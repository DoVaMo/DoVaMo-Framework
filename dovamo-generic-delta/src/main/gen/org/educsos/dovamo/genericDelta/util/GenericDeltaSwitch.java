/**
 */
package org.educsos.dovamo.genericDelta.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.educsos.dovamo.genericDelta.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage
 * @generated
 */
public class GenericDeltaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenericDeltaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDeltaSwitch() {
		if (modelPackage == null) {
			modelPackage = GenericDeltaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GenericDeltaPackage.DELTA_OP: {
				DeltaOp deltaOp = (DeltaOp)theEObject;
				T result = caseDeltaOp(deltaOp);
				if (result == null) result = caseIdentifier(deltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.DELTA: {
				Delta delta = (Delta)theEObject;
				T result = caseDelta(delta);
				if (result == null) result = caseIdentifier(delta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.MACRO_DELTA_OP: {
				MacroDeltaOp macroDeltaOp = (MacroDeltaOp)theEObject;
				T result = caseMacroDeltaOp(macroDeltaOp);
				if (result == null) result = caseDeltaOp(macroDeltaOp);
				if (result == null) result = caseIdentifier(macroDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.ATT_DELTA_OP: {
				AttDeltaOp attDeltaOp = (AttDeltaOp)theEObject;
				T result = caseAttDeltaOp(attDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(attDeltaOp);
				if (result == null) result = caseDeltaOp(attDeltaOp);
				if (result == null) result = caseIdentifier(attDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.REF_DELTA_OP: {
				RefDeltaOp refDeltaOp = (RefDeltaOp)theEObject;
				T result = caseRefDeltaOp(refDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(refDeltaOp);
				if (result == null) result = caseDeltaOp(refDeltaOp);
				if (result == null) result = caseIdentifier(refDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.SINGLE_REF_DELTA_OP: {
				SingleRefDeltaOp singleRefDeltaOp = (SingleRefDeltaOp)theEObject;
				T result = caseSingleRefDeltaOp(singleRefDeltaOp);
				if (result == null) result = caseRefDeltaOp(singleRefDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(singleRefDeltaOp);
				if (result == null) result = caseDeltaOp(singleRefDeltaOp);
				if (result == null) result = caseIdentifier(singleRefDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.MULTI_REF_DELTA_OP: {
				MultiRefDeltaOp multiRefDeltaOp = (MultiRefDeltaOp)theEObject;
				T result = caseMultiRefDeltaOp(multiRefDeltaOp);
				if (result == null) result = caseRefDeltaOp(multiRefDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(multiRefDeltaOp);
				if (result == null) result = caseDeltaOp(multiRefDeltaOp);
				if (result == null) result = caseIdentifier(multiRefDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.SINGLE_ATT_DELTA_OP: {
				SingleAttDeltaOp singleAttDeltaOp = (SingleAttDeltaOp)theEObject;
				T result = caseSingleAttDeltaOp(singleAttDeltaOp);
				if (result == null) result = caseAttDeltaOp(singleAttDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(singleAttDeltaOp);
				if (result == null) result = caseDeltaOp(singleAttDeltaOp);
				if (result == null) result = caseIdentifier(singleAttDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.MULTI_ATT_DELTA_OP: {
				MultiAttDeltaOp multiAttDeltaOp = (MultiAttDeltaOp)theEObject;
				T result = caseMultiAttDeltaOp(multiAttDeltaOp);
				if (result == null) result = caseAttDeltaOp(multiAttDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(multiAttDeltaOp);
				if (result == null) result = caseDeltaOp(multiAttDeltaOp);
				if (result == null) result = caseIdentifier(multiAttDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.SET_SINGLE_ATT_DELTA_OP: {
				SetSingleAttDeltaOp setSingleAttDeltaOp = (SetSingleAttDeltaOp)theEObject;
				T result = caseSetSingleAttDeltaOp(setSingleAttDeltaOp);
				if (result == null) result = caseSingleAttDeltaOp(setSingleAttDeltaOp);
				if (result == null) result = caseAttDeltaOp(setSingleAttDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(setSingleAttDeltaOp);
				if (result == null) result = caseDeltaOp(setSingleAttDeltaOp);
				if (result == null) result = caseIdentifier(setSingleAttDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.UNSET_SINGLE_ATT_DELTA_OP: {
				UnsetSingleAttDeltaOp unsetSingleAttDeltaOp = (UnsetSingleAttDeltaOp)theEObject;
				T result = caseUnsetSingleAttDeltaOp(unsetSingleAttDeltaOp);
				if (result == null) result = caseSingleAttDeltaOp(unsetSingleAttDeltaOp);
				if (result == null) result = caseAttDeltaOp(unsetSingleAttDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(unsetSingleAttDeltaOp);
				if (result == null) result = caseDeltaOp(unsetSingleAttDeltaOp);
				if (result == null) result = caseIdentifier(unsetSingleAttDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.UNSET_SINGLE_REF_DELTA_OP: {
				UnsetSingleRefDeltaOp unsetSingleRefDeltaOp = (UnsetSingleRefDeltaOp)theEObject;
				T result = caseUnsetSingleRefDeltaOp(unsetSingleRefDeltaOp);
				if (result == null) result = caseSingleRefDeltaOp(unsetSingleRefDeltaOp);
				if (result == null) result = caseRefDeltaOp(unsetSingleRefDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(unsetSingleRefDeltaOp);
				if (result == null) result = caseDeltaOp(unsetSingleRefDeltaOp);
				if (result == null) result = caseIdentifier(unsetSingleRefDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.SET_SINGLE_REF_DELTA_OP: {
				SetSingleRefDeltaOp setSingleRefDeltaOp = (SetSingleRefDeltaOp)theEObject;
				T result = caseSetSingleRefDeltaOp(setSingleRefDeltaOp);
				if (result == null) result = caseSingleRefDeltaOp(setSingleRefDeltaOp);
				if (result == null) result = caseRefDeltaOp(setSingleRefDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(setSingleRefDeltaOp);
				if (result == null) result = caseDeltaOp(setSingleRefDeltaOp);
				if (result == null) result = caseIdentifier(setSingleRefDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.INSERT_AT_INDEX_MULTI_REF_DELTA_OP: {
				InsertAtIndexMultiRefDeltaOp insertAtIndexMultiRefDeltaOp = (InsertAtIndexMultiRefDeltaOp)theEObject;
				T result = caseInsertAtIndexMultiRefDeltaOp(insertAtIndexMultiRefDeltaOp);
				if (result == null) result = caseAddByValueMultiRefDeltaOp(insertAtIndexMultiRefDeltaOp);
				if (result == null) result = caseAdditionMultiRefDeltaOp(insertAtIndexMultiRefDeltaOp);
				if (result == null) result = caseMultiRefDeltaOp(insertAtIndexMultiRefDeltaOp);
				if (result == null) result = caseRefDeltaOp(insertAtIndexMultiRefDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(insertAtIndexMultiRefDeltaOp);
				if (result == null) result = caseDeltaOp(insertAtIndexMultiRefDeltaOp);
				if (result == null) result = caseIdentifier(insertAtIndexMultiRefDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.ADD_BY_VALUE_MULTI_REF_DELTA_OP: {
				AddByValueMultiRefDeltaOp addByValueMultiRefDeltaOp = (AddByValueMultiRefDeltaOp)theEObject;
				T result = caseAddByValueMultiRefDeltaOp(addByValueMultiRefDeltaOp);
				if (result == null) result = caseAdditionMultiRefDeltaOp(addByValueMultiRefDeltaOp);
				if (result == null) result = caseMultiRefDeltaOp(addByValueMultiRefDeltaOp);
				if (result == null) result = caseRefDeltaOp(addByValueMultiRefDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(addByValueMultiRefDeltaOp);
				if (result == null) result = caseDeltaOp(addByValueMultiRefDeltaOp);
				if (result == null) result = caseIdentifier(addByValueMultiRefDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_REF_DELTA_OP: {
				RemoveByValueMultiRefDeltaOp removeByValueMultiRefDeltaOp = (RemoveByValueMultiRefDeltaOp)theEObject;
				T result = caseRemoveByValueMultiRefDeltaOp(removeByValueMultiRefDeltaOp);
				if (result == null) result = caseRemovalMultiRefDeltaOp(removeByValueMultiRefDeltaOp);
				if (result == null) result = caseMultiRefDeltaOp(removeByValueMultiRefDeltaOp);
				if (result == null) result = caseRefDeltaOp(removeByValueMultiRefDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(removeByValueMultiRefDeltaOp);
				if (result == null) result = caseDeltaOp(removeByValueMultiRefDeltaOp);
				if (result == null) result = caseIdentifier(removeByValueMultiRefDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.IDENTIFIER: {
				Identifier identifier = (Identifier)theEObject;
				T result = caseIdentifier(identifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.CLEAR_MULTI_REF_DELTA_OP: {
				ClearMultiRefDeltaOp clearMultiRefDeltaOp = (ClearMultiRefDeltaOp)theEObject;
				T result = caseClearMultiRefDeltaOp(clearMultiRefDeltaOp);
				if (result == null) result = caseRemovalMultiRefDeltaOp(clearMultiRefDeltaOp);
				if (result == null) result = caseMultiRefDeltaOp(clearMultiRefDeltaOp);
				if (result == null) result = caseRefDeltaOp(clearMultiRefDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(clearMultiRefDeltaOp);
				if (result == null) result = caseDeltaOp(clearMultiRefDeltaOp);
				if (result == null) result = caseIdentifier(clearMultiRefDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.DELETE_BY_INDEX_MULTI_REF_DELTA_OP: {
				DeleteByIndexMultiRefDeltaOp deleteByIndexMultiRefDeltaOp = (DeleteByIndexMultiRefDeltaOp)theEObject;
				T result = caseDeleteByIndexMultiRefDeltaOp(deleteByIndexMultiRefDeltaOp);
				if (result == null) result = caseRemovalMultiRefDeltaOp(deleteByIndexMultiRefDeltaOp);
				if (result == null) result = caseMultiRefDeltaOp(deleteByIndexMultiRefDeltaOp);
				if (result == null) result = caseRefDeltaOp(deleteByIndexMultiRefDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(deleteByIndexMultiRefDeltaOp);
				if (result == null) result = caseDeltaOp(deleteByIndexMultiRefDeltaOp);
				if (result == null) result = caseIdentifier(deleteByIndexMultiRefDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.REPLACE_AT_REF_MACRO: {
				ReplaceAtRefMacro replaceAtRefMacro = (ReplaceAtRefMacro)theEObject;
				T result = caseReplaceAtRefMacro(replaceAtRefMacro);
				if (result == null) result = casePredefinedMacroDeltaOp(replaceAtRefMacro);
				if (result == null) result = caseMacroDeltaOp(replaceAtRefMacro);
				if (result == null) result = caseDeltaOp(replaceAtRefMacro);
				if (result == null) result = caseIdentifier(replaceAtRefMacro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.DELTA_REPOSITORY: {
				DeltaRepository deltaRepository = (DeltaRepository)theEObject;
				T result = caseDeltaRepository(deltaRepository);
				if (result == null) result = caseIdentifier(deltaRepository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.ATOMIC_DELTA_OP: {
				AtomicDeltaOp atomicDeltaOp = (AtomicDeltaOp)theEObject;
				T result = caseAtomicDeltaOp(atomicDeltaOp);
				if (result == null) result = caseDeltaOp(atomicDeltaOp);
				if (result == null) result = caseIdentifier(atomicDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.MOVE_CONTAINED: {
				MoveContained moveContained = (MoveContained)theEObject;
				T result = caseMoveContained(moveContained);
				if (result == null) result = casePredefinedMacroDeltaOp(moveContained);
				if (result == null) result = caseMacroDeltaOp(moveContained);
				if (result == null) result = caseDeltaOp(moveContained);
				if (result == null) result = caseIdentifier(moveContained);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.REMOVAL_MULTI_REF_DELTA_OP: {
				RemovalMultiRefDeltaOp removalMultiRefDeltaOp = (RemovalMultiRefDeltaOp)theEObject;
				T result = caseRemovalMultiRefDeltaOp(removalMultiRefDeltaOp);
				if (result == null) result = caseMultiRefDeltaOp(removalMultiRefDeltaOp);
				if (result == null) result = caseRefDeltaOp(removalMultiRefDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(removalMultiRefDeltaOp);
				if (result == null) result = caseDeltaOp(removalMultiRefDeltaOp);
				if (result == null) result = caseIdentifier(removalMultiRefDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.ADDITION_MULTI_REF_DELTA_OP: {
				AdditionMultiRefDeltaOp additionMultiRefDeltaOp = (AdditionMultiRefDeltaOp)theEObject;
				T result = caseAdditionMultiRefDeltaOp(additionMultiRefDeltaOp);
				if (result == null) result = caseMultiRefDeltaOp(additionMultiRefDeltaOp);
				if (result == null) result = caseRefDeltaOp(additionMultiRefDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(additionMultiRefDeltaOp);
				if (result == null) result = caseDeltaOp(additionMultiRefDeltaOp);
				if (result == null) result = caseIdentifier(additionMultiRefDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.ADDITION_MULTI_ATT_DELTA_OP: {
				AdditionMultiAttDeltaOp additionMultiAttDeltaOp = (AdditionMultiAttDeltaOp)theEObject;
				T result = caseAdditionMultiAttDeltaOp(additionMultiAttDeltaOp);
				if (result == null) result = caseMultiAttDeltaOp(additionMultiAttDeltaOp);
				if (result == null) result = caseAttDeltaOp(additionMultiAttDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(additionMultiAttDeltaOp);
				if (result == null) result = caseDeltaOp(additionMultiAttDeltaOp);
				if (result == null) result = caseIdentifier(additionMultiAttDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.REMOVAL_MULTI_ATT_DELTA_OP: {
				RemovalMultiAttDeltaOp removalMultiAttDeltaOp = (RemovalMultiAttDeltaOp)theEObject;
				T result = caseRemovalMultiAttDeltaOp(removalMultiAttDeltaOp);
				if (result == null) result = caseMultiAttDeltaOp(removalMultiAttDeltaOp);
				if (result == null) result = caseAttDeltaOp(removalMultiAttDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(removalMultiAttDeltaOp);
				if (result == null) result = caseDeltaOp(removalMultiAttDeltaOp);
				if (result == null) result = caseIdentifier(removalMultiAttDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.ADD_BY_VALUE_MULTI_ATT_DELTA_OP: {
				AddByValueMultiAttDeltaOp addByValueMultiAttDeltaOp = (AddByValueMultiAttDeltaOp)theEObject;
				T result = caseAddByValueMultiAttDeltaOp(addByValueMultiAttDeltaOp);
				if (result == null) result = caseAdditionMultiAttDeltaOp(addByValueMultiAttDeltaOp);
				if (result == null) result = caseMultiAttDeltaOp(addByValueMultiAttDeltaOp);
				if (result == null) result = caseAttDeltaOp(addByValueMultiAttDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(addByValueMultiAttDeltaOp);
				if (result == null) result = caseDeltaOp(addByValueMultiAttDeltaOp);
				if (result == null) result = caseIdentifier(addByValueMultiAttDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.INSERT_AT_INDEX_MULTI_ATT_DELTA_OP: {
				InsertAtIndexMultiAttDeltaOp insertAtIndexMultiAttDeltaOp = (InsertAtIndexMultiAttDeltaOp)theEObject;
				T result = caseInsertAtIndexMultiAttDeltaOp(insertAtIndexMultiAttDeltaOp);
				if (result == null) result = caseAddByValueMultiAttDeltaOp(insertAtIndexMultiAttDeltaOp);
				if (result == null) result = caseAdditionMultiAttDeltaOp(insertAtIndexMultiAttDeltaOp);
				if (result == null) result = caseMultiAttDeltaOp(insertAtIndexMultiAttDeltaOp);
				if (result == null) result = caseAttDeltaOp(insertAtIndexMultiAttDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(insertAtIndexMultiAttDeltaOp);
				if (result == null) result = caseDeltaOp(insertAtIndexMultiAttDeltaOp);
				if (result == null) result = caseIdentifier(insertAtIndexMultiAttDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.DELETE_BY_INDEX_MULTI_ATT_DELTA_OP: {
				DeleteByIndexMultiAttDeltaOp deleteByIndexMultiAttDeltaOp = (DeleteByIndexMultiAttDeltaOp)theEObject;
				T result = caseDeleteByIndexMultiAttDeltaOp(deleteByIndexMultiAttDeltaOp);
				if (result == null) result = caseRemovalMultiAttDeltaOp(deleteByIndexMultiAttDeltaOp);
				if (result == null) result = caseMultiAttDeltaOp(deleteByIndexMultiAttDeltaOp);
				if (result == null) result = caseAttDeltaOp(deleteByIndexMultiAttDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(deleteByIndexMultiAttDeltaOp);
				if (result == null) result = caseDeltaOp(deleteByIndexMultiAttDeltaOp);
				if (result == null) result = caseIdentifier(deleteByIndexMultiAttDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP: {
				RemoveByValueMultiAttDeltaOp removeByValueMultiAttDeltaOp = (RemoveByValueMultiAttDeltaOp)theEObject;
				T result = caseRemoveByValueMultiAttDeltaOp(removeByValueMultiAttDeltaOp);
				if (result == null) result = caseRemovalMultiAttDeltaOp(removeByValueMultiAttDeltaOp);
				if (result == null) result = caseMultiAttDeltaOp(removeByValueMultiAttDeltaOp);
				if (result == null) result = caseAttDeltaOp(removeByValueMultiAttDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(removeByValueMultiAttDeltaOp);
				if (result == null) result = caseDeltaOp(removeByValueMultiAttDeltaOp);
				if (result == null) result = caseIdentifier(removeByValueMultiAttDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.CLEAR_MULTI_ATT_DELTA_OP: {
				ClearMultiAttDeltaOp clearMultiAttDeltaOp = (ClearMultiAttDeltaOp)theEObject;
				T result = caseClearMultiAttDeltaOp(clearMultiAttDeltaOp);
				if (result == null) result = caseRemovalMultiAttDeltaOp(clearMultiAttDeltaOp);
				if (result == null) result = caseMultiAttDeltaOp(clearMultiAttDeltaOp);
				if (result == null) result = caseAttDeltaOp(clearMultiAttDeltaOp);
				if (result == null) result = caseAtomicDeltaOp(clearMultiAttDeltaOp);
				if (result == null) result = caseDeltaOp(clearMultiAttDeltaOp);
				if (result == null) result = caseIdentifier(clearMultiAttDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO: {
				ReplaceAtAttMacro replaceAtAttMacro = (ReplaceAtAttMacro)theEObject;
				T result = caseReplaceAtAttMacro(replaceAtAttMacro);
				if (result == null) result = casePredefinedMacroDeltaOp(replaceAtAttMacro);
				if (result == null) result = caseMacroDeltaOp(replaceAtAttMacro);
				if (result == null) result = caseDeltaOp(replaceAtAttMacro);
				if (result == null) result = caseIdentifier(replaceAtAttMacro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.PREDEFINED_MACRO_DELTA_OP: {
				PredefinedMacroDeltaOp predefinedMacroDeltaOp = (PredefinedMacroDeltaOp)theEObject;
				T result = casePredefinedMacroDeltaOp(predefinedMacroDeltaOp);
				if (result == null) result = caseMacroDeltaOp(predefinedMacroDeltaOp);
				if (result == null) result = caseDeltaOp(predefinedMacroDeltaOp);
				if (result == null) result = caseIdentifier(predefinedMacroDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.DIALECT_MACRO_DELTA_OP: {
				DialectMacroDeltaOp dialectMacroDeltaOp = (DialectMacroDeltaOp)theEObject;
				T result = caseDialectMacroDeltaOp(dialectMacroDeltaOp);
				if (result == null) result = caseMacroDeltaOp(dialectMacroDeltaOp);
				if (result == null) result = caseDeltaOp(dialectMacroDeltaOp);
				if (result == null) result = caseIdentifier(dialectMacroDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.CREATION_MACRO_DELTA_OP: {
				CreationMacroDeltaOp creationMacroDeltaOp = (CreationMacroDeltaOp)theEObject;
				T result = caseCreationMacroDeltaOp(creationMacroDeltaOp);
				if (result == null) result = caseDialectMacroDeltaOp(creationMacroDeltaOp);
				if (result == null) result = caseMacroDeltaOp(creationMacroDeltaOp);
				if (result == null) result = caseDeltaOp(creationMacroDeltaOp);
				if (result == null) result = caseIdentifier(creationMacroDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP: {
				InitializeRootObjectDeltaOp initializeRootObjectDeltaOp = (InitializeRootObjectDeltaOp)theEObject;
				T result = caseInitializeRootObjectDeltaOp(initializeRootObjectDeltaOp);
				if (result == null) result = caseDeltaOp(initializeRootObjectDeltaOp);
				if (result == null) result = caseIdentifier(initializeRootObjectDeltaOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeltaOp(DeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelta(Delta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroDeltaOp(MacroDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttDeltaOp(AttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefDeltaOp(RefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleRefDeltaOp(SingleRefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiRefDeltaOp(MultiRefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleAttDeltaOp(SingleAttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiAttDeltaOp(MultiAttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Single Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Single Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetSingleAttDeltaOp(SetSingleAttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unset Single Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unset Single Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsetSingleAttDeltaOp(UnsetSingleAttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unset Single Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unset Single Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsetSingleRefDeltaOp(UnsetSingleRefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Single Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Single Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetSingleRefDeltaOp(SetSingleRefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert At Index Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert At Index Multi Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertAtIndexMultiRefDeltaOp(InsertAtIndexMultiRefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add By Value Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add By Value Multi Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddByValueMultiRefDeltaOp(AddByValueMultiRefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove By Value Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove By Value Multi Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveByValueMultiRefDeltaOp(RemoveByValueMultiRefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Multi Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearMultiRefDeltaOp(ClearMultiRefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete By Index Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete By Index Multi Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteByIndexMultiRefDeltaOp(DeleteByIndexMultiRefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace At Ref Macro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace At Ref Macro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceAtRefMacro(ReplaceAtRefMacro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delta Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delta Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeltaRepository(DeltaRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicDeltaOp(AtomicDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Contained</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Contained</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveContained(MoveContained object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Removal Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Removal Multi Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemovalMultiRefDeltaOp(RemovalMultiRefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Multi Ref Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Multi Ref Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionMultiRefDeltaOp(AdditionMultiRefDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Multi Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionMultiAttDeltaOp(AdditionMultiAttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Removal Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Removal Multi Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemovalMultiAttDeltaOp(RemovalMultiAttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add By Value Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add By Value Multi Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddByValueMultiAttDeltaOp(AddByValueMultiAttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert At Index Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert At Index Multi Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertAtIndexMultiAttDeltaOp(InsertAtIndexMultiAttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete By Index Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete By Index Multi Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteByIndexMultiAttDeltaOp(DeleteByIndexMultiAttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove By Value Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove By Value Multi Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveByValueMultiAttDeltaOp(RemoveByValueMultiAttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear Multi Att Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear Multi Att Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClearMultiAttDeltaOp(ClearMultiAttDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace At Att Macro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace At Att Macro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceAtAttMacro(ReplaceAtAttMacro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predefined Macro Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predefined Macro Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredefinedMacroDeltaOp(PredefinedMacroDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dialect Macro Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dialect Macro Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDialectMacroDeltaOp(DialectMacroDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation Macro Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation Macro Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreationMacroDeltaOp(CreationMacroDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialize Root Object Delta Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialize Root Object Delta Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitializeRootObjectDeltaOp(InitializeRootObjectDeltaOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GenericDeltaSwitch
