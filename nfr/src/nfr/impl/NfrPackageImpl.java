/**
 */
package nfr.impl;

import nfr.ANDDecomposition;
import nfr.Break;
import nfr.ClaimSoftgoal;
import nfr.Contribution;
import nfr.Decomposition;
import nfr.EQLDecomposition;
import nfr.Event;
import nfr.FlowSequence;
import nfr.GraphcialObject;
import nfr.Help;
import nfr.Hurt;
import nfr.Make;
import nfr.NFRFramework;
import nfr.NFRSoftgoal;
import nfr.NegativeSatisficing;
import nfr.NfrFactory;
import nfr.NfrPackage;
import nfr.ORDecomposition;
import nfr.OperationalizingSoftgoal;
import nfr.PositiveSatisficing;
import nfr.Satisficing;
import nfr.SatisficingLabelType;
import nfr.SoftGoal;
import nfr.SomeMinus;
import nfr.SomePlus;

import nfr.Task;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NfrPackageImpl extends EPackageImpl implements NfrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfrFrameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nfrSoftgoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalizingSoftgoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimSoftgoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisficingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveSatisficingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeSatisficingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eqlDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass makeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass somePlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass breakEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hurtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass someMinusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphcialObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum satisficingLabelTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see nfr.NfrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NfrPackageImpl() {
		super(eNS_URI, NfrFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NfrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NfrPackage init() {
		if (isInited) return (NfrPackage)EPackage.Registry.INSTANCE.getEPackage(NfrPackage.eNS_URI);

		// Obtain or create and register package
		NfrPackageImpl theNfrPackage = (NfrPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NfrPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NfrPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNfrPackage.createPackageContents();

		// Initialize created meta-data
		theNfrPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNfrPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NfrPackage.eNS_URI, theNfrPackage);
		return theNfrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFRFramework() {
		return nfrFrameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNFRFramework_Name() {
		return (EAttribute)nfrFrameworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFRFramework_SoftgoalMemebers() {
		return (EReference)nfrFrameworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNFRFramework_BpmnMembers() {
		return (EReference)nfrFrameworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftGoal() {
		return softGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftGoal_Name() {
		return (EAttribute)softGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftGoal_GoalType() {
		return (EAttribute)softGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftGoal_GoalTopic() {
		return (EReference)softGoalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftGoal_Parents() {
		return (EReference)softGoalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftGoal_Child() {
		return (EReference)softGoalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftGoal_ContribTypeToParent() {
		return (EReference)softGoalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNFRSoftgoal() {
		return nfrSoftgoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationalizingSoftgoal() {
		return operationalizingSoftgoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimSoftgoal() {
		return claimSoftgoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContribution() {
		return contributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_Name() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContribution_TargetSoftgoal() {
		return (EReference)contributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecomposition() {
		return decompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatisficing() {
		return satisficingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANDDecomposition() {
		return andDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORDecomposition() {
		return orDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveSatisficing() {
		return positiveSatisficingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeSatisficing() {
		return negativeSatisficingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEQLDecomposition() {
		return eqlDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMake() {
		return makeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelp() {
		return helpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSomePlus() {
		return somePlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBreak() {
		return breakEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHurt() {
		return hurtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSomeMinus() {
		return someMinusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphcialObject() {
		return graphcialObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphcialObject_Name() {
		return (EAttribute)graphcialObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphcialObject_Softgoal() {
		return (EReference)graphcialObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_SourceRef() {
		return (EReference)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_TargetRef() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_SequenceToTarget() {
		return (EReference)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowSequence() {
		return flowSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowSequence_SourceTask() {
		return (EReference)flowSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSatisficingLabelType() {
		return satisficingLabelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfrFactory getNfrFactory() {
		return (NfrFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		nfrFrameworkEClass = createEClass(NFR_FRAMEWORK);
		createEAttribute(nfrFrameworkEClass, NFR_FRAMEWORK__NAME);
		createEReference(nfrFrameworkEClass, NFR_FRAMEWORK__SOFTGOAL_MEMEBERS);
		createEReference(nfrFrameworkEClass, NFR_FRAMEWORK__BPMN_MEMBERS);

		softGoalEClass = createEClass(SOFT_GOAL);
		createEAttribute(softGoalEClass, SOFT_GOAL__NAME);
		createEAttribute(softGoalEClass, SOFT_GOAL__GOAL_TYPE);
		createEReference(softGoalEClass, SOFT_GOAL__PARENTS);
		createEReference(softGoalEClass, SOFT_GOAL__CHILD);
		createEReference(softGoalEClass, SOFT_GOAL__CONTRIB_TYPE_TO_PARENT);
		createEReference(softGoalEClass, SOFT_GOAL__GOAL_TOPIC);

		nfrSoftgoalEClass = createEClass(NFR_SOFTGOAL);

		operationalizingSoftgoalEClass = createEClass(OPERATIONALIZING_SOFTGOAL);

		claimSoftgoalEClass = createEClass(CLAIM_SOFTGOAL);

		contributionEClass = createEClass(CONTRIBUTION);
		createEAttribute(contributionEClass, CONTRIBUTION__NAME);
		createEReference(contributionEClass, CONTRIBUTION__TARGET_SOFTGOAL);

		decompositionEClass = createEClass(DECOMPOSITION);

		satisficingEClass = createEClass(SATISFICING);

		andDecompositionEClass = createEClass(AND_DECOMPOSITION);

		orDecompositionEClass = createEClass(OR_DECOMPOSITION);

		positiveSatisficingEClass = createEClass(POSITIVE_SATISFICING);

		negativeSatisficingEClass = createEClass(NEGATIVE_SATISFICING);

		eqlDecompositionEClass = createEClass(EQL_DECOMPOSITION);

		makeEClass = createEClass(MAKE);

		helpEClass = createEClass(HELP);

		somePlusEClass = createEClass(SOME_PLUS);

		breakEClass = createEClass(BREAK);

		hurtEClass = createEClass(HURT);

		someMinusEClass = createEClass(SOME_MINUS);

		graphcialObjectEClass = createEClass(GRAPHCIAL_OBJECT);
		createEAttribute(graphcialObjectEClass, GRAPHCIAL_OBJECT__NAME);
		createEReference(graphcialObjectEClass, GRAPHCIAL_OBJECT__SOFTGOAL);

		eventEClass = createEClass(EVENT);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__SOURCE_REF);
		createEReference(taskEClass, TASK__TARGET_REF);
		createEReference(taskEClass, TASK__SEQUENCE_TO_TARGET);

		flowSequenceEClass = createEClass(FLOW_SEQUENCE);
		createEReference(flowSequenceEClass, FLOW_SEQUENCE__SOURCE_TASK);

		// Create enums
		satisficingLabelTypeEEnum = createEEnum(SATISFICING_LABEL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nfrSoftgoalEClass.getESuperTypes().add(this.getSoftGoal());
		operationalizingSoftgoalEClass.getESuperTypes().add(this.getSoftGoal());
		claimSoftgoalEClass.getESuperTypes().add(this.getSoftGoal());
		decompositionEClass.getESuperTypes().add(this.getContribution());
		satisficingEClass.getESuperTypes().add(this.getContribution());
		andDecompositionEClass.getESuperTypes().add(this.getDecomposition());
		orDecompositionEClass.getESuperTypes().add(this.getDecomposition());
		positiveSatisficingEClass.getESuperTypes().add(this.getSatisficing());
		negativeSatisficingEClass.getESuperTypes().add(this.getSatisficing());
		eqlDecompositionEClass.getESuperTypes().add(this.getDecomposition());
		makeEClass.getESuperTypes().add(this.getPositiveSatisficing());
		helpEClass.getESuperTypes().add(this.getPositiveSatisficing());
		somePlusEClass.getESuperTypes().add(this.getPositiveSatisficing());
		breakEClass.getESuperTypes().add(this.getNegativeSatisficing());
		hurtEClass.getESuperTypes().add(this.getNegativeSatisficing());
		someMinusEClass.getESuperTypes().add(this.getNegativeSatisficing());
		eventEClass.getESuperTypes().add(this.getGraphcialObject());
		taskEClass.getESuperTypes().add(this.getGraphcialObject());
		flowSequenceEClass.getESuperTypes().add(this.getGraphcialObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(nfrFrameworkEClass, NFRFramework.class, "NFRFramework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNFRFramework_Name(), ecorePackage.getEString(), "name", null, 0, 1, NFRFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNFRFramework_SoftgoalMemebers(), this.getSoftGoal(), null, "softgoalMemebers", null, 0, -1, NFRFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNFRFramework_BpmnMembers(), this.getGraphcialObject(), null, "bpmnMembers", null, 0, -1, NFRFramework.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softGoalEClass, SoftGoal.class, "SoftGoal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftGoal_Name(), ecorePackage.getEString(), "name", null, 0, 1, SoftGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftGoal_GoalType(), ecorePackage.getEString(), "goalType", null, 0, 1, SoftGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftGoal_Parents(), this.getSoftGoal(), this.getSoftGoal_Child(), "parents", null, 0, -1, SoftGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftGoal_Child(), this.getSoftGoal(), this.getSoftGoal_Parents(), "child", null, 0, -1, SoftGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftGoal_ContribTypeToParent(), this.getContribution(), null, "contribTypeToParent", null, 0, 1, SoftGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftGoal_GoalTopic(), this.getGraphcialObject(), this.getGraphcialObject_Softgoal(), "goalTopic", null, 0, -1, SoftGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nfrSoftgoalEClass, NFRSoftgoal.class, "NFRSoftgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationalizingSoftgoalEClass, OperationalizingSoftgoal.class, "OperationalizingSoftgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(claimSoftgoalEClass, ClaimSoftgoal.class, "ClaimSoftgoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contributionEClass, Contribution.class, "Contribution", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContribution_Name(), ecorePackage.getEString(), "name", null, 0, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContribution_TargetSoftgoal(), this.getSoftGoal(), null, "targetSoftgoal", null, 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decompositionEClass, Decomposition.class, "Decomposition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(satisficingEClass, Satisficing.class, "Satisficing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andDecompositionEClass, ANDDecomposition.class, "ANDDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orDecompositionEClass, ORDecomposition.class, "ORDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveSatisficingEClass, PositiveSatisficing.class, "PositiveSatisficing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeSatisficingEClass, NegativeSatisficing.class, "NegativeSatisficing", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eqlDecompositionEClass, EQLDecomposition.class, "EQLDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(makeEClass, Make.class, "Make", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(helpEClass, Help.class, "Help", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(somePlusEClass, SomePlus.class, "SomePlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(breakEClass, Break.class, "Break", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hurtEClass, Hurt.class, "Hurt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(someMinusEClass, SomeMinus.class, "SomeMinus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(graphcialObjectEClass, GraphcialObject.class, "GraphcialObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphcialObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, GraphcialObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphcialObject_Softgoal(), this.getSoftGoal(), this.getSoftGoal_GoalTopic(), "softgoal", null, 0, -1, GraphcialObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_SourceRef(), this.getTask(), this.getTask_TargetRef(), "sourceRef", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_TargetRef(), this.getTask(), this.getTask_SourceRef(), "targetRef", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_SequenceToTarget(), this.getFlowSequence(), null, "sequenceToTarget", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowSequenceEClass, FlowSequence.class, "FlowSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowSequence_SourceTask(), this.getTask(), null, "sourceTask", null, 1, 1, FlowSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(satisficingLabelTypeEEnum, SatisficingLabelType.class, "SatisficingLabelType");
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.UNDECIDED);
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.SATISFICED);
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.WEAKLY_SATISFICED);
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.WEAKLY_DENIED);
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.DENIED);
		addEEnumLiteral(satisficingLabelTypeEEnum, SatisficingLabelType.CONFLICT);

		// Create resource
		createResource(eNS_URI);
	}

} //NfrPackageImpl
