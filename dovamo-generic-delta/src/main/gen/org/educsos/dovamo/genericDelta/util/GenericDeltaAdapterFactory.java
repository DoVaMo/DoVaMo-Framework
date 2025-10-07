/**
 */
package org.educsos.dovamo.genericDelta.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.educsos.dovamo.genericDelta.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage
 * @generated
 */
public class GenericDeltaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenericDeltaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDeltaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GenericDeltaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericDeltaSwitch<Adapter> modelSwitch =
		new GenericDeltaSwitch<Adapter>() {
			@Override
			public Adapter caseDeltaOp(DeltaOp object) {
				return createDeltaOpAdapter();
			}
			@Override
			public Adapter caseDelta(Delta object) {
				return createDeltaAdapter();
			}
			@Override
			public Adapter caseMacroDeltaOp(MacroDeltaOp object) {
				return createMacroDeltaOpAdapter();
			}
			@Override
			public Adapter caseAttDeltaOp(AttDeltaOp object) {
				return createAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseRefDeltaOp(RefDeltaOp object) {
				return createRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseSingleRefDeltaOp(SingleRefDeltaOp object) {
				return createSingleRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseMultiRefDeltaOp(MultiRefDeltaOp object) {
				return createMultiRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseSingleAttDeltaOp(SingleAttDeltaOp object) {
				return createSingleAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseMultiAttDeltaOp(MultiAttDeltaOp object) {
				return createMultiAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseSetSingleAttDeltaOp(SetSingleAttDeltaOp object) {
				return createSetSingleAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseUnsetSingleAttDeltaOp(UnsetSingleAttDeltaOp object) {
				return createUnsetSingleAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseUnsetSingleRefDeltaOp(UnsetSingleRefDeltaOp object) {
				return createUnsetSingleRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseSetSingleRefDeltaOp(SetSingleRefDeltaOp object) {
				return createSetSingleRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseInsertAtIndexMultiRefDeltaOp(InsertAtIndexMultiRefDeltaOp object) {
				return createInsertAtIndexMultiRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseAddByValueMultiRefDeltaOp(AddByValueMultiRefDeltaOp object) {
				return createAddByValueMultiRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseRemoveByValueMultiRefDeltaOp(RemoveByValueMultiRefDeltaOp object) {
				return createRemoveByValueMultiRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseClearMultiRefDeltaOp(ClearMultiRefDeltaOp object) {
				return createClearMultiRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseDeleteByIndexMultiRefDeltaOp(DeleteByIndexMultiRefDeltaOp object) {
				return createDeleteByIndexMultiRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseReplaceAtRefMacro(ReplaceAtRefMacro object) {
				return createReplaceAtRefMacroAdapter();
			}
			@Override
			public Adapter caseDeltaRepository(DeltaRepository object) {
				return createDeltaRepositoryAdapter();
			}
			@Override
			public Adapter caseAtomicDeltaOp(AtomicDeltaOp object) {
				return createAtomicDeltaOpAdapter();
			}
			@Override
			public Adapter caseMoveContained(MoveContained object) {
				return createMoveContainedAdapter();
			}
			@Override
			public Adapter caseRemovalMultiRefDeltaOp(RemovalMultiRefDeltaOp object) {
				return createRemovalMultiRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseAdditionMultiRefDeltaOp(AdditionMultiRefDeltaOp object) {
				return createAdditionMultiRefDeltaOpAdapter();
			}
			@Override
			public Adapter caseAdditionMultiAttDeltaOp(AdditionMultiAttDeltaOp object) {
				return createAdditionMultiAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseRemovalMultiAttDeltaOp(RemovalMultiAttDeltaOp object) {
				return createRemovalMultiAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseAddByValueMultiAttDeltaOp(AddByValueMultiAttDeltaOp object) {
				return createAddByValueMultiAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseInsertAtIndexMultiAttDeltaOp(InsertAtIndexMultiAttDeltaOp object) {
				return createInsertAtIndexMultiAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseDeleteByIndexMultiAttDeltaOp(DeleteByIndexMultiAttDeltaOp object) {
				return createDeleteByIndexMultiAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseRemoveByValueMultiAttDeltaOp(RemoveByValueMultiAttDeltaOp object) {
				return createRemoveByValueMultiAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseClearMultiAttDeltaOp(ClearMultiAttDeltaOp object) {
				return createClearMultiAttDeltaOpAdapter();
			}
			@Override
			public Adapter caseReplaceAtAttMacro(ReplaceAtAttMacro object) {
				return createReplaceAtAttMacroAdapter();
			}
			@Override
			public Adapter casePredefinedMacroDeltaOp(PredefinedMacroDeltaOp object) {
				return createPredefinedMacroDeltaOpAdapter();
			}
			@Override
			public Adapter caseDialectMacroDeltaOp(DialectMacroDeltaOp object) {
				return createDialectMacroDeltaOpAdapter();
			}
			@Override
			public Adapter caseCreationMacroDeltaOp(CreationMacroDeltaOp object) {
				return createCreationMacroDeltaOpAdapter();
			}
			@Override
			public Adapter caseInitializeRootObjectDeltaOp(InitializeRootObjectDeltaOp object) {
				return createInitializeRootObjectDeltaOpAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.DeltaOp <em>Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.DeltaOp
	 * @generated
	 */
	public Adapter createDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.Delta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.Delta
	 * @generated
	 */
	public Adapter createDeltaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.MacroDeltaOp <em>Macro Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.MacroDeltaOp
	 * @generated
	 */
	public Adapter createMacroDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.AttDeltaOp <em>Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.AttDeltaOp
	 * @generated
	 */
	public Adapter createAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.RefDeltaOp <em>Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.RefDeltaOp
	 * @generated
	 */
	public Adapter createRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.SingleRefDeltaOp <em>Single Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.SingleRefDeltaOp
	 * @generated
	 */
	public Adapter createSingleRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.MultiRefDeltaOp <em>Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.MultiRefDeltaOp
	 * @generated
	 */
	public Adapter createMultiRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.SingleAttDeltaOp <em>Single Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.SingleAttDeltaOp
	 * @generated
	 */
	public Adapter createSingleAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.MultiAttDeltaOp <em>Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.MultiAttDeltaOp
	 * @generated
	 */
	public Adapter createMultiAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.SetSingleAttDeltaOp <em>Set Single Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.SetSingleAttDeltaOp
	 * @generated
	 */
	public Adapter createSetSingleAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.UnsetSingleAttDeltaOp <em>Unset Single Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.UnsetSingleAttDeltaOp
	 * @generated
	 */
	public Adapter createUnsetSingleAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.UnsetSingleRefDeltaOp <em>Unset Single Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.UnsetSingleRefDeltaOp
	 * @generated
	 */
	public Adapter createUnsetSingleRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.SetSingleRefDeltaOp <em>Set Single Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.SetSingleRefDeltaOp
	 * @generated
	 */
	public Adapter createSetSingleRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.InsertAtIndexMultiRefDeltaOp <em>Insert At Index Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.InsertAtIndexMultiRefDeltaOp
	 * @generated
	 */
	public Adapter createInsertAtIndexMultiRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.AddByValueMultiRefDeltaOp <em>Add By Value Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.AddByValueMultiRefDeltaOp
	 * @generated
	 */
	public Adapter createAddByValueMultiRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp <em>Remove By Value Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp
	 * @generated
	 */
	public Adapter createRemoveByValueMultiRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.ClearMultiRefDeltaOp <em>Clear Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.ClearMultiRefDeltaOp
	 * @generated
	 */
	public Adapter createClearMultiRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.DeleteByIndexMultiRefDeltaOp <em>Delete By Index Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.DeleteByIndexMultiRefDeltaOp
	 * @generated
	 */
	public Adapter createDeleteByIndexMultiRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.ReplaceAtRefMacro <em>Replace At Ref Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.ReplaceAtRefMacro
	 * @generated
	 */
	public Adapter createReplaceAtRefMacroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.DeltaRepository <em>Delta Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.DeltaRepository
	 * @generated
	 */
	public Adapter createDeltaRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.AtomicDeltaOp <em>Atomic Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.AtomicDeltaOp
	 * @generated
	 */
	public Adapter createAtomicDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.MoveContained <em>Move Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.MoveContained
	 * @generated
	 */
	public Adapter createMoveContainedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.RemovalMultiRefDeltaOp <em>Removal Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.RemovalMultiRefDeltaOp
	 * @generated
	 */
	public Adapter createRemovalMultiRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.AdditionMultiRefDeltaOp <em>Addition Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.AdditionMultiRefDeltaOp
	 * @generated
	 */
	public Adapter createAdditionMultiRefDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.AdditionMultiAttDeltaOp <em>Addition Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.AdditionMultiAttDeltaOp
	 * @generated
	 */
	public Adapter createAdditionMultiAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.RemovalMultiAttDeltaOp <em>Removal Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.RemovalMultiAttDeltaOp
	 * @generated
	 */
	public Adapter createRemovalMultiAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.AddByValueMultiAttDeltaOp <em>Add By Value Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.AddByValueMultiAttDeltaOp
	 * @generated
	 */
	public Adapter createAddByValueMultiAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.InsertAtIndexMultiAttDeltaOp <em>Insert At Index Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.InsertAtIndexMultiAttDeltaOp
	 * @generated
	 */
	public Adapter createInsertAtIndexMultiAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.DeleteByIndexMultiAttDeltaOp <em>Delete By Index Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.DeleteByIndexMultiAttDeltaOp
	 * @generated
	 */
	public Adapter createDeleteByIndexMultiAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp <em>Remove By Value Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp
	 * @generated
	 */
	public Adapter createRemoveByValueMultiAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.ClearMultiAttDeltaOp <em>Clear Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.ClearMultiAttDeltaOp
	 * @generated
	 */
	public Adapter createClearMultiAttDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.ReplaceAtAttMacro <em>Replace At Att Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.ReplaceAtAttMacro
	 * @generated
	 */
	public Adapter createReplaceAtAttMacroAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.PredefinedMacroDeltaOp <em>Predefined Macro Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.PredefinedMacroDeltaOp
	 * @generated
	 */
	public Adapter createPredefinedMacroDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.DialectMacroDeltaOp <em>Dialect Macro Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.DialectMacroDeltaOp
	 * @generated
	 */
	public Adapter createDialectMacroDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.CreationMacroDeltaOp <em>Creation Macro Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.CreationMacroDeltaOp
	 * @generated
	 */
	public Adapter createCreationMacroDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp <em>Initialize Root Object Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp
	 * @generated
	 */
	public Adapter createInitializeRootObjectDeltaOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GenericDeltaAdapterFactory
