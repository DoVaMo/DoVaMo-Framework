/**
 */
package org.educsos.dovamo.genericDelta;

import org.eclipse.emf.common.util.EList;

import org.educsos.dovamo.genericDelta.applicability.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.Delta#getDeltaOperations <em>Delta Operations</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.Delta#getApplicabilityCondition <em>Applicability Condition</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.Delta#getAfter <em>After</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getDelta()
 * @model
 * @generated
 */
public interface Delta extends Identifier {
	/**
	 * Returns the value of the '<em><b>Delta Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.educsos.dovamo.genericDelta.DeltaOp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta Operations</em>' containment reference list.
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getDelta_DeltaOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeltaOp> getDeltaOperations();

	/**
	 * Returns the value of the '<em><b>Applicability Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicability Condition</em>' containment reference.
	 * @see #setApplicabilityCondition(Expression)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getDelta_ApplicabilityCondition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getApplicabilityCondition();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.Delta#getApplicabilityCondition <em>Applicability Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicability Condition</em>' containment reference.
	 * @see #getApplicabilityCondition()
	 * @generated
	 */
	void setApplicabilityCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>After</b></em>' reference list.
	 * The list contents are of type {@link org.educsos.dovamo.genericDelta.Delta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' reference list.
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getDelta_After()
	 * @model
	 * @generated
	 */
	EList<Delta> getAfter();

} // Delta
