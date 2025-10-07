/**
 */
package org.educsos.dovamo.genericDelta.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.educsos.dovamo.genericDelta.AddByValueMultiRefDeltaOp;
import org.educsos.dovamo.genericDelta.GenericDeltaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add By Value Multi Ref Delta Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.AddByValueMultiRefDeltaOpImpl#getIdOfAddedValue <em>Id Of Added Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddByValueMultiRefDeltaOpImpl extends AdditionMultiRefDeltaOpImpl implements AddByValueMultiRefDeltaOp {
	/**
	 * The default value of the '{@link #getIdOfAddedValue() <em>Id Of Added Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfAddedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_OF_ADDED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdOfAddedValue() <em>Id Of Added Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfAddedValue()
	 * @generated
	 * @ordered
	 */
	protected String idOfAddedValue = ID_OF_ADDED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddByValueMultiRefDeltaOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.ADD_BY_VALUE_MULTI_REF_DELTA_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdOfAddedValue() {
		return idOfAddedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdOfAddedValue(String newIdOfAddedValue) {
		String oldIdOfAddedValue = idOfAddedValue;
		idOfAddedValue = newIdOfAddedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_ADDED_VALUE, oldIdOfAddedValue, idOfAddedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDeltaPackage.ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_ADDED_VALUE:
				return getIdOfAddedValue();
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
			case GenericDeltaPackage.ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_ADDED_VALUE:
				setIdOfAddedValue((String)newValue);
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
			case GenericDeltaPackage.ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_ADDED_VALUE:
				setIdOfAddedValue(ID_OF_ADDED_VALUE_EDEFAULT);
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
			case GenericDeltaPackage.ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_ADDED_VALUE:
				return ID_OF_ADDED_VALUE_EDEFAULT == null ? idOfAddedValue != null : !ID_OF_ADDED_VALUE_EDEFAULT.equals(idOfAddedValue);
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
		result.append(" (idOfAddedValue: ");
		result.append(idOfAddedValue);
		result.append(')');
		return result.toString();
	}

} //AddByValueMultiRefDeltaOpImpl
