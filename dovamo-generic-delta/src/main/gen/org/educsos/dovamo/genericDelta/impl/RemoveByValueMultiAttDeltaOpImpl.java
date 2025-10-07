/**
 */
package org.educsos.dovamo.genericDelta.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.educsos.dovamo.genericDelta.GenericDeltaPackage;
import org.educsos.dovamo.genericDelta.RemovalStrategy;
import org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove By Value Multi Att Delta Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.RemoveByValueMultiAttDeltaOpImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.RemoveByValueMultiAttDeltaOpImpl#getIdOfRemovedValue <em>Id Of Removed Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveByValueMultiAttDeltaOpImpl extends RemovalMultiAttDeltaOpImpl implements RemoveByValueMultiAttDeltaOp {
	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final RemovalStrategy STRATEGY_EDEFAULT = RemovalStrategy.FIRST;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected RemovalStrategy strategy = STRATEGY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdOfRemovedValue() <em>Id Of Removed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfRemovedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_OF_REMOVED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdOfRemovedValue() <em>Id Of Removed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdOfRemovedValue()
	 * @generated
	 * @ordered
	 */
	protected String idOfRemovedValue = ID_OF_REMOVED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveByValueMultiAttDeltaOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovalStrategy getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(RemovalStrategy newStrategy) {
		RemovalStrategy oldStrategy = strategy;
		strategy = newStrategy == null ? STRATEGY_EDEFAULT : newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__STRATEGY, oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdOfRemovedValue() {
		return idOfRemovedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdOfRemovedValue(String newIdOfRemovedValue) {
		String oldIdOfRemovedValue = idOfRemovedValue;
		idOfRemovedValue = newIdOfRemovedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_REMOVED_VALUE, oldIdOfRemovedValue, idOfRemovedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__STRATEGY:
				return getStrategy();
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_REMOVED_VALUE:
				return getIdOfRemovedValue();
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
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__STRATEGY:
				setStrategy((RemovalStrategy)newValue);
				return;
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_REMOVED_VALUE:
				setIdOfRemovedValue((String)newValue);
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
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__STRATEGY:
				setStrategy(STRATEGY_EDEFAULT);
				return;
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_REMOVED_VALUE:
				setIdOfRemovedValue(ID_OF_REMOVED_VALUE_EDEFAULT);
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
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__STRATEGY:
				return strategy != STRATEGY_EDEFAULT;
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_REMOVED_VALUE:
				return ID_OF_REMOVED_VALUE_EDEFAULT == null ? idOfRemovedValue != null : !ID_OF_REMOVED_VALUE_EDEFAULT.equals(idOfRemovedValue);
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
		result.append(" (strategy: ");
		result.append(strategy);
		result.append(", idOfRemovedValue: ");
		result.append(idOfRemovedValue);
		result.append(')');
		return result.toString();
	}

} //RemoveByValueMultiAttDeltaOpImpl
