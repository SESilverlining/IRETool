/**
 */
package nfr.tests;

import junit.textui.TestRunner;

import nfr.ClaimSoftgoal;
import nfr.NfrFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Claim Softgoal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClaimSoftgoalTest extends SoftGoalTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClaimSoftgoalTest.class);
	}

	/**
	 * Constructs a new Claim Softgoal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSoftgoalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Claim Softgoal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ClaimSoftgoal getFixture() {
		return (ClaimSoftgoal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfrFactory.eINSTANCE.createClaimSoftgoal());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ClaimSoftgoalTest
