/**
 */
package nfr.impl;

import java.util.Collection;

import nfr.GraphcialObject;
import nfr.NFRFramework;
import nfr.NfrPackage;
import nfr.SoftGoal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NFR Framework</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nfr.impl.NFRFrameworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link nfr.impl.NFRFrameworkImpl#getSoftgoalMemebers <em>Softgoal Memebers</em>}</li>
 *   <li>{@link nfr.impl.NFRFrameworkImpl#getBpmnMembers <em>Bpmn Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NFRFrameworkImpl extends MinimalEObjectImpl.Container implements NFRFramework {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoftgoalMemebers() <em>Softgoal Memebers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftgoalMemebers()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftGoal> softgoalMemebers;

	/**
	 * The cached value of the '{@link #getBpmnMembers() <em>Bpmn Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBpmnMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphcialObject> bpmnMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NFRFrameworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfrPackage.Literals.NFR_FRAMEWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfrPackage.NFR_FRAMEWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftGoal> getSoftgoalMemebers() {
		if (softgoalMemebers == null) {
			softgoalMemebers = new EObjectContainmentEList<SoftGoal>(SoftGoal.class, this, NfrPackage.NFR_FRAMEWORK__SOFTGOAL_MEMEBERS);
		}
		return softgoalMemebers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphcialObject> getBpmnMembers() {
		if (bpmnMembers == null) {
			bpmnMembers = new EObjectContainmentEList<GraphcialObject>(GraphcialObject.class, this, NfrPackage.NFR_FRAMEWORK__BPMN_MEMBERS);
		}
		return bpmnMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NfrPackage.NFR_FRAMEWORK__SOFTGOAL_MEMEBERS:
				return ((InternalEList<?>)getSoftgoalMemebers()).basicRemove(otherEnd, msgs);
			case NfrPackage.NFR_FRAMEWORK__BPMN_MEMBERS:
				return ((InternalEList<?>)getBpmnMembers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfrPackage.NFR_FRAMEWORK__NAME:
				return getName();
			case NfrPackage.NFR_FRAMEWORK__SOFTGOAL_MEMEBERS:
				return getSoftgoalMemebers();
			case NfrPackage.NFR_FRAMEWORK__BPMN_MEMBERS:
				return getBpmnMembers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NfrPackage.NFR_FRAMEWORK__NAME:
				setName((String)newValue);
				return;
			case NfrPackage.NFR_FRAMEWORK__SOFTGOAL_MEMEBERS:
				getSoftgoalMemebers().clear();
				getSoftgoalMemebers().addAll((Collection<? extends SoftGoal>)newValue);
				return;
			case NfrPackage.NFR_FRAMEWORK__BPMN_MEMBERS:
				getBpmnMembers().clear();
				getBpmnMembers().addAll((Collection<? extends GraphcialObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NfrPackage.NFR_FRAMEWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NfrPackage.NFR_FRAMEWORK__SOFTGOAL_MEMEBERS:
				getSoftgoalMemebers().clear();
				return;
			case NfrPackage.NFR_FRAMEWORK__BPMN_MEMBERS:
				getBpmnMembers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NfrPackage.NFR_FRAMEWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NfrPackage.NFR_FRAMEWORK__SOFTGOAL_MEMEBERS:
				return softgoalMemebers != null && !softgoalMemebers.isEmpty();
			case NfrPackage.NFR_FRAMEWORK__BPMN_MEMBERS:
				return bpmnMembers != null && !bpmnMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NFRFrameworkImpl
