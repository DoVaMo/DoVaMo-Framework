/**
 */
package org.educsos.dovamo.genericDelta;

import org.eclipse.emf.ecore.EAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Att Delta Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.AttDeltaOp#getModifiedAtt <em>Modified Att</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.AttDeltaOp#getModifiedAttString <em>Modified Att String</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getAttDeltaOp()
 * @model abstract="true"
 * @generated
 */
public interface AttDeltaOp extends AtomicDeltaOp {
	/**
	 * Returns the value of the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Att</em>' reference.
	 * @see #setModifiedAtt(EAttribute)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getAttDeltaOp_ModifiedAtt()
	 * @model
	 * @generated
	 */
	EAttribute getModifiedAtt();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.AttDeltaOp#getModifiedAtt <em>Modified Att</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Att</em>' reference.
	 * @see #getModifiedAtt()
	 * @generated
	 */
	void setModifiedAtt(EAttribute value);

	/**
	 * Returns the value of the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Att String</em>' attribute.
	 * @see #setModifiedAttString(String)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getAttDeltaOp_ModifiedAttString()
	 * @model required="true"
	 * @generated
	 */
	String getModifiedAttString();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.AttDeltaOp#getModifiedAttString <em>Modified Att String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Att String</em>' attribute.
	 * @see #getModifiedAttString()
	 * @generated
	 */
	void setModifiedAttString(String value);

} // AttDeltaOp
