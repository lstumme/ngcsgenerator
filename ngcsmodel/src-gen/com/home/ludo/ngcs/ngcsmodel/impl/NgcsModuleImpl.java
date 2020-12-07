/**
 */
package com.home.ludo.ngcs.ngcsmodel.impl;

import com.home.ludo.ngcs.ngcsmodel.NgcsData;
import com.home.ludo.ngcs.ngcsmodel.NgcsModule;
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
 * An implementation of the model object '<em><b>Ngcs Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsModuleImpl#getEdata <em>Edata</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsModuleImpl#isGUIModule <em>GUI Module</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsModuleImpl#isServerModule <em>Server Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NgcsModuleImpl extends MinimalEObjectImpl.Container implements NgcsModule {
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
	 * The cached value of the '{@link #getEdata() <em>Edata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdata()
	 * @generated
	 * @ordered
	 */
	protected EList<NgcsData> edata;

	/**
	 * The default value of the '{@link #isGUIModule() <em>GUI Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGUIModule()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GUI_MODULE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGUIModule() <em>GUI Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGUIModule()
	 * @generated
	 * @ordered
	 */
	protected boolean guiModule = GUI_MODULE_EDEFAULT;

	/**
	 * The default value of the '{@link #isServerModule() <em>Server Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServerModule()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVER_MODULE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isServerModule() <em>Server Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServerModule()
	 * @generated
	 * @ordered
	 */
	protected boolean serverModule = SERVER_MODULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NgcsModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NgcsmodelPackage.Literals.NGCS_MODULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NgcsmodelPackage.NGCS_MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NgcsData> getEdata() {
		if (edata == null) {
			edata = new EObjectContainmentEList<NgcsData>(NgcsData.class, this, NgcsmodelPackage.NGCS_MODULE__EDATA);
		}
		return edata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGUIModule() {
		return guiModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGUIModule(boolean newGUIModule) {
		boolean oldGUIModule = guiModule;
		guiModule = newGUIModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NgcsmodelPackage.NGCS_MODULE__GUI_MODULE,
					oldGUIModule, guiModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isServerModule() {
		return serverModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServerModule(boolean newServerModule) {
		boolean oldServerModule = serverModule;
		serverModule = newServerModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NgcsmodelPackage.NGCS_MODULE__SERVER_MODULE,
					oldServerModule, serverModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NgcsmodelPackage.NGCS_MODULE__EDATA:
			return ((InternalEList<?>) getEdata()).basicRemove(otherEnd, msgs);
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
		case NgcsmodelPackage.NGCS_MODULE__NAME:
			return getName();
		case NgcsmodelPackage.NGCS_MODULE__EDATA:
			return getEdata();
		case NgcsmodelPackage.NGCS_MODULE__GUI_MODULE:
			return isGUIModule();
		case NgcsmodelPackage.NGCS_MODULE__SERVER_MODULE:
			return isServerModule();
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
		case NgcsmodelPackage.NGCS_MODULE__NAME:
			setName((String) newValue);
			return;
		case NgcsmodelPackage.NGCS_MODULE__EDATA:
			getEdata().clear();
			getEdata().addAll((Collection<? extends NgcsData>) newValue);
			return;
		case NgcsmodelPackage.NGCS_MODULE__GUI_MODULE:
			setGUIModule((Boolean) newValue);
			return;
		case NgcsmodelPackage.NGCS_MODULE__SERVER_MODULE:
			setServerModule((Boolean) newValue);
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
		case NgcsmodelPackage.NGCS_MODULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case NgcsmodelPackage.NGCS_MODULE__EDATA:
			getEdata().clear();
			return;
		case NgcsmodelPackage.NGCS_MODULE__GUI_MODULE:
			setGUIModule(GUI_MODULE_EDEFAULT);
			return;
		case NgcsmodelPackage.NGCS_MODULE__SERVER_MODULE:
			setServerModule(SERVER_MODULE_EDEFAULT);
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
		case NgcsmodelPackage.NGCS_MODULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case NgcsmodelPackage.NGCS_MODULE__EDATA:
			return edata != null && !edata.isEmpty();
		case NgcsmodelPackage.NGCS_MODULE__GUI_MODULE:
			return guiModule != GUI_MODULE_EDEFAULT;
		case NgcsmodelPackage.NGCS_MODULE__SERVER_MODULE:
			return serverModule != SERVER_MODULE_EDEFAULT;
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
		result.append(", GUIModule: ");
		result.append(guiModule);
		result.append(", serverModule: ");
		result.append(serverModule);
		result.append(')');
		return result.toString();
	}

} //NgcsModuleImpl
