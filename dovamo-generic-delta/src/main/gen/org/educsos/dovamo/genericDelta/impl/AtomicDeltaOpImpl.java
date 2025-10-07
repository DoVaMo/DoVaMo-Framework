/**
 */
package org.educsos.dovamo.genericDelta.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.educsos.dovamo.genericDelta.AtomicDeltaOp;
import org.educsos.dovamo.genericDelta.GenericDeltaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Delta Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.AtomicDeltaOpImpl#getIdOfAffectedObject <em>Id Of Affected Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AtomicDeltaOpImpl extends DeltaOpImpl implements AtomicDeltaOp {
	/**
	 * The default value of the '{@link #getIdOfAffectedObject() <em>Id Of Affected Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfAffectedObject()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_OF_AFFECTED_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdOfAffectedObject() <em>Id Of Affected Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfAffectedObject()
	 * @generated
	 * @ordered
	 */
	protected String idOfAffectedObject = ID_OF_AFFECTED_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicDeltaOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.ATOMIC_DELTA_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdOfAffectedObject() {
		return idOfAffectedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdOfAffectedObject(String newIdOfAffectedObject) {
		String oldIdOfAffectedObject = idOfAffectedObject;
		idOfAffectedObject = newIdOfAffectedObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.ATOMIC_DELTA_OP__ID_OF_AFFECTED_OBJECT, oldIdOfAffectedObject, idOfAffectedObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDeltaPackage.ATOMIC_DELTA_OP__ID_OF_AFFECTED_OBJECT:
				return getIdOfAffectedObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenericDeltaPackage.ATOMIC_DELTA_OP__ID_OF_AFFECTED_OBJECT:
				setIdOfAffectedObject((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenericDeltaPackage.ATOMIC_DELTA_OP__ID_OF_AFFECTED_OBJECT:
				setIdOfAffectedObject(ID_OF_AFFECTED_OBJECT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenericDeltaPackage.ATOMIC_DELTA_OP__ID_OF_AFFECTED_OBJECT:
				return ID_OF_AFFECTED_OBJECT_EDEFAULT == null ? idOfAffectedObject != null : !ID_OF_AFFECTED_OBJECT_EDEFAULT.equals(idOfAffectedObject);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (idOfAffectedObject: ");
		result.append(idOfAffectedObject);
		result.append(')');
		return result.toString();
	}

} //AtomicDeltaOpImpl
