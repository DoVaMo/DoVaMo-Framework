/**
 */
package org.educsos.dovamo.genericDelta;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Delta Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.RefDeltaOp#getModifiedRef <em>Modified Ref</em>}</li>
 *   <li>{@link org.educsos.dovamo.genericDelta.RefDeltaOp#getModifiedRefString <em>Modified Ref String</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getRefDeltaOp()
 * @model abstract="true"
 * @generated
 */
public interface RefDeltaOp extends AtomicDeltaOp {
	/**
	 * Returns the value of the '<em><b>Modified Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Ref</em>' reference.
	 * @see #setModifiedRef(EReference)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getRefDeltaOp_ModifiedRef()
	 * @model
	 * @generated
	 */
	EReference getModifiedRef();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.RefDeltaOp#getModifiedRef <em>Modified Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Ref</em>' reference.
	 * @see #getModifiedRef()
	 * @generated
	 */
	void setModifiedRef(EReference value);

	/**
	 * Returns the value of the '<em><b>Modified Ref String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Ref String</em>' attribute.
	 * @see #setModifiedRefString(String)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getRefDeltaOp_ModifiedRefString()
	 * @model required="true"
	 * @generated
	 */
	String getModifiedRefString();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.RefDeltaOp#getModifiedRefString <em>Modified Ref String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Ref String</em>' attribute.
	 * @see #getModifiedRefString()
	 * @generated
	 */
	void setModifiedRefString(String value);

} // RefDeltaOp
