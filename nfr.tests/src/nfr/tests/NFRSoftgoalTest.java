/**
 */
package nfr.tests;

import junit.textui.TestRunner;

import nfr.NFRSoftgoal;
import nfr.NfrFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NFR Softgoal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NFRSoftgoalTest extends SoftGoalTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NFRSoftgoalTest.class);
	}

	/**
	 * Constructs a new NFR Softgoal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFRSoftgoalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this NFR Softgoal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NFRSoftgoal getFixture() {
		return (NFRSoftgoal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfrFactory.eINSTANCE.createNFRSoftgoal());
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

} //NFRSoftgoalTest
