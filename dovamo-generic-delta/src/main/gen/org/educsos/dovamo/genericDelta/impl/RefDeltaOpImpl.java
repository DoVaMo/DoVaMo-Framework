/**
 */
package org.educsos.dovamo.genericDelta.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.educsos.dovamo.genericDelta.GenericDeltaPackage;
import org.educsos.dovamo.genericDelta.RefDeltaOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Delta Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.RefDeltaOpImpl#getModifiedRef <em>Modified Ref</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.RefDeltaOpImpl#getModifiedRefString <em>Modified Ref String</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RefDeltaOpImpl extends AtomicDeltaOpImpl implements RefDeltaOp {
	/**
	 * The cached value of the '{@link #getModifiedRef() <em>Modified Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedRef()
	 * @generated
	 * @ordered
	 */
	protected EReference modifiedRef;

	/**
	 * The default value of the '{@link #getModifiedRefString() <em>Modified Ref String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedRefString()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_REF_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedRefString() <em>Modified Ref String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedRefString()
	 * @generated
	 * @ordered
	 */
	protected String modifiedRefString = MODIFIED_REF_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefDeltaOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.REF_DELTA_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiedRef() {
		if (modifiedRef != null && modifiedRef.eIsProxy()) {
			InternalEObject oldModifiedRef = (InternalEObject)modifiedRef;
			modifiedRef = (EReference)eResolveProxy(oldModifiedRef);
			if (modifiedRef != oldModifiedRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF, oldModifiedRef, modifiedRef));
			}
		}
		return modifiedRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetModifiedRef() {
		return modifiedRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedRef(EReference newModifiedRef) {
		EReference oldModifiedRef = modifiedRef;
		modifiedRef = newModifiedRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF, oldModifiedRef, modifiedRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifiedRefString() {
		return modifiedRefString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedRefString(String newModifiedRefString) {
		String oldModifiedRefString = modifiedRefString;
		modifiedRefString = newModifiedRefString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF_STRING, oldModifiedRefString, modifiedRefString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF:
				if (resolve) return getModifiedRef();
				return basicGetModifiedRef();
			case GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF_STRING:
				return getModifiedRefString();
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
			case GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF:
				setModifiedRef((EReference)newValue);
				return;
			case GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF_STRING:
				setModifiedRefString((String)newValue);
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
			case GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF:
				setModifiedRef((EReference)null);
				return;
			case GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF_STRING:
				setModifiedRefString(MODIFIED_REF_STRING_EDEFAULT);
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
			case GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF:
				return modifiedRef != null;
			case GenericDeltaPackage.REF_DELTA_OP__MODIFIED_REF_STRING:
				return MODIFIED_REF_STRING_EDEFAULT == null ? modifiedRefString != null : !MODIFIED_REF_STRING_EDEFAULT.equals(modifiedRefString);
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
		result.append(" (modifiedRefString: ");
		result.append(modifiedRefString);
		result.append(')');
		return result.toString();
	}

} //RefDeltaOpImpl
