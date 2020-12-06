/**
 */
package com.home.ludo.ngcs.ngcsmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ngcs Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsProject#getNgcsmodule <em>Ngcsmodule</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsProject#getName <em>Name</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsProject#getManager <em>Manager</em>}</li>
 * </ul>
 *
 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsProject()
 * @model
 * @generated
 */
public interface NgcsProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Ngcsmodule</b></em>' containment reference list.
	 * The list contents are of type {@link com.home.ludo.ngcs.ngcsmodel.NgcsModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ngcsmodule</em>' containment reference list.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsProject_Ngcsmodule()
	 * @model containment="true"
	 * @generated
	 */
	EList<NgcsModule> getNgcsmodule();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' attribute.
	 * @see #setManager(String)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsProject_Manager()
	 * @model
	 * @generated
	 */
	String getManager();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsProject#getManager <em>Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' attribute.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(String value);

} // NgcsProject
