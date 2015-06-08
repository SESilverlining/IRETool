/**
 */
package nfr.util;

import nfr.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nfr.NfrPackage
 * @generated
 */
public class NfrAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NfrPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfrAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NfrPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NfrSwitch<Adapter> modelSwitch =
		new NfrSwitch<Adapter>() {
			@Override
			public Adapter caseNFRFramework(NFRFramework object) {
				return createNFRFrameworkAdapter();
			}
			@Override
			public Adapter caseSoftGoal(SoftGoal object) {
				return createSoftGoalAdapter();
			}
			@Override
			public Adapter caseNFRSoftgoal(NFRSoftgoal object) {
				return createNFRSoftgoalAdapter();
			}
			@Override
			public Adapter caseOperationalizingSoftgoal(OperationalizingSoftgoal object) {
				return createOperationalizingSoftgoalAdapter();
			}
			@Override
			public Adapter caseClaimSoftgoal(ClaimSoftgoal object) {
				return createClaimSoftgoalAdapter();
			}
			@Override
			public Adapter caseContribution(Contribution object) {
				return createContributionAdapter();
			}
			@Override
			public Adapter caseDecomposition(Decomposition object) {
				return createDecompositionAdapter();
			}
			@Override
			public Adapter caseSatisficing(Satisficing object) {
				return createSatisficingAdapter();
			}
			@Override
			public Adapter caseANDDecomposition(ANDDecomposition object) {
				return createANDDecompositionAdapter();
			}
			@Override
			public Adapter caseORDecomposition(ORDecomposition object) {
				return createORDecompositionAdapter();
			}
			@Override
			public Adapter casePositiveSatisficing(PositiveSatisficing object) {
				return createPositiveSatisficingAdapter();
			}
			@Override
			public Adapter caseNegativeSatisficing(NegativeSatisficing object) {
				return createNegativeSatisficingAdapter();
			}
			@Override
			public Adapter caseEQLDecomposition(EQLDecomposition object) {
				return createEQLDecompositionAdapter();
			}
			@Override
			public Adapter caseMake(Make object) {
				return createMakeAdapter();
			}
			@Override
			public Adapter caseHelp(Help object) {
				return createHelpAdapter();
			}
			@Override
			public Adapter caseSomePlus(SomePlus object) {
				return createSomePlusAdapter();
			}
			@Override
			public Adapter caseBreak(Break object) {
				return createBreakAdapter();
			}
			@Override
			public Adapter caseHurt(Hurt object) {
				return createHurtAdapter();
			}
			@Override
			public Adapter caseSomeMinus(SomeMinus object) {
				return createSomeMinusAdapter();
			}
			@Override
			public Adapter caseGraphcialObject(GraphcialObject object) {
				return createGraphcialObjectAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseTask(Task object) {
				return createTaskAdapter();
			}
			@Override
			public Adapter caseFlowSequence(FlowSequence object) {
				return createFlowSequenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link nfr.NFRFramework <em>NFR Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.NFRFramework
	 * @generated
	 */
	public Adapter createNFRFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.SoftGoal <em>Soft Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.SoftGoal
	 * @generated
	 */
	public Adapter createSoftGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.NFRSoftgoal <em>NFR Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.NFRSoftgoal
	 * @generated
	 */
	public Adapter createNFRSoftgoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.OperationalizingSoftgoal <em>Operationalizing Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.OperationalizingSoftgoal
	 * @generated
	 */
	public Adapter createOperationalizingSoftgoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.ClaimSoftgoal <em>Claim Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.ClaimSoftgoal
	 * @generated
	 */
	public Adapter createClaimSoftgoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.Contribution
	 * @generated
	 */
	public Adapter createContributionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.Decomposition
	 * @generated
	 */
	public Adapter createDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.Satisficing <em>Satisficing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.Satisficing
	 * @generated
	 */
	public Adapter createSatisficingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.ANDDecomposition <em>AND Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.ANDDecomposition
	 * @generated
	 */
	public Adapter createANDDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.ORDecomposition <em>OR Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.ORDecomposition
	 * @generated
	 */
	public Adapter createORDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.PositiveSatisficing <em>Positive Satisficing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.PositiveSatisficing
	 * @generated
	 */
	public Adapter createPositiveSatisficingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.NegativeSatisficing <em>Negative Satisficing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.NegativeSatisficing
	 * @generated
	 */
	public Adapter createNegativeSatisficingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.EQLDecomposition <em>EQL Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.EQLDecomposition
	 * @generated
	 */
	public Adapter createEQLDecompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.Make <em>Make</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.Make
	 * @generated
	 */
	public Adapter createMakeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.Help <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.Help
	 * @generated
	 */
	public Adapter createHelpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.SomePlus <em>Some Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.SomePlus
	 * @generated
	 */
	public Adapter createSomePlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.Break
	 * @generated
	 */
	public Adapter createBreakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.Hurt <em>Hurt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.Hurt
	 * @generated
	 */
	public Adapter createHurtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.SomeMinus <em>Some Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.SomeMinus
	 * @generated
	 */
	public Adapter createSomeMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.GraphcialObject <em>Graphcial Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.GraphcialObject
	 * @generated
	 */
	public Adapter createGraphcialObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nfr.FlowSequence <em>Flow Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nfr.FlowSequence
	 * @generated
	 */
	public Adapter createFlowSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NfrAdapterFactory
