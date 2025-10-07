/**
 */
package org.educsos.dovamo.genericDelta;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialect Macro Delta Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.DialectMacroDeltaOp#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getDialectMacroDeltaOp()
 * @model abstract="true"
 * @generated
 */
public interface DialectMacroDeltaOp extends MacroDeltaOp {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(EClass)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getDialectMacroDeltaOp_Body()
	 * @model required="true"
	 * @generated
	 */
	EClass getBody();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.DialectMacroDeltaOp#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(EClass value);

} // DialectMacroDeltaOp
