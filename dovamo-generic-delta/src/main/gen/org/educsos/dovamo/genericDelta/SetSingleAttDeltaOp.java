/**
 */
package org.educsos.dovamo.genericDelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Single Att Delta Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.SetSingleAttDeltaOp#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getSetSingleAttDeltaOp()
 * @model
 * @generated
 */
public interface SetSingleAttDeltaOp extends SingleAttDeltaOp {
	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute.
	 * @see #setNewValue(String)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getSetSingleAttDeltaOp_NewValue()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getNewValue();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.SetSingleAttDeltaOp#getNewValue <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Value</em>' attribute.
	 * @see #getNewValue()
	 * @generated
	 */
	void setNewValue(String value);

} // SetSingleAttDeltaOp
