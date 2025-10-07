/**
 */
package org.educsos.dovamo.genericDelta.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.educsos.dovamo.genericDelta.AddByValueMultiAttDeltaOp;
import org.educsos.dovamo.genericDelta.AddByValueMultiRefDeltaOp;
import org.educsos.dovamo.genericDelta.AdditionMultiAttDeltaOp;
import org.educsos.dovamo.genericDelta.AdditionMultiRefDeltaOp;
import org.educsos.dovamo.genericDelta.AtomicDeltaOp;
import org.educsos.dovamo.genericDelta.AttDeltaOp;
import org.educsos.dovamo.genericDelta.ClearMultiAttDeltaOp;
import org.educsos.dovamo.genericDelta.ClearMultiRefDeltaOp;
import org.educsos.dovamo.genericDelta.CreationMacroDeltaOp;
import org.educsos.dovamo.genericDelta.DeleteByIndexMultiAttDeltaOp;
import org.educsos.dovamo.genericDelta.DeleteByIndexMultiRefDeltaOp;
import org.educsos.dovamo.genericDelta.Delta;
import org.educsos.dovamo.genericDelta.DeltaOp;
import org.educsos.dovamo.genericDelta.DeltaRepository;
import org.educsos.dovamo.genericDelta.DialectMacroDeltaOp;
import org.educsos.dovamo.genericDelta.GenericDeltaFactory;
import org.educsos.dovamo.genericDelta.GenericDeltaPackage;
import org.educsos.dovamo.genericDelta.Identifier;
import org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp;
import org.educsos.dovamo.genericDelta.InsertAtIndexMultiAttDeltaOp;
import org.educsos.dovamo.genericDelta.InsertAtIndexMultiRefDeltaOp;
import org.educsos.dovamo.genericDelta.MacroDeltaOp;
import org.educsos.dovamo.genericDelta.MoveContained;
import org.educsos.dovamo.genericDelta.MultiAttDeltaOp;
import org.educsos.dovamo.genericDelta.MultiRefDeltaOp;
import org.educsos.dovamo.genericDelta.PredefinedMacroDeltaOp;
import org.educsos.dovamo.genericDelta.RefDeltaOp;
import org.educsos.dovamo.genericDelta.RemovalMultiAttDeltaOp;
import org.educsos.dovamo.genericDelta.RemovalMultiRefDeltaOp;
import org.educsos.dovamo.genericDelta.RemovalStrategy;
import org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp;
import org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp;
import org.educsos.dovamo.genericDelta.ReplaceAtAttMacro;
import org.educsos.dovamo.genericDelta.ReplaceAtRefMacro;
import org.educsos.dovamo.genericDelta.SetSingleAttDeltaOp;
import org.educsos.dovamo.genericDelta.SetSingleRefDeltaOp;
import org.educsos.dovamo.genericDelta.SingleAttDeltaOp;
import org.educsos.dovamo.genericDelta.SingleRefDeltaOp;
import org.educsos.dovamo.genericDelta.UnsetSingleAttDeltaOp;
import org.educsos.dovamo.genericDelta.UnsetSingleRefDeltaOp;

import org.educsos.dovamo.genericDelta.applicability.ApplicabilityPackage;

import org.educsos.dovamo.genericDelta.applicability.impl.ApplicabilityPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericDeltaPackageImpl extends EPackageImpl implements GenericDeltaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deltaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macroDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleRefDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiRefDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleAttDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiAttDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setSingleAttDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsetSingleAttDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsetSingleRefDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setSingleRefDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertAtIndexMultiRefDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addByValueMultiRefDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeByValueMultiRefDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearMultiRefDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteByIndexMultiRefDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceAtRefMacroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deltaRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveContainedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removalMultiRefDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionMultiRefDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionMultiAttDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removalMultiAttDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addByValueMultiAttDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertAtIndexMultiAttDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteByIndexMultiAttDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeByValueMultiAttDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearMultiAttDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceAtAttMacroEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedMacroDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dialectMacroDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creationMacroDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializeRootObjectDeltaOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum removalStrategyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenericDeltaPackageImpl() {
		super(eNS_URI, GenericDeltaFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GenericDeltaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenericDeltaPackage init() {
		if (isInited) return (GenericDeltaPackage)EPackage.Registry.INSTANCE.getEPackage(GenericDeltaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGenericDeltaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GenericDeltaPackageImpl theGenericDeltaPackage = registeredGenericDeltaPackage instanceof GenericDeltaPackageImpl ? (GenericDeltaPackageImpl)registeredGenericDeltaPackage : new GenericDeltaPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ApplicabilityPackage.eNS_URI);
		ApplicabilityPackageImpl theApplicabilityPackage = (ApplicabilityPackageImpl)(registeredPackage instanceof ApplicabilityPackageImpl ? registeredPackage : ApplicabilityPackage.eINSTANCE);

		// Create package meta-data objects
		theGenericDeltaPackage.createPackageContents();
		theApplicabilityPackage.createPackageContents();

		// Initialize created meta-data
		theGenericDeltaPackage.initializePackageContents();
		theApplicabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenericDeltaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenericDeltaPackage.eNS_URI, theGenericDeltaPackage);
		return theGenericDeltaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeltaOp() {
		return deltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeltaOp__Apply() {
		return deltaOpEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelta() {
		return deltaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelta_DeltaOperations() {
		return (EReference)deltaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelta_ApplicabilityCondition() {
		return (EReference)deltaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelta_After() {
		return (EReference)deltaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacroDeltaOp() {
		return macroDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttDeltaOp() {
		return attDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttDeltaOp_ModifiedAtt() {
		return (EReference)attDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttDeltaOp_ModifiedAttString() {
		return (EAttribute)attDeltaOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefDeltaOp() {
		return refDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefDeltaOp_ModifiedRef() {
		return (EReference)refDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefDeltaOp_ModifiedRefString() {
		return (EAttribute)refDeltaOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleRefDeltaOp() {
		return singleRefDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiRefDeltaOp() {
		return multiRefDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleAttDeltaOp() {
		return singleAttDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiAttDeltaOp() {
		return multiAttDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetSingleAttDeltaOp() {
		return setSingleAttDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetSingleAttDeltaOp_NewValue() {
		return (EAttribute)setSingleAttDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsetSingleAttDeltaOp() {
		return unsetSingleAttDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsetSingleRefDeltaOp() {
		return unsetSingleRefDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetSingleRefDeltaOp() {
		return setSingleRefDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetSingleRefDeltaOp_IdOfNewValue() {
		return (EAttribute)setSingleRefDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertAtIndexMultiRefDeltaOp() {
		return insertAtIndexMultiRefDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertAtIndexMultiRefDeltaOp_Position() {
		return (EAttribute)insertAtIndexMultiRefDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddByValueMultiRefDeltaOp() {
		return addByValueMultiRefDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddByValueMultiRefDeltaOp_IdOfAddedValue() {
		return (EAttribute)addByValueMultiRefDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveByValueMultiRefDeltaOp() {
		return removeByValueMultiRefDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveByValueMultiRefDeltaOp_Strategy() {
		return (EAttribute)removeByValueMultiRefDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveByValueMultiRefDeltaOp_IdOfRemovedValue() {
		return (EAttribute)removeByValueMultiRefDeltaOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Id() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifier_Name() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearMultiRefDeltaOp() {
		return clearMultiRefDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteByIndexMultiRefDeltaOp() {
		return deleteByIndexMultiRefDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteByIndexMultiRefDeltaOp_Position() {
		return (EAttribute)deleteByIndexMultiRefDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceAtRefMacro() {
		return replaceAtRefMacroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplaceAtRefMacro_Delete() {
		return (EReference)replaceAtRefMacroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplaceAtRefMacro_Insert() {
		return (EReference)replaceAtRefMacroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeltaRepository() {
		return deltaRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeltaRepository_Delta() {
		return (EReference)deltaRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicDeltaOp() {
		return atomicDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicDeltaOp_IdOfAffectedObject() {
		return (EAttribute)atomicDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveContained() {
		return moveContainedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveContained_Remove() {
		return (EReference)moveContainedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMoveContained_Add() {
		return (EReference)moveContainedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemovalMultiRefDeltaOp() {
		return removalMultiRefDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionMultiRefDeltaOp() {
		return additionMultiRefDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionMultiAttDeltaOp() {
		return additionMultiAttDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemovalMultiAttDeltaOp() {
		return removalMultiAttDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddByValueMultiAttDeltaOp() {
		return addByValueMultiAttDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddByValueMultiAttDeltaOp_IdOfAddedValue() {
		return (EAttribute)addByValueMultiAttDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertAtIndexMultiAttDeltaOp() {
		return insertAtIndexMultiAttDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertAtIndexMultiAttDeltaOp_Position() {
		return (EAttribute)insertAtIndexMultiAttDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteByIndexMultiAttDeltaOp() {
		return deleteByIndexMultiAttDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteByIndexMultiAttDeltaOp_Position() {
		return (EAttribute)deleteByIndexMultiAttDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveByValueMultiAttDeltaOp() {
		return removeByValueMultiAttDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveByValueMultiAttDeltaOp_Strategy() {
		return (EAttribute)removeByValueMultiAttDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveByValueMultiAttDeltaOp_IdOfRemovedValue() {
		return (EAttribute)removeByValueMultiAttDeltaOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearMultiAttDeltaOp() {
		return clearMultiAttDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceAtAttMacro() {
		return replaceAtAttMacroEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplaceAtAttMacro_Delete() {
		return (EReference)replaceAtAttMacroEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplaceAtAttMacro_Insert() {
		return (EReference)replaceAtAttMacroEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefinedMacroDeltaOp() {
		return predefinedMacroDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDialectMacroDeltaOp() {
		return dialectMacroDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDialectMacroDeltaOp_Body() {
		return (EReference)dialectMacroDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreationMacroDeltaOp() {
		return creationMacroDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitializeRootObjectDeltaOp() {
		return initializeRootObjectDeltaOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitializeRootObjectDeltaOp_IdOfNewRoot() {
		return (EAttribute)initializeRootObjectDeltaOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitializeRootObjectDeltaOp_Location() {
		return (EAttribute)initializeRootObjectDeltaOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInitializeRootObjectDeltaOp_RootType() {
		return (EReference)initializeRootObjectDeltaOpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitializeRootObjectDeltaOp_RootTypeString() {
		return (EAttribute)initializeRootObjectDeltaOpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRemovalStrategy() {
		return removalStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDeltaFactory getGenericDeltaFactory() {
		return (GenericDeltaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		deltaOpEClass = createEClass(DELTA_OP);
		createEOperation(deltaOpEClass, DELTA_OP___APPLY);

		deltaEClass = createEClass(DELTA);
		createEReference(deltaEClass, DELTA__DELTA_OPERATIONS);
		createEReference(deltaEClass, DELTA__APPLICABILITY_CONDITION);
		createEReference(deltaEClass, DELTA__AFTER);

		macroDeltaOpEClass = createEClass(MACRO_DELTA_OP);

		attDeltaOpEClass = createEClass(ATT_DELTA_OP);
		createEReference(attDeltaOpEClass, ATT_DELTA_OP__MODIFIED_ATT);
		createEAttribute(attDeltaOpEClass, ATT_DELTA_OP__MODIFIED_ATT_STRING);

		refDeltaOpEClass = createEClass(REF_DELTA_OP);
		createEReference(refDeltaOpEClass, REF_DELTA_OP__MODIFIED_REF);
		createEAttribute(refDeltaOpEClass, REF_DELTA_OP__MODIFIED_REF_STRING);

		singleRefDeltaOpEClass = createEClass(SINGLE_REF_DELTA_OP);

		multiRefDeltaOpEClass = createEClass(MULTI_REF_DELTA_OP);

		singleAttDeltaOpEClass = createEClass(SINGLE_ATT_DELTA_OP);

		multiAttDeltaOpEClass = createEClass(MULTI_ATT_DELTA_OP);

		setSingleAttDeltaOpEClass = createEClass(SET_SINGLE_ATT_DELTA_OP);
		createEAttribute(setSingleAttDeltaOpEClass, SET_SINGLE_ATT_DELTA_OP__NEW_VALUE);

		unsetSingleAttDeltaOpEClass = createEClass(UNSET_SINGLE_ATT_DELTA_OP);

		unsetSingleRefDeltaOpEClass = createEClass(UNSET_SINGLE_REF_DELTA_OP);

		setSingleRefDeltaOpEClass = createEClass(SET_SINGLE_REF_DELTA_OP);
		createEAttribute(setSingleRefDeltaOpEClass, SET_SINGLE_REF_DELTA_OP__ID_OF_NEW_VALUE);

		insertAtIndexMultiRefDeltaOpEClass = createEClass(INSERT_AT_INDEX_MULTI_REF_DELTA_OP);
		createEAttribute(insertAtIndexMultiRefDeltaOpEClass, INSERT_AT_INDEX_MULTI_REF_DELTA_OP__POSITION);

		addByValueMultiRefDeltaOpEClass = createEClass(ADD_BY_VALUE_MULTI_REF_DELTA_OP);
		createEAttribute(addByValueMultiRefDeltaOpEClass, ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_ADDED_VALUE);

		removeByValueMultiRefDeltaOpEClass = createEClass(REMOVE_BY_VALUE_MULTI_REF_DELTA_OP);
		createEAttribute(removeByValueMultiRefDeltaOpEClass, REMOVE_BY_VALUE_MULTI_REF_DELTA_OP__STRATEGY);
		createEAttribute(removeByValueMultiRefDeltaOpEClass, REMOVE_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_REMOVED_VALUE);

		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__ID);
		createEAttribute(identifierEClass, IDENTIFIER__NAME);

		clearMultiRefDeltaOpEClass = createEClass(CLEAR_MULTI_REF_DELTA_OP);

		deleteByIndexMultiRefDeltaOpEClass = createEClass(DELETE_BY_INDEX_MULTI_REF_DELTA_OP);
		createEAttribute(deleteByIndexMultiRefDeltaOpEClass, DELETE_BY_INDEX_MULTI_REF_DELTA_OP__POSITION);

		replaceAtRefMacroEClass = createEClass(REPLACE_AT_REF_MACRO);
		createEReference(replaceAtRefMacroEClass, REPLACE_AT_REF_MACRO__DELETE);
		createEReference(replaceAtRefMacroEClass, REPLACE_AT_REF_MACRO__INSERT);

		deltaRepositoryEClass = createEClass(DELTA_REPOSITORY);
		createEReference(deltaRepositoryEClass, DELTA_REPOSITORY__DELTA);

		atomicDeltaOpEClass = createEClass(ATOMIC_DELTA_OP);
		createEAttribute(atomicDeltaOpEClass, ATOMIC_DELTA_OP__ID_OF_AFFECTED_OBJECT);

		moveContainedEClass = createEClass(MOVE_CONTAINED);
		createEReference(moveContainedEClass, MOVE_CONTAINED__REMOVE);
		createEReference(moveContainedEClass, MOVE_CONTAINED__ADD);

		removalMultiRefDeltaOpEClass = createEClass(REMOVAL_MULTI_REF_DELTA_OP);

		additionMultiRefDeltaOpEClass = createEClass(ADDITION_MULTI_REF_DELTA_OP);

		additionMultiAttDeltaOpEClass = createEClass(ADDITION_MULTI_ATT_DELTA_OP);

		removalMultiAttDeltaOpEClass = createEClass(REMOVAL_MULTI_ATT_DELTA_OP);

		addByValueMultiAttDeltaOpEClass = createEClass(ADD_BY_VALUE_MULTI_ATT_DELTA_OP);
		createEAttribute(addByValueMultiAttDeltaOpEClass, ADD_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_ADDED_VALUE);

		insertAtIndexMultiAttDeltaOpEClass = createEClass(INSERT_AT_INDEX_MULTI_ATT_DELTA_OP);
		createEAttribute(insertAtIndexMultiAttDeltaOpEClass, INSERT_AT_INDEX_MULTI_ATT_DELTA_OP__POSITION);

		deleteByIndexMultiAttDeltaOpEClass = createEClass(DELETE_BY_INDEX_MULTI_ATT_DELTA_OP);
		createEAttribute(deleteByIndexMultiAttDeltaOpEClass, DELETE_BY_INDEX_MULTI_ATT_DELTA_OP__POSITION);

		removeByValueMultiAttDeltaOpEClass = createEClass(REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP);
		createEAttribute(removeByValueMultiAttDeltaOpEClass, REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__STRATEGY);
		createEAttribute(removeByValueMultiAttDeltaOpEClass, REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_REMOVED_VALUE);

		clearMultiAttDeltaOpEClass = createEClass(CLEAR_MULTI_ATT_DELTA_OP);

		replaceAtAttMacroEClass = createEClass(REPLACE_AT_ATT_MACRO);
		createEReference(replaceAtAttMacroEClass, REPLACE_AT_ATT_MACRO__DELETE);
		createEReference(replaceAtAttMacroEClass, REPLACE_AT_ATT_MACRO__INSERT);

		predefinedMacroDeltaOpEClass = createEClass(PREDEFINED_MACRO_DELTA_OP);

		dialectMacroDeltaOpEClass = createEClass(DIALECT_MACRO_DELTA_OP);
		createEReference(dialectMacroDeltaOpEClass, DIALECT_MACRO_DELTA_OP__BODY);

		creationMacroDeltaOpEClass = createEClass(CREATION_MACRO_DELTA_OP);

		initializeRootObjectDeltaOpEClass = createEClass(INITIALIZE_ROOT_OBJECT_DELTA_OP);
		createEAttribute(initializeRootObjectDeltaOpEClass, INITIALIZE_ROOT_OBJECT_DELTA_OP__ID_OF_NEW_ROOT);
		createEAttribute(initializeRootObjectDeltaOpEClass, INITIALIZE_ROOT_OBJECT_DELTA_OP__LOCATION);
		createEReference(initializeRootObjectDeltaOpEClass, INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE);
		createEAttribute(initializeRootObjectDeltaOpEClass, INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE_STRING);

		// Create enums
		removalStrategyEEnum = createEEnum(REMOVAL_STRATEGY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApplicabilityPackage theApplicabilityPackage = (ApplicabilityPackage)EPackage.Registry.INSTANCE.getEPackage(ApplicabilityPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theApplicabilityPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deltaOpEClass.getESuperTypes().add(this.getIdentifier());
		deltaEClass.getESuperTypes().add(this.getIdentifier());
		macroDeltaOpEClass.getESuperTypes().add(this.getDeltaOp());
		attDeltaOpEClass.getESuperTypes().add(this.getAtomicDeltaOp());
		refDeltaOpEClass.getESuperTypes().add(this.getAtomicDeltaOp());
		singleRefDeltaOpEClass.getESuperTypes().add(this.getRefDeltaOp());
		multiRefDeltaOpEClass.getESuperTypes().add(this.getRefDeltaOp());
		singleAttDeltaOpEClass.getESuperTypes().add(this.getAttDeltaOp());
		multiAttDeltaOpEClass.getESuperTypes().add(this.getAttDeltaOp());
		setSingleAttDeltaOpEClass.getESuperTypes().add(this.getSingleAttDeltaOp());
		unsetSingleAttDeltaOpEClass.getESuperTypes().add(this.getSingleAttDeltaOp());
		unsetSingleRefDeltaOpEClass.getESuperTypes().add(this.getSingleRefDeltaOp());
		setSingleRefDeltaOpEClass.getESuperTypes().add(this.getSingleRefDeltaOp());
		insertAtIndexMultiRefDeltaOpEClass.getESuperTypes().add(this.getAddByValueMultiRefDeltaOp());
		addByValueMultiRefDeltaOpEClass.getESuperTypes().add(this.getAdditionMultiRefDeltaOp());
		removeByValueMultiRefDeltaOpEClass.getESuperTypes().add(this.getRemovalMultiRefDeltaOp());
		clearMultiRefDeltaOpEClass.getESuperTypes().add(this.getRemovalMultiRefDeltaOp());
		deleteByIndexMultiRefDeltaOpEClass.getESuperTypes().add(this.getRemovalMultiRefDeltaOp());
		replaceAtRefMacroEClass.getESuperTypes().add(this.getPredefinedMacroDeltaOp());
		deltaRepositoryEClass.getESuperTypes().add(this.getIdentifier());
		atomicDeltaOpEClass.getESuperTypes().add(this.getDeltaOp());
		moveContainedEClass.getESuperTypes().add(this.getPredefinedMacroDeltaOp());
		removalMultiRefDeltaOpEClass.getESuperTypes().add(this.getMultiRefDeltaOp());
		additionMultiRefDeltaOpEClass.getESuperTypes().add(this.getMultiRefDeltaOp());
		additionMultiAttDeltaOpEClass.getESuperTypes().add(this.getMultiAttDeltaOp());
		removalMultiAttDeltaOpEClass.getESuperTypes().add(this.getMultiAttDeltaOp());
		addByValueMultiAttDeltaOpEClass.getESuperTypes().add(this.getAdditionMultiAttDeltaOp());
		insertAtIndexMultiAttDeltaOpEClass.getESuperTypes().add(this.getAddByValueMultiAttDeltaOp());
		deleteByIndexMultiAttDeltaOpEClass.getESuperTypes().add(this.getRemovalMultiAttDeltaOp());
		removeByValueMultiAttDeltaOpEClass.getESuperTypes().add(this.getRemovalMultiAttDeltaOp());
		clearMultiAttDeltaOpEClass.getESuperTypes().add(this.getRemovalMultiAttDeltaOp());
		replaceAtAttMacroEClass.getESuperTypes().add(this.getPredefinedMacroDeltaOp());
		predefinedMacroDeltaOpEClass.getESuperTypes().add(this.getMacroDeltaOp());
		dialectMacroDeltaOpEClass.getESuperTypes().add(this.getMacroDeltaOp());
		creationMacroDeltaOpEClass.getESuperTypes().add(this.getDialectMacroDeltaOp());
		initializeRootObjectDeltaOpEClass.getESuperTypes().add(this.getDeltaOp());

		// Initialize classes, features, and operations; add parameters
		initEClass(deltaOpEClass, DeltaOp.class, "DeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDeltaOp__Apply(), null, "apply", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(deltaEClass, Delta.class, "Delta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelta_DeltaOperations(), this.getDeltaOp(), null, "deltaOperations", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelta_ApplicabilityCondition(), theApplicabilityPackage.getExpression(), null, "applicabilityCondition", null, 0, 1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelta_After(), this.getDelta(), null, "after", null, 0, -1, Delta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(macroDeltaOpEClass, MacroDeltaOp.class, "MacroDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attDeltaOpEClass, AttDeltaOp.class, "AttDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttDeltaOp_ModifiedAtt(), ecorePackage.getEAttribute(), null, "modifiedAtt", null, 0, 1, AttDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttDeltaOp_ModifiedAttString(), ecorePackage.getEString(), "modifiedAttString", null, 1, 1, AttDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refDeltaOpEClass, RefDeltaOp.class, "RefDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefDeltaOp_ModifiedRef(), ecorePackage.getEReference(), null, "modifiedRef", null, 0, 1, RefDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefDeltaOp_ModifiedRefString(), ecorePackage.getEString(), "modifiedRefString", null, 1, 1, RefDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleRefDeltaOpEClass, SingleRefDeltaOp.class, "SingleRefDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiRefDeltaOpEClass, MultiRefDeltaOp.class, "MultiRefDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleAttDeltaOpEClass, SingleAttDeltaOp.class, "SingleAttDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiAttDeltaOpEClass, MultiAttDeltaOp.class, "MultiAttDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setSingleAttDeltaOpEClass, SetSingleAttDeltaOp.class, "SetSingleAttDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetSingleAttDeltaOp_NewValue(), ecorePackage.getEString(), "newValue", null, 1, 1, SetSingleAttDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unsetSingleAttDeltaOpEClass, UnsetSingleAttDeltaOp.class, "UnsetSingleAttDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unsetSingleRefDeltaOpEClass, UnsetSingleRefDeltaOp.class, "UnsetSingleRefDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setSingleRefDeltaOpEClass, SetSingleRefDeltaOp.class, "SetSingleRefDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetSingleRefDeltaOp_IdOfNewValue(), ecorePackage.getEString(), "idOfNewValue", null, 1, 1, SetSingleRefDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(insertAtIndexMultiRefDeltaOpEClass, InsertAtIndexMultiRefDeltaOp.class, "InsertAtIndexMultiRefDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertAtIndexMultiRefDeltaOp_Position(), ecorePackage.getEInt(), "position", null, 1, 1, InsertAtIndexMultiRefDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addByValueMultiRefDeltaOpEClass, AddByValueMultiRefDeltaOp.class, "AddByValueMultiRefDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddByValueMultiRefDeltaOp_IdOfAddedValue(), ecorePackage.getEString(), "idOfAddedValue", null, 1, 1, AddByValueMultiRefDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(removeByValueMultiRefDeltaOpEClass, RemoveByValueMultiRefDeltaOp.class, "RemoveByValueMultiRefDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveByValueMultiRefDeltaOp_Strategy(), this.getRemovalStrategy(), "strategy", null, 1, 1, RemoveByValueMultiRefDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveByValueMultiRefDeltaOp_IdOfRemovedValue(), ecorePackage.getEString(), "idOfRemovedValue", null, 1, 1, RemoveByValueMultiRefDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(identifierEClass, Identifier.class, "Identifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifier_Id(), ecorePackage.getEString(), "id", null, 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIdentifier_Name(), ecorePackage.getEString(), "name", null, 1, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clearMultiRefDeltaOpEClass, ClearMultiRefDeltaOp.class, "ClearMultiRefDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deleteByIndexMultiRefDeltaOpEClass, DeleteByIndexMultiRefDeltaOp.class, "DeleteByIndexMultiRefDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteByIndexMultiRefDeltaOp_Position(), ecorePackage.getEInt(), "position", null, 1, 1, DeleteByIndexMultiRefDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replaceAtRefMacroEClass, ReplaceAtRefMacro.class, "ReplaceAtRefMacro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplaceAtRefMacro_Delete(), this.getDeleteByIndexMultiRefDeltaOp(), null, "delete", null, 1, 1, ReplaceAtRefMacro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplaceAtRefMacro_Insert(), this.getInsertAtIndexMultiRefDeltaOp(), null, "insert", null, 1, 1, ReplaceAtRefMacro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deltaRepositoryEClass, DeltaRepository.class, "DeltaRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeltaRepository_Delta(), this.getDelta(), null, "delta", null, 0, -1, DeltaRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicDeltaOpEClass, AtomicDeltaOp.class, "AtomicDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtomicDeltaOp_IdOfAffectedObject(), ecorePackage.getEString(), "idOfAffectedObject", null, 1, 1, AtomicDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(moveContainedEClass, MoveContained.class, "MoveContained", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoveContained_Remove(), this.getRemoveByValueMultiRefDeltaOp(), null, "remove", null, 1, 1, MoveContained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoveContained_Add(), this.getAdditionMultiRefDeltaOp(), null, "add", null, 1, 1, MoveContained.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removalMultiRefDeltaOpEClass, RemovalMultiRefDeltaOp.class, "RemovalMultiRefDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionMultiRefDeltaOpEClass, AdditionMultiRefDeltaOp.class, "AdditionMultiRefDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(additionMultiAttDeltaOpEClass, AdditionMultiAttDeltaOp.class, "AdditionMultiAttDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removalMultiAttDeltaOpEClass, RemovalMultiAttDeltaOp.class, "RemovalMultiAttDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addByValueMultiAttDeltaOpEClass, AddByValueMultiAttDeltaOp.class, "AddByValueMultiAttDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddByValueMultiAttDeltaOp_IdOfAddedValue(), ecorePackage.getEString(), "idOfAddedValue", null, 1, 1, AddByValueMultiAttDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(insertAtIndexMultiAttDeltaOpEClass, InsertAtIndexMultiAttDeltaOp.class, "InsertAtIndexMultiAttDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsertAtIndexMultiAttDeltaOp_Position(), ecorePackage.getEInt(), "position", null, 1, 1, InsertAtIndexMultiAttDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteByIndexMultiAttDeltaOpEClass, DeleteByIndexMultiAttDeltaOp.class, "DeleteByIndexMultiAttDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteByIndexMultiAttDeltaOp_Position(), ecorePackage.getEInt(), "position", null, 1, 1, DeleteByIndexMultiAttDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeByValueMultiAttDeltaOpEClass, RemoveByValueMultiAttDeltaOp.class, "RemoveByValueMultiAttDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveByValueMultiAttDeltaOp_Strategy(), this.getRemovalStrategy(), "strategy", null, 1, 1, RemoveByValueMultiAttDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveByValueMultiAttDeltaOp_IdOfRemovedValue(), ecorePackage.getEString(), "idOfRemovedValue", null, 1, 1, RemoveByValueMultiAttDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clearMultiAttDeltaOpEClass, ClearMultiAttDeltaOp.class, "ClearMultiAttDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(replaceAtAttMacroEClass, ReplaceAtAttMacro.class, "ReplaceAtAttMacro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplaceAtAttMacro_Delete(), this.getDeleteByIndexMultiAttDeltaOp(), null, "delete", null, 1, 1, ReplaceAtAttMacro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplaceAtAttMacro_Insert(), this.getInsertAtIndexMultiAttDeltaOp(), null, "insert", null, 1, 1, ReplaceAtAttMacro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predefinedMacroDeltaOpEClass, PredefinedMacroDeltaOp.class, "PredefinedMacroDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dialectMacroDeltaOpEClass, DialectMacroDeltaOp.class, "DialectMacroDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDialectMacroDeltaOp_Body(), ecorePackage.getEClass(), null, "body", null, 1, 1, DialectMacroDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creationMacroDeltaOpEClass, CreationMacroDeltaOp.class, "CreationMacroDeltaOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(initializeRootObjectDeltaOpEClass, InitializeRootObjectDeltaOp.class, "InitializeRootObjectDeltaOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInitializeRootObjectDeltaOp_IdOfNewRoot(), ecorePackage.getEString(), "idOfNewRoot", null, 1, 1, InitializeRootObjectDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInitializeRootObjectDeltaOp_Location(), ecorePackage.getEString(), "location", null, 1, 1, InitializeRootObjectDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInitializeRootObjectDeltaOp_RootType(), ecorePackage.getEClass(), null, "rootType", null, 0, 1, InitializeRootObjectDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInitializeRootObjectDeltaOp_RootTypeString(), ecorePackage.getEString(), "rootTypeString", null, 1, 1, InitializeRootObjectDeltaOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(removalStrategyEEnum, RemovalStrategy.class, "RemovalStrategy");
		addEEnumLiteral(removalStrategyEEnum, RemovalStrategy.FIRST);
		addEEnumLiteral(removalStrategyEEnum, RemovalStrategy.LAST);
		addEEnumLiteral(removalStrategyEEnum, RemovalStrategy.ALL);

		// Create resource
		createResource(eNS_URI);
	}

} //GenericDeltaPackageImpl
