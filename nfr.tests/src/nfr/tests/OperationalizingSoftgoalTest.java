/**
 */
package nfr.tests;

import junit.textui.TestRunner;

import nfr.NfrFactory;
import nfr.OperationalizingSoftgoal;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operationalizing Softgoal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationalizingSoftgoalTest extends SoftGoalTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperationalizingSoftgoalTest.class);
	}

	/**
	 * Constructs a new Operationalizing Softgoal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalizingSoftgoalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operationalizing Softgoal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OperationalizingSoftgoal getFixture() {
		return (OperationalizingSoftgoal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfrFactory.eINSTANCE.createOperationalizingSoftgoal());
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

} //OperationalizingSoftgoalTest
