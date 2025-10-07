/**
 */
package org.educsos.dovamo.genericDelta.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.educsos.dovamo.genericDelta.GenericDeltaPackage;
import org.educsos.dovamo.genericDelta.RefDeltaOp;
import org.educsos.dovamo.provider.custom.EcoreUriStringPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.educsos.dovamo.genericDelta.RefDeltaOp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RefDeltaOpItemProvider extends AtomicDeltaOpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefDeltaOpItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addModifiedRefPropertyDescriptor(object);
			addModifiedRefStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Modified Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiedRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RefDeltaOp_modifiedRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RefDeltaOp_modifiedRef_feature", "_UI_RefDeltaOp_type"),
				 GenericDeltaPackage.Literals.REF_DELTA_OP__MODIFIED_REF,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modified Ref String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addModifiedRefStringPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_RefDeltaOp_modifiedRefString_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_RefDeltaOp_modifiedRefString_feature", "_UI_RefDeltaOp_type"),
//				 GenericDeltaPackage.Literals.REF_DELTA_OP__MODIFIED_REF_STRING,
//				 true,
//				 false,
//				 false,
//				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
//				 null,
//				 null));
		itemPropertyDescriptors.add(
		        new EcoreUriStringPropertyDescriptor<org.eclipse.emf.ecore.EReference,RefDeltaOp>(
		            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
		            getResourceLocator(),
		            getString("_UI_RefDeltaOp_modifiedRefString_feature"),
		            getString("_UI_PropertyDescriptor_description",
		            		"_UI_RefDeltaOp_modifiedRefString_feature", "_UI_RefDeltaOp_type"),
		            GenericDeltaPackage.Literals.REF_DELTA_OP__MODIFIED_REF_STRING,
		            true, false, false,
		            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
		            null,
		            null,
		            org.eclipse.emf.ecore.EReference.class,
		            RefDeltaOp.class
		        )
		    );
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RefDeltaOp)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RefDeltaOp_type") :
			getString("_UI_RefDeltaOp_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RefDeltaOp.class)) {
			case GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF_STRING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
