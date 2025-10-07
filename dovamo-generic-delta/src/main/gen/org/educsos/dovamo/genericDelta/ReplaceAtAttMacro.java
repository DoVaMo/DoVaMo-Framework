/**
 */
package org.educsos.dovamo.genericDelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace At Att Macro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.ReplaceAtAttMacro#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.ReplaceAtAttMacro#getInsert <em>Insert</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getReplaceAtAttMacro()
 * @model
 * @generated
 */
public interface ReplaceAtAttMacro extends PredefinedMacroDeltaOp {
	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(DeleteByIndexMultiAttDeltaOp)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getReplaceAtAttMacro_Delete()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeleteByIndexMultiAttDeltaOp getDelete();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.ReplaceAtAttMacro#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(DeleteByIndexMultiAttDeltaOp value);

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' containment reference.
	 * @see #setInsert(InsertAtIndexMultiAttDeltaOp)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getReplaceAtAttMacro_Insert()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InsertAtIndexMultiAttDeltaOp getInsert();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.ReplaceAtAttMacro#getInsert <em>Insert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert</em>' containment reference.
	 * @see #getInsert()
	 * @generated
	 */
	void setInsert(InsertAtIndexMultiAttDeltaOp value);

} // ReplaceAtAttMacro
