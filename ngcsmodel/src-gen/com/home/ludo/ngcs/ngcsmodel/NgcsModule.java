/**
 */
package com.home.ludo.ngcs.ngcsmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ngcs Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Package conteneur
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsModule#getName <em>Name</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsModule#getEdata <em>Edata</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsModule#isGUIModule <em>GUI Module</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsModule#isServerModule <em>Server Module</em>}</li>
 * </ul>
 *
 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsModule()
 * @model
 * @generated
 */
public interface NgcsModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Edata</b></em>' containment reference list.
	 * The list contents are of type {@link com.home.ludo.ngcs.ngcsmodel.NgcsData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edata</em>' containment reference list.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsModule_Edata()
	 * @model containment="true"
	 * @generated
	 */
	EList<NgcsData> getEdata();

	/**
	 * Returns the value of the '<em><b>GUI Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GUI Module</em>' attribute.
	 * @see #setGUIModule(boolean)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsModule_GUIModule()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isGUIModule();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsModule#isGUIModule <em>GUI Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUI Module</em>' attribute.
	 * @see #isGUIModule()
	 * @generated
	 */
	void setGUIModule(boolean value);

	/**
	 * Returns the value of the '<em><b>Server Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Module</em>' attribute.
	 * @see #setServerModule(boolean)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsModule_ServerModule()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isServerModule();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsModule#isServerModule <em>Server Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Module</em>' attribute.
	 * @see #isServerModule()
	 * @generated
	 */
	void setServerModule(boolean value);

} // NgcsModule
