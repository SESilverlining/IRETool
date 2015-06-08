/**
 */
package nfr.provider;


import java.util.Collection;
import java.util.List;

import nfr.NfrFactory;
import nfr.NfrPackage;
import nfr.SoftGoal;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link nfr.SoftGoal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SoftGoalItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftGoalItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addGoalTypePropertyDescriptor(object);
			addParentsPropertyDescriptor(object);
			addChildPropertyDescriptor(object);
			addGoalTopicPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftGoal_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftGoal_name_feature", "_UI_SoftGoal_type"),
				 NfrPackage.Literals.SOFT_GOAL__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Goal Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftGoal_goalType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftGoal_goalType_feature", "_UI_SoftGoal_type"),
				 NfrPackage.Literals.SOFT_GOAL__GOAL_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Goal Topic feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGoalTopicPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftGoal_goalTopic_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftGoal_goalTopic_feature", "_UI_SoftGoal_type"),
				 NfrPackage.Literals.SOFT_GOAL__GOAL_TOPIC,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftGoal_parents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftGoal_parents_feature", "_UI_SoftGoal_type"),
				 NfrPackage.Literals.SOFT_GOAL__PARENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Child feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChildPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SoftGoal_child_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SoftGoal_child_feature", "_UI_SoftGoal_type"),
				 NfrPackage.Literals.SOFT_GOAL__CHILD,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(NfrPackage.Literals.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SoftGoal)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SoftGoal_type") :
			getString("_UI_SoftGoal_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SoftGoal.class)) {
			case NfrPackage.SOFT_GOAL__NAME:
			case NfrPackage.SOFT_GOAL__GOAL_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case NfrPackage.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(NfrPackage.Literals.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT,
				 NfrFactory.eINSTANCE.createANDDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(NfrPackage.Literals.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT,
				 NfrFactory.eINSTANCE.createORDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(NfrPackage.Literals.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT,
				 NfrFactory.eINSTANCE.createEQLDecomposition()));

		newChildDescriptors.add
			(createChildParameter
				(NfrPackage.Literals.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT,
				 NfrFactory.eINSTANCE.createMake()));

		newChildDescriptors.add
			(createChildParameter
				(NfrPackage.Literals.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT,
				 NfrFactory.eINSTANCE.createHelp()));

		newChildDescriptors.add
			(createChildParameter
				(NfrPackage.Literals.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT,
				 NfrFactory.eINSTANCE.createSomePlus()));

		newChildDescriptors.add
			(createChildParameter
				(NfrPackage.Literals.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT,
				 NfrFactory.eINSTANCE.createBreak()));

		newChildDescriptors.add
			(createChildParameter
				(NfrPackage.Literals.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT,
				 NfrFactory.eINSTANCE.createHurt()));

		newChildDescriptors.add
			(createChildParameter
				(NfrPackage.Literals.SOFT_GOAL__CONTRIB_TYPE_TO_PARENT,
				 NfrFactory.eINSTANCE.createSomeMinus()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return NfrEditPlugin.INSTANCE;
	}

}
