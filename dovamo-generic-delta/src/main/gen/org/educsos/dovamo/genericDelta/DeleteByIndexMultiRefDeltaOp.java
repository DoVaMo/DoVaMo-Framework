/**
 */
package org.educsos.dovamo.genericDelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete By Index Multi Ref Delta Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.DeleteByIndexMultiRefDeltaOp#getPosition <em>Position</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getDeleteByIndexMultiRefDeltaOp()
 * @model
 * @generated
 */
public interface DeleteByIndexMultiRefDeltaOp extends RemovalMultiRefDeltaOp {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getDeleteByIndexMultiRefDeltaOp_Position()
	 * @model required="true"
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.DeleteByIndexMultiRefDeltaOp#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

} // DeleteByIndexMultiRefDeltaOp
