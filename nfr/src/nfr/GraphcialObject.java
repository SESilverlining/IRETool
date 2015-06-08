/**
 */
package nfr;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphcial Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nfr.GraphcialObject#getName <em>Name</em>}</li>
 *   <li>{@link nfr.GraphcialObject#getSoftgoal <em>Softgoal</em>}</li>
 * </ul>
 * </p>
 *
 * @see nfr.NfrPackage#getGraphcialObject()
 * @model abstract="true"
 * @generated
 */
public interface GraphcialObject extends EObject {

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
	 * @see nfr.NfrPackage#getGraphcialObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nfr.GraphcialObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Softgoal</b></em>' reference list.
	 * The list contents are of type {@link nfr.SoftGoal}.
	 * It is bidirectional and its opposite is '{@link nfr.SoftGoal#getGoalTopic <em>Goal Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Softgoal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Softgoal</em>' reference list.
	 * @see nfr.NfrPackage#getGraphcialObject_Softgoal()
	 * @see nfr.SoftGoal#getGoalTopic
	 * @model opposite="goalTopic"
	 * @generated
	 */
	EList<SoftGoal> getSoftgoal();
} // GraphcialObject
