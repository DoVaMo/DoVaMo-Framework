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

import org.educsos.dovamo.genericDelta.AttDeltaOp;
import org.educsos.dovamo.genericDelta.GenericDeltaPackage;
import org.educsos.dovamo.provider.custom.EcoreUriStringPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.educsos.dovamo.genericDelta.AttDeltaOp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttDeltaOpItemProvider extends AtomicDeltaOpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttDeltaOpItemProvider(AdapterFactory adapterFactory) {
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

			addModifiedAttPropertyDescriptor(object);
			addModifiedAttStringPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Modified Att feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModifiedAttPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AttDeltaOp_modifiedAtt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttDeltaOp_modifiedAtt_feature", "_UI_AttDeltaOp_type"),
				 GenericDeltaPackage.Literals.ATT_DELTA_OP__MODIFIED_ATT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Modified Att String feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addModifiedAttStringPropertyDescriptor(Object object) {
//		itemPropertyDescriptors.add
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_AttDeltaOp_modifiedAttString_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_AttDeltaOp_modifiedAttString_feature", "_UI_AttDeltaOp_type"),
//				 GenericDeltaPackage.Literals.ATT_DELTA_OP__MODIFIED_ATT_STRING,
//				 true,
//				 false,
//				 false,
//				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
//				 null,
//				 null));
		itemPropertyDescriptors.add(
		        new EcoreUriStringPropertyDescriptor<org.eclipse.emf.ecore.EAttribute,AttDeltaOp>(
		            ((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
		            getResourceLocator(),
		            getString("_UI_AttDeltaOp_modifiedAttString_feature"),
		            getString("_UI_PropertyDescriptor_description",
		                      "_UI_AttDeltaOp_modifiedAttString_feature",
		                      "_UI_AttDeltaOp_type"),
		            GenericDeltaPackage.Literals.ATT_DELTA_OP__MODIFIED_ATT_STRING,
		            true, false, false,
		            ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
		            null,
		            null,
		            org.eclipse.emf.ecore.EAttribute.class,
		            AttDeltaOp.class
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
		String label = ((AttDeltaOp)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AttDeltaOp_type") :
			getString("_UI_AttDeltaOp_type") + " " + label;
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

		switch (notification.getFeatureID(AttDeltaOp.class)) {
			case GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT_STRING:
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
