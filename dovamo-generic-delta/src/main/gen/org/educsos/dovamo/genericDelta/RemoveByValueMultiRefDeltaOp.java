/**
 */
package org.educsos.dovamo.genericDelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove By Value Multi Ref Delta Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp#getIdOfRemovedValue <em>Id Of Removed Value</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getRemoveByValueMultiRefDeltaOp()
 * @model
 * @generated
 */
public interface RemoveByValueMultiRefDeltaOp extends RemovalMultiRefDeltaOp {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.educsos.dovamo.genericDelta.RemovalStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see org.educsos.dovamo.genericDelta.RemovalStrategy
	 * @see #setStrategy(RemovalStrategy)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getRemoveByValueMultiRefDeltaOp_Strategy()
	 * @model required="true"
	 * @generated
	 */
	RemovalStrategy getStrategy();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see org.educsos.dovamo.genericDelta.RemovalStrategy
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(RemovalStrategy value);

	/**
	 * Returns the value of the '<em><b>Id Of Removed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Of Removed Value</em>' attribute.
	 * @see #setIdOfRemovedValue(String)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getRemoveByValueMultiRefDeltaOp_IdOfRemovedValue()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getIdOfRemovedValue();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp#getIdOfRemovedValue <em>Id Of Removed Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Of Removed Value</em>' attribute.
	 * @see #getIdOfRemovedValue()
	 * @generated
	 */
	void setIdOfRemovedValue(String value);

} // RemoveByValueMultiRefDeltaOp
