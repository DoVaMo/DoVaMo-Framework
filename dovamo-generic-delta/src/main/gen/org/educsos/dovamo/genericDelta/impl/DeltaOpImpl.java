/**
 */
package org.educsos.dovamo.genericDelta.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.educsos.dovamo.genericDelta.DeltaOp;
import org.educsos.dovamo.genericDelta.GenericDeltaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delta Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class DeltaOpImpl extends IdentifierImpl implements DeltaOp {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeltaOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDeltaPackage.Literals.DELTA_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void apply() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GenericDeltaPackage.DELTA_OP___APPLY:
				apply();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DeltaOpImpl
