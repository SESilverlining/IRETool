/**
 */
package nfr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soft Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nfr.SoftGoal#getName <em>Name</em>}</li>
 *   <li>{@link nfr.SoftGoal#getGoalType <em>Goal Type</em>}</li>
 *   <li>{@link nfr.SoftGoal#getParents <em>Parents</em>}</li>
 *   <li>{@link nfr.SoftGoal#getChild <em>Child</em>}</li>
 *   <li>{@link nfr.SoftGoal#getContribTypeToParent <em>Contrib Type To Parent</em>}</li>
 *   <li>{@link nfr.SoftGoal#getGoalTopic <em>Goal Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @see nfr.NfrPackage#getSoftGoal()
 * @model abstract="true"
 * @generated
 */
public interface SoftGoal extends EObject {
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
	 * @see nfr.NfrPackage#getSoftGoal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nfr.SoftGoal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Goal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Type</em>' attribute.
	 * @see #setGoalType(String)
	 * @see nfr.NfrPackage#getSoftGoal_GoalType()
	 * @model
	 * @generated
	 */
	String getGoalType();

	/**
	 * Sets the value of the '{@link nfr.SoftGoal#getGoalType <em>Goal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal Type</em>' attribute.
	 * @see #getGoalType()
	 * @generated
	 */
	void setGoalType(String value);

	/**
	 * Returns the value of the '<em><b>Goal Topic</b></em>' reference list.
	 * The list contents are of type {@link nfr.GraphcialObject}.
	 * It is bidirectional and its opposite is '{@link nfr.GraphcialObject#getSoftgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal Topic</em>' reference list.
	 * @see nfr.NfrPackage#getSoftGoal_GoalTopic()
	 * @see nfr.GraphcialObject#getSoftgoal
	 * @model opposite="softgoal"
	 * @generated
	 */
	EList<GraphcialObject> getGoalTopic();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link nfr.SoftGoal}.
	 * It is bidirectional and its opposite is '{@link nfr.SoftGoal#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see nfr.NfrPackage#getSoftGoal_Parents()
	 * @see nfr.SoftGoal#getChild
	 * @model opposite="child"
	 * @generated
	 */
	EList<SoftGoal> getParents();

	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link nfr.SoftGoal}.
	 * It is bidirectional and its opposite is '{@link nfr.SoftGoal#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see nfr.NfrPackage#getSoftGoal_Child()
	 * @see nfr.SoftGoal#getParents
	 * @model opposite="parents"
	 * @generated
	 */
	EList<SoftGoal> getChild();

	/**
	 * Returns the value of the '<em><b>Contrib Type To Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrib Type To Parent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrib Type To Parent</em>' containment reference.
	 * @see #setContribTypeToParent(Contribution)
	 * @see nfr.NfrPackage#getSoftGoal_ContribTypeToParent()
	 * @model containment="true"
	 * @generated
	 */
	Contribution getContribTypeToParent();

	/**
	 * Sets the value of the '{@link nfr.SoftGoal#getContribTypeToParent <em>Contrib Type To Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrib Type To Parent</em>' containment reference.
	 * @see #getContribTypeToParent()
	 * @generated
	 */
	void setContribTypeToParent(Contribution value);

} // SoftGoal
