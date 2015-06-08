/**
 */
package nfr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nfr.NfrPackage
 * @generated
 */
public interface NfrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NfrFactory eINSTANCE = nfr.impl.NfrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>NFR Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFR Framework</em>'.
	 * @generated
	 */
	NFRFramework createNFRFramework();

	/**
	 * Returns a new object of class '<em>NFR Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFR Softgoal</em>'.
	 * @generated
	 */
	NFRSoftgoal createNFRSoftgoal();

	/**
	 * Returns a new object of class '<em>Operationalizing Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operationalizing Softgoal</em>'.
	 * @generated
	 */
	OperationalizingSoftgoal createOperationalizingSoftgoal();

	/**
	 * Returns a new object of class '<em>Claim Softgoal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Softgoal</em>'.
	 * @generated
	 */
	ClaimSoftgoal createClaimSoftgoal();

	/**
	 * Returns a new object of class '<em>AND Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND Decomposition</em>'.
	 * @generated
	 */
	ANDDecomposition createANDDecomposition();

	/**
	 * Returns a new object of class '<em>OR Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR Decomposition</em>'.
	 * @generated
	 */
	ORDecomposition createORDecomposition();

	/**
	 * Returns a new object of class '<em>EQL Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EQL Decomposition</em>'.
	 * @generated
	 */
	EQLDecomposition createEQLDecomposition();

	/**
	 * Returns a new object of class '<em>Make</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Make</em>'.
	 * @generated
	 */
	Make createMake();

	/**
	 * Returns a new object of class '<em>Help</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Help</em>'.
	 * @generated
	 */
	Help createHelp();

	/**
	 * Returns a new object of class '<em>Some Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Some Plus</em>'.
	 * @generated
	 */
	SomePlus createSomePlus();

	/**
	 * Returns a new object of class '<em>Break</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Break</em>'.
	 * @generated
	 */
	Break createBreak();

	/**
	 * Returns a new object of class '<em>Hurt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hurt</em>'.
	 * @generated
	 */
	Hurt createHurt();

	/**
	 * Returns a new object of class '<em>Some Minus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Some Minus</em>'.
	 * @generated
	 */
	SomeMinus createSomeMinus();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Flow Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Sequence</em>'.
	 * @generated
	 */
	FlowSequence createFlowSequence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NfrPackage getNfrPackage();

} //NfrFactory
