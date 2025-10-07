/**
 */
package org.educsos.dovamo.genericDelta.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.educsos.dovamo.genericDelta.Delta;
import org.educsos.dovamo.genericDelta.GenericDeltaFactory;
import org.educsos.dovamo.genericDelta.GenericDeltaPackage;

import org.educsos.dovamo.genericDelta.applicability.ApplicabilityFactory;

/**
 * This is the item provider adapter for a {@link org.educsos.dovamo.genericDelta.Delta} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeltaItemProvider extends IdentifierItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeltaItemProvider(AdapterFactory adapterFactory) {
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

			addAfterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the After feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAfterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Delta_after_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Delta_after_feature", "_UI_Delta_type"),
				 GenericDeltaPackage.Literals.DELTA__AFTER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS);
			childrenFeatures.add(GenericDeltaPackage.Literals.DELTA__APPLICABILITY_CONDITION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Delta.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Delta"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Delta)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Delta_type") :
			getString("_UI_Delta_type") + " " + label;
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

		switch (notification.getFeatureID(Delta.class)) {
			case GenericDeltaPackage.DELTA__DELTA_OPERATIONS:
			case GenericDeltaPackage.DELTA__APPLICABILITY_CONDITION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createSetSingleAttDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createUnsetSingleAttDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createUnsetSingleRefDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createSetSingleRefDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createAddByValueMultiRefDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createInsertAtIndexMultiRefDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createRemoveByValueMultiRefDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createClearMultiRefDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createDeleteByIndexMultiRefDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createReplaceAtRefMacro()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createMoveContained()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createAddByValueMultiAttDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createInsertAtIndexMultiAttDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createDeleteByIndexMultiAttDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createRemoveByValueMultiAttDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createClearMultiAttDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createReplaceAtAttMacro()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__DELTA_OPERATIONS,
				 GenericDeltaFactory.eINSTANCE.createInitializeRootObjectDeltaOp()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__APPLICABILITY_CONDITION,
				 ApplicabilityFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__APPLICABILITY_CONDITION,
				 ApplicabilityFactory.eINSTANCE.createAndExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__APPLICABILITY_CONDITION,
				 ApplicabilityFactory.eINSTANCE.createOrExpression()));

		newChildDescriptors.add
			(createChildParameter
				(GenericDeltaPackage.Literals.DELTA__APPLICABILITY_CONDITION,
				 ApplicabilityFactory.eINSTANCE.createNotExpression()));
	}

}
