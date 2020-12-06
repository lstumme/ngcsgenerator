/**
 */
package com.home.ludo.ngcs.ngcsmodel.impl;

import com.home.ludo.ngcs.ngcsmodel.NgcsModule;
import com.home.ludo.ngcs.ngcsmodel.NgcsProject;
import com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Ngcs Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsProjectImpl#getNgcsmodule <em>Ngcsmodule</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsProjectImpl#getManager <em>Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NgcsProjectImpl extends MinimalEObjectImpl.Container implements NgcsProject {
	/**
	 * The cached value of the '{@link #getNgcsmodule() <em>Ngcsmodule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNgcsmodule()
	 * @generated
	 * @ordered
	 */
	protected EList<NgcsModule> ngcsmodule;

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
	 * The default value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected String manager = MANAGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NgcsProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NgcsmodelPackage.Literals.NGCS_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NgcsModule> getNgcsmodule() {
		if (ngcsmodule == null) {
			ngcsmodule = new EObjectContainmentEList<NgcsModule>(NgcsModule.class, this,
					NgcsmodelPackage.NGCS_PROJECT__NGCSMODULE);
		}
		return ngcsmodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NgcsmodelPackage.NGCS_PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManager(String newManager) {
		String oldManager = manager;
		manager = newManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NgcsmodelPackage.NGCS_PROJECT__MANAGER, oldManager,
					manager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NgcsmodelPackage.NGCS_PROJECT__NGCSMODULE:
			return ((InternalEList<?>) getNgcsmodule()).basicRemove(otherEnd, msgs);
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
		case NgcsmodelPackage.NGCS_PROJECT__NGCSMODULE:
			return getNgcsmodule();
		case NgcsmodelPackage.NGCS_PROJECT__NAME:
			return getName();
		case NgcsmodelPackage.NGCS_PROJECT__MANAGER:
			return getManager();
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
		case NgcsmodelPackage.NGCS_PROJECT__NGCSMODULE:
			getNgcsmodule().clear();
			getNgcsmodule().addAll((Collection<? extends NgcsModule>) newValue);
			return;
		case NgcsmodelPackage.NGCS_PROJECT__NAME:
			setName((String) newValue);
			return;
		case NgcsmodelPackage.NGCS_PROJECT__MANAGER:
			setManager((String) newValue);
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
		case NgcsmodelPackage.NGCS_PROJECT__NGCSMODULE:
			getNgcsmodule().clear();
			return;
		case NgcsmodelPackage.NGCS_PROJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case NgcsmodelPackage.NGCS_PROJECT__MANAGER:
			setManager(MANAGER_EDEFAULT);
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
		case NgcsmodelPackage.NGCS_PROJECT__NGCSMODULE:
			return ngcsmodule != null && !ngcsmodule.isEmpty();
		case NgcsmodelPackage.NGCS_PROJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case NgcsmodelPackage.NGCS_PROJECT__MANAGER:
			return MANAGER_EDEFAULT == null ? manager != null : !MANAGER_EDEFAULT.equals(manager);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", manager: ");
		result.append(manager);
		result.append(')');
		return result.toString();
	}

} //NgcsProjectImpl
