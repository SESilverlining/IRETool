/**
 */
package nfr.tests;

import junit.textui.TestRunner;

import nfr.NfrFactory;
import nfr.SomeMinus;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Some Minus</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SomeMinusTest extends NegativeSatisficingTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SomeMinusTest.class);
	}

	/**
	 * Constructs a new Some Minus test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomeMinusTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Some Minus test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SomeMinus getFixture() {
		return (SomeMinus)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfrFactory.eINSTANCE.createSomeMinus());
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

} //SomeMinusTest
