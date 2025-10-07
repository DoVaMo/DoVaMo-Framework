package org.educsos.dovamo.provider.custom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.educsos.dovamo.genericDelta.DeltaOp;

/**
 * Generic property descriptor for EMF objects of type T (EClass, EAttribute, EReference).
 * Supports displaying and selecting values as strings (URIs) with null, sorting, 
 * and putting "genericdeltametamodel" package elements at the bottom.
 * 
 * @param <T> The type of EObject to display (EClass, EReference, EAttribute)
 */
public class EcoreUriStringPropertyDescriptor<T extends EObject, U extends DeltaOp> extends ItemPropertyDescriptor {
	
	private final Class<T> ecoreElementClass;
	private final Class<U> deltaOpClass;
	
	/**
     * Constructor for the custom EClass string property descriptor.
     *
     * @param rootAdapterFactory the root adapter factory
     * @param resourceLocator the resource locator for labels and icons
     * @param displayName the human-readable name of the property
     * @param description the description of the property
     * @param feature the structural feature this descriptor represents
     * @param isSettable whether the property is editable
     * @param multiLine whether the property supports multi-line input
     * @param sortChoices whether choices should be sorted (ignored in this class)
     * @param staticImage optional image for the property
     * @param category optional category for grouping properties
     * @param filterFlags optional filter flags for property visibility
     * @param ecoreElementClass class of the metamodel element to choose in dropdown
     * @param deltaOpClass class of deltaop to set property for
     */
    public EcoreUriStringPropertyDescriptor(AdapterFactory rootAdapterFactory,
                                          ResourceLocator resourceLocator,
                                          String displayName,
                                          String description,
                                          EStructuralFeature feature,
                                          boolean isSettable,
                                          boolean multiLine,
                                          boolean sortChoices,
                                          Object staticImage,
                                          String category,
                                          String[] filterFlags,
                                          Class<T> ecoreElementClass,
                                          Class<U> deltaOpClass) {
        super(rootAdapterFactory, resourceLocator, displayName, description,
              feature, isSettable, multiLine, sortChoices, staticImage, category, filterFlags);
        this.ecoreElementClass = ecoreElementClass;
        this.deltaOpClass = deltaOpClass;
    }
    
    /**
     * Returns the display text for a given value.
     * Null values are displayed as "null".
     * EClass values are displayed as "modelName#//package/ClassName",
     * where modelName is the last part of the root package's nsURI.
     *
     * @param value the value to get the display text for
     * @return a string suitable for display in the Properties View
     */
    public String getDropdownDisplayText(Object value) {
    	if(value == null) {
    		return "null";
    	}
    	if (this.ecoreElementClass.isInstance(value)) {
    		@SuppressWarnings("unchecked")
			T tvalue = (T)value;
	        EObject container = tvalue;
	        EPackage rootPackage = null;
	        while (container.eContainer() != null) {
	            container = container.eContainer();
				if (container instanceof EPackage) {
					rootPackage = (EPackage) container;
					break;
				}
	        }
	        while (rootPackage.getESuperPackage() != null) {
	        	rootPackage = rootPackage.getESuperPackage();
	        }
	        
	        String nsURI = rootPackage.getNsURI();
	        String shortName = nsURI;
	        int idxSlash = shortName.lastIndexOf('/');
	        int idxHash  = shortName.lastIndexOf('#');
	        int cut = Math.max(idxSlash, idxHash);
	        if (cut != -1 && cut + 1 < shortName.length()) {
	            shortName = shortName.substring(cut + 1);
	        }
	
	        String fragment = EcoreUtil.getURI(tvalue).fragment(); // z.B. "//pkg/Class"
	
	        return shortName + "#" + fragment;
    	}
    	return String.valueOf(value);
    }
    
    /**
     * Provides a label provider for the property, which supplies
     * the display string and optional icons for each choice.
     *
     * @param object the object for which the label provider is requested
     * @return an IItemLabelProvider for rendering values in the Properties View
     */
    @Override
    public IItemLabelProvider getLabelProvider(Object object) {
        return new IItemLabelProvider() {
			@Override
            public String getText(Object value) {
				return getDropdownDisplayText(value);
            }

            @Override
            public Object getImage(Object value) {
            	 // Optional: provide icons for values if desired
                return null;
            }
        };
    }
    
    /**
     * Sets the property value on the target object. Converts <code>T</code>
     * instances into URI strings for persistence in the string attribute.
     * Null values are handled appropriately.
     *
     * @param object the target object
     * @param value the new value to set
     */
    @SuppressWarnings("unchecked")
	@Override
    public void setPropertyValue(Object object, Object value) {
        if (this.deltaOpClass.isInstance(object)) {
        	if (value == null) {
                super.setPropertyValue(object, value);
                return;
            }
            if (ecoreElementClass.isInstance(value)) {
            	String val = EcoreUtil.getURI((T)value).toString();
                super.setPropertyValue(object, val);
                return;
            }
        }
    }

    /**
     * Returns all possible choices for this property.
     * The returned list contains <code>null</code> first, then all 
     * <code>T</code>s not in "genericdeltametamodel", and finally all 
     * <code>T</code>s in "genericdeltametamodel" (including subpackages),
     * each group sorted alphabetically by display string.
     *
     * @param object the object for which choices are requested
     * @return a collection of possible property values
     */
    @Override
    public Collection<?> getChoiceOfValues(Object object) {
        if (!(object instanceof EObject eObject)) {
            return Collections.emptyList();
        }

        List<T> generic = new ArrayList<>();
        List<T> others  = new ArrayList<>();

        if (eObject.eResource() != null && eObject.eResource().getResourceSet() != null) {
            ResourceSet rs = eObject.eResource().getResourceSet();
            for (Resource res : rs.getResources()) {
                for (EObject root : res.getContents()) {
                    if (root instanceof EPackage ePackage) {
                        collectEClasses(ePackage, others, generic);
                    }
                }
            }
        }

        Comparator<T> cmp = Comparator.comparing(this::getDropdownDisplayText);
        others.sort(cmp);
        generic.sort(cmp);

        List<Object> result = new ArrayList<>();
        result.add(null);       // Null ganz oben
        result.addAll(others);  // erst alle „normalen“
        result.addAll(generic); // dann genericdeltametamodel inkl. Subpackages

        return result;
    }
    
    /**
     * Traverses the given package and collects all <code>T</code>s into
     * either the 'others' list or the 'generic' list depending on
     * whether they belong to "genericdeltametamodel" (including subpackages).
     *
     * @param rootPackage the package to traverse
     * @param others list to collect <code>T</code>s not in genericdeltametamodel
     * @param generic list to collect <code>T</code>s in genericdeltametamodel
     */
    private void collectEClasses(EPackage rootPackage, List<T> others, List<T> generic) {
    	List<T> targetList = "genericdeltametamodel".equalsIgnoreCase(rootPackage.getName()) ? generic : others;

        for (Iterator<EObject> it = rootPackage.eAllContents(); it.hasNext(); ) {
            EObject obj = it.next();
            if (ecoreElementClass.isInstance(obj)) {
                @SuppressWarnings("unchecked")
                T tValue = (T) obj;
                targetList.add(tValue);
            }
        }
    }
}
