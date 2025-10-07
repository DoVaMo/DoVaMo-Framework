/**
 */
package org.educsos.dovamo.genericDelta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.educsos.dovamo.genericDelta.Delta;
import org.educsos.dovamo.genericDelta.DeltaOp;
import org.educsos.dovamo.genericDelta.GenericDeltaPackage;

import org.educsos.dovamo.genericDelta.applicability.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.DeltaImpl#getDeltaOperations <em>Delta Operations</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.DeltaImpl#getApplicabilityCondition <em>Applicability Condition</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.DeltaImpl#getAfter <em>After</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeltaImpl extends IdentifierImpl implements Delta {
	/**
	 * The cached value of the '{@link #getDeltaOperations() <em>Delta Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<DeltaOp> deltaOperations;

	/**
	 * The cached value of the '{@link #getApplicabilityCondition() <em>Applicability Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicabilityCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression applicabilityCondition;

	/**
	 * The cached value of the '{@link #getAfter() <em>After</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected EList<Delta> after;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeltaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.DELTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeltaOp> getDeltaOperations() {
		if (deltaOperations == null) {
			deltaOperations = new EObjectContainmentEList<DeltaOp>(DeltaOp.class, this, GenericDeltaPackage.DELTA__DELTA_OPERATIONS);
		}
		return deltaOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getApplicabilityCondition() {
		return applicabilityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicabilityCondition(Expression newApplicabilityCondition, NotificationChain msgs) {
		Expression oldApplicabilityCondition = applicabilityCondition;
		applicabilityCondition = newApplicabilityCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.DELTA__APPLICABILITY_CONDITION, oldApplicabilityCondition, newApplicabilityCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicabilityCondition(Expression newApplicabilityCondition) {
		if (newApplicabilityCondition != applicabilityCondition) {
			NotificationChain msgs = null;
			if (applicabilityCondition != null)
				msgs = ((InternalEObject)applicabilityCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GenericDeltaPackage.DELTA__APPLICABILITY_CONDITION, null, msgs);
			if (newApplicabilityCondition != null)
				msgs = ((InternalEObject)newApplicabilityCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GenericDeltaPackage.DELTA__APPLICABILITY_CONDITION, null, msgs);
			msgs = basicSetApplicabilityCondition(newApplicabilityCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDeltaPackage.DELTA__APPLICABILITY_CONDITION, newApplicabilityCondition, newApplicabilityCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delta> getAfter() {
		if (after == null) {
			after = new EObjectResolvingEList<Delta>(Delta.class, this, GenericDeltaPackage.DELTA__AFTER);
		}
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericDeltaPackage.DELTA__DELTA_OPERATIONS:
				return ((InternalEList<?>)getDeltaOperations()).basicRemove(otherEnd, msgs);
			case GenericDeltaPackage.DELTA__APPLICABILITY_CONDITION:
				return basicSetApplicabilityCondition(null, msgs);
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
			case GenericDeltaPackage.DELTA__DELTA_OPERATIONS:
				return getDeltaOperations();
			case GenericDeltaPackage.DELTA__APPLICABILITY_CONDITION:
				return getApplicabilityCondition();
			case GenericDeltaPackage.DELTA__AFTER:
				return getAfter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenericDeltaPackage.DELTA__DELTA_OPERATIONS:
				getDeltaOperations().clear();
				getDeltaOperations().addAll((Collection<? extends DeltaOp>)newValue);
				return;
			case GenericDeltaPackage.DELTA__APPLICABILITY_CONDITION:
				setApplicabilityCondition((Expression)newValue);
				return;
			case GenericDeltaPackage.DELTA__AFTER:
				getAfter().clear();
				getAfter().addAll((Collection<? extends Delta>)newValue);
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
			case GenericDeltaPackage.DELTA__DELTA_OPERATIONS:
				getDeltaOperations().clear();
				return;
			case GenericDeltaPackage.DELTA__APPLICABILITY_CONDITION:
				setApplicabilityCondition((Expression)null);
				return;
			case GenericDeltaPackage.DELTA__AFTER:
				getAfter().clear();
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
			case GenericDeltaPackage.DELTA__DELTA_OPERATIONS:
				return deltaOperations != null && !deltaOperations.isEmpty();
			case GenericDeltaPackage.DELTA__APPLICABILITY_CONDITION:
				return applicabilityCondition != null;
			case GenericDeltaPackage.DELTA__AFTER:
				return after != null && !after.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeltaImpl
