/**
 */
package com.home.ludo.ngcs.ngcsmodel.impl;

import com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty;
import com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ngcs Single Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsSinglePropertyImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsSinglePropertyImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsSinglePropertyImpl#isCrypted <em>Crypted</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsSinglePropertyImpl#isDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NgcsSinglePropertyImpl extends NgcsPropertyImpl implements NgcsSingleProperty {
	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #isCrypted() <em>Crypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrypted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CRYPTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCrypted() <em>Crypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCrypted()
	 * @generated
	 * @ordered
	 */
	protected boolean crypted = CRYPTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NgcsSinglePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NgcsmodelPackage.Literals.NGCS_SINGLE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NgcsmodelPackage.NGCS_SINGLE_PROPERTY__EDITABLE,
					oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NgcsmodelPackage.NGCS_SINGLE_PROPERTY__REQUIRED,
					oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCrypted() {
		return crypted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrypted(boolean newCrypted) {
		boolean oldCrypted = crypted;
		crypted = newCrypted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NgcsmodelPackage.NGCS_SINGLE_PROPERTY__CRYPTED,
					oldCrypted, crypted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NgcsmodelPackage.NGCS_SINGLE_PROPERTY__DEFAULT,
					oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__EDITABLE:
			return isEditable();
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__REQUIRED:
			return isRequired();
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__CRYPTED:
			return isCrypted();
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__DEFAULT:
			return isDefault();
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
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__EDITABLE:
			setEditable((Boolean) newValue);
			return;
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__REQUIRED:
			setRequired((Boolean) newValue);
			return;
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__CRYPTED:
			setCrypted((Boolean) newValue);
			return;
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__DEFAULT:
			setDefault((Boolean) newValue);
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
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__EDITABLE:
			setEditable(EDITABLE_EDEFAULT);
			return;
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__REQUIRED:
			setRequired(REQUIRED_EDEFAULT);
			return;
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__CRYPTED:
			setCrypted(CRYPTED_EDEFAULT);
			return;
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__DEFAULT:
			setDefault(DEFAULT_EDEFAULT);
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
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__EDITABLE:
			return editable != EDITABLE_EDEFAULT;
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__REQUIRED:
			return required != REQUIRED_EDEFAULT;
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__CRYPTED:
			return crypted != CRYPTED_EDEFAULT;
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY__DEFAULT:
			return default_ != DEFAULT_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (editable: ");
		result.append(editable);
		result.append(", required: ");
		result.append(required);
		result.append(", crypted: ");
		result.append(crypted);
		result.append(", default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //NgcsSinglePropertyImpl
