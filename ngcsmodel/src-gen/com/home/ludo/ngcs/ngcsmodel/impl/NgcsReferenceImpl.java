/**
 */
package com.home.ludo.ngcs.ngcsmodel.impl;

import com.home.ludo.ngcs.ngcsmodel.NgcsData;
import com.home.ludo.ngcs.ngcsmodel.NgcsReference;
import com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ngcs Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsReferenceImpl#getRefTo <em>Ref To</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsReferenceImpl#isIsKey <em>Is Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NgcsReferenceImpl extends NgcsSinglePropertyImpl implements NgcsReference {
	/**
	 * The cached value of the '{@link #getRefTo() <em>Ref To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefTo()
	 * @generated
	 * @ordered
	 */
	protected NgcsData refTo;

	/**
	 * The default value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isKey = IS_KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NgcsReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NgcsmodelPackage.Literals.NGCS_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NgcsData getRefTo() {
		if (refTo != null && refTo.eIsProxy()) {
			InternalEObject oldRefTo = (InternalEObject) refTo;
			refTo = (NgcsData) eResolveProxy(oldRefTo);
			if (refTo != oldRefTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NgcsmodelPackage.NGCS_REFERENCE__REF_TO,
							oldRefTo, refTo));
			}
		}
		return refTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NgcsData basicGetRefTo() {
		return refTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRefTo(NgcsData newRefTo) {
		NgcsData oldRefTo = refTo;
		refTo = newRefTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NgcsmodelPackage.NGCS_REFERENCE__REF_TO, oldRefTo,
					refTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsKey() {
		return isKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsKey(boolean newIsKey) {
		boolean oldIsKey = isKey;
		isKey = newIsKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NgcsmodelPackage.NGCS_REFERENCE__IS_KEY, oldIsKey,
					isKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NgcsmodelPackage.NGCS_REFERENCE__REF_TO:
			if (resolve)
				return getRefTo();
			return basicGetRefTo();
		case NgcsmodelPackage.NGCS_REFERENCE__IS_KEY:
			return isIsKey();
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
		case NgcsmodelPackage.NGCS_REFERENCE__REF_TO:
			setRefTo((NgcsData) newValue);
			return;
		case NgcsmodelPackage.NGCS_REFERENCE__IS_KEY:
			setIsKey((Boolean) newValue);
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
		case NgcsmodelPackage.NGCS_REFERENCE__REF_TO:
			setRefTo((NgcsData) null);
			return;
		case NgcsmodelPackage.NGCS_REFERENCE__IS_KEY:
			setIsKey(IS_KEY_EDEFAULT);
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
		case NgcsmodelPackage.NGCS_REFERENCE__REF_TO:
			return refTo != null;
		case NgcsmodelPackage.NGCS_REFERENCE__IS_KEY:
			return isKey != IS_KEY_EDEFAULT;
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
		result.append(" (isKey: ");
		result.append(isKey);
		result.append(')');
		return result.toString();
	}

} //NgcsReferenceImpl
