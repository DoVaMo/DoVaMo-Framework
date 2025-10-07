/**
 */
package org.educsos.dovamo.genericDelta.applicability;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.applicability.AndExpression#getOperands <em>Operands</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.applicability.ApplicabilityPackage#getAndExpression()
 * @model
 * @generated
 */
public interface AndExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link org.educsos.dovamo.genericDelta.applicability.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see org.educsos.dovamo.genericDelta.applicability.ApplicabilityPackage#getAndExpression_Operands()
	 * @model containment="true" lower="2" ordered="false"
	 * @generated
	 */
	EList<Expression> getOperands();

} // AndExpression
