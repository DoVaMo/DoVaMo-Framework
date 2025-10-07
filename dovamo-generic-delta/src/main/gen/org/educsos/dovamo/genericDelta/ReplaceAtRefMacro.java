/**
 */
package org.educsos.dovamo.genericDelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace At Ref Macro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.ReplaceAtRefMacro#getDelete <em>Delete</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.ReplaceAtRefMacro#getInsert <em>Insert</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getReplaceAtRefMacro()
 * @model
 * @generated
 */
public interface ReplaceAtRefMacro extends PredefinedMacroDeltaOp {
	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(DeleteByIndexMultiRefDeltaOp)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getReplaceAtRefMacro_Delete()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DeleteByIndexMultiRefDeltaOp getDelete();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.ReplaceAtRefMacro#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(DeleteByIndexMultiRefDeltaOp value);

	/**
	 * Returns the value of the '<em><b>Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insert</em>' containment reference.
	 * @see #setInsert(InsertAtIndexMultiRefDeltaOp)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getReplaceAtRefMacro_Insert()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InsertAtIndexMultiRefDeltaOp getInsert();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.ReplaceAtRefMacro#getInsert <em>Insert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insert</em>' containment reference.
	 * @see #getInsert()
	 * @generated
	 */
	void setInsert(InsertAtIndexMultiRefDeltaOp value);

} // ReplaceAtRefMacro
