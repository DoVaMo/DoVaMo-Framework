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
import org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp;
import org.educsos.dovamo.provider.custom.EcoreUriStringPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InitializeRootObjectDeltaOpItemProvider extends DeltaOpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializeRootObjectDeltaOpItemProvider(AdapterFactory adapterFactory) {
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

			addIdOfNewRootPropertyDescriptor(object);
			addLocationPropertyDescriptor(object);
			addRootTypePropertyDescriptor(object);
			addRootTypeStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id Of New Root feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdOfNewRootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InitializeRootObjectDeltaOp_idOfNewRoot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InitializeRootObjectDeltaOp_idOfNewRoot_feature", "_UI_InitializeRootObjectDeltaOp_type"),
				 GenericDeltaPackage.Literals.INITIALIZE_ROOT_OBJECT_DELTA_OP__ID_OF_NEW_ROOT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InitializeRootObjectDeltaOp_location_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InitializeRootObjectDeltaOp_location_feature", "_UI_InitializeRootObjectDeltaOp_type"),
				 GenericDeltaPackage.Literals.INITIALIZE_ROOT_OBJECT_DELTA_OP__LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InitializeRootObjectDeltaOp_rootType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InitializeRootObjectDeltaOp_rootType_feature", "_UI_InitializeRootObjectDeltaOp_type"),
				 GenericDeltaPackage.Literals.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Root Type String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addRootTypeStringPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_InitializeRootObjectDeltaOp_rootTypeString_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_InitializeRootObjectDeltaOp_rootTypeString_feature", "_UI_InitializeRootObjectDeltaOp_type"),
//				 GenericDeltaPackage.Literals.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE_STRING,
//				 true,
//				 false,
//				 false,
//				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
//				 null,
//				 null));
		itemPropertyDescriptors.add(
		        new EcoreUriStringPropertyDescriptor<org.eclipse.emf.ecore.EClass, InitializeRootObjectDeltaOp>(
		            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
		            getResourceLocator(),
		            getString("_UI_InitializeRootObjectDeltaOp_rootTypeString_feature"),
		            getString("_UI_PropertyDescriptor_description",
		                      "_UI_InitializeRootObjectDeltaOp_rootTypeString_feature",
		                      "_UI_InitializeRootObjectDeltaOp_type"),
		            GenericDeltaPackage.Literals.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE_STRING,
		            true, false, false,
		            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
		            null,
		            null,
		            org.eclipse.emf.ecore.EClass.class,
		            InitializeRootObjectDeltaOp.class
		        )
		    );
	}

	/**
	 * This returns InitializeRootObjectDeltaOp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InitializeRootObjectDeltaOp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((InitializeRootObjectDeltaOp)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InitializeRootObjectDeltaOp_type") :
			getString("_UI_InitializeRootObjectDeltaOp_type") + " " + label;
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

		switch (notification.getFeatureID(InitializeRootObjectDeltaOp.class)) {
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ID_OF_NEW_ROOT:
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__LOCATION:
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE_STRING:
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
