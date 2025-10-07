/**
 */
package org.educsos.dovamo.genericDelta;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.educsos.dovamo.genericDelta.GenericDeltaFactory
 * @model kind="package"
 * @generated
 */
public interface GenericDeltaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genericDelta";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://tva.kastel.kit.edu/deltavar/core/genericDelta";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genericDelta";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericDeltaPackage eINSTANCE = org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.IdentifierImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.DeltaOpImpl <em>Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.DeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDeltaOp()
	 * @generated
	 */
	int DELTA_OP = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_OP__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_OP__NAME = IDENTIFIER__NAME;

	/**
	 * The number of structural features of the '<em>Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_OP_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_OP___APPLY = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_OP_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.DeltaImpl <em>Delta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.DeltaImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDelta()
	 * @generated
	 */
	int DELTA = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Delta Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA__DELTA_OPERATIONS = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applicability Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA__APPLICABILITY_CONDITION = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>After</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA__AFTER = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Delta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.MacroDeltaOpImpl <em>Macro Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.MacroDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getMacroDeltaOp()
	 * @generated
	 */
	int MACRO_DELTA_OP = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DELTA_OP__ID = DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DELTA_OP__NAME = DELTA_OP__NAME;

	/**
	 * The number of structural features of the '<em>Macro Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DELTA_OP_FEATURE_COUNT = DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DELTA_OP___APPLY = DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Macro Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_DELTA_OP_OPERATION_COUNT = DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.AtomicDeltaOpImpl <em>Atomic Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.AtomicDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAtomicDeltaOp()
	 * @generated
	 */
	int ATOMIC_DELTA_OP = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DELTA_OP__ID = DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DELTA_OP__NAME = DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DELTA_OP__ID_OF_AFFECTED_OBJECT = DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atomic Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DELTA_OP_FEATURE_COUNT = DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DELTA_OP___APPLY = DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Atomic Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_DELTA_OP_OPERATION_COUNT = DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.AttDeltaOpImpl <em>Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.AttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAttDeltaOp()
	 * @generated
	 */
	int ATT_DELTA_OP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_DELTA_OP__ID = ATOMIC_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_DELTA_OP__NAME = ATOMIC_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = ATOMIC_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_DELTA_OP__MODIFIED_ATT = ATOMIC_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_DELTA_OP__MODIFIED_ATT_STRING = ATOMIC_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_DELTA_OP_FEATURE_COUNT = ATOMIC_DELTA_OP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_DELTA_OP___APPLY = ATOMIC_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATT_DELTA_OP_OPERATION_COUNT = ATOMIC_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.RefDeltaOpImpl <em>Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.RefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRefDeltaOp()
	 * @generated
	 */
	int REF_DELTA_OP = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DELTA_OP__ID = ATOMIC_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DELTA_OP__NAME = ATOMIC_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = ATOMIC_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DELTA_OP__MODIFIED_REF = ATOMIC_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DELTA_OP__MODIFIED_REF_STRING = ATOMIC_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DELTA_OP_FEATURE_COUNT = ATOMIC_DELTA_OP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DELTA_OP___APPLY = ATOMIC_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_DELTA_OP_OPERATION_COUNT = ATOMIC_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.SingleRefDeltaOpImpl <em>Single Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.SingleRefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getSingleRefDeltaOp()
	 * @generated
	 */
	int SINGLE_REF_DELTA_OP = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REF_DELTA_OP__ID = REF_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REF_DELTA_OP__NAME = REF_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = REF_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REF_DELTA_OP__MODIFIED_REF = REF_DELTA_OP__MODIFIED_REF;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REF_DELTA_OP__MODIFIED_REF_STRING = REF_DELTA_OP__MODIFIED_REF_STRING;

	/**
	 * The number of structural features of the '<em>Single Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REF_DELTA_OP_FEATURE_COUNT = REF_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REF_DELTA_OP___APPLY = REF_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Single Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_REF_DELTA_OP_OPERATION_COUNT = REF_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.MultiRefDeltaOpImpl <em>Multi Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.MultiRefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getMultiRefDeltaOp()
	 * @generated
	 */
	int MULTI_REF_DELTA_OP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_DELTA_OP__ID = REF_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_DELTA_OP__NAME = REF_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = REF_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_DELTA_OP__MODIFIED_REF = REF_DELTA_OP__MODIFIED_REF;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_DELTA_OP__MODIFIED_REF_STRING = REF_DELTA_OP__MODIFIED_REF_STRING;

	/**
	 * The number of structural features of the '<em>Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_DELTA_OP_FEATURE_COUNT = REF_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_DELTA_OP___APPLY = REF_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_DELTA_OP_OPERATION_COUNT = REF_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.SingleAttDeltaOpImpl <em>Single Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.SingleAttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getSingleAttDeltaOp()
	 * @generated
	 */
	int SINGLE_ATT_DELTA_OP = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATT_DELTA_OP__ID = ATT_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATT_DELTA_OP__NAME = ATT_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATT_DELTA_OP__MODIFIED_ATT = ATT_DELTA_OP__MODIFIED_ATT;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATT_DELTA_OP__MODIFIED_ATT_STRING = ATT_DELTA_OP__MODIFIED_ATT_STRING;

	/**
	 * The number of structural features of the '<em>Single Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATT_DELTA_OP_FEATURE_COUNT = ATT_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATT_DELTA_OP___APPLY = ATT_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Single Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATT_DELTA_OP_OPERATION_COUNT = ATT_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.MultiAttDeltaOpImpl <em>Multi Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.MultiAttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getMultiAttDeltaOp()
	 * @generated
	 */
	int MULTI_ATT_DELTA_OP = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ATT_DELTA_OP__ID = ATT_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ATT_DELTA_OP__NAME = ATT_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ATT_DELTA_OP__MODIFIED_ATT = ATT_DELTA_OP__MODIFIED_ATT;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING = ATT_DELTA_OP__MODIFIED_ATT_STRING;

	/**
	 * The number of structural features of the '<em>Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ATT_DELTA_OP_FEATURE_COUNT = ATT_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ATT_DELTA_OP___APPLY = ATT_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ATT_DELTA_OP_OPERATION_COUNT = ATT_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.SetSingleAttDeltaOpImpl <em>Set Single Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.SetSingleAttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getSetSingleAttDeltaOp()
	 * @generated
	 */
	int SET_SINGLE_ATT_DELTA_OP = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_ATT_DELTA_OP__ID = SINGLE_ATT_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_ATT_DELTA_OP__NAME = SINGLE_ATT_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = SINGLE_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_ATT_DELTA_OP__MODIFIED_ATT = SINGLE_ATT_DELTA_OP__MODIFIED_ATT;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_ATT_DELTA_OP__MODIFIED_ATT_STRING = SINGLE_ATT_DELTA_OP__MODIFIED_ATT_STRING;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_ATT_DELTA_OP__NEW_VALUE = SINGLE_ATT_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Single Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_ATT_DELTA_OP_FEATURE_COUNT = SINGLE_ATT_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_ATT_DELTA_OP___APPLY = SINGLE_ATT_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Set Single Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_ATT_DELTA_OP_OPERATION_COUNT = SINGLE_ATT_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.UnsetSingleAttDeltaOpImpl <em>Unset Single Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.UnsetSingleAttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getUnsetSingleAttDeltaOp()
	 * @generated
	 */
	int UNSET_SINGLE_ATT_DELTA_OP = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_ATT_DELTA_OP__ID = SINGLE_ATT_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_ATT_DELTA_OP__NAME = SINGLE_ATT_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = SINGLE_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_ATT_DELTA_OP__MODIFIED_ATT = SINGLE_ATT_DELTA_OP__MODIFIED_ATT;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_ATT_DELTA_OP__MODIFIED_ATT_STRING = SINGLE_ATT_DELTA_OP__MODIFIED_ATT_STRING;

	/**
	 * The number of structural features of the '<em>Unset Single Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_ATT_DELTA_OP_FEATURE_COUNT = SINGLE_ATT_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_ATT_DELTA_OP___APPLY = SINGLE_ATT_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Unset Single Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_ATT_DELTA_OP_OPERATION_COUNT = SINGLE_ATT_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.UnsetSingleRefDeltaOpImpl <em>Unset Single Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.UnsetSingleRefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getUnsetSingleRefDeltaOp()
	 * @generated
	 */
	int UNSET_SINGLE_REF_DELTA_OP = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_REF_DELTA_OP__ID = SINGLE_REF_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_REF_DELTA_OP__NAME = SINGLE_REF_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = SINGLE_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_REF_DELTA_OP__MODIFIED_REF = SINGLE_REF_DELTA_OP__MODIFIED_REF;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_REF_DELTA_OP__MODIFIED_REF_STRING = SINGLE_REF_DELTA_OP__MODIFIED_REF_STRING;

	/**
	 * The number of structural features of the '<em>Unset Single Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_REF_DELTA_OP_FEATURE_COUNT = SINGLE_REF_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_REF_DELTA_OP___APPLY = SINGLE_REF_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Unset Single Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSET_SINGLE_REF_DELTA_OP_OPERATION_COUNT = SINGLE_REF_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.SetSingleRefDeltaOpImpl <em>Set Single Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.SetSingleRefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getSetSingleRefDeltaOp()
	 * @generated
	 */
	int SET_SINGLE_REF_DELTA_OP = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_REF_DELTA_OP__ID = SINGLE_REF_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_REF_DELTA_OP__NAME = SINGLE_REF_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = SINGLE_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_REF_DELTA_OP__MODIFIED_REF = SINGLE_REF_DELTA_OP__MODIFIED_REF;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_REF_DELTA_OP__MODIFIED_REF_STRING = SINGLE_REF_DELTA_OP__MODIFIED_REF_STRING;

	/**
	 * The feature id for the '<em><b>Id Of New Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_REF_DELTA_OP__ID_OF_NEW_VALUE = SINGLE_REF_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Single Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_REF_DELTA_OP_FEATURE_COUNT = SINGLE_REF_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_REF_DELTA_OP___APPLY = SINGLE_REF_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Set Single Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SINGLE_REF_DELTA_OP_OPERATION_COUNT = SINGLE_REF_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.AdditionMultiRefDeltaOpImpl <em>Addition Multi Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.AdditionMultiRefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAdditionMultiRefDeltaOp()
	 * @generated
	 */
	int ADDITION_MULTI_REF_DELTA_OP = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_REF_DELTA_OP__ID = MULTI_REF_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_REF_DELTA_OP__NAME = MULTI_REF_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_REF_DELTA_OP__MODIFIED_REF = MULTI_REF_DELTA_OP__MODIFIED_REF;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING = MULTI_REF_DELTA_OP__MODIFIED_REF_STRING;

	/**
	 * The number of structural features of the '<em>Addition Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_REF_DELTA_OP_FEATURE_COUNT = MULTI_REF_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_REF_DELTA_OP___APPLY = MULTI_REF_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Addition Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_REF_DELTA_OP_OPERATION_COUNT = MULTI_REF_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.AddByValueMultiRefDeltaOpImpl <em>Add By Value Multi Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.AddByValueMultiRefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAddByValueMultiRefDeltaOp()
	 * @generated
	 */
	int ADD_BY_VALUE_MULTI_REF_DELTA_OP = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID = ADDITION_MULTI_REF_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_REF_DELTA_OP__NAME = ADDITION_MULTI_REF_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = ADDITION_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_REF_DELTA_OP__MODIFIED_REF = ADDITION_MULTI_REF_DELTA_OP__MODIFIED_REF;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING = ADDITION_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING;

	/**
	 * The feature id for the '<em><b>Id Of Added Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_ADDED_VALUE = ADDITION_MULTI_REF_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add By Value Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_REF_DELTA_OP_FEATURE_COUNT = ADDITION_MULTI_REF_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_REF_DELTA_OP___APPLY = ADDITION_MULTI_REF_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Add By Value Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_REF_DELTA_OP_OPERATION_COUNT = ADDITION_MULTI_REF_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.InsertAtIndexMultiRefDeltaOpImpl <em>Insert At Index Multi Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.InsertAtIndexMultiRefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getInsertAtIndexMultiRefDeltaOp()
	 * @generated
	 */
	int INSERT_AT_INDEX_MULTI_REF_DELTA_OP = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_REF_DELTA_OP__ID = ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_REF_DELTA_OP__NAME = ADD_BY_VALUE_MULTI_REF_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_REF_DELTA_OP__MODIFIED_REF = ADD_BY_VALUE_MULTI_REF_DELTA_OP__MODIFIED_REF;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING = ADD_BY_VALUE_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING;

	/**
	 * The feature id for the '<em><b>Id Of Added Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_REF_DELTA_OP__ID_OF_ADDED_VALUE = ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_ADDED_VALUE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_REF_DELTA_OP__POSITION = ADD_BY_VALUE_MULTI_REF_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Insert At Index Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_REF_DELTA_OP_FEATURE_COUNT = ADD_BY_VALUE_MULTI_REF_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_REF_DELTA_OP___APPLY = ADD_BY_VALUE_MULTI_REF_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Insert At Index Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_REF_DELTA_OP_OPERATION_COUNT = ADD_BY_VALUE_MULTI_REF_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.RemovalMultiRefDeltaOpImpl <em>Removal Multi Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.RemovalMultiRefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRemovalMultiRefDeltaOp()
	 * @generated
	 */
	int REMOVAL_MULTI_REF_DELTA_OP = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_REF_DELTA_OP__ID = MULTI_REF_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_REF_DELTA_OP__NAME = MULTI_REF_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_REF_DELTA_OP__MODIFIED_REF = MULTI_REF_DELTA_OP__MODIFIED_REF;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING = MULTI_REF_DELTA_OP__MODIFIED_REF_STRING;

	/**
	 * The number of structural features of the '<em>Removal Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_REF_DELTA_OP_FEATURE_COUNT = MULTI_REF_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_REF_DELTA_OP___APPLY = MULTI_REF_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Removal Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_REF_DELTA_OP_OPERATION_COUNT = MULTI_REF_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.RemoveByValueMultiRefDeltaOpImpl <em>Remove By Value Multi Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.RemoveByValueMultiRefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRemoveByValueMultiRefDeltaOp()
	 * @generated
	 */
	int REMOVE_BY_VALUE_MULTI_REF_DELTA_OP = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_REF_DELTA_OP__ID = REMOVAL_MULTI_REF_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_REF_DELTA_OP__NAME = REMOVAL_MULTI_REF_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = REMOVAL_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_REF_DELTA_OP__MODIFIED_REF = REMOVAL_MULTI_REF_DELTA_OP__MODIFIED_REF;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING = REMOVAL_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_REF_DELTA_OP__STRATEGY = REMOVAL_MULTI_REF_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Of Removed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_REMOVED_VALUE = REMOVAL_MULTI_REF_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove By Value Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_REF_DELTA_OP_FEATURE_COUNT = REMOVAL_MULTI_REF_DELTA_OP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_REF_DELTA_OP___APPLY = REMOVAL_MULTI_REF_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Remove By Value Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_REF_DELTA_OP_OPERATION_COUNT = REMOVAL_MULTI_REF_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.ClearMultiRefDeltaOpImpl <em>Clear Multi Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.ClearMultiRefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getClearMultiRefDeltaOp()
	 * @generated
	 */
	int CLEAR_MULTI_REF_DELTA_OP = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_REF_DELTA_OP__ID = REMOVAL_MULTI_REF_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_REF_DELTA_OP__NAME = REMOVAL_MULTI_REF_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = REMOVAL_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_REF_DELTA_OP__MODIFIED_REF = REMOVAL_MULTI_REF_DELTA_OP__MODIFIED_REF;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING = REMOVAL_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING;

	/**
	 * The number of structural features of the '<em>Clear Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_REF_DELTA_OP_FEATURE_COUNT = REMOVAL_MULTI_REF_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_REF_DELTA_OP___APPLY = REMOVAL_MULTI_REF_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Clear Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_REF_DELTA_OP_OPERATION_COUNT = REMOVAL_MULTI_REF_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.DeleteByIndexMultiRefDeltaOpImpl <em>Delete By Index Multi Ref Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.DeleteByIndexMultiRefDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDeleteByIndexMultiRefDeltaOp()
	 * @generated
	 */
	int DELETE_BY_INDEX_MULTI_REF_DELTA_OP = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_REF_DELTA_OP__ID = REMOVAL_MULTI_REF_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_REF_DELTA_OP__NAME = REMOVAL_MULTI_REF_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT = REMOVAL_MULTI_REF_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_REF_DELTA_OP__MODIFIED_REF = REMOVAL_MULTI_REF_DELTA_OP__MODIFIED_REF;

	/**
	 * The feature id for the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING = REMOVAL_MULTI_REF_DELTA_OP__MODIFIED_REF_STRING;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_REF_DELTA_OP__POSITION = REMOVAL_MULTI_REF_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete By Index Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_REF_DELTA_OP_FEATURE_COUNT = REMOVAL_MULTI_REF_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_REF_DELTA_OP___APPLY = REMOVAL_MULTI_REF_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Delete By Index Multi Ref Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_REF_DELTA_OP_OPERATION_COUNT = REMOVAL_MULTI_REF_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.PredefinedMacroDeltaOpImpl <em>Predefined Macro Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.PredefinedMacroDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getPredefinedMacroDeltaOp()
	 * @generated
	 */
	int PREDEFINED_MACRO_DELTA_OP = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_MACRO_DELTA_OP__ID = MACRO_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_MACRO_DELTA_OP__NAME = MACRO_DELTA_OP__NAME;

	/**
	 * The number of structural features of the '<em>Predefined Macro Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_MACRO_DELTA_OP_FEATURE_COUNT = MACRO_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_MACRO_DELTA_OP___APPLY = MACRO_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Predefined Macro Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_MACRO_DELTA_OP_OPERATION_COUNT = MACRO_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.ReplaceAtRefMacroImpl <em>Replace At Ref Macro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.ReplaceAtRefMacroImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getReplaceAtRefMacro()
	 * @generated
	 */
	int REPLACE_AT_REF_MACRO = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_REF_MACRO__ID = PREDEFINED_MACRO_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_REF_MACRO__NAME = PREDEFINED_MACRO_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_REF_MACRO__DELETE = PREDEFINED_MACRO_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_REF_MACRO__INSERT = PREDEFINED_MACRO_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Replace At Ref Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_REF_MACRO_FEATURE_COUNT = PREDEFINED_MACRO_DELTA_OP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_REF_MACRO___APPLY = PREDEFINED_MACRO_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Replace At Ref Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_REF_MACRO_OPERATION_COUNT = PREDEFINED_MACRO_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.DeltaRepositoryImpl <em>Delta Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.DeltaRepositoryImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDeltaRepository()
	 * @generated
	 */
	int DELTA_REPOSITORY = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_REPOSITORY__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_REPOSITORY__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Delta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_REPOSITORY__DELTA = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delta Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_REPOSITORY_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delta Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELTA_REPOSITORY_OPERATION_COUNT = IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.MoveContainedImpl <em>Move Contained</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.MoveContainedImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getMoveContained()
	 * @generated
	 */
	int MOVE_CONTAINED = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CONTAINED__ID = PREDEFINED_MACRO_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CONTAINED__NAME = PREDEFINED_MACRO_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Remove</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CONTAINED__REMOVE = PREDEFINED_MACRO_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CONTAINED__ADD = PREDEFINED_MACRO_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Move Contained</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CONTAINED_FEATURE_COUNT = PREDEFINED_MACRO_DELTA_OP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CONTAINED___APPLY = PREDEFINED_MACRO_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Move Contained</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_CONTAINED_OPERATION_COUNT = PREDEFINED_MACRO_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.AdditionMultiAttDeltaOpImpl <em>Addition Multi Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.AdditionMultiAttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAdditionMultiAttDeltaOp()
	 * @generated
	 */
	int ADDITION_MULTI_ATT_DELTA_OP = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_ATT_DELTA_OP__ID = MULTI_ATT_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_ATT_DELTA_OP__NAME = MULTI_ATT_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_ATT_DELTA_OP__MODIFIED_ATT = MULTI_ATT_DELTA_OP__MODIFIED_ATT;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING = MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING;

	/**
	 * The number of structural features of the '<em>Addition Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_ATT_DELTA_OP_FEATURE_COUNT = MULTI_ATT_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_ATT_DELTA_OP___APPLY = MULTI_ATT_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Addition Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_MULTI_ATT_DELTA_OP_OPERATION_COUNT = MULTI_ATT_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.RemovalMultiAttDeltaOpImpl <em>Removal Multi Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.RemovalMultiAttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRemovalMultiAttDeltaOp()
	 * @generated
	 */
	int REMOVAL_MULTI_ATT_DELTA_OP = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_ATT_DELTA_OP__ID = MULTI_ATT_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_ATT_DELTA_OP__NAME = MULTI_ATT_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_ATT_DELTA_OP__MODIFIED_ATT = MULTI_ATT_DELTA_OP__MODIFIED_ATT;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING = MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING;

	/**
	 * The number of structural features of the '<em>Removal Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_ATT_DELTA_OP_FEATURE_COUNT = MULTI_ATT_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_ATT_DELTA_OP___APPLY = MULTI_ATT_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Removal Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_MULTI_ATT_DELTA_OP_OPERATION_COUNT = MULTI_ATT_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.AddByValueMultiAttDeltaOpImpl <em>Add By Value Multi Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.AddByValueMultiAttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAddByValueMultiAttDeltaOp()
	 * @generated
	 */
	int ADD_BY_VALUE_MULTI_ATT_DELTA_OP = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_ATT_DELTA_OP__ID = ADDITION_MULTI_ATT_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_ATT_DELTA_OP__NAME = ADDITION_MULTI_ATT_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = ADDITION_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_ATT_DELTA_OP__MODIFIED_ATT = ADDITION_MULTI_ATT_DELTA_OP__MODIFIED_ATT;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING = ADDITION_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING;

	/**
	 * The feature id for the '<em><b>Id Of Added Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_ADDED_VALUE = ADDITION_MULTI_ATT_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add By Value Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_ATT_DELTA_OP_FEATURE_COUNT = ADDITION_MULTI_ATT_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_ATT_DELTA_OP___APPLY = ADDITION_MULTI_ATT_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Add By Value Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BY_VALUE_MULTI_ATT_DELTA_OP_OPERATION_COUNT = ADDITION_MULTI_ATT_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.InsertAtIndexMultiAttDeltaOpImpl <em>Insert At Index Multi Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.InsertAtIndexMultiAttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getInsertAtIndexMultiAttDeltaOp()
	 * @generated
	 */
	int INSERT_AT_INDEX_MULTI_ATT_DELTA_OP = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_ATT_DELTA_OP__ID = ADD_BY_VALUE_MULTI_ATT_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_ATT_DELTA_OP__NAME = ADD_BY_VALUE_MULTI_ATT_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = ADD_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_ATT_DELTA_OP__MODIFIED_ATT = ADD_BY_VALUE_MULTI_ATT_DELTA_OP__MODIFIED_ATT;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING = ADD_BY_VALUE_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING;

	/**
	 * The feature id for the '<em><b>Id Of Added Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_ATT_DELTA_OP__ID_OF_ADDED_VALUE = ADD_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_ADDED_VALUE;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_ATT_DELTA_OP__POSITION = ADD_BY_VALUE_MULTI_ATT_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Insert At Index Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_ATT_DELTA_OP_FEATURE_COUNT = ADD_BY_VALUE_MULTI_ATT_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_ATT_DELTA_OP___APPLY = ADD_BY_VALUE_MULTI_ATT_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Insert At Index Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_AT_INDEX_MULTI_ATT_DELTA_OP_OPERATION_COUNT = ADD_BY_VALUE_MULTI_ATT_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.DeleteByIndexMultiAttDeltaOpImpl <em>Delete By Index Multi Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.DeleteByIndexMultiAttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDeleteByIndexMultiAttDeltaOp()
	 * @generated
	 */
	int DELETE_BY_INDEX_MULTI_ATT_DELTA_OP = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_ATT_DELTA_OP__ID = REMOVAL_MULTI_ATT_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_ATT_DELTA_OP__NAME = REMOVAL_MULTI_ATT_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = REMOVAL_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_ATT_DELTA_OP__MODIFIED_ATT = REMOVAL_MULTI_ATT_DELTA_OP__MODIFIED_ATT;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING = REMOVAL_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_ATT_DELTA_OP__POSITION = REMOVAL_MULTI_ATT_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delete By Index Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_ATT_DELTA_OP_FEATURE_COUNT = REMOVAL_MULTI_ATT_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_ATT_DELTA_OP___APPLY = REMOVAL_MULTI_ATT_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Delete By Index Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_BY_INDEX_MULTI_ATT_DELTA_OP_OPERATION_COUNT = REMOVAL_MULTI_ATT_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.RemoveByValueMultiAttDeltaOpImpl <em>Remove By Value Multi Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.RemoveByValueMultiAttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRemoveByValueMultiAttDeltaOp()
	 * @generated
	 */
	int REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID = REMOVAL_MULTI_ATT_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__NAME = REMOVAL_MULTI_ATT_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = REMOVAL_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__MODIFIED_ATT = REMOVAL_MULTI_ATT_DELTA_OP__MODIFIED_ATT;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING = REMOVAL_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__STRATEGY = REMOVAL_MULTI_ATT_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id Of Removed Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_REMOVED_VALUE = REMOVAL_MULTI_ATT_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove By Value Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP_FEATURE_COUNT = REMOVAL_MULTI_ATT_DELTA_OP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP___APPLY = REMOVAL_MULTI_ATT_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Remove By Value Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP_OPERATION_COUNT = REMOVAL_MULTI_ATT_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.ClearMultiAttDeltaOpImpl <em>Clear Multi Att Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.ClearMultiAttDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getClearMultiAttDeltaOp()
	 * @generated
	 */
	int CLEAR_MULTI_ATT_DELTA_OP = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_ATT_DELTA_OP__ID = REMOVAL_MULTI_ATT_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_ATT_DELTA_OP__NAME = REMOVAL_MULTI_ATT_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT = REMOVAL_MULTI_ATT_DELTA_OP__ID_OF_AFFECTED_OBJECT;

	/**
	 * The feature id for the '<em><b>Modified Att</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_ATT_DELTA_OP__MODIFIED_ATT = REMOVAL_MULTI_ATT_DELTA_OP__MODIFIED_ATT;

	/**
	 * The feature id for the '<em><b>Modified Att String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING = REMOVAL_MULTI_ATT_DELTA_OP__MODIFIED_ATT_STRING;

	/**
	 * The number of structural features of the '<em>Clear Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_ATT_DELTA_OP_FEATURE_COUNT = REMOVAL_MULTI_ATT_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_ATT_DELTA_OP___APPLY = REMOVAL_MULTI_ATT_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Clear Multi Att Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEAR_MULTI_ATT_DELTA_OP_OPERATION_COUNT = REMOVAL_MULTI_ATT_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.ReplaceAtAttMacroImpl <em>Replace At Att Macro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.ReplaceAtAttMacroImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getReplaceAtAttMacro()
	 * @generated
	 */
	int REPLACE_AT_ATT_MACRO = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_ATT_MACRO__ID = PREDEFINED_MACRO_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_ATT_MACRO__NAME = PREDEFINED_MACRO_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_ATT_MACRO__DELETE = PREDEFINED_MACRO_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_ATT_MACRO__INSERT = PREDEFINED_MACRO_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Replace At Att Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_ATT_MACRO_FEATURE_COUNT = PREDEFINED_MACRO_DELTA_OP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_ATT_MACRO___APPLY = PREDEFINED_MACRO_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Replace At Att Macro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_AT_ATT_MACRO_OPERATION_COUNT = PREDEFINED_MACRO_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.DialectMacroDeltaOpImpl <em>Dialect Macro Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.DialectMacroDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDialectMacroDeltaOp()
	 * @generated
	 */
	int DIALECT_MACRO_DELTA_OP = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALECT_MACRO_DELTA_OP__ID = MACRO_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALECT_MACRO_DELTA_OP__NAME = MACRO_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALECT_MACRO_DELTA_OP__BODY = MACRO_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dialect Macro Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALECT_MACRO_DELTA_OP_FEATURE_COUNT = MACRO_DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALECT_MACRO_DELTA_OP___APPLY = MACRO_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Dialect Macro Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIALECT_MACRO_DELTA_OP_OPERATION_COUNT = MACRO_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.CreationMacroDeltaOpImpl <em>Creation Macro Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.CreationMacroDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getCreationMacroDeltaOp()
	 * @generated
	 */
	int CREATION_MACRO_DELTA_OP = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_MACRO_DELTA_OP__ID = DIALECT_MACRO_DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_MACRO_DELTA_OP__NAME = DIALECT_MACRO_DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_MACRO_DELTA_OP__BODY = DIALECT_MACRO_DELTA_OP__BODY;

	/**
	 * The number of structural features of the '<em>Creation Macro Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_MACRO_DELTA_OP_FEATURE_COUNT = DIALECT_MACRO_DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_MACRO_DELTA_OP___APPLY = DIALECT_MACRO_DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Creation Macro Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATION_MACRO_DELTA_OP_OPERATION_COUNT = DIALECT_MACRO_DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.impl.InitializeRootObjectDeltaOpImpl <em>Initialize Root Object Delta Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.impl.InitializeRootObjectDeltaOpImpl
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getInitializeRootObjectDeltaOp()
	 * @generated
	 */
	int INITIALIZE_ROOT_OBJECT_DELTA_OP = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_ROOT_OBJECT_DELTA_OP__ID = DELTA_OP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_ROOT_OBJECT_DELTA_OP__NAME = DELTA_OP__NAME;

	/**
	 * The feature id for the '<em><b>Id Of New Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_ROOT_OBJECT_DELTA_OP__ID_OF_NEW_ROOT = DELTA_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_ROOT_OBJECT_DELTA_OP__LOCATION = DELTA_OP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE = DELTA_OP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Root Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE_STRING = DELTA_OP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Initialize Root Object Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_ROOT_OBJECT_DELTA_OP_FEATURE_COUNT = DELTA_OP_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_ROOT_OBJECT_DELTA_OP___APPLY = DELTA_OP___APPLY;

	/**
	 * The number of operations of the '<em>Initialize Root Object Delta Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_ROOT_OBJECT_DELTA_OP_OPERATION_COUNT = DELTA_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.educsos.dovamo.genericDelta.RemovalStrategy <em>Removal Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.educsos.dovamo.genericDelta.RemovalStrategy
	 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRemovalStrategy()
	 * @generated
	 */
	int REMOVAL_STRATEGY = 37;


	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.DeltaOp <em>Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.DeltaOp
	 * @generated
	 */
	EClass getDeltaOp();

	/**
	 * Returns the meta object for the '{@link org.educsos.dovamo.genericDelta.DeltaOp#apply() <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see org.educsos.dovamo.genericDelta.DeltaOp#apply()
	 * @generated
	 */
	EOperation getDeltaOp__Apply();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.Delta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delta</em>'.
	 * @see org.educsos.dovamo.genericDelta.Delta
	 * @generated
	 */
	EClass getDelta();

	/**
	 * Returns the meta object for the containment reference list '{@link org.educsos.dovamo.genericDelta.Delta#getDeltaOperations <em>Delta Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delta Operations</em>'.
	 * @see org.educsos.dovamo.genericDelta.Delta#getDeltaOperations()
	 * @see #getDelta()
	 * @generated
	 */
	EReference getDelta_DeltaOperations();

	/**
	 * Returns the meta object for the containment reference '{@link org.educsos.dovamo.genericDelta.Delta#getApplicabilityCondition <em>Applicability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicability Condition</em>'.
	 * @see org.educsos.dovamo.genericDelta.Delta#getApplicabilityCondition()
	 * @see #getDelta()
	 * @generated
	 */
	EReference getDelta_ApplicabilityCondition();

	/**
	 * Returns the meta object for the reference list '{@link org.educsos.dovamo.genericDelta.Delta#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>After</em>'.
	 * @see org.educsos.dovamo.genericDelta.Delta#getAfter()
	 * @see #getDelta()
	 * @generated
	 */
	EReference getDelta_After();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.MacroDeltaOp <em>Macro Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.MacroDeltaOp
	 * @generated
	 */
	EClass getMacroDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.AttDeltaOp <em>Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.AttDeltaOp
	 * @generated
	 */
	EClass getAttDeltaOp();

	/**
	 * Returns the meta object for the reference '{@link org.educsos.dovamo.genericDelta.AttDeltaOp#getModifiedAtt <em>Modified Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modified Att</em>'.
	 * @see org.educsos.dovamo.genericDelta.AttDeltaOp#getModifiedAtt()
	 * @see #getAttDeltaOp()
	 * @generated
	 */
	EReference getAttDeltaOp_ModifiedAtt();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.AttDeltaOp#getModifiedAttString <em>Modified Att String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Att String</em>'.
	 * @see org.educsos.dovamo.genericDelta.AttDeltaOp#getModifiedAttString()
	 * @see #getAttDeltaOp()
	 * @generated
	 */
	EAttribute getAttDeltaOp_ModifiedAttString();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.RefDeltaOp <em>Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.RefDeltaOp
	 * @generated
	 */
	EClass getRefDeltaOp();

	/**
	 * Returns the meta object for the reference '{@link org.educsos.dovamo.genericDelta.RefDeltaOp#getModifiedRef <em>Modified Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modified Ref</em>'.
	 * @see org.educsos.dovamo.genericDelta.RefDeltaOp#getModifiedRef()
	 * @see #getRefDeltaOp()
	 * @generated
	 */
	EReference getRefDeltaOp_ModifiedRef();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.RefDeltaOp#getModifiedRefString <em>Modified Ref String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Ref String</em>'.
	 * @see org.educsos.dovamo.genericDelta.RefDeltaOp#getModifiedRefString()
	 * @see #getRefDeltaOp()
	 * @generated
	 */
	EAttribute getRefDeltaOp_ModifiedRefString();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.SingleRefDeltaOp <em>Single Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.SingleRefDeltaOp
	 * @generated
	 */
	EClass getSingleRefDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.MultiRefDeltaOp <em>Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.MultiRefDeltaOp
	 * @generated
	 */
	EClass getMultiRefDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.SingleAttDeltaOp <em>Single Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.SingleAttDeltaOp
	 * @generated
	 */
	EClass getSingleAttDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.MultiAttDeltaOp <em>Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.MultiAttDeltaOp
	 * @generated
	 */
	EClass getMultiAttDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.SetSingleAttDeltaOp <em>Set Single Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Single Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.SetSingleAttDeltaOp
	 * @generated
	 */
	EClass getSetSingleAttDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.SetSingleAttDeltaOp#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Value</em>'.
	 * @see org.educsos.dovamo.genericDelta.SetSingleAttDeltaOp#getNewValue()
	 * @see #getSetSingleAttDeltaOp()
	 * @generated
	 */
	EAttribute getSetSingleAttDeltaOp_NewValue();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.UnsetSingleAttDeltaOp <em>Unset Single Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unset Single Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.UnsetSingleAttDeltaOp
	 * @generated
	 */
	EClass getUnsetSingleAttDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.UnsetSingleRefDeltaOp <em>Unset Single Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unset Single Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.UnsetSingleRefDeltaOp
	 * @generated
	 */
	EClass getUnsetSingleRefDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.SetSingleRefDeltaOp <em>Set Single Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Single Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.SetSingleRefDeltaOp
	 * @generated
	 */
	EClass getSetSingleRefDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.SetSingleRefDeltaOp#getIdOfNewValue <em>Id Of New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Of New Value</em>'.
	 * @see org.educsos.dovamo.genericDelta.SetSingleRefDeltaOp#getIdOfNewValue()
	 * @see #getSetSingleRefDeltaOp()
	 * @generated
	 */
	EAttribute getSetSingleRefDeltaOp_IdOfNewValue();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.InsertAtIndexMultiRefDeltaOp <em>Insert At Index Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert At Index Multi Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.InsertAtIndexMultiRefDeltaOp
	 * @generated
	 */
	EClass getInsertAtIndexMultiRefDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.InsertAtIndexMultiRefDeltaOp#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.educsos.dovamo.genericDelta.InsertAtIndexMultiRefDeltaOp#getPosition()
	 * @see #getInsertAtIndexMultiRefDeltaOp()
	 * @generated
	 */
	EAttribute getInsertAtIndexMultiRefDeltaOp_Position();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.AddByValueMultiRefDeltaOp <em>Add By Value Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add By Value Multi Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.AddByValueMultiRefDeltaOp
	 * @generated
	 */
	EClass getAddByValueMultiRefDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.AddByValueMultiRefDeltaOp#getIdOfAddedValue <em>Id Of Added Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Of Added Value</em>'.
	 * @see org.educsos.dovamo.genericDelta.AddByValueMultiRefDeltaOp#getIdOfAddedValue()
	 * @see #getAddByValueMultiRefDeltaOp()
	 * @generated
	 */
	EAttribute getAddByValueMultiRefDeltaOp_IdOfAddedValue();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp <em>Remove By Value Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove By Value Multi Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp
	 * @generated
	 */
	EClass getRemoveByValueMultiRefDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp#getStrategy()
	 * @see #getRemoveByValueMultiRefDeltaOp()
	 * @generated
	 */
	EAttribute getRemoveByValueMultiRefDeltaOp_Strategy();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp#getIdOfRemovedValue <em>Id Of Removed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Of Removed Value</em>'.
	 * @see org.educsos.dovamo.genericDelta.RemoveByValueMultiRefDeltaOp#getIdOfRemovedValue()
	 * @see #getRemoveByValueMultiRefDeltaOp()
	 * @generated
	 */
	EAttribute getRemoveByValueMultiRefDeltaOp_IdOfRemovedValue();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see org.educsos.dovamo.genericDelta.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.Identifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.educsos.dovamo.genericDelta.Identifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.Identifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.educsos.dovamo.genericDelta.Identifier#getName()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Name();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.ClearMultiRefDeltaOp <em>Clear Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Multi Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.ClearMultiRefDeltaOp
	 * @generated
	 */
	EClass getClearMultiRefDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.DeleteByIndexMultiRefDeltaOp <em>Delete By Index Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete By Index Multi Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.DeleteByIndexMultiRefDeltaOp
	 * @generated
	 */
	EClass getDeleteByIndexMultiRefDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.DeleteByIndexMultiRefDeltaOp#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.educsos.dovamo.genericDelta.DeleteByIndexMultiRefDeltaOp#getPosition()
	 * @see #getDeleteByIndexMultiRefDeltaOp()
	 * @generated
	 */
	EAttribute getDeleteByIndexMultiRefDeltaOp_Position();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.ReplaceAtRefMacro <em>Replace At Ref Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace At Ref Macro</em>'.
	 * @see org.educsos.dovamo.genericDelta.ReplaceAtRefMacro
	 * @generated
	 */
	EClass getReplaceAtRefMacro();

	/**
	 * Returns the meta object for the containment reference '{@link org.educsos.dovamo.genericDelta.ReplaceAtRefMacro#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete</em>'.
	 * @see org.educsos.dovamo.genericDelta.ReplaceAtRefMacro#getDelete()
	 * @see #getReplaceAtRefMacro()
	 * @generated
	 */
	EReference getReplaceAtRefMacro_Delete();

	/**
	 * Returns the meta object for the containment reference '{@link org.educsos.dovamo.genericDelta.ReplaceAtRefMacro#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert</em>'.
	 * @see org.educsos.dovamo.genericDelta.ReplaceAtRefMacro#getInsert()
	 * @see #getReplaceAtRefMacro()
	 * @generated
	 */
	EReference getReplaceAtRefMacro_Insert();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.DeltaRepository <em>Delta Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delta Repository</em>'.
	 * @see org.educsos.dovamo.genericDelta.DeltaRepository
	 * @generated
	 */
	EClass getDeltaRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.educsos.dovamo.genericDelta.DeltaRepository#getDelta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delta</em>'.
	 * @see org.educsos.dovamo.genericDelta.DeltaRepository#getDelta()
	 * @see #getDeltaRepository()
	 * @generated
	 */
	EReference getDeltaRepository_Delta();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.AtomicDeltaOp <em>Atomic Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.AtomicDeltaOp
	 * @generated
	 */
	EClass getAtomicDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.AtomicDeltaOp#getIdOfAffectedObject <em>Id Of Affected Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Of Affected Object</em>'.
	 * @see org.educsos.dovamo.genericDelta.AtomicDeltaOp#getIdOfAffectedObject()
	 * @see #getAtomicDeltaOp()
	 * @generated
	 */
	EAttribute getAtomicDeltaOp_IdOfAffectedObject();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.MoveContained <em>Move Contained</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Contained</em>'.
	 * @see org.educsos.dovamo.genericDelta.MoveContained
	 * @generated
	 */
	EClass getMoveContained();

	/**
	 * Returns the meta object for the containment reference '{@link org.educsos.dovamo.genericDelta.MoveContained#getRemove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Remove</em>'.
	 * @see org.educsos.dovamo.genericDelta.MoveContained#getRemove()
	 * @see #getMoveContained()
	 * @generated
	 */
	EReference getMoveContained_Remove();

	/**
	 * Returns the meta object for the containment reference '{@link org.educsos.dovamo.genericDelta.MoveContained#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add</em>'.
	 * @see org.educsos.dovamo.genericDelta.MoveContained#getAdd()
	 * @see #getMoveContained()
	 * @generated
	 */
	EReference getMoveContained_Add();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.RemovalMultiRefDeltaOp <em>Removal Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removal Multi Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.RemovalMultiRefDeltaOp
	 * @generated
	 */
	EClass getRemovalMultiRefDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.AdditionMultiRefDeltaOp <em>Addition Multi Ref Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Multi Ref Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.AdditionMultiRefDeltaOp
	 * @generated
	 */
	EClass getAdditionMultiRefDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.AdditionMultiAttDeltaOp <em>Addition Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition Multi Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.AdditionMultiAttDeltaOp
	 * @generated
	 */
	EClass getAdditionMultiAttDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.RemovalMultiAttDeltaOp <em>Removal Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removal Multi Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.RemovalMultiAttDeltaOp
	 * @generated
	 */
	EClass getRemovalMultiAttDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.AddByValueMultiAttDeltaOp <em>Add By Value Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add By Value Multi Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.AddByValueMultiAttDeltaOp
	 * @generated
	 */
	EClass getAddByValueMultiAttDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.AddByValueMultiAttDeltaOp#getIdOfAddedValue <em>Id Of Added Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Of Added Value</em>'.
	 * @see org.educsos.dovamo.genericDelta.AddByValueMultiAttDeltaOp#getIdOfAddedValue()
	 * @see #getAddByValueMultiAttDeltaOp()
	 * @generated
	 */
	EAttribute getAddByValueMultiAttDeltaOp_IdOfAddedValue();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.InsertAtIndexMultiAttDeltaOp <em>Insert At Index Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert At Index Multi Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.InsertAtIndexMultiAttDeltaOp
	 * @generated
	 */
	EClass getInsertAtIndexMultiAttDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.InsertAtIndexMultiAttDeltaOp#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.educsos.dovamo.genericDelta.InsertAtIndexMultiAttDeltaOp#getPosition()
	 * @see #getInsertAtIndexMultiAttDeltaOp()
	 * @generated
	 */
	EAttribute getInsertAtIndexMultiAttDeltaOp_Position();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.DeleteByIndexMultiAttDeltaOp <em>Delete By Index Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete By Index Multi Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.DeleteByIndexMultiAttDeltaOp
	 * @generated
	 */
	EClass getDeleteByIndexMultiAttDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.DeleteByIndexMultiAttDeltaOp#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.educsos.dovamo.genericDelta.DeleteByIndexMultiAttDeltaOp#getPosition()
	 * @see #getDeleteByIndexMultiAttDeltaOp()
	 * @generated
	 */
	EAttribute getDeleteByIndexMultiAttDeltaOp_Position();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp <em>Remove By Value Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove By Value Multi Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp
	 * @generated
	 */
	EClass getRemoveByValueMultiAttDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp#getStrategy()
	 * @see #getRemoveByValueMultiAttDeltaOp()
	 * @generated
	 */
	EAttribute getRemoveByValueMultiAttDeltaOp_Strategy();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp#getIdOfRemovedValue <em>Id Of Removed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Of Removed Value</em>'.
	 * @see org.educsos.dovamo.genericDelta.RemoveByValueMultiAttDeltaOp#getIdOfRemovedValue()
	 * @see #getRemoveByValueMultiAttDeltaOp()
	 * @generated
	 */
	EAttribute getRemoveByValueMultiAttDeltaOp_IdOfRemovedValue();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.ClearMultiAttDeltaOp <em>Clear Multi Att Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clear Multi Att Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.ClearMultiAttDeltaOp
	 * @generated
	 */
	EClass getClearMultiAttDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.ReplaceAtAttMacro <em>Replace At Att Macro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace At Att Macro</em>'.
	 * @see org.educsos.dovamo.genericDelta.ReplaceAtAttMacro
	 * @generated
	 */
	EClass getReplaceAtAttMacro();

	/**
	 * Returns the meta object for the containment reference '{@link org.educsos.dovamo.genericDelta.ReplaceAtAttMacro#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete</em>'.
	 * @see org.educsos.dovamo.genericDelta.ReplaceAtAttMacro#getDelete()
	 * @see #getReplaceAtAttMacro()
	 * @generated
	 */
	EReference getReplaceAtAttMacro_Delete();

	/**
	 * Returns the meta object for the containment reference '{@link org.educsos.dovamo.genericDelta.ReplaceAtAttMacro#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert</em>'.
	 * @see org.educsos.dovamo.genericDelta.ReplaceAtAttMacro#getInsert()
	 * @see #getReplaceAtAttMacro()
	 * @generated
	 */
	EReference getReplaceAtAttMacro_Insert();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.PredefinedMacroDeltaOp <em>Predefined Macro Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined Macro Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.PredefinedMacroDeltaOp
	 * @generated
	 */
	EClass getPredefinedMacroDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.DialectMacroDeltaOp <em>Dialect Macro Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dialect Macro Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.DialectMacroDeltaOp
	 * @generated
	 */
	EClass getDialectMacroDeltaOp();

	/**
	 * Returns the meta object for the reference '{@link org.educsos.dovamo.genericDelta.DialectMacroDeltaOp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Body</em>'.
	 * @see org.educsos.dovamo.genericDelta.DialectMacroDeltaOp#getBody()
	 * @see #getDialectMacroDeltaOp()
	 * @generated
	 */
	EReference getDialectMacroDeltaOp_Body();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.CreationMacroDeltaOp <em>Creation Macro Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creation Macro Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.CreationMacroDeltaOp
	 * @generated
	 */
	EClass getCreationMacroDeltaOp();

	/**
	 * Returns the meta object for class '{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp <em>Initialize Root Object Delta Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialize Root Object Delta Op</em>'.
	 * @see org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp
	 * @generated
	 */
	EClass getInitializeRootObjectDeltaOp();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getIdOfNewRoot <em>Id Of New Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Of New Root</em>'.
	 * @see org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getIdOfNewRoot()
	 * @see #getInitializeRootObjectDeltaOp()
	 * @generated
	 */
	EAttribute getInitializeRootObjectDeltaOp_IdOfNewRoot();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getLocation()
	 * @see #getInitializeRootObjectDeltaOp()
	 * @generated
	 */
	EAttribute getInitializeRootObjectDeltaOp_Location();

	/**
	 * Returns the meta object for the reference '{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getRootType <em>Root Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Type</em>'.
	 * @see org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getRootType()
	 * @see #getInitializeRootObjectDeltaOp()
	 * @generated
	 */
	EReference getInitializeRootObjectDeltaOp_RootType();

	/**
	 * Returns the meta object for the attribute '{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getRootTypeString <em>Root Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Type String</em>'.
	 * @see org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getRootTypeString()
	 * @see #getInitializeRootObjectDeltaOp()
	 * @generated
	 */
	EAttribute getInitializeRootObjectDeltaOp_RootTypeString();

	/**
	 * Returns the meta object for enum '{@link org.educsos.dovamo.genericDelta.RemovalStrategy <em>Removal Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Removal Strategy</em>'.
	 * @see org.educsos.dovamo.genericDelta.RemovalStrategy
	 * @generated
	 */
	EEnum getRemovalStrategy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericDeltaFactory getGenericDeltaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.DeltaOpImpl <em>Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.DeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDeltaOp()
		 * @generated
		 */
		EClass DELTA_OP = eINSTANCE.getDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DELTA_OP___APPLY = eINSTANCE.getDeltaOp__Apply();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.DeltaImpl <em>Delta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.DeltaImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDelta()
		 * @generated
		 */
		EClass DELTA = eINSTANCE.getDelta();

		/**
		 * The meta object literal for the '<em><b>Delta Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA__DELTA_OPERATIONS = eINSTANCE.getDelta_DeltaOperations();

		/**
		 * The meta object literal for the '<em><b>Applicability Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA__APPLICABILITY_CONDITION = eINSTANCE.getDelta_ApplicabilityCondition();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA__AFTER = eINSTANCE.getDelta_After();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.MacroDeltaOpImpl <em>Macro Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.MacroDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getMacroDeltaOp()
		 * @generated
		 */
		EClass MACRO_DELTA_OP = eINSTANCE.getMacroDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.AttDeltaOpImpl <em>Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.AttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAttDeltaOp()
		 * @generated
		 */
		EClass ATT_DELTA_OP = eINSTANCE.getAttDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Modified Att</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATT_DELTA_OP__MODIFIED_ATT = eINSTANCE.getAttDeltaOp_ModifiedAtt();

		/**
		 * The meta object literal for the '<em><b>Modified Att String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATT_DELTA_OP__MODIFIED_ATT_STRING = eINSTANCE.getAttDeltaOp_ModifiedAttString();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.RefDeltaOpImpl <em>Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.RefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRefDeltaOp()
		 * @generated
		 */
		EClass REF_DELTA_OP = eINSTANCE.getRefDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Modified Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_DELTA_OP__MODIFIED_REF = eINSTANCE.getRefDeltaOp_ModifiedRef();

		/**
		 * The meta object literal for the '<em><b>Modified Ref String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_DELTA_OP__MODIFIED_REF_STRING = eINSTANCE.getRefDeltaOp_ModifiedRefString();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.SingleRefDeltaOpImpl <em>Single Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.SingleRefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getSingleRefDeltaOp()
		 * @generated
		 */
		EClass SINGLE_REF_DELTA_OP = eINSTANCE.getSingleRefDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.MultiRefDeltaOpImpl <em>Multi Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.MultiRefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getMultiRefDeltaOp()
		 * @generated
		 */
		EClass MULTI_REF_DELTA_OP = eINSTANCE.getMultiRefDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.SingleAttDeltaOpImpl <em>Single Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.SingleAttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getSingleAttDeltaOp()
		 * @generated
		 */
		EClass SINGLE_ATT_DELTA_OP = eINSTANCE.getSingleAttDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.MultiAttDeltaOpImpl <em>Multi Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.MultiAttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getMultiAttDeltaOp()
		 * @generated
		 */
		EClass MULTI_ATT_DELTA_OP = eINSTANCE.getMultiAttDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.SetSingleAttDeltaOpImpl <em>Set Single Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.SetSingleAttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getSetSingleAttDeltaOp()
		 * @generated
		 */
		EClass SET_SINGLE_ATT_DELTA_OP = eINSTANCE.getSetSingleAttDeltaOp();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_SINGLE_ATT_DELTA_OP__NEW_VALUE = eINSTANCE.getSetSingleAttDeltaOp_NewValue();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.UnsetSingleAttDeltaOpImpl <em>Unset Single Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.UnsetSingleAttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getUnsetSingleAttDeltaOp()
		 * @generated
		 */
		EClass UNSET_SINGLE_ATT_DELTA_OP = eINSTANCE.getUnsetSingleAttDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.UnsetSingleRefDeltaOpImpl <em>Unset Single Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.UnsetSingleRefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getUnsetSingleRefDeltaOp()
		 * @generated
		 */
		EClass UNSET_SINGLE_REF_DELTA_OP = eINSTANCE.getUnsetSingleRefDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.SetSingleRefDeltaOpImpl <em>Set Single Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.SetSingleRefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getSetSingleRefDeltaOp()
		 * @generated
		 */
		EClass SET_SINGLE_REF_DELTA_OP = eINSTANCE.getSetSingleRefDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Id Of New Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_SINGLE_REF_DELTA_OP__ID_OF_NEW_VALUE = eINSTANCE.getSetSingleRefDeltaOp_IdOfNewValue();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.InsertAtIndexMultiRefDeltaOpImpl <em>Insert At Index Multi Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.InsertAtIndexMultiRefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getInsertAtIndexMultiRefDeltaOp()
		 * @generated
		 */
		EClass INSERT_AT_INDEX_MULTI_REF_DELTA_OP = eINSTANCE.getInsertAtIndexMultiRefDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_AT_INDEX_MULTI_REF_DELTA_OP__POSITION = eINSTANCE.getInsertAtIndexMultiRefDeltaOp_Position();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.AddByValueMultiRefDeltaOpImpl <em>Add By Value Multi Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.AddByValueMultiRefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAddByValueMultiRefDeltaOp()
		 * @generated
		 */
		EClass ADD_BY_VALUE_MULTI_REF_DELTA_OP = eINSTANCE.getAddByValueMultiRefDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Id Of Added Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_ADDED_VALUE = eINSTANCE.getAddByValueMultiRefDeltaOp_IdOfAddedValue();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.RemoveByValueMultiRefDeltaOpImpl <em>Remove By Value Multi Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.RemoveByValueMultiRefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRemoveByValueMultiRefDeltaOp()
		 * @generated
		 */
		EClass REMOVE_BY_VALUE_MULTI_REF_DELTA_OP = eINSTANCE.getRemoveByValueMultiRefDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_BY_VALUE_MULTI_REF_DELTA_OP__STRATEGY = eINSTANCE.getRemoveByValueMultiRefDeltaOp_Strategy();

		/**
		 * The meta object literal for the '<em><b>Id Of Removed Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_BY_VALUE_MULTI_REF_DELTA_OP__ID_OF_REMOVED_VALUE = eINSTANCE.getRemoveByValueMultiRefDeltaOp_IdOfRemovedValue();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.IdentifierImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__NAME = eINSTANCE.getIdentifier_Name();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.ClearMultiRefDeltaOpImpl <em>Clear Multi Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.ClearMultiRefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getClearMultiRefDeltaOp()
		 * @generated
		 */
		EClass CLEAR_MULTI_REF_DELTA_OP = eINSTANCE.getClearMultiRefDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.DeleteByIndexMultiRefDeltaOpImpl <em>Delete By Index Multi Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.DeleteByIndexMultiRefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDeleteByIndexMultiRefDeltaOp()
		 * @generated
		 */
		EClass DELETE_BY_INDEX_MULTI_REF_DELTA_OP = eINSTANCE.getDeleteByIndexMultiRefDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_BY_INDEX_MULTI_REF_DELTA_OP__POSITION = eINSTANCE.getDeleteByIndexMultiRefDeltaOp_Position();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.ReplaceAtRefMacroImpl <em>Replace At Ref Macro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.ReplaceAtRefMacroImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getReplaceAtRefMacro()
		 * @generated
		 */
		EClass REPLACE_AT_REF_MACRO = eINSTANCE.getReplaceAtRefMacro();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_AT_REF_MACRO__DELETE = eINSTANCE.getReplaceAtRefMacro_Delete();

		/**
		 * The meta object literal for the '<em><b>Insert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_AT_REF_MACRO__INSERT = eINSTANCE.getReplaceAtRefMacro_Insert();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.DeltaRepositoryImpl <em>Delta Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.DeltaRepositoryImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDeltaRepository()
		 * @generated
		 */
		EClass DELTA_REPOSITORY = eINSTANCE.getDeltaRepository();

		/**
		 * The meta object literal for the '<em><b>Delta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELTA_REPOSITORY__DELTA = eINSTANCE.getDeltaRepository_Delta();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.AtomicDeltaOpImpl <em>Atomic Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.AtomicDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAtomicDeltaOp()
		 * @generated
		 */
		EClass ATOMIC_DELTA_OP = eINSTANCE.getAtomicDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Id Of Affected Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_DELTA_OP__ID_OF_AFFECTED_OBJECT = eINSTANCE.getAtomicDeltaOp_IdOfAffectedObject();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.MoveContainedImpl <em>Move Contained</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.MoveContainedImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getMoveContained()
		 * @generated
		 */
		EClass MOVE_CONTAINED = eINSTANCE.getMoveContained();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_CONTAINED__REMOVE = eINSTANCE.getMoveContained_Remove();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE_CONTAINED__ADD = eINSTANCE.getMoveContained_Add();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.RemovalMultiRefDeltaOpImpl <em>Removal Multi Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.RemovalMultiRefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRemovalMultiRefDeltaOp()
		 * @generated
		 */
		EClass REMOVAL_MULTI_REF_DELTA_OP = eINSTANCE.getRemovalMultiRefDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.AdditionMultiRefDeltaOpImpl <em>Addition Multi Ref Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.AdditionMultiRefDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAdditionMultiRefDeltaOp()
		 * @generated
		 */
		EClass ADDITION_MULTI_REF_DELTA_OP = eINSTANCE.getAdditionMultiRefDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.AdditionMultiAttDeltaOpImpl <em>Addition Multi Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.AdditionMultiAttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAdditionMultiAttDeltaOp()
		 * @generated
		 */
		EClass ADDITION_MULTI_ATT_DELTA_OP = eINSTANCE.getAdditionMultiAttDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.RemovalMultiAttDeltaOpImpl <em>Removal Multi Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.RemovalMultiAttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRemovalMultiAttDeltaOp()
		 * @generated
		 */
		EClass REMOVAL_MULTI_ATT_DELTA_OP = eINSTANCE.getRemovalMultiAttDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.AddByValueMultiAttDeltaOpImpl <em>Add By Value Multi Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.AddByValueMultiAttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getAddByValueMultiAttDeltaOp()
		 * @generated
		 */
		EClass ADD_BY_VALUE_MULTI_ATT_DELTA_OP = eINSTANCE.getAddByValueMultiAttDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Id Of Added Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_ADDED_VALUE = eINSTANCE.getAddByValueMultiAttDeltaOp_IdOfAddedValue();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.InsertAtIndexMultiAttDeltaOpImpl <em>Insert At Index Multi Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.InsertAtIndexMultiAttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getInsertAtIndexMultiAttDeltaOp()
		 * @generated
		 */
		EClass INSERT_AT_INDEX_MULTI_ATT_DELTA_OP = eINSTANCE.getInsertAtIndexMultiAttDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_AT_INDEX_MULTI_ATT_DELTA_OP__POSITION = eINSTANCE.getInsertAtIndexMultiAttDeltaOp_Position();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.DeleteByIndexMultiAttDeltaOpImpl <em>Delete By Index Multi Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.DeleteByIndexMultiAttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDeleteByIndexMultiAttDeltaOp()
		 * @generated
		 */
		EClass DELETE_BY_INDEX_MULTI_ATT_DELTA_OP = eINSTANCE.getDeleteByIndexMultiAttDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_BY_INDEX_MULTI_ATT_DELTA_OP__POSITION = eINSTANCE.getDeleteByIndexMultiAttDeltaOp_Position();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.RemoveByValueMultiAttDeltaOpImpl <em>Remove By Value Multi Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.RemoveByValueMultiAttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRemoveByValueMultiAttDeltaOp()
		 * @generated
		 */
		EClass REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP = eINSTANCE.getRemoveByValueMultiAttDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__STRATEGY = eINSTANCE.getRemoveByValueMultiAttDeltaOp_Strategy();

		/**
		 * The meta object literal for the '<em><b>Id Of Removed Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_BY_VALUE_MULTI_ATT_DELTA_OP__ID_OF_REMOVED_VALUE = eINSTANCE.getRemoveByValueMultiAttDeltaOp_IdOfRemovedValue();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.ClearMultiAttDeltaOpImpl <em>Clear Multi Att Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.ClearMultiAttDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getClearMultiAttDeltaOp()
		 * @generated
		 */
		EClass CLEAR_MULTI_ATT_DELTA_OP = eINSTANCE.getClearMultiAttDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.ReplaceAtAttMacroImpl <em>Replace At Att Macro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.ReplaceAtAttMacroImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getReplaceAtAttMacro()
		 * @generated
		 */
		EClass REPLACE_AT_ATT_MACRO = eINSTANCE.getReplaceAtAttMacro();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_AT_ATT_MACRO__DELETE = eINSTANCE.getReplaceAtAttMacro_Delete();

		/**
		 * The meta object literal for the '<em><b>Insert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_AT_ATT_MACRO__INSERT = eINSTANCE.getReplaceAtAttMacro_Insert();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.PredefinedMacroDeltaOpImpl <em>Predefined Macro Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.PredefinedMacroDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getPredefinedMacroDeltaOp()
		 * @generated
		 */
		EClass PREDEFINED_MACRO_DELTA_OP = eINSTANCE.getPredefinedMacroDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.DialectMacroDeltaOpImpl <em>Dialect Macro Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.DialectMacroDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getDialectMacroDeltaOp()
		 * @generated
		 */
		EClass DIALECT_MACRO_DELTA_OP = eINSTANCE.getDialectMacroDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIALECT_MACRO_DELTA_OP__BODY = eINSTANCE.getDialectMacroDeltaOp_Body();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.CreationMacroDeltaOpImpl <em>Creation Macro Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.CreationMacroDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getCreationMacroDeltaOp()
		 * @generated
		 */
		EClass CREATION_MACRO_DELTA_OP = eINSTANCE.getCreationMacroDeltaOp();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.impl.InitializeRootObjectDeltaOpImpl <em>Initialize Root Object Delta Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.impl.InitializeRootObjectDeltaOpImpl
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getInitializeRootObjectDeltaOp()
		 * @generated
		 */
		EClass INITIALIZE_ROOT_OBJECT_DELTA_OP = eINSTANCE.getInitializeRootObjectDeltaOp();

		/**
		 * The meta object literal for the '<em><b>Id Of New Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIALIZE_ROOT_OBJECT_DELTA_OP__ID_OF_NEW_ROOT = eINSTANCE.getInitializeRootObjectDeltaOp_IdOfNewRoot();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIALIZE_ROOT_OBJECT_DELTA_OP__LOCATION = eINSTANCE.getInitializeRootObjectDeltaOp_Location();

		/**
		 * The meta object literal for the '<em><b>Root Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE = eINSTANCE.getInitializeRootObjectDeltaOp_RootType();

		/**
		 * The meta object literal for the '<em><b>Root Type String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INITIALIZE_ROOT_OBJECT_DELTA_OP__ROOT_TYPE_STRING = eINSTANCE.getInitializeRootObjectDeltaOp_RootTypeString();

		/**
		 * The meta object literal for the '{@link org.educsos.dovamo.genericDelta.RemovalStrategy <em>Removal Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.educsos.dovamo.genericDelta.RemovalStrategy
		 * @see org.educsos.dovamo.genericDelta.impl.GenericDeltaPackageImpl#getRemovalStrategy()
		 * @generated
		 */
		EEnum REMOVAL_STRATEGY = eINSTANCE.getRemovalStrategy();

	}

} //GenericDeltaPackage
