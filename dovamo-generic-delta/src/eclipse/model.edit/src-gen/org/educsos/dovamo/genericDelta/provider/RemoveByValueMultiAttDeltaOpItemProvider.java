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
import org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp;

/**
 * This is the item provider adapter for a {@link org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RemoveByValueMultiAttDeltaOpItemProvider extends RemovalMultiAttDeltaOpItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveByValueMultiAttDeltaOpItemProvider(AdapterFactory adapterFactory) {
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

			addStrategyPropertyDescriptor(object);
			addIdOfRemovedValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Strategy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoveByValueMultiAttDeltaOp_strategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoveByValueMultiAttDeltaOp_strategy_feature", "_UI_RemoveByValueMultiAttDeltaOp_type"),
				 GenericDeltaPackage.Literals.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__STRATEGY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id Of Removed Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdOfRemovedValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RemoveByValueMultiAttDeltaOp_idOfRemovedValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RemoveByValueMultiAttDeltaOp_idOfRemovedValue_feature", "_UI_RemoveByValueMultiAttDeltaOp_type"),
				 GenericDeltaPackage.Literals.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_REMOVED_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns RemoveByValueMultiAttDeltaOp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RemoveByValueMultiAttDeltaOp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RemoveByValueMultiAttDeltaOp)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_RemoveByValueMultiAttDeltaOp_type") :
			getString("_UI_RemoveByValueMultiAttDeltaOp_type") + " " + label;
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

		switch (notification.getFeatureID(RemoveByValueMultiAttDeltaOp.class)) {
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__STRATEGY:
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_REMOVED_VALUE:
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
