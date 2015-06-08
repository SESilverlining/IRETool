/**
 */
package nfr;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nfr.Task#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link nfr.Task#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link nfr.Task#getSequenceToTarget <em>Sequence To Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see nfr.NfrPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends GraphcialObject {

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link nfr.Task#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(Task)
	 * @see nfr.NfrPackage#getTask_SourceRef()
	 * @see nfr.Task#getTargetRef
	 * @model opposite="targetRef"
	 * @generated
	 */
	Task getSourceRef();

	/**
	 * Sets the value of the '{@link nfr.Task#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(Task value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference list.
	 * The list contents are of type {@link nfr.Task}.
	 * It is bidirectional and its opposite is '{@link nfr.Task#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference list.
	 * @see nfr.NfrPackage#getTask_TargetRef()
	 * @see nfr.Task#getSourceRef
	 * @model opposite="sourceRef"
	 * @generated
	 */
	EList<Task> getTargetRef();

	/**
	 * Returns the value of the '<em><b>Sequence To Target</b></em>' containment reference list.
	 * The list contents are of type {@link nfr.FlowSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence To Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence To Target</em>' containment reference list.
	 * @see nfr.NfrPackage#getTask_SequenceToTarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowSequence> getSequenceToTarget();
} // Task
