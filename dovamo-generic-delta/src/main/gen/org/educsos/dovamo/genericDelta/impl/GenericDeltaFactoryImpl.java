/**
 */
package org.educsos.dovamo.genericDelta.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.educsos.dovamo.genericDelta.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericDeltaFactoryImpl extends EFactoryImpl implements GenericDeltaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericDeltaFactory init() {
		try {
			GenericDeltaFactory theGenericDeltaFactory = (GenericDeltaFactory)EPackage.Registry.INSTANCE.getEFactory(GenericDeltaPackage.eNS_URI);
			if (theGenericDeltaFactory != null) {
				return theGenericDeltaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenericDeltaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDeltaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GenericDeltaPackage.DELTA: return createDelta();
			case GenericDeltaPackage.SET_SINGLE_ATT_DELTA_OP: return createSetSingleAttDeltaOp();
			case GenericDeltaPackage.UNSET_SINGLE_ATT_DELTA_OP: return createUnsetSingleAttDeltaOp();
			case GenericDeltaPackage.UNSET_SINGLE_REF_DELTA_OP: return createUnsetSingleRefDeltaOp();
			case GenericDeltaPackage.SET_SINGLE_REF_DELTA_OP: return createSetSingleRefDeltaOp();
			case GenericDeltaPackage.INSERT_AT_INDEX_MULTI_REF_DELTA_OP: return createInsertAtIndexMultiRefDeltaOp();
			case GenericDeltaPackage.ADD_BY_VALUE_MULTI_REF_DELTA_OP: return createAddByValueMultiRefDeltaOp();
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_REF_DELTA_OP: return createRemoveByValueMultiRefDeltaOp();
			case GenericDeltaPackage.CLEAR_MULTI_REF_DELTA_OP: return createClearMultiRefDeltaOp();
			case GenericDeltaPackage.DELETE_BY_INDEX_MULTI_REF_DELTA_OP: return createDeleteByIndexMultiRefDeltaOp();
			case GenericDeltaPackage.REPLACE_AT_REF_MACRO: return createReplaceAtRefMacro();
			case GenericDeltaPackage.DELTA_REPOSITORY: return createDeltaRepository();
			case GenericDeltaPackage.MOVE_CONTAINED: return createMoveContained();
			case GenericDeltaPackage.ADD_BY_VALUE_MULTI_ATT_DELTA_OP: return createAddByValueMultiAttDeltaOp();
			case GenericDeltaPackage.INSERT_AT_INDEX_MULTI_ATT_DELTA_OP: return createInsertAtIndexMultiAttDeltaOp();
			case GenericDeltaPackage.DELETE_BY_INDEX_MULTI_ATT_DELTA_OP: return createDeleteByIndexMultiAttDeltaOp();
			case GenericDeltaPackage.REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP: return createRemoveByValueMultiAttDeltaOp();
			case GenericDeltaPackage.CLEAR_MULTI_ATT_DELTA_OP: return createClearMultiAttDeltaOp();
			case GenericDeltaPackage.REPLACE_AT_ATT_MACRO: return createReplaceAtAttMacro();
			case GenericDeltaPackage.INITIALIZE_ROOT_OBJECT_DELTA_OP: return createInitializeRootObjectDeltaOp();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GenericDeltaPackage.REMOVAL_STRATEGY:
				return createRemovalStrategyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GenericDeltaPackage.REMOVAL_STRATEGY:
				return convertRemovalStrategyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delta createDelta() {
		DeltaImpl delta = new DeltaImpl();
		return delta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetSingleAttDeltaOp createSetSingleAttDeltaOp() {
		SetSingleAttDeltaOpImpl setSingleAttDeltaOp = new SetSingleAttDeltaOpImpl();
		return setSingleAttDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsetSingleAttDeltaOp createUnsetSingleAttDeltaOp() {
		UnsetSingleAttDeltaOpImpl unsetSingleAttDeltaOp = new UnsetSingleAttDeltaOpImpl();
		return unsetSingleAttDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsetSingleRefDeltaOp createUnsetSingleRefDeltaOp() {
		UnsetSingleRefDeltaOpImpl unsetSingleRefDeltaOp = new UnsetSingleRefDeltaOpImpl();
		return unsetSingleRefDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetSingleRefDeltaOp createSetSingleRefDeltaOp() {
		SetSingleRefDeltaOpImpl setSingleRefDeltaOp = new SetSingleRefDeltaOpImpl();
		return setSingleRefDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertAtIndexMultiRefDeltaOp createInsertAtIndexMultiRefDeltaOp() {
		InsertAtIndexMultiRefDeltaOpImpl insertAtIndexMultiRefDeltaOp = new InsertAtIndexMultiRefDeltaOpImpl();
		return insertAtIndexMultiRefDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddByValueMultiRefDeltaOp createAddByValueMultiRefDeltaOp() {
		AddByValueMultiRefDeltaOpImpl addByValueMultiRefDeltaOp = new AddByValueMultiRefDeltaOpImpl();
		return addByValueMultiRefDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveByValueMultiRefDeltaOp createRemoveByValueMultiRefDeltaOp() {
		RemoveByValueMultiRefDeltaOpImpl removeByValueMultiRefDeltaOp = new RemoveByValueMultiRefDeltaOpImpl();
		return removeByValueMultiRefDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearMultiRefDeltaOp createClearMultiRefDeltaOp() {
		ClearMultiRefDeltaOpImpl clearMultiRefDeltaOp = new ClearMultiRefDeltaOpImpl();
		return clearMultiRefDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteByIndexMultiRefDeltaOp createDeleteByIndexMultiRefDeltaOp() {
		DeleteByIndexMultiRefDeltaOpImpl deleteByIndexMultiRefDeltaOp = new DeleteByIndexMultiRefDeltaOpImpl();
		return deleteByIndexMultiRefDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceAtRefMacro createReplaceAtRefMacro() {
		ReplaceAtRefMacroImpl replaceAtRefMacro = new ReplaceAtRefMacroImpl();
		return replaceAtRefMacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeltaRepository createDeltaRepository() {
		DeltaRepositoryImpl deltaRepository = new DeltaRepositoryImpl();
		return deltaRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveContained createMoveContained() {
		MoveContainedImpl moveContained = new MoveContainedImpl();
		return moveContained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddByValueMultiAttDeltaOp createAddByValueMultiAttDeltaOp() {
		AddByValueMultiAttDeltaOpImpl addByValueMultiAttDeltaOp = new AddByValueMultiAttDeltaOpImpl();
		return addByValueMultiAttDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertAtIndexMultiAttDeltaOp createInsertAtIndexMultiAttDeltaOp() {
		InsertAtIndexMultiAttDeltaOpImpl insertAtIndexMultiAttDeltaOp = new InsertAtIndexMultiAttDeltaOpImpl();
		return insertAtIndexMultiAttDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteByIndexMultiAttDeltaOp createDeleteByIndexMultiAttDeltaOp() {
		DeleteByIndexMultiAttDeltaOpImpl deleteByIndexMultiAttDeltaOp = new DeleteByIndexMultiAttDeltaOpImpl();
		return deleteByIndexMultiAttDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveByValueMultiAttDeltaOp createRemoveByValueMultiAttDeltaOp() {
		RemoveByValueMultiAttDeltaOpImpl removeByValueMultiAttDeltaOp = new RemoveByValueMultiAttDeltaOpImpl();
		return removeByValueMultiAttDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearMultiAttDeltaOp createClearMultiAttDeltaOp() {
		ClearMultiAttDeltaOpImpl clearMultiAttDeltaOp = new ClearMultiAttDeltaOpImpl();
		return clearMultiAttDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceAtAttMacro createReplaceAtAttMacro() {
		ReplaceAtAttMacroImpl replaceAtAttMacro = new ReplaceAtAttMacroImpl();
		return replaceAtAttMacro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializeRootObjectDeltaOp createInitializeRootObjectDeltaOp() {
		InitializeRootObjectDeltaOpImpl initializeRootObjectDeltaOp = new InitializeRootObjectDeltaOpImpl();
		return initializeRootObjectDeltaOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovalStrategy createRemovalStrategyFromString(EDataType eDataType, String initialValue) {
		RemovalStrategy result = RemovalStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRemovalStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDeltaPackage getGenericDeltaPackage() {
		return (GenericDeltaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenericDeltaPackage getPackage() {
		return GenericDeltaPackage.eINSTANCE;
	}

} //GenericDeltaFactoryImpl
