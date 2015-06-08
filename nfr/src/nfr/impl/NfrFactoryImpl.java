/**
 */
package nfr.impl;

import nfr.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NfrFactoryImpl extends EFactoryImpl implements NfrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NfrFactory init() {
		try {
			NfrFactory theNfrFactory = (NfrFactory)EPackage.Registry.INSTANCE.getEFactory(NfrPackage.eNS_URI);
			if (theNfrFactory != null) {
				return theNfrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NfrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfrFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NfrPackage.NFR_FRAMEWORK: return createNFRFramework();
			case NfrPackage.NFR_SOFTGOAL: return createNFRSoftgoal();
			case NfrPackage.OPERATIONALIZING_SOFTGOAL: return createOperationalizingSoftgoal();
			case NfrPackage.CLAIM_SOFTGOAL: return createClaimSoftgoal();
			case NfrPackage.AND_DECOMPOSITION: return createANDDecomposition();
			case NfrPackage.OR_DECOMPOSITION: return createORDecomposition();
			case NfrPackage.EQL_DECOMPOSITION: return createEQLDecomposition();
			case NfrPackage.MAKE: return createMake();
			case NfrPackage.HELP: return createHelp();
			case NfrPackage.SOME_PLUS: return createSomePlus();
			case NfrPackage.BREAK: return createBreak();
			case NfrPackage.HURT: return createHurt();
			case NfrPackage.SOME_MINUS: return createSomeMinus();
			case NfrPackage.EVENT: return createEvent();
			case NfrPackage.TASK: return createTask();
			case NfrPackage.FLOW_SEQUENCE: return createFlowSequence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case NfrPackage.SATISFICING_LABEL_TYPE:
				return createSatisficingLabelTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case NfrPackage.SATISFICING_LABEL_TYPE:
				return convertSatisficingLabelTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFRFramework createNFRFramework() {
		NFRFrameworkImpl nfrFramework = new NFRFrameworkImpl();
		return nfrFramework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NFRSoftgoal createNFRSoftgoal() {
		NFRSoftgoalImpl nfrSoftgoal = new NFRSoftgoalImpl();
		return nfrSoftgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalizingSoftgoal createOperationalizingSoftgoal() {
		OperationalizingSoftgoalImpl operationalizingSoftgoal = new OperationalizingSoftgoalImpl();
		return operationalizingSoftgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSoftgoal createClaimSoftgoal() {
		ClaimSoftgoalImpl claimSoftgoal = new ClaimSoftgoalImpl();
		return claimSoftgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANDDecomposition createANDDecomposition() {
		ANDDecompositionImpl andDecomposition = new ANDDecompositionImpl();
		return andDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORDecomposition createORDecomposition() {
		ORDecompositionImpl orDecomposition = new ORDecompositionImpl();
		return orDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQLDecomposition createEQLDecomposition() {
		EQLDecompositionImpl eqlDecomposition = new EQLDecompositionImpl();
		return eqlDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Make createMake() {
		MakeImpl make = new MakeImpl();
		return make;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Help createHelp() {
		HelpImpl help = new HelpImpl();
		return help;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomePlus createSomePlus() {
		SomePlusImpl somePlus = new SomePlusImpl();
		return somePlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Break createBreak() {
		BreakImpl break_ = new BreakImpl();
		return break_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hurt createHurt() {
		HurtImpl hurt = new HurtImpl();
		return hurt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SomeMinus createSomeMinus() {
		SomeMinusImpl someMinus = new SomeMinusImpl();
		return someMinus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowSequence createFlowSequence() {
		FlowSequenceImpl flowSequence = new FlowSequenceImpl();
		return flowSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatisficingLabelType createSatisficingLabelTypeFromString(EDataType eDataType, String initialValue) {
		SatisficingLabelType result = SatisficingLabelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSatisficingLabelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NfrPackage getNfrPackage() {
		return (NfrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NfrPackage getPackage() {
		return NfrPackage.eINSTANCE;
	}

} //NfrFactoryImpl
