/**
 */
package org.educsos.dovamo.genericDelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Contained</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.MoveContained#getRemove <em>Remove</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.MoveContained#getAdd <em>Add</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getMoveContained()
 * @model
 * @generated
 */
public interface MoveContained extends PredefinedMacroDeltaOp {
	/**
	 * Returns the value of the '<em><b>Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove</em>' containment reference.
	 * @see #setRemove(RemoveByValueMultiRefDeltaOp)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getMoveContained_Remove()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RemoveByValueMultiRefDeltaOp getRemove();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.MoveContained#getRemove <em>Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove</em>' containment reference.
	 * @see #getRemove()
	 * @generated
	 */
	void setRemove(RemoveByValueMultiRefDeltaOp value);

	/**
	 * Returns the value of the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Add</em>' containment reference.
	 * @see #setAdd(AdditionMultiRefDeltaOp)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getMoveContained_Add()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AdditionMultiRefDeltaOp getAdd();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.MoveContained#getAdd <em>Add</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add</em>' containment reference.
	 * @see #getAdd()
	 * @generated
	 */
	void setAdd(AdditionMultiRefDeltaOp value);

} // MoveContained
