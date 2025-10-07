/**
 */
package org.educsos.dovamo.genericDelta.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.educsos.dovamo.genericDelta.GenericDeltaPackage;
import org.educsos.dovamo.genericDelta.SetSingleRefDeltaOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Single Ref Delta Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.SetSingleRefDeltaOpImpl#getIdOfNewValue <em>Id Of New Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetSingleRefDeltaOpImpl extends SingleRefDeltaOpImpl implements SetSingleRefDeltaOp {
	/**
	 * The default value of the '{@link #getIdOfNewValue() <em>Id Of New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfNewValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_OF_NEW_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdOfNewValue() <em>Id Of New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfNewValue()
	 * @generated
	 * @ordered
	 */
	protected String idOfNewValue = ID_OF_NEW_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetSingleRefDeltaOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.SET_SINGLE_REF_DELTA_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdOfNewValue() {
		return idOfNewValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdOfNewValue(String newIdOfNewValue) {
		String oldIdOfNewValue = idOfNewValue;
		idOfNewValue = newIdOfNewValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.SET_SINGLE_REF_DELTA_OP__ID_OF_NEW_VALUE, oldIdOfNewValue, idOfNewValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDeltaPackage.SET_SINGLE_REF_DELTA_OP__ID_OF_NEW_VALUE:
				return getIdOfNewValue();
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
			case GenericDeltaPackage.SET_SINGLE_REF_DELTA_OP__ID_OF_NEW_VALUE:
				setIdOfNewValue((String)newValue);
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
			case GenericDeltaPackage.SET_SINGLE_REF_DELTA_OP__ID_OF_NEW_VALUE:
				setIdOfNewValue(ID_OF_NEW_VALUE_EDEFAULT);
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
			case GenericDeltaPackage.SET_SINGLE_REF_DELTA_OP__ID_OF_NEW_VALUE:
				return ID_OF_NEW_VALUE_EDEFAULT == null ? idOfNewValue != null : !ID_OF_NEW_VALUE_EDEFAULT.equals(idOfNewValue);
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
		result.append(" (idOfNewValue: ");
		result.append(idOfNewValue);
		result.append(')');
		return result.toString();
	}

} //SetSingleRefDeltaOpImpl
