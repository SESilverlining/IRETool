/**
 */
package nfr.impl;

import nfr.FlowSequence;
import nfr.NfrPackage;
import nfr.Task;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link nfr.impl.FlowSequenceImpl#getSourceTask <em>Source Task</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowSequenceImpl extends GraphcialObjectImpl implements FlowSequence {
	/**
	 * The cached value of the '{@link #getSourceTask() <em>Source Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTask()
	 * @generated
	 * @ordered
	 */
	protected Task sourceTask;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NfrPackage.Literals.FLOW_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getSourceTask() {
		if (sourceTask != null && sourceTask.eIsProxy()) {
			InternalEObject oldSourceTask = (InternalEObject)sourceTask;
			sourceTask = (Task)eResolveProxy(oldSourceTask);
			if (sourceTask != oldSourceTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NfrPackage.FLOW_SEQUENCE__SOURCE_TASK, oldSourceTask, sourceTask));
			}
		}
		return sourceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetSourceTask() {
		return sourceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTask(Task newSourceTask) {
		Task oldSourceTask = sourceTask;
		sourceTask = newSourceTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NfrPackage.FLOW_SEQUENCE__SOURCE_TASK, oldSourceTask, sourceTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NfrPackage.FLOW_SEQUENCE__SOURCE_TASK:
				if (resolve) return getSourceTask();
				return basicGetSourceTask();
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
			case NfrPackage.FLOW_SEQUENCE__SOURCE_TASK:
				setSourceTask((Task)newValue);
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
			case NfrPackage.FLOW_SEQUENCE__SOURCE_TASK:
				setSourceTask((Task)null);
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
			case NfrPackage.FLOW_SEQUENCE__SOURCE_TASK:
				return sourceTask != null;
		}
		return super.eIsSet(featureID);
	}

} //FlowSequenceImpl
