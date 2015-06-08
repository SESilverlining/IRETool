/**
 */
package nfr;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nfr.NfrFactory
 * @model kind="package"
 * @generated
 */
public interface NfrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nfr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/nfr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nfr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NfrPackage eINSTANCE = nfr.impl.NfrPackageImpl.init();

	/**
	 * The meta object id for the '{@link nfr.impl.NFRFrameworkImpl <em>NFR Framework</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.NFRFrameworkImpl
	 * @see nfr.impl.NfrPackageImpl#getNFRFramework()
	 * @generated
	 */
	int NFR_FRAMEWORK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_FRAMEWORK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Softgoal Memebers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_FRAMEWORK__SOFTGOAL_MEMEBERS = 1;

	/**
	 * The feature id for the '<em><b>Bpmn Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_FRAMEWORK__BPMN_MEMBERS = 2;

	/**
	 * The number of structural features of the '<em>NFR Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_FRAMEWORK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>NFR Framework</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_FRAMEWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nfr.impl.SoftGoalImpl <em>Soft Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.SoftGoalImpl
	 * @see nfr.impl.NfrPackageImpl#getSoftGoal()
	 * @generated
	 */
	int SOFT_GOAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GOAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Goal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GOAL__GOAL_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GOAL__PARENTS = 2;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GOAL__CHILD = 3;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GOAL__CONTRIB_TYPE_TO_PARENT = 4;

	/**
	 * The feature id for the '<em><b>Goal Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GOAL__GOAL_TOPIC = 5;

	/**
	 * The number of structural features of the '<em>Soft Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GOAL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Soft Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nfr.impl.NFRSoftgoalImpl <em>NFR Softgoal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.NFRSoftgoalImpl
	 * @see nfr.impl.NfrPackageImpl#getNFRSoftgoal()
	 * @generated
	 */
	int NFR_SOFTGOAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTGOAL__NAME = SOFT_GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Goal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTGOAL__GOAL_TYPE = SOFT_GOAL__GOAL_TYPE;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTGOAL__PARENTS = SOFT_GOAL__PARENTS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTGOAL__CHILD = SOFT_GOAL__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTGOAL__CONTRIB_TYPE_TO_PARENT = SOFT_GOAL__CONTRIB_TYPE_TO_PARENT;

	/**
	 * The feature id for the '<em><b>Goal Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTGOAL__GOAL_TOPIC = SOFT_GOAL__GOAL_TOPIC;

	/**
	 * The number of structural features of the '<em>NFR Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTGOAL_FEATURE_COUNT = SOFT_GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>NFR Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFR_SOFTGOAL_OPERATION_COUNT = SOFT_GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.OperationalizingSoftgoalImpl <em>Operationalizing Softgoal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.OperationalizingSoftgoalImpl
	 * @see nfr.impl.NfrPackageImpl#getOperationalizingSoftgoal()
	 * @generated
	 */
	int OPERATIONALIZING_SOFTGOAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTGOAL__NAME = SOFT_GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Goal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTGOAL__GOAL_TYPE = SOFT_GOAL__GOAL_TYPE;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTGOAL__PARENTS = SOFT_GOAL__PARENTS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTGOAL__CHILD = SOFT_GOAL__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTGOAL__CONTRIB_TYPE_TO_PARENT = SOFT_GOAL__CONTRIB_TYPE_TO_PARENT;

	/**
	 * The feature id for the '<em><b>Goal Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTGOAL__GOAL_TOPIC = SOFT_GOAL__GOAL_TOPIC;

	/**
	 * The number of structural features of the '<em>Operationalizing Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTGOAL_FEATURE_COUNT = SOFT_GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operationalizing Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONALIZING_SOFTGOAL_OPERATION_COUNT = SOFT_GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.ClaimSoftgoalImpl <em>Claim Softgoal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.ClaimSoftgoalImpl
	 * @see nfr.impl.NfrPackageImpl#getClaimSoftgoal()
	 * @generated
	 */
	int CLAIM_SOFTGOAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTGOAL__NAME = SOFT_GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Goal Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTGOAL__GOAL_TYPE = SOFT_GOAL__GOAL_TYPE;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTGOAL__PARENTS = SOFT_GOAL__PARENTS;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTGOAL__CHILD = SOFT_GOAL__CHILD;

	/**
	 * The feature id for the '<em><b>Contrib Type To Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTGOAL__CONTRIB_TYPE_TO_PARENT = SOFT_GOAL__CONTRIB_TYPE_TO_PARENT;

	/**
	 * The feature id for the '<em><b>Goal Topic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTGOAL__GOAL_TOPIC = SOFT_GOAL__GOAL_TOPIC;

	/**
	 * The number of structural features of the '<em>Claim Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTGOAL_FEATURE_COUNT = SOFT_GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Claim Softgoal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SOFTGOAL_OPERATION_COUNT = SOFT_GOAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.ContributionImpl
	 * @see nfr.impl.NfrPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TARGET_SOFTGOAL = 1;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nfr.impl.DecompositionImpl <em>Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.DecompositionImpl
	 * @see nfr.impl.NfrPackageImpl#getDecomposition()
	 * @generated
	 */
	int DECOMPOSITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__NAME = CONTRIBUTION__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION__TARGET_SOFTGOAL = CONTRIBUTION__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_FEATURE_COUNT = CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSITION_OPERATION_COUNT = CONTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.SatisficingImpl <em>Satisficing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.SatisficingImpl
	 * @see nfr.impl.NfrPackageImpl#getSatisficing()
	 * @generated
	 */
	int SATISFICING = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFICING__NAME = CONTRIBUTION__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFICING__TARGET_SOFTGOAL = CONTRIBUTION__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFICING_FEATURE_COUNT = CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFICING_OPERATION_COUNT = CONTRIBUTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.ANDDecompositionImpl <em>AND Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.ANDDecompositionImpl
	 * @see nfr.impl.NfrPackageImpl#getANDDecomposition()
	 * @generated
	 */
	int AND_DECOMPOSITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION__NAME = DECOMPOSITION__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION__TARGET_SOFTGOAL = DECOMPOSITION__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>AND Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION_FEATURE_COUNT = DECOMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>AND Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_DECOMPOSITION_OPERATION_COUNT = DECOMPOSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.ORDecompositionImpl <em>OR Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.ORDecompositionImpl
	 * @see nfr.impl.NfrPackageImpl#getORDecomposition()
	 * @generated
	 */
	int OR_DECOMPOSITION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION__NAME = DECOMPOSITION__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION__TARGET_SOFTGOAL = DECOMPOSITION__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>OR Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION_FEATURE_COUNT = DECOMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OR Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_DECOMPOSITION_OPERATION_COUNT = DECOMPOSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.PositiveSatisficingImpl <em>Positive Satisficing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.PositiveSatisficingImpl
	 * @see nfr.impl.NfrPackageImpl#getPositiveSatisficing()
	 * @generated
	 */
	int POSITIVE_SATISFICING = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_SATISFICING__NAME = SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_SATISFICING__TARGET_SOFTGOAL = SATISFICING__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>Positive Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_SATISFICING_FEATURE_COUNT = SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Positive Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_SATISFICING_OPERATION_COUNT = SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.NegativeSatisficingImpl <em>Negative Satisficing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.NegativeSatisficingImpl
	 * @see nfr.impl.NfrPackageImpl#getNegativeSatisficing()
	 * @generated
	 */
	int NEGATIVE_SATISFICING = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_SATISFICING__NAME = SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_SATISFICING__TARGET_SOFTGOAL = SATISFICING__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>Negative Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_SATISFICING_FEATURE_COUNT = SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negative Satisficing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_SATISFICING_OPERATION_COUNT = SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.EQLDecompositionImpl <em>EQL Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.EQLDecompositionImpl
	 * @see nfr.impl.NfrPackageImpl#getEQLDecomposition()
	 * @generated
	 */
	int EQL_DECOMPOSITION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQL_DECOMPOSITION__NAME = DECOMPOSITION__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQL_DECOMPOSITION__TARGET_SOFTGOAL = DECOMPOSITION__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>EQL Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQL_DECOMPOSITION_FEATURE_COUNT = DECOMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>EQL Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQL_DECOMPOSITION_OPERATION_COUNT = DECOMPOSITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.MakeImpl <em>Make</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.MakeImpl
	 * @see nfr.impl.NfrPackageImpl#getMake()
	 * @generated
	 */
	int MAKE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE__NAME = POSITIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE__TARGET_SOFTGOAL = POSITIVE_SATISFICING__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>Make</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_FEATURE_COUNT = POSITIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Make</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAKE_OPERATION_COUNT = POSITIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.HelpImpl <em>Help</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.HelpImpl
	 * @see nfr.impl.NfrPackageImpl#getHelp()
	 * @generated
	 */
	int HELP = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP__NAME = POSITIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP__TARGET_SOFTGOAL = POSITIVE_SATISFICING__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>Help</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_FEATURE_COUNT = POSITIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Help</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELP_OPERATION_COUNT = POSITIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.SomePlusImpl <em>Some Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.SomePlusImpl
	 * @see nfr.impl.NfrPackageImpl#getSomePlus()
	 * @generated
	 */
	int SOME_PLUS = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_PLUS__NAME = POSITIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_PLUS__TARGET_SOFTGOAL = POSITIVE_SATISFICING__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>Some Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_PLUS_FEATURE_COUNT = POSITIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Some Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_PLUS_OPERATION_COUNT = POSITIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.BreakImpl <em>Break</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.BreakImpl
	 * @see nfr.impl.NfrPackageImpl#getBreak()
	 * @generated
	 */
	int BREAK = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__NAME = NEGATIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK__TARGET_SOFTGOAL = NEGATIVE_SATISFICING__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_FEATURE_COUNT = NEGATIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Break</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_OPERATION_COUNT = NEGATIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.HurtImpl <em>Hurt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.HurtImpl
	 * @see nfr.impl.NfrPackageImpl#getHurt()
	 * @generated
	 */
	int HURT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT__NAME = NEGATIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT__TARGET_SOFTGOAL = NEGATIVE_SATISFICING__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>Hurt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT_FEATURE_COUNT = NEGATIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hurt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HURT_OPERATION_COUNT = NEGATIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.SomeMinusImpl <em>Some Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.SomeMinusImpl
	 * @see nfr.impl.NfrPackageImpl#getSomeMinus()
	 * @generated
	 */
	int SOME_MINUS = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_MINUS__NAME = NEGATIVE_SATISFICING__NAME;

	/**
	 * The feature id for the '<em><b>Target Softgoal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_MINUS__TARGET_SOFTGOAL = NEGATIVE_SATISFICING__TARGET_SOFTGOAL;

	/**
	 * The number of structural features of the '<em>Some Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_MINUS_FEATURE_COUNT = NEGATIVE_SATISFICING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Some Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_MINUS_OPERATION_COUNT = NEGATIVE_SATISFICING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.GraphcialObjectImpl <em>Graphcial Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.GraphcialObjectImpl
	 * @see nfr.impl.NfrPackageImpl#getGraphcialObject()
	 * @generated
	 */
	int GRAPHCIAL_OBJECT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Softgoal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT__SOFTGOAL = 1;

	/**
	 * The number of structural features of the '<em>Graphcial Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graphcial Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHCIAL_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nfr.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.EventImpl
	 * @see nfr.impl.NfrPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = GRAPHCIAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Softgoal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SOFTGOAL = GRAPHCIAL_OBJECT__SOFTGOAL;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = GRAPHCIAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = GRAPHCIAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.TaskImpl
	 * @see nfr.impl.NfrPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = GRAPHCIAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Softgoal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SOFTGOAL = GRAPHCIAL_OBJECT__SOFTGOAL;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SOURCE_REF = GRAPHCIAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TARGET_REF = GRAPHCIAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sequence To Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SEQUENCE_TO_TARGET = GRAPHCIAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = GRAPHCIAL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = GRAPHCIAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.impl.FlowSequenceImpl <em>Flow Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.impl.FlowSequenceImpl
	 * @see nfr.impl.NfrPackageImpl#getFlowSequence()
	 * @generated
	 */
	int FLOW_SEQUENCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SEQUENCE__NAME = GRAPHCIAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Softgoal</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SEQUENCE__SOFTGOAL = GRAPHCIAL_OBJECT__SOFTGOAL;

	/**
	 * The feature id for the '<em><b>Source Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SEQUENCE__SOURCE_TASK = GRAPHCIAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SEQUENCE_FEATURE_COUNT = GRAPHCIAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flow Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SEQUENCE_OPERATION_COUNT = GRAPHCIAL_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link nfr.SatisficingLabelType <em>Satisficing Label Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nfr.SatisficingLabelType
	 * @see nfr.impl.NfrPackageImpl#getSatisficingLabelType()
	 * @generated
	 */
	int SATISFICING_LABEL_TYPE = 23;


	/**
	 * Returns the meta object for class '{@link nfr.NFRFramework <em>NFR Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFR Framework</em>'.
	 * @see nfr.NFRFramework
	 * @generated
	 */
	EClass getNFRFramework();

	/**
	 * Returns the meta object for the attribute '{@link nfr.NFRFramework#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nfr.NFRFramework#getName()
	 * @see #getNFRFramework()
	 * @generated
	 */
	EAttribute getNFRFramework_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nfr.NFRFramework#getSoftgoalMemebers <em>Softgoal Memebers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Softgoal Memebers</em>'.
	 * @see nfr.NFRFramework#getSoftgoalMemebers()
	 * @see #getNFRFramework()
	 * @generated
	 */
	EReference getNFRFramework_SoftgoalMemebers();

	/**
	 * Returns the meta object for the containment reference list '{@link nfr.NFRFramework#getBpmnMembers <em>Bpmn Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bpmn Members</em>'.
	 * @see nfr.NFRFramework#getBpmnMembers()
	 * @see #getNFRFramework()
	 * @generated
	 */
	EReference getNFRFramework_BpmnMembers();

	/**
	 * Returns the meta object for class '{@link nfr.SoftGoal <em>Soft Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Goal</em>'.
	 * @see nfr.SoftGoal
	 * @generated
	 */
	EClass getSoftGoal();

	/**
	 * Returns the meta object for the attribute '{@link nfr.SoftGoal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nfr.SoftGoal#getName()
	 * @see #getSoftGoal()
	 * @generated
	 */
	EAttribute getSoftGoal_Name();

	/**
	 * Returns the meta object for the attribute '{@link nfr.SoftGoal#getGoalType <em>Goal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goal Type</em>'.
	 * @see nfr.SoftGoal#getGoalType()
	 * @see #getSoftGoal()
	 * @generated
	 */
	EAttribute getSoftGoal_GoalType();

	/**
	 * Returns the meta object for the reference list '{@link nfr.SoftGoal#getGoalTopic <em>Goal Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Goal Topic</em>'.
	 * @see nfr.SoftGoal#getGoalTopic()
	 * @see #getSoftGoal()
	 * @generated
	 */
	EReference getSoftGoal_GoalTopic();

	/**
	 * Returns the meta object for the reference list '{@link nfr.SoftGoal#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see nfr.SoftGoal#getParents()
	 * @see #getSoftGoal()
	 * @generated
	 */
	EReference getSoftGoal_Parents();

	/**
	 * Returns the meta object for the reference list '{@link nfr.SoftGoal#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see nfr.SoftGoal#getChild()
	 * @see #getSoftGoal()
	 * @generated
	 */
	EReference getSoftGoal_Child();

	/**
	 * Returns the meta object for the containment reference '{@link nfr.SoftGoal#getContribTypeToParent <em>Contrib Type To Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contrib Type To Parent</em>'.
	 * @see nfr.SoftGoal#getContribTypeToParent()
	 * @see #getSoftGoal()
	 * @generated
	 */
	EReference getSoftGoal_ContribTypeToParent();

	/**
	 * Returns the meta object for class '{@link nfr.NFRSoftgoal <em>NFR Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFR Softgoal</em>'.
	 * @see nfr.NFRSoftgoal
	 * @generated
	 */
	EClass getNFRSoftgoal();

	/**
	 * Returns the meta object for class '{@link nfr.OperationalizingSoftgoal <em>Operationalizing Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operationalizing Softgoal</em>'.
	 * @see nfr.OperationalizingSoftgoal
	 * @generated
	 */
	EClass getOperationalizingSoftgoal();

	/**
	 * Returns the meta object for class '{@link nfr.ClaimSoftgoal <em>Claim Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim Softgoal</em>'.
	 * @see nfr.ClaimSoftgoal
	 * @generated
	 */
	EClass getClaimSoftgoal();

	/**
	 * Returns the meta object for class '{@link nfr.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see nfr.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the attribute '{@link nfr.Contribution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nfr.Contribution#getName()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Name();

	/**
	 * Returns the meta object for the reference '{@link nfr.Contribution#getTargetSoftgoal <em>Target Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Softgoal</em>'.
	 * @see nfr.Contribution#getTargetSoftgoal()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_TargetSoftgoal();

	/**
	 * Returns the meta object for class '{@link nfr.Decomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposition</em>'.
	 * @see nfr.Decomposition
	 * @generated
	 */
	EClass getDecomposition();

	/**
	 * Returns the meta object for class '{@link nfr.Satisficing <em>Satisficing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisficing</em>'.
	 * @see nfr.Satisficing
	 * @generated
	 */
	EClass getSatisficing();

	/**
	 * Returns the meta object for class '{@link nfr.ANDDecomposition <em>AND Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Decomposition</em>'.
	 * @see nfr.ANDDecomposition
	 * @generated
	 */
	EClass getANDDecomposition();

	/**
	 * Returns the meta object for class '{@link nfr.ORDecomposition <em>OR Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR Decomposition</em>'.
	 * @see nfr.ORDecomposition
	 * @generated
	 */
	EClass getORDecomposition();

	/**
	 * Returns the meta object for class '{@link nfr.PositiveSatisficing <em>Positive Satisficing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Satisficing</em>'.
	 * @see nfr.PositiveSatisficing
	 * @generated
	 */
	EClass getPositiveSatisficing();

	/**
	 * Returns the meta object for class '{@link nfr.NegativeSatisficing <em>Negative Satisficing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative Satisficing</em>'.
	 * @see nfr.NegativeSatisficing
	 * @generated
	 */
	EClass getNegativeSatisficing();

	/**
	 * Returns the meta object for class '{@link nfr.EQLDecomposition <em>EQL Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EQL Decomposition</em>'.
	 * @see nfr.EQLDecomposition
	 * @generated
	 */
	EClass getEQLDecomposition();

	/**
	 * Returns the meta object for class '{@link nfr.Make <em>Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Make</em>'.
	 * @see nfr.Make
	 * @generated
	 */
	EClass getMake();

	/**
	 * Returns the meta object for class '{@link nfr.Help <em>Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Help</em>'.
	 * @see nfr.Help
	 * @generated
	 */
	EClass getHelp();

	/**
	 * Returns the meta object for class '{@link nfr.SomePlus <em>Some Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Plus</em>'.
	 * @see nfr.SomePlus
	 * @generated
	 */
	EClass getSomePlus();

	/**
	 * Returns the meta object for class '{@link nfr.Break <em>Break</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Break</em>'.
	 * @see nfr.Break
	 * @generated
	 */
	EClass getBreak();

	/**
	 * Returns the meta object for class '{@link nfr.Hurt <em>Hurt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hurt</em>'.
	 * @see nfr.Hurt
	 * @generated
	 */
	EClass getHurt();

	/**
	 * Returns the meta object for class '{@link nfr.SomeMinus <em>Some Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Minus</em>'.
	 * @see nfr.SomeMinus
	 * @generated
	 */
	EClass getSomeMinus();

	/**
	 * Returns the meta object for class '{@link nfr.GraphcialObject <em>Graphcial Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphcial Object</em>'.
	 * @see nfr.GraphcialObject
	 * @generated
	 */
	EClass getGraphcialObject();

	/**
	 * Returns the meta object for the attribute '{@link nfr.GraphcialObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nfr.GraphcialObject#getName()
	 * @see #getGraphcialObject()
	 * @generated
	 */
	EAttribute getGraphcialObject_Name();

	/**
	 * Returns the meta object for the reference list '{@link nfr.GraphcialObject#getSoftgoal <em>Softgoal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Softgoal</em>'.
	 * @see nfr.GraphcialObject#getSoftgoal()
	 * @see #getGraphcialObject()
	 * @generated
	 */
	EReference getGraphcialObject_Softgoal();

	/**
	 * Returns the meta object for class '{@link nfr.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see nfr.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link nfr.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see nfr.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference '{@link nfr.Task#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see nfr.Task#getSourceRef()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_SourceRef();

	/**
	 * Returns the meta object for the reference list '{@link nfr.Task#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Ref</em>'.
	 * @see nfr.Task#getTargetRef()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_TargetRef();

	/**
	 * Returns the meta object for the containment reference list '{@link nfr.Task#getSequenceToTarget <em>Sequence To Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequence To Target</em>'.
	 * @see nfr.Task#getSequenceToTarget()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_SequenceToTarget();

	/**
	 * Returns the meta object for class '{@link nfr.FlowSequence <em>Flow Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Sequence</em>'.
	 * @see nfr.FlowSequence
	 * @generated
	 */
	EClass getFlowSequence();

	/**
	 * Returns the meta object for the reference '{@link nfr.FlowSequence#getSourceTask <em>Source Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Task</em>'.
	 * @see nfr.FlowSequence#getSourceTask()
	 * @see #getFlowSequence()
	 * @generated
	 */
	EReference getFlowSequence_SourceTask();

	/**
	 * Returns the meta object for enum '{@link nfr.SatisficingLabelType <em>Satisficing Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Satisficing Label Type</em>'.
	 * @see nfr.SatisficingLabelType
	 * @generated
	 */
	EEnum getSatisficingLabelType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NfrFactory getNfrFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nfr.impl.NFRFrameworkImpl <em>NFR Framework</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.NFRFrameworkImpl
		 * @see nfr.impl.NfrPackageImpl#getNFRFramework()
		 * @generated
		 */
		EClass NFR_FRAMEWORK = eINSTANCE.getNFRFramework();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFR_FRAMEWORK__NAME = eINSTANCE.getNFRFramework_Name();

		/**
		 * The meta object literal for the '<em><b>Softgoal Memebers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFR_FRAMEWORK__SOFTGOAL_MEMEBERS = eINSTANCE.getNFRFramework_SoftgoalMemebers();

		/**
		 * The meta object literal for the '<em><b>Bpmn Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NFR_FRAMEWORK__BPMN_MEMBERS = eINSTANCE.getNFRFramework_BpmnMembers();

		/**
		 * The meta object literal for the '{@link nfr.impl.SoftGoalImpl <em>Soft Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.SoftGoalImpl
		 * @see nfr.impl.NfrPackageImpl#getSoftGoal()
		 * @generated
		 */
		EClass SOFT_GOAL = eINSTANCE.getSoftGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_GOAL__NAME = eINSTANCE.getSoftGoal_Name();

		/**
		 * The meta object literal for the '<em><b>Goal Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_GOAL__GOAL_TYPE = eINSTANCE.getSoftGoal_GoalType();

		/**
		 * The meta object literal for the '<em><b>Goal Topic</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GOAL__GOAL_TOPIC = eINSTANCE.getSoftGoal_GoalTopic();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GOAL__PARENTS = eINSTANCE.getSoftGoal_Parents();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GOAL__CHILD = eINSTANCE.getSoftGoal_Child();

		/**
		 * The meta object literal for the '<em><b>Contrib Type To Parent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFT_GOAL__CONTRIB_TYPE_TO_PARENT = eINSTANCE.getSoftGoal_ContribTypeToParent();

		/**
		 * The meta object literal for the '{@link nfr.impl.NFRSoftgoalImpl <em>NFR Softgoal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.NFRSoftgoalImpl
		 * @see nfr.impl.NfrPackageImpl#getNFRSoftgoal()
		 * @generated
		 */
		EClass NFR_SOFTGOAL = eINSTANCE.getNFRSoftgoal();

		/**
		 * The meta object literal for the '{@link nfr.impl.OperationalizingSoftgoalImpl <em>Operationalizing Softgoal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.OperationalizingSoftgoalImpl
		 * @see nfr.impl.NfrPackageImpl#getOperationalizingSoftgoal()
		 * @generated
		 */
		EClass OPERATIONALIZING_SOFTGOAL = eINSTANCE.getOperationalizingSoftgoal();

		/**
		 * The meta object literal for the '{@link nfr.impl.ClaimSoftgoalImpl <em>Claim Softgoal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.ClaimSoftgoalImpl
		 * @see nfr.impl.NfrPackageImpl#getClaimSoftgoal()
		 * @generated
		 */
		EClass CLAIM_SOFTGOAL = eINSTANCE.getClaimSoftgoal();

		/**
		 * The meta object literal for the '{@link nfr.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.ContributionImpl
		 * @see nfr.impl.NfrPackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__NAME = eINSTANCE.getContribution_Name();

		/**
		 * The meta object literal for the '<em><b>Target Softgoal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__TARGET_SOFTGOAL = eINSTANCE.getContribution_TargetSoftgoal();

		/**
		 * The meta object literal for the '{@link nfr.impl.DecompositionImpl <em>Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.DecompositionImpl
		 * @see nfr.impl.NfrPackageImpl#getDecomposition()
		 * @generated
		 */
		EClass DECOMPOSITION = eINSTANCE.getDecomposition();

		/**
		 * The meta object literal for the '{@link nfr.impl.SatisficingImpl <em>Satisficing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.SatisficingImpl
		 * @see nfr.impl.NfrPackageImpl#getSatisficing()
		 * @generated
		 */
		EClass SATISFICING = eINSTANCE.getSatisficing();

		/**
		 * The meta object literal for the '{@link nfr.impl.ANDDecompositionImpl <em>AND Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.ANDDecompositionImpl
		 * @see nfr.impl.NfrPackageImpl#getANDDecomposition()
		 * @generated
		 */
		EClass AND_DECOMPOSITION = eINSTANCE.getANDDecomposition();

		/**
		 * The meta object literal for the '{@link nfr.impl.ORDecompositionImpl <em>OR Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.ORDecompositionImpl
		 * @see nfr.impl.NfrPackageImpl#getORDecomposition()
		 * @generated
		 */
		EClass OR_DECOMPOSITION = eINSTANCE.getORDecomposition();

		/**
		 * The meta object literal for the '{@link nfr.impl.PositiveSatisficingImpl <em>Positive Satisficing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.PositiveSatisficingImpl
		 * @see nfr.impl.NfrPackageImpl#getPositiveSatisficing()
		 * @generated
		 */
		EClass POSITIVE_SATISFICING = eINSTANCE.getPositiveSatisficing();

		/**
		 * The meta object literal for the '{@link nfr.impl.NegativeSatisficingImpl <em>Negative Satisficing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.NegativeSatisficingImpl
		 * @see nfr.impl.NfrPackageImpl#getNegativeSatisficing()
		 * @generated
		 */
		EClass NEGATIVE_SATISFICING = eINSTANCE.getNegativeSatisficing();

		/**
		 * The meta object literal for the '{@link nfr.impl.EQLDecompositionImpl <em>EQL Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.EQLDecompositionImpl
		 * @see nfr.impl.NfrPackageImpl#getEQLDecomposition()
		 * @generated
		 */
		EClass EQL_DECOMPOSITION = eINSTANCE.getEQLDecomposition();

		/**
		 * The meta object literal for the '{@link nfr.impl.MakeImpl <em>Make</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.MakeImpl
		 * @see nfr.impl.NfrPackageImpl#getMake()
		 * @generated
		 */
		EClass MAKE = eINSTANCE.getMake();

		/**
		 * The meta object literal for the '{@link nfr.impl.HelpImpl <em>Help</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.HelpImpl
		 * @see nfr.impl.NfrPackageImpl#getHelp()
		 * @generated
		 */
		EClass HELP = eINSTANCE.getHelp();

		/**
		 * The meta object literal for the '{@link nfr.impl.SomePlusImpl <em>Some Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.SomePlusImpl
		 * @see nfr.impl.NfrPackageImpl#getSomePlus()
		 * @generated
		 */
		EClass SOME_PLUS = eINSTANCE.getSomePlus();

		/**
		 * The meta object literal for the '{@link nfr.impl.BreakImpl <em>Break</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.BreakImpl
		 * @see nfr.impl.NfrPackageImpl#getBreak()
		 * @generated
		 */
		EClass BREAK = eINSTANCE.getBreak();

		/**
		 * The meta object literal for the '{@link nfr.impl.HurtImpl <em>Hurt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.HurtImpl
		 * @see nfr.impl.NfrPackageImpl#getHurt()
		 * @generated
		 */
		EClass HURT = eINSTANCE.getHurt();

		/**
		 * The meta object literal for the '{@link nfr.impl.SomeMinusImpl <em>Some Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.SomeMinusImpl
		 * @see nfr.impl.NfrPackageImpl#getSomeMinus()
		 * @generated
		 */
		EClass SOME_MINUS = eINSTANCE.getSomeMinus();

		/**
		 * The meta object literal for the '{@link nfr.impl.GraphcialObjectImpl <em>Graphcial Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.GraphcialObjectImpl
		 * @see nfr.impl.NfrPackageImpl#getGraphcialObject()
		 * @generated
		 */
		EClass GRAPHCIAL_OBJECT = eINSTANCE.getGraphcialObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHCIAL_OBJECT__NAME = eINSTANCE.getGraphcialObject_Name();

		/**
		 * The meta object literal for the '<em><b>Softgoal</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPHCIAL_OBJECT__SOFTGOAL = eINSTANCE.getGraphcialObject_Softgoal();

		/**
		 * The meta object literal for the '{@link nfr.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.EventImpl
		 * @see nfr.impl.NfrPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link nfr.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.TaskImpl
		 * @see nfr.impl.NfrPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SOURCE_REF = eINSTANCE.getTask_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__TARGET_REF = eINSTANCE.getTask_TargetRef();

		/**
		 * The meta object literal for the '<em><b>Sequence To Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__SEQUENCE_TO_TARGET = eINSTANCE.getTask_SequenceToTarget();

		/**
		 * The meta object literal for the '{@link nfr.impl.FlowSequenceImpl <em>Flow Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.impl.FlowSequenceImpl
		 * @see nfr.impl.NfrPackageImpl#getFlowSequence()
		 * @generated
		 */
		EClass FLOW_SEQUENCE = eINSTANCE.getFlowSequence();

		/**
		 * The meta object literal for the '<em><b>Source Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SEQUENCE__SOURCE_TASK = eINSTANCE.getFlowSequence_SourceTask();

		/**
		 * The meta object literal for the '{@link nfr.SatisficingLabelType <em>Satisficing Label Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nfr.SatisficingLabelType
		 * @see nfr.impl.NfrPackageImpl#getSatisficingLabelType()
		 * @generated
		 */
		EEnum SATISFICING_LABEL_TYPE = eINSTANCE.getSatisficingLabelType();

	}

} //NfrPackage
