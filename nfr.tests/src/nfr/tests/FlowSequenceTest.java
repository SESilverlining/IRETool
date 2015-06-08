/**
 */
package nfr.tests;

import junit.textui.TestRunner;
import nfr.FlowSequence;
import nfr.NfrFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Flow Sequence</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowSequenceTest extends GraphcialObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FlowSequenceTest.class);
	}

	/**
	 * Constructs a new Flow Sequence test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSequenceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Flow Sequence test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FlowSequence getFixture() {
		return (FlowSequence)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfrFactory.eINSTANCE.createFlowSequence());
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

} //FlowSequenceTest
