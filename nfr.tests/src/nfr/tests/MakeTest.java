/**
 */
package nfr.tests;

import junit.textui.TestRunner;

import nfr.Make;
import nfr.NfrFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Make</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MakeTest extends PositiveSatisficingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MakeTest.class);
	}

	/**
	 * Constructs a new Make test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MakeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Make test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Make getFixture() {
		return (Make)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfrFactory.eINSTANCE.createMake());
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

} //MakeTest
