/**
 */
package org.educsos.dovamo.genericDelta.applicability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.applicability.Literal#getFeatureID <em>Feature ID</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.applicability.ApplicabilityPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends Expression {
	/**
	 * Returns the value of the '<em><b>Feature ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature ID</em>' attribute.
	 * @see #setFeatureID(String)
	 * @see org.educsos.dovamo.genericDelta.applicability.ApplicabilityPackage#getLiteral_FeatureID()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureID();

	/**
	 * Sets the value of the '{@link org.educsos.dovamo.genericDelta.applicability.Literal#getFeatureID <em>Feature ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature ID</em>' attribute.
	 * @see #getFeatureID()
	 * @generated
	 */
	void setFeatureID(String value);

} // Literal
