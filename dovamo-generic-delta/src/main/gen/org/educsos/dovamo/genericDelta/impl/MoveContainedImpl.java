/**
 */
package org.educsos.dovamo.genericDelta.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.educsos.dovamo.genericDelta.AdditionMultiRefDeltaOp;
import org.educsos.dovamo.genericDelta.GenericDeltaPackage;
import org.educsos.dovamo.genericDelta.MoveContained;
import org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Contained</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.MoveContainedImpl#getRemove <em>Remove</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.MoveContainedImpl#getAdd <em>Add</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveContainedImpl extends PredefinedMacroDeltaOpImpl implements MoveContained {
	/**
	 * The cached value of the '{@link #getRemove() <em>Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemove()
	 * @generated
	 * @ordered
	 */
	protected RemoveByValueMultiRefDeltaOp remove;

	/**
	 * The cached value of the '{@link #getAdd() <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdd()
	 * @generated
	 * @ordered
	 */
	protected AdditionMultiRefDeltaOp add;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveContainedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.MOVE_CONTAINED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveByValueMultiRefDeltaOp getRemove() {
		return remove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemove(RemoveByValueMultiRefDeltaOp newRemove, NotificationChain msgs) {
		RemoveByValueMultiRefDeltaOp oldRemove = remove;
		remove = newRemove;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.MOVE_CONTAINED__REMOVE, oldRemove, newRemove);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemove(RemoveByValueMultiRefDeltaOp newRemove) {
		if (newRemove != remove) {
			NotificationChain msgs = null;
			if (remove != null)
				msgs = ((InternalEObject)remove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericDeltaPackage.MOVE_CONTAINED__REMOVE, null, msgs);
			if (newRemove != null)
				msgs = ((InternalEObject)newRemove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericDeltaPackage.MOVE_CONTAINED__REMOVE, null, msgs);
			msgs = basicSetRemove(newRemove, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.MOVE_CONTAINED__REMOVE, newRemove, newRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionMultiRefDeltaOp getAdd() {
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdd(AdditionMultiRefDeltaOp newAdd, NotificationChain msgs) {
		AdditionMultiRefDeltaOp oldAdd = add;
		add = newAdd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.MOVE_CONTAINED__ADD, oldAdd, newAdd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdd(AdditionMultiRefDeltaOp newAdd) {
		if (newAdd != add) {
			NotificationChain msgs = null;
			if (add != null)
				msgs = ((InternalEObject)add).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericDeltaPackage.MOVE_CONTAINED__ADD, null, msgs);
			if (newAdd != null)
				msgs = ((InternalEObject)newAdd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericDeltaPackage.MOVE_CONTAINED__ADD, null, msgs);
			msgs = basicSetAdd(newAdd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.MOVE_CONTAINED__ADD, newAdd, newAdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericDeltaPackage.MOVE_CONTAINED__REMOVE:
				return basicSetRemove(null, msgs);
			case GenericDeltaPackage.MOVE_CONTAINED__ADD:
				return basicSetAdd(null, msgs);
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
			case GenericDeltaPackage.MOVE_CONTAINED__REMOVE:
				return getRemove();
			case GenericDeltaPackage.MOVE_CONTAINED__ADD:
				return getAdd();
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
			case GenericDeltaPackage.MOVE_CONTAINED__REMOVE:
				setRemove((RemoveByValueMultiRefDeltaOp)newValue);
				return;
			case GenericDeltaPackage.MOVE_CONTAINED__ADD:
				setAdd((AdditionMultiRefDeltaOp)newValue);
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
			case GenericDeltaPackage.MOVE_CONTAINED__REMOVE:
				setRemove((RemoveByValueMultiRefDeltaOp)null);
				return;
			case GenericDeltaPackage.MOVE_CONTAINED__ADD:
				setAdd((AdditionMultiRefDeltaOp)null);
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
			case GenericDeltaPackage.MOVE_CONTAINED__REMOVE:
				return remove != null;
			case GenericDeltaPackage.MOVE_CONTAINED__ADD:
				return add != null;
		}
		return super.eIsSet(featureID);
	}

} //MoveContainedImpl
