/**
 */
package nfr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nfr.Contribution#getName <em>Name</em>}</li>
 *   <li>{@link nfr.Contribution#getTargetSoftgoal <em>Target Softgoal</em>}</li>
 * </ul>
 * </p>
 *
 * @see nfr.NfrPackage#getContribution()
 * @model abstract="true"
 * @generated
 */
public interface Contribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nfr.NfrPackage#getContribution_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nfr.Contribution#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Softgoal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Softgoal</em>' reference.
	 * @see #setTargetSoftgoal(SoftGoal)
	 * @see nfr.NfrPackage#getContribution_TargetSoftgoal()
	 * @model required="true"
	 * @generated
	 */
	SoftGoal getTargetSoftgoal();

	/**
	 * Sets the value of the '{@link nfr.Contribution#getTargetSoftgoal <em>Target Softgoal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Softgoal</em>' reference.
	 * @see #getTargetSoftgoal()
	 * @generated
	 */
	void setTargetSoftgoal(SoftGoal value);

} // Contribution
