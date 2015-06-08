/**
 */
package nfr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFR Framework</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nfr.NFRFramework#getName <em>Name</em>}</li>
 *   <li>{@link nfr.NFRFramework#getSoftgoalMemebers <em>Softgoal Memebers</em>}</li>
 *   <li>{@link nfr.NFRFramework#getBpmnMembers <em>Bpmn Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see nfr.NfrPackage#getNFRFramework()
 * @model
 * @generated
 */
public interface NFRFramework extends EObject {
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
	 * @see nfr.NfrPackage#getNFRFramework_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nfr.NFRFramework#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Softgoal Memebers</b></em>' containment reference list.
	 * The list contents are of type {@link nfr.SoftGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Softgoal Memebers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Softgoal Memebers</em>' containment reference list.
	 * @see nfr.NfrPackage#getNFRFramework_SoftgoalMemebers()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoftGoal> getSoftgoalMemebers();

	/**
	 * Returns the value of the '<em><b>Bpmn Members</b></em>' containment reference list.
	 * The list contents are of type {@link nfr.GraphcialObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bpmn Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Members</em>' containment reference list.
	 * @see nfr.NfrPackage#getNFRFramework_BpmnMembers()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphcialObject> getBpmnMembers();

} // NFRFramework
