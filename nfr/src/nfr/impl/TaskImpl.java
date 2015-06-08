/**
 */
package nfr.impl;

import java.util.Collection;
import nfr.FlowSequence;
import nfr.NfrPackage;
import nfr.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nfr.impl.TaskImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link nfr.impl.TaskImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link nfr.impl.TaskImpl#getSequenceToTarget <em>Sequence To Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends GraphcialObjectImpl implements Task {
	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected Task sourceRef;
	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRef()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> targetRef;
	/**
	 * The cached value of the '{@link #getSequenceToTarget() <em>Sequence To Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceToTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<FlowSequence> sequenceToTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfrPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getSourceRef() {
		if (sourceRef != null && sourceRef.eIsProxy()) {
			InternalEObject oldSourceRef = (InternalEObject)sourceRef;
			sourceRef = (Task)eResolveProxy(oldSourceRef);
			if (sourceRef != oldSourceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NfrPackage.TASK__SOURCE_REF, oldSourceRef, sourceRef));
			}
		}
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetSourceRef() {
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRef(Task newSourceRef, NotificationChain msgs) {
		Task oldSourceRef = sourceRef;
		sourceRef = newSourceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NfrPackage.TASK__SOURCE_REF, oldSourceRef, newSourceRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(Task newSourceRef) {
		if (newSourceRef != sourceRef) {
			NotificationChain msgs = null;
			if (sourceRef != null)
				msgs = ((InternalEObject)sourceRef).eInverseRemove(this, NfrPackage.TASK__TARGET_REF, Task.class, msgs);
			if (newSourceRef != null)
				msgs = ((InternalEObject)newSourceRef).eInverseAdd(this, NfrPackage.TASK__TARGET_REF, Task.class, msgs);
			msgs = basicSetSourceRef(newSourceRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfrPackage.TASK__SOURCE_REF, newSourceRef, newSourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTargetRef() {
		if (targetRef == null) {
			targetRef = new EObjectWithInverseResolvingEList<Task>(Task.class, this, NfrPackage.TASK__TARGET_REF, NfrPackage.TASK__SOURCE_REF);
		}
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowSequence> getSequenceToTarget() {
		if (sequenceToTarget == null) {
			sequenceToTarget = new EObjectContainmentEList<FlowSequence>(FlowSequence.class, this, NfrPackage.TASK__SEQUENCE_TO_TARGET);
		}
		return sequenceToTarget;
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
			case NfrPackage.TASK__SOURCE_REF:
				if (sourceRef != null)
					msgs = ((InternalEObject)sourceRef).eInverseRemove(this, NfrPackage.TASK__TARGET_REF, Task.class, msgs);
				return basicSetSourceRef((Task)otherEnd, msgs);
			case NfrPackage.TASK__TARGET_REF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetRef()).basicAdd(otherEnd, msgs);
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
			case NfrPackage.TASK__SOURCE_REF:
				return basicSetSourceRef(null, msgs);
			case NfrPackage.TASK__TARGET_REF:
				return ((InternalEList<?>)getTargetRef()).basicRemove(otherEnd, msgs);
			case NfrPackage.TASK__SEQUENCE_TO_TARGET:
				return ((InternalEList<?>)getSequenceToTarget()).basicRemove(otherEnd, msgs);
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
			case NfrPackage.TASK__SOURCE_REF:
				if (resolve) return getSourceRef();
				return basicGetSourceRef();
			case NfrPackage.TASK__TARGET_REF:
				return getTargetRef();
			case NfrPackage.TASK__SEQUENCE_TO_TARGET:
				return getSequenceToTarget();
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
			case NfrPackage.TASK__SOURCE_REF:
				setSourceRef((Task)newValue);
				return;
			case NfrPackage.TASK__TARGET_REF:
				getTargetRef().clear();
				getTargetRef().addAll((Collection<? extends Task>)newValue);
				return;
			case NfrPackage.TASK__SEQUENCE_TO_TARGET:
				getSequenceToTarget().clear();
				getSequenceToTarget().addAll((Collection<? extends FlowSequence>)newValue);
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
			case NfrPackage.TASK__SOURCE_REF:
				setSourceRef((Task)null);
				return;
			case NfrPackage.TASK__TARGET_REF:
				getTargetRef().clear();
				return;
			case NfrPackage.TASK__SEQUENCE_TO_TARGET:
				getSequenceToTarget().clear();
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
			case NfrPackage.TASK__SOURCE_REF:
				return sourceRef != null;
			case NfrPackage.TASK__TARGET_REF:
				return targetRef != null && !targetRef.isEmpty();
			case NfrPackage.TASK__SEQUENCE_TO_TARGET:
				return sequenceToTarget != null && !sequenceToTarget.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
