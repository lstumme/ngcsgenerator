/**
 */
package com.home.ludo.ngcs.ngcsmodel.provider;

import com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty;
import com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NgcsSinglePropertyItemProvider extends NgcsPropertyItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NgcsSinglePropertyItemProvider(AdapterFactory adapterFactory) {
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

			addEditablePropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addCryptedPropertyDescriptor(object);
			addDefaultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Editable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_NgcsSingleProperty_editable_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_NgcsSingleProperty_editable_feature",
						"_UI_NgcsSingleProperty_type"),
				NgcsmodelPackage.Literals.NGCS_SINGLE_PROPERTY__EDITABLE, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_NgcsSingleProperty_required_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_NgcsSingleProperty_required_feature",
						"_UI_NgcsSingleProperty_type"),
				NgcsmodelPackage.Literals.NGCS_SINGLE_PROPERTY__REQUIRED, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Crypted feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCryptedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NgcsSingleProperty_crypted_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NgcsSingleProperty_crypted_feature",
								"_UI_NgcsSingleProperty_type"),
						NgcsmodelPackage.Literals.NGCS_SINGLE_PROPERTY__CRYPTED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NgcsSingleProperty_default_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NgcsSingleProperty_default_feature",
								"_UI_NgcsSingleProperty_type"),
						NgcsmodelPackage.Literals.NGCS_SINGLE_PROPERTY__DEFAULT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns NgcsSingleProperty.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NgcsSingleProperty"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NgcsSingleProperty) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_NgcsSingleProperty_type")
				: getString("_UI_NgcsSingleProperty_type") + " " + label;
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

		switch (notification.getFeatureID(NgcsSingleProperty.class)) {
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__EDITABLE:
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__REQUIRED:
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__CRYPTED:
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__DEFAULT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
