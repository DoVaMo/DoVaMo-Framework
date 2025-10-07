/**
 */
package org.educsos.dovamo.genericDelta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Delta Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.AtomicDeltaOp#getIdOfAffectedObject <em>Id Of Affected Object</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getAtomicDeltaOp()
 * @model abstract="true"
 * @generated
 */
public interface AtomicDeltaOp extends DeltaOp {
	/**
	 * Returns the value of the '<em><b>Id Of Affected Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Of Affected Object</em>' attribute.
	 * @see #setIdOfAffectedObject(String)
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getAtomicDeltaOp_IdOfAffectedObject()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getIdOfAffectedObject();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.AtomicDeltaOp#getIdOfAffectedObject <em>Id Of Affected Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Of Affected Object</em>' attribute.
	 * @see #getIdOfAffectedObject()
	 * @generated
	 */
	void setIdOfAffectedObject(String value);

} // AtomicDeltaOp
