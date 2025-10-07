/**
 */
package org.educsos.dovamo.genericDelta.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.educsos.dovamo.genericDelta.DeleteByIndexMultiAttDeltaOp;
import org.educsos.dovamo.genericDelta.GenericDeltaPackage;
import org.educsos.dovamo.genericDelta.InsertAtIndexMultiAttDeltaOp;
import org.educsos.dovamo.genericDelta.ReplaceAtAttMacro;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replace At Att Macro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.ReplaceAtAttMacroImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.ReplaceAtAttMacroImpl#getInsert <em>Insert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplaceAtAttMacroImpl extends PredefinedMacroDeltaOpImpl implements ReplaceAtAttMacro {
	/**
	 * The cached value of the '{@link #getDelete() <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected DeleteByIndexMultiAttDeltaOp delete;

	/**
	 * The cached value of the '{@link #getInsert() <em>Insert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsert()
	 * @generated
	 * @ordered
	 */
	protected InsertAtIndexMultiAttDeltaOp insert;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplaceAtAttMacroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.REPLACE_AT_ATT_MACRO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteByIndexMultiAttDeltaOp getDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelete(DeleteByIndexMultiAttDeltaOp newDelete, NotificationChain msgs) {
		DeleteByIndexMultiAttDeltaOp oldDelete = delete;
		delete = newDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.REPLACE_AT_ATT_MACRO__DELETE, oldDelete, newDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(DeleteByIndexMultiAttDeltaOp newDelete) {
		if (newDelete != delete) {
			NotificationChain msgs = null;
			if (delete != null)
				msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericDeltaPackage.REPLACE_AT_ATT_MACRO__DELETE, null, msgs);
			if (newDelete != null)
				msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericDeltaPackage.REPLACE_AT_ATT_MACRO__DELETE, null, msgs);
			msgs = basicSetDelete(newDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.REPLACE_AT_ATT_MACRO__DELETE, newDelete, newDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertAtIndexMultiAttDeltaOp getInsert() {
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsert(InsertAtIndexMultiAttDeltaOp newInsert, NotificationChain msgs) {
		InsertAtIndexMultiAttDeltaOp oldInsert = insert;
		insert = newInsert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.REPLACE_AT_ATT_MACRO__INSERT, oldInsert, newInsert);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsert(InsertAtIndexMultiAttDeltaOp newInsert) {
		if (newInsert != insert) {
			NotificationChain msgs = null;
			if (insert != null)
				msgs = ((InternalEObject)insert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericDeltaPackage.REPLACE_AT_ATT_MACRO__INSERT, null, msgs);
			if (newInsert != null)
				msgs = ((InternalEObject)newInsert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericDeltaPackage.REPLACE_AT_ATT_MACRO__INSERT, null, msgs);
			msgs = basicSetInsert(newInsert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.REPLACE_AT_ATT_MACRO__INSERT, newInsert, newInsert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO__DELETE:
				return basicSetDelete(null, msgs);
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO__INSERT:
				return basicSetInsert(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO__DELETE:
				return getDelete();
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO__INSERT:
				return getInsert();
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
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO__DELETE:
				setDelete((DeleteByIndexMultiAttDeltaOp)newValue);
				return;
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO__INSERT:
				setInsert((InsertAtIndexMultiAttDeltaOp)newValue);
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
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO__DELETE:
				setDelete((DeleteByIndexMultiAttDeltaOp)null);
				return;
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO__INSERT:
				setInsert((InsertAtIndexMultiAttDeltaOp)null);
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
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO__DELETE:
				return delete != null;
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO__INSERT:
				return insert != null;
		}
		return super.eIsSet(featureID);
	}

} //ReplaceAtAttMacroImpl
