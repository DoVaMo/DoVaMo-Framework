/**
 */
package org.educsos.dovamo.genericDelta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.educsos.dovamo.genericDelta.Delta;
import org.educsos.dovamo.genericDelta.DeltaRepository;
import org.educsos.dovamo.genericDelta.GenericDeltaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.impl.DeltaRepositoryImpl#getDelta <em>Delta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeltaRepositoryImpl extends IdentifierImpl implements DeltaRepository {
	/**
	 * The cached value of the '{@link #getDelta() <em>Delta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelta()
	 * @generated
	 * @ordered
	 */
	protected EList<Delta> delta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeltaRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.DELTA_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Delta> getDelta() {
		if (delta == null) {
			delta = new EObjectContainmentEList<Delta>(Delta.class, this, GenericDeltaPackage.DELTA_REPOSITORY__DELTA);
		}
		return delta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GenericDeltaPackage.DELTA_REPOSITORY__DELTA:
				return ((InternalEList<?>)getDelta()).basicRemove(otherEnd, msgs);
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
			case GenericDeltaPackage.DELTA_REPOSITORY__DELTA:
				return getDelta();
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
			case GenericDeltaPackage.DELTA_REPOSITORY__DELTA:
				getDelta().clear();
				getDelta().addAll((Collection<? extends Delta>)newValue);
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
			case GenericDeltaPackage.DELTA_REPOSITORY__DELTA:
				getDelta().clear();
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
			case GenericDeltaPackage.DELTA_REPOSITORY__DELTA:
				return delta != null && !delta.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeltaRepositoryImpl
