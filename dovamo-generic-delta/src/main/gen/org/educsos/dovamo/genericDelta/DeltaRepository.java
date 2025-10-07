/**
 */
package org.educsos.dovamo.genericDelta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delta Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.educsos.dovamo.genericDelta.DeltaRepository#getDelta <em>Delta</em>}</li>
 * </ul>
 *
 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getDeltaRepository()
 * @model
 * @generated
 */
public interface DeltaRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Delta</b></em>' containment reference list.
	 * The list contents are of type {@link org.educsos.dovamo.genericDelta.Delta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta</em>' containment reference list.
	 * @see org.educsos.dovamo.genericDelta.GenericDeltaPackage#getDeltaRepository_Delta()
	 * @model containment="true"
	 * @generated
	 */
	EList<Delta> getDelta();

} // DeltaRepository
