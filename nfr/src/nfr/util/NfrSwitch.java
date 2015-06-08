/**
 */
package nfr.util;

import nfr.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see nfr.NfrPackage
 * @generated
 */
public class NfrSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NfrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfrSwitch() {
		if (modelPackage == null) {
			modelPackage = NfrPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NfrPackage.NFR_FRAMEWORK: {
				NFRFramework nfrFramework = (NFRFramework)theEObject;
				T result = caseNFRFramework(nfrFramework);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.SOFT_GOAL: {
				SoftGoal softGoal = (SoftGoal)theEObject;
				T result = caseSoftGoal(softGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.NFR_SOFTGOAL: {
				NFRSoftgoal nfrSoftgoal = (NFRSoftgoal)theEObject;
				T result = caseNFRSoftgoal(nfrSoftgoal);
				if (result == null) result = caseSoftGoal(nfrSoftgoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.OPERATIONALIZING_SOFTGOAL: {
				OperationalizingSoftgoal operationalizingSoftgoal = (OperationalizingSoftgoal)theEObject;
				T result = caseOperationalizingSoftgoal(operationalizingSoftgoal);
				if (result == null) result = caseSoftGoal(operationalizingSoftgoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.CLAIM_SOFTGOAL: {
				ClaimSoftgoal claimSoftgoal = (ClaimSoftgoal)theEObject;
				T result = caseClaimSoftgoal(claimSoftgoal);
				if (result == null) result = caseSoftGoal(claimSoftgoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.CONTRIBUTION: {
				Contribution contribution = (Contribution)theEObject;
				T result = caseContribution(contribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.DECOMPOSITION: {
				Decomposition decomposition = (Decomposition)theEObject;
				T result = caseDecomposition(decomposition);
				if (result == null) result = caseContribution(decomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.SATISFICING: {
				Satisficing satisficing = (Satisficing)theEObject;
				T result = caseSatisficing(satisficing);
				if (result == null) result = caseContribution(satisficing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.AND_DECOMPOSITION: {
				ANDDecomposition andDecomposition = (ANDDecomposition)theEObject;
				T result = caseANDDecomposition(andDecomposition);
				if (result == null) result = caseDecomposition(andDecomposition);
				if (result == null) result = caseContribution(andDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.OR_DECOMPOSITION: {
				ORDecomposition orDecomposition = (ORDecomposition)theEObject;
				T result = caseORDecomposition(orDecomposition);
				if (result == null) result = caseDecomposition(orDecomposition);
				if (result == null) result = caseContribution(orDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.POSITIVE_SATISFICING: {
				PositiveSatisficing positiveSatisficing = (PositiveSatisficing)theEObject;
				T result = casePositiveSatisficing(positiveSatisficing);
				if (result == null) result = caseSatisficing(positiveSatisficing);
				if (result == null) result = caseContribution(positiveSatisficing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.NEGATIVE_SATISFICING: {
				NegativeSatisficing negativeSatisficing = (NegativeSatisficing)theEObject;
				T result = caseNegativeSatisficing(negativeSatisficing);
				if (result == null) result = caseSatisficing(negativeSatisficing);
				if (result == null) result = caseContribution(negativeSatisficing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.EQL_DECOMPOSITION: {
				EQLDecomposition eqlDecomposition = (EQLDecomposition)theEObject;
				T result = caseEQLDecomposition(eqlDecomposition);
				if (result == null) result = caseDecomposition(eqlDecomposition);
				if (result == null) result = caseContribution(eqlDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.MAKE: {
				Make make = (Make)theEObject;
				T result = caseMake(make);
				if (result == null) result = casePositiveSatisficing(make);
				if (result == null) result = caseSatisficing(make);
				if (result == null) result = caseContribution(make);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.HELP: {
				Help help = (Help)theEObject;
				T result = caseHelp(help);
				if (result == null) result = casePositiveSatisficing(help);
				if (result == null) result = caseSatisficing(help);
				if (result == null) result = caseContribution(help);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.SOME_PLUS: {
				SomePlus somePlus = (SomePlus)theEObject;
				T result = caseSomePlus(somePlus);
				if (result == null) result = casePositiveSatisficing(somePlus);
				if (result == null) result = caseSatisficing(somePlus);
				if (result == null) result = caseContribution(somePlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.BREAK: {
				Break break_ = (Break)theEObject;
				T result = caseBreak(break_);
				if (result == null) result = caseNegativeSatisficing(break_);
				if (result == null) result = caseSatisficing(break_);
				if (result == null) result = caseContribution(break_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.HURT: {
				Hurt hurt = (Hurt)theEObject;
				T result = caseHurt(hurt);
				if (result == null) result = caseNegativeSatisficing(hurt);
				if (result == null) result = caseSatisficing(hurt);
				if (result == null) result = caseContribution(hurt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.SOME_MINUS: {
				SomeMinus someMinus = (SomeMinus)theEObject;
				T result = caseSomeMinus(someMinus);
				if (result == null) result = caseNegativeSatisficing(someMinus);
				if (result == null) result = caseSatisficing(someMinus);
				if (result == null) result = caseContribution(someMinus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.GRAPHCIAL_OBJECT: {
				GraphcialObject graphcialObject = (GraphcialObject)theEObject;
				T result = caseGraphcialObject(graphcialObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseGraphcialObject(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.TASK: {
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseGraphcialObject(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NfrPackage.FLOW_SEQUENCE: {
				FlowSequence flowSequence = (FlowSequence)theEObject;
				T result = caseFlowSequence(flowSequence);
				if (result == null) result = caseGraphcialObject(flowSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFR Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFR Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFRFramework(NFRFramework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soft Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soft Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftGoal(SoftGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFR Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFR Softgoal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFRSoftgoal(NFRSoftgoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operationalizing Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operationalizing Softgoal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalizingSoftgoal(OperationalizingSoftgoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Softgoal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimSoftgoal(ClaimSoftgoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContribution(Contribution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecomposition(Decomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisficing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisficing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisficing(Satisficing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANDDecomposition(ANDDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORDecomposition(ORDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Satisficing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Satisficing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveSatisficing(PositiveSatisficing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negative Satisficing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negative Satisficing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegativeSatisficing(NegativeSatisficing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EQL Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EQL Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEQLDecomposition(EQLDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Make</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Make</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMake(Make object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Help</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Help</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelp(Help object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Some Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Some Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSomePlus(SomePlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBreak(Break object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hurt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hurt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHurt(Hurt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Some Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Some Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSomeMinus(SomeMinus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphcial Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphcial Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphcialObject(GraphcialObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowSequence(FlowSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NfrSwitch
