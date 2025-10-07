/**
 */
package org.educsos.dovamo.genericDelta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage
 * @generated
 */
public interface GenericDeltaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericDeltaFactory eINSTANCE = org.educsos.dovamo.genericDelta.impl.GenericDeltaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Delta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delta</em>'.
	 * @generated
	 */
	Delta createDelta();

	/**
	 * Returns a new object of class '<em>Set Single Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Single Att Delta Op</em>'.
	 * @generated
	 */
	SetSingleAttDeltaOp createSetSingleAttDeltaOp();

	/**
	 * Returns a new object of class '<em>Unset Single Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unset Single Att Delta Op</em>'.
	 * @generated
	 */
	UnsetSingleAttDeltaOp createUnsetSingleAttDeltaOp();

	/**
	 * Returns a new object of class '<em>Unset Single Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unset Single Ref Delta Op</em>'.
	 * @generated
	 */
	UnsetSingleRefDeltaOp createUnsetSingleRefDeltaOp();

	/**
	 * Returns a new object of class '<em>Set Single Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Single Ref Delta Op</em>'.
	 * @generated
	 */
	SetSingleRefDeltaOp createSetSingleRefDeltaOp();

	/**
	 * Returns a new object of class '<em>Insert At Index Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert At Index Multi Ref Delta Op</em>'.
	 * @generated
	 */
	InsertAtIndexMultiRefDeltaOp createInsertAtIndexMultiRefDeltaOp();

	/**
	 * Returns a new object of class '<em>Add By Value Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add By Value Multi Ref Delta Op</em>'.
	 * @generated
	 */
	AddByValueMultiRefDeltaOp createAddByValueMultiRefDeltaOp();

	/**
	 * Returns a new object of class '<em>Remove By Value Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove By Value Multi Ref Delta Op</em>'.
	 * @generated
	 */
	RemoveByValueMultiRefDeltaOp createRemoveByValueMultiRefDeltaOp();

	/**
	 * Returns a new object of class '<em>Clear Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Multi Ref Delta Op</em>'.
	 * @generated
	 */
	ClearMultiRefDeltaOp createClearMultiRefDeltaOp();

	/**
	 * Returns a new object of class '<em>Delete By Index Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete By Index Multi Ref Delta Op</em>'.
	 * @generated
	 */
	DeleteByIndexMultiRefDeltaOp createDeleteByIndexMultiRefDeltaOp();

	/**
	 * Returns a new object of class '<em>Replace At Ref Macro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replace At Ref Macro</em>'.
	 * @generated
	 */
	ReplaceAtRefMacro createReplaceAtRefMacro();

	/**
	 * Returns a new object of class '<em>Delta Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delta Repository</em>'.
	 * @generated
	 */
	DeltaRepository createDeltaRepository();

	/**
	 * Returns a new object of class '<em>Move Contained</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Contained</em>'.
	 * @generated
	 */
	MoveContained createMoveContained();

	/**
	 * Returns a new object of class '<em>Add By Value Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add By Value Multi Att Delta Op</em>'.
	 * @generated
	 */
	AddByValueMultiAttDeltaOp createAddByValueMultiAttDeltaOp();

	/**
	 * Returns a new object of class '<em>Insert At Index Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert At Index Multi Att Delta Op</em>'.
	 * @generated
	 */
	InsertAtIndexMultiAttDeltaOp createInsertAtIndexMultiAttDeltaOp();

	/**
	 * Returns a new object of class '<em>Delete By Index Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete By Index Multi Att Delta Op</em>'.
	 * @generated
	 */
	DeleteByIndexMultiAttDeltaOp createDeleteByIndexMultiAttDeltaOp();

	/**
	 * Returns a new object of class '<em>Remove By Value Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove By Value Multi Att Delta Op</em>'.
	 * @generated
	 */
	RemoveByValueMultiAttDeltaOp createRemoveByValueMultiAttDeltaOp();

	/**
	 * Returns a new object of class '<em>Clear Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clear Multi Att Delta Op</em>'.
	 * @generated
	 */
	ClearMultiAttDeltaOp createClearMultiAttDeltaOp();

	/**
	 * Returns a new object of class '<em>Replace At Att Macro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replace At Att Macro</em>'.
	 * @generated
	 */
	ReplaceAtAttMacro createReplaceAtAttMacro();

	/**
	 * Returns a new object of class '<em>Initialize Root Object Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initialize Root Object Delta Op</em>'.
	 * @generated
	 */
	InitializeRootObjectDeltaOp createInitializeRootObjectDeltaOp();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GenericDeltaPackage getGenericDeltaPackage();

} //GenericDeltaFactory
