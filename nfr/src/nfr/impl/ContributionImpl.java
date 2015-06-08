/**
 */
package nfr.impl;

import nfr.Contribution;
import nfr.NfrPackage;
import nfr.SoftGoal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nfr.impl.ContributionImpl#getName <em>Name</em>}</li>
 *   <li>{@link nfr.impl.ContributionImpl#getTargetSoftgoal <em>Target Softgoal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ContributionImpl extends MinimalEObjectImpl.Container implements Contribution {
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
	 * The cached value of the '{@link #getTargetSoftgoal() <em>Target Softgoal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSoftgoal()
	 * @generated
	 * @ordered
	 */
	protected SoftGoal targetSoftgoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfrPackage.Literals.CONTRIBUTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NfrPackage.CONTRIBUTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftGoal getTargetSoftgoal() {
		if (targetSoftgoal != null && targetSoftgoal.eIsProxy()) {
			InternalEObject oldTargetSoftgoal = (InternalEObject)targetSoftgoal;
			targetSoftgoal = (SoftGoal)eResolveProxy(oldTargetSoftgoal);
			if (targetSoftgoal != oldTargetSoftgoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NfrPackage.CONTRIBUTION__TARGET_SOFTGOAL, oldTargetSoftgoal, targetSoftgoal));
			}
		}
		return targetSoftgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftGoal basicGetTargetSoftgoal() {
		return targetSoftgoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSoftgoal(SoftGoal newTargetSoftgoal) {
		SoftGoal oldTargetSoftgoal = targetSoftgoal;
		targetSoftgoal = newTargetSoftgoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfrPackage.CONTRIBUTION__TARGET_SOFTGOAL, oldTargetSoftgoal, targetSoftgoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfrPackage.CONTRIBUTION__NAME:
				return getName();
			case NfrPackage.CONTRIBUTION__TARGET_SOFTGOAL:
				if (resolve) return getTargetSoftgoal();
				return basicGetTargetSoftgoal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NfrPackage.CONTRIBUTION__NAME:
				setName((String)newValue);
				return;
			case NfrPackage.CONTRIBUTION__TARGET_SOFTGOAL:
				setTargetSoftgoal((SoftGoal)newValue);
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
			case NfrPackage.CONTRIBUTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NfrPackage.CONTRIBUTION__TARGET_SOFTGOAL:
				setTargetSoftgoal((SoftGoal)null);
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
			case NfrPackage.CONTRIBUTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NfrPackage.CONTRIBUTION__TARGET_SOFTGOAL:
				return targetSoftgoal != null;
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

} //ContributionImpl
