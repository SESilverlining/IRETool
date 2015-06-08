/**
 */
package nfr.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import nfr.NFRFramework;
import nfr.NfrFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>NFR Framework</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NFRFrameworkTest extends TestCase {

	/**
	 * The fixture for this NFR Framework test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFRFramework fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NFRFrameworkTest.class);
	}

	/**
	 * Constructs a new NFR Framework test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFRFrameworkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this NFR Framework test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NFRFramework fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this NFR Framework test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFRFramework getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(NfrFactory.eINSTANCE.createNFRFramework());
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

} //NFRFrameworkTest
