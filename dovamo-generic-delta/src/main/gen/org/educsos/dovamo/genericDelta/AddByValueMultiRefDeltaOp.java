/**
 */
package org.educsos.dovamo.genericDelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add By Value Multi Ref Delta Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.AddByValueMultiRefDeltaOp#getIdOfAddedValue <em>Id Of Added Value</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getAddByValueMultiRefDeltaOp()
 * @model
 * @generated
 */
public interface AddByValueMultiRefDeltaOp extends AdditionMultiRefDeltaOp {
	/**
	 * Returns the value of the '<em><b>Id Of Added Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Of Added Value</em>' attribute.
	 * @see #setIdOfAddedValue(String)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getAddByValueMultiRefDeltaOp_IdOfAddedValue()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getIdOfAddedValue();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.AddByValueMultiRefDeltaOp#getIdOfAddedValue <em>Id Of Added Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Of Added Value</em>' attribute.
	 * @see #getIdOfAddedValue()
	 * @generated
	 */
	void setIdOfAddedValue(String value);

} // AddByValueMultiRefDeltaOp
