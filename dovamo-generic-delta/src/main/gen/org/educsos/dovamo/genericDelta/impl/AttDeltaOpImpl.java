/**
 */
package org.educsos.dovamo.genericDelta.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.educsos.dovamo.genericDelta.AttDeltaOp;
import org.educsos.dovamo.genericDelta.GenericDeltaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Att Delta Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.AttDeltaOpImpl#getModifiedAtt <em>Modified Att</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.AttDeltaOpImpl#getModifiedAttString <em>Modified Att String</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AttDeltaOpImpl extends AtomicDeltaOpImpl implements AttDeltaOp {
	/**
	 * The cached value of the '{@link #getModifiedAtt() <em>Modified Att</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedAtt()
	 * @generated
	 * @ordered
	 */
	protected EAttribute modifiedAtt;

	/**
	 * The default value of the '{@link #getModifiedAttString() <em>Modified Att String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedAttString()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_ATT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedAttString() <em>Modified Att String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedAttString()
	 * @generated
	 * @ordered
	 */
	protected String modifiedAttString = MODIFIED_ATT_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttDeltaOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.ATT_DELTA_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifiedAtt() {
		if (modifiedAtt != null && modifiedAtt.eIsProxy()) {
			InternalEObject oldModifiedAtt = (InternalEObject)modifiedAtt;
			modifiedAtt = (EAttribute)eResolveProxy(oldModifiedAtt);
			if (modifiedAtt != oldModifiedAtt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT, oldModifiedAtt, modifiedAtt));
			}
		}
		return modifiedAtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetModifiedAtt() {
		return modifiedAtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedAtt(EAttribute newModifiedAtt) {
		EAttribute oldModifiedAtt = modifiedAtt;
		modifiedAtt = newModifiedAtt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT, oldModifiedAtt, modifiedAtt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifiedAttString() {
		return modifiedAttString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedAttString(String newModifiedAttString) {
		String oldModifiedAttString = modifiedAttString;
		modifiedAttString = newModifiedAttString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT_STRING, oldModifiedAttString, modifiedAttString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT:
				if (resolve) return getModifiedAtt();
				return basicGetModifiedAtt();
			case GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT_STRING:
				return getModifiedAttString();
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
			case GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT:
				setModifiedAtt((EAttribute)newValue);
				return;
			case GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT_STRING:
				setModifiedAttString((String)newValue);
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
			case GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT:
				setModifiedAtt((EAttribute)null);
				return;
			case GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT_STRING:
				setModifiedAttString(MODIFIED_ATT_STRING_EDEFAULT);
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
			case GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT:
				return modifiedAtt != null;
			case GenericDeltaPackage.ATT_DELTA_OP__MODIFIED_ATT_STRING:
				return MODIFIED_ATT_STRING_EDEFAULT == null ? modifiedAttString != null : !MODIFIED_ATT_STRING_EDEFAULT.equals(modifiedAttString);
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
		result.append(" (modifiedAttString: ");
		result.append(modifiedAttString);
		result.append(')');
		return result.toString();
	}

} //AttDeltaOpImpl
