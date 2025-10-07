/**
 */
package org.educsos.dovamo.genericDelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Single Ref Delta Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.SetSingleRefDeltaOp#getIdOfNewValue <em>Id Of New Value</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getSetSingleRefDeltaOp()
 * @model
 * @generated
 */
public interface SetSingleRefDeltaOp extends SingleRefDeltaOp {
	/**
	 * Returns the value of the '<em><b>Id Of New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Of New Value</em>' attribute.
	 * @see #setIdOfNewValue(String)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getSetSingleRefDeltaOp_IdOfNewValue()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getIdOfNewValue();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.SetSingleRefDeltaOp#getIdOfNewValue <em>Id Of New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Of New Value</em>' attribute.
	 * @see #getIdOfNewValue()
	 * @generated
	 */
	void setIdOfNewValue(String value);

} // SetSingleRefDeltaOp
