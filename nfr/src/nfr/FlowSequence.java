/**
 */
package nfr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link nfr.FlowSequence#getSourceTask <em>Source Task</em>}</li>
 * </ul>
 * </p>
 *
 * @see nfr.NfrPackage#getFlowSequence()
 * @model
 * @generated
 */
public interface FlowSequence extends GraphcialObject {
	/**
	 * Returns the value of the '<em><b>Source Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Task</em>' reference.
	 * @see #setSourceTask(Task)
	 * @see nfr.NfrPackage#getFlowSequence_SourceTask()
	 * @model required="true"
	 * @generated
	 */
	Task getSourceTask();

	/**
	 * Sets the value of the '{@link nfr.FlowSequence#getSourceTask <em>Source Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Task</em>' reference.
	 * @see #getSourceTask()
	 * @generated
	 */
	void setSourceTask(Task value);

} // FlowSequence
