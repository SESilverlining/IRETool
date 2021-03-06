/**
 */
package nfr.tests;

import junit.textui.TestRunner;

import nfr.Help;
import nfr.NfrFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Help</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelpTest extends PositiveSatisficingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HelpTest.class);
	}

	/**
	 * Constructs a new Help test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Help test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Help getFixture() {
		return (Help)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfrFactory.eINSTANCE.createHelp());
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

} //HelpTest
