/**
 */
package nfr.impl;

import java.util.Collection;
import nfr.Contribution;
import nfr.GraphcialObject;
import nfr.NfrPackage;
import nfr.SoftGoal;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soft Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nfr.impl.SoftGoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link nfr.impl.SoftGoalImpl#getGoalType <em>Goal Type</em>}</li>
 *   <li>{@link nfr.impl.SoftGoalImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link nfr.impl.SoftGoalImpl#getChild <em>Child</em>}</li>
 *   <li>{@link nfr.impl.SoftGoalImpl#getContribTypeToParent <em>Contrib Type To Parent</em>}</li>
 *   <li>{@link nfr.impl.SoftGoalImpl#getGoalTopic <em>Goal Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SoftGoalImpl extends MinimalEObjectImpl.Container implements SoftGoal {
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
	 * The default value of the '{@link #getGoalType() <em>Goal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalType()
	 * @generated
	 * @ordered
	 */
	protected static final String GOAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGoalType() <em>Goal Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalType()
	 * @generated
	 * @ordered
	 */
	protected String goalType = GOAL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftGoal> parents;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftGoal> child;

	/**
	 * The cached value of the '{@link #getContribTypeToParent() <em>Contrib Type To Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribTypeToParent()
	 * @generated
	 * @ordered
	 */
	protected Contribution contribTypeToParent;

	/**
	 * The cached value of the '{@link #getGoalTopic() <em>Goal Topic</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoalTopic()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphcialObject> goalTopic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfrPackage.Literals.SOFT_GOAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NfrPackage.SOFT_GOAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGoalType() {
		return goalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoalType(String newGoalType) {
		String oldGoalType = goalType;
		goalType = newGoalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfrPackage.SOFT_GOAL__GOAL_TYPE, oldGoalType, goalType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphcialObject> getGoalTopic() {
		if (goalTopic == null) {
			goalTopic = new EObjectWithInverseResolvingEList.ManyInverse<GraphcialObject>(GraphcialObject.class, this, NfrPackage.SOFT_GOAL__GOAL_TOPIC, NfrPackage.GRAPHCIAL_OBJECT__SOFTGOAL);
		}
		return goalTopic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftGoal> getParents() {
		if (parents == null) {
			parents = new EObjectWithInverseResolvingEList.ManyInverse<SoftGoal>(SoftGoal.class, this, NfrPackage.SOFT_GOAL__PARENTS, NfrPackage.SOFT_GOAL__CHILD);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftGoal> getChild() {
		if (child == null) {
			child = new EObjectWithInverseResolvingEList.ManyInverse<SoftGoal>(SoftGoal.class, this, NfrPackage.SOFT_GOAL__CHILD, NfrPackage.SOFT_GOAL__PARENTS);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contribution getContribTypeToParent() {
		return contribTypeToParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContribTypeToParent(Contribution newContribTypeToParent, NotificationChain msgs) {
		Contribution oldContribTypeToParent = contribTypeToParent;
		contribTypeToParent = newContribTypeToParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NfrPackage.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT, oldContribTypeToParent, newContribTypeToParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContribTypeToParent(Contribution newContribTypeToParent) {
		if (newContribTypeToParent != contribTypeToParent) {
			NotificationChain msgs = null;
			if (contribTypeToParent != null)
				msgs = ((InternalEObject)contribTypeToParent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NfrPackage.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT, null, msgs);
			if (newContribTypeToParent != null)
				msgs = ((InternalEObject)newContribTypeToParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NfrPackage.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT, null, msgs);
			msgs = basicSetContribTypeToParent(newContribTypeToParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfrPackage.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT, newContribTypeToParent, newContribTypeToParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NfrPackage.SOFT_GOAL__PARENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParents()).basicAdd(otherEnd, msgs);
			case NfrPackage.SOFT_GOAL__CHILD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChild()).basicAdd(otherEnd, msgs);
			case NfrPackage.SOFT_GOAL__GOAL_TOPIC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGoalTopic()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NfrPackage.SOFT_GOAL__PARENTS:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
			case NfrPackage.SOFT_GOAL__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
			case NfrPackage.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT:
				return basicSetContribTypeToParent(null, msgs);
			case NfrPackage.SOFT_GOAL__GOAL_TOPIC:
				return ((InternalEList<?>)getGoalTopic()).basicRemove(otherEnd, msgs);
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
			case NfrPackage.SOFT_GOAL__NAME:
				return getName();
			case NfrPackage.SOFT_GOAL__GOAL_TYPE:
				return getGoalType();
			case NfrPackage.SOFT_GOAL__PARENTS:
				return getParents();
			case NfrPackage.SOFT_GOAL__CHILD:
				return getChild();
			case NfrPackage.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT:
				return getContribTypeToParent();
			case NfrPackage.SOFT_GOAL__GOAL_TOPIC:
				return getGoalTopic();
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
			case NfrPackage.SOFT_GOAL__NAME:
				setName((String)newValue);
				return;
			case NfrPackage.SOFT_GOAL__GOAL_TYPE:
				setGoalType((String)newValue);
				return;
			case NfrPackage.SOFT_GOAL__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends SoftGoal>)newValue);
				return;
			case NfrPackage.SOFT_GOAL__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends SoftGoal>)newValue);
				return;
			case NfrPackage.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT:
				setContribTypeToParent((Contribution)newValue);
				return;
			case NfrPackage.SOFT_GOAL__GOAL_TOPIC:
				getGoalTopic().clear();
				getGoalTopic().addAll((Collection<? extends GraphcialObject>)newValue);
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
			case NfrPackage.SOFT_GOAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NfrPackage.SOFT_GOAL__GOAL_TYPE:
				setGoalType(GOAL_TYPE_EDEFAULT);
				return;
			case NfrPackage.SOFT_GOAL__PARENTS:
				getParents().clear();
				return;
			case NfrPackage.SOFT_GOAL__CHILD:
				getChild().clear();
				return;
			case NfrPackage.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT:
				setContribTypeToParent((Contribution)null);
				return;
			case NfrPackage.SOFT_GOAL__GOAL_TOPIC:
				getGoalTopic().clear();
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
			case NfrPackage.SOFT_GOAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NfrPackage.SOFT_GOAL__GOAL_TYPE:
				return GOAL_TYPE_EDEFAULT == null ? goalType != null : !GOAL_TYPE_EDEFAULT.equals(goalType);
			case NfrPackage.SOFT_GOAL__PARENTS:
				return parents != null && !parents.isEmpty();
			case NfrPackage.SOFT_GOAL__CHILD:
				return child != null && !child.isEmpty();
			case NfrPackage.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT:
				return contribTypeToParent != null;
			case NfrPackage.SOFT_GOAL__GOAL_TOPIC:
				return goalTopic != null && !goalTopic.isEmpty();
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
		result.append(", goalType: ");
		result.append(goalType);
		result.append(')');
		return result.toString();
	}

} //SoftGoalImpl
