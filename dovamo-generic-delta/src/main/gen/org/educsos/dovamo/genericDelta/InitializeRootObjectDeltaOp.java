/**
 */
package org.educsos.dovamo.genericDelta;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initialize Root Object Delta Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getIdOfNewRoot <em>Id Of New Root</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getLocation <em>Location</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getRootType <em>Root Type</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getRootTypeString <em>Root Type String</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getInitializeRootObjectDeltaOp()
 * @model
 * @generated
 */
public interface InitializeRootObjectDeltaOp extends DeltaOp {
	/**
	 * Returns the value of the '<em><b>Id Of New Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Of New Root</em>' attribute.
	 * @see #setIdOfNewRoot(String)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getInitializeRootObjectDeltaOp_IdOfNewRoot()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getIdOfNewRoot();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getIdOfNewRoot <em>Id Of New Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Of New Root</em>' attribute.
	 * @see #getIdOfNewRoot()
	 * @generated
	 */
	void setIdOfNewRoot(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getInitializeRootObjectDeltaOp_Location()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Root Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Type</em>' reference.
	 * @see #setRootType(EClass)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getInitializeRootObjectDeltaOp_RootType()
	 * @model
	 * @generated
	 */
	EClass getRootType();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getRootType <em>Root Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Type</em>' reference.
	 * @see #getRootType()
	 * @generated
	 */
	void setRootType(EClass value);

	/**
	 * Returns the value of the '<em><b>Root Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Type String</em>' attribute.
	 * @see #setRootTypeString(String)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getInitializeRootObjectDeltaOp_RootTypeString()
	 * @model required="true"
	 * @generated
	 */
	String getRootTypeString();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.InitializeRootObjectDeltaOp#getRootTypeString <em>Root Type String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Type String</em>' attribute.
	 * @see #getRootTypeString()
	 * @generated
	 */
	void setRootTypeString(String value);

} // InitializeRootObjectDeltaOp
