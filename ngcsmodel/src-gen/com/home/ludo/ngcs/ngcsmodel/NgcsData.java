/**
 */
package com.home.ludo.ngcs.ngcsmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ngcs Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsData#getName <em>Name</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsData#getNgcsproperty <em>Ngcsproperty</em>}</li>
 * </ul>
 *
 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsData()
 * @model
 * @generated
 */
public interface NgcsData extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsData_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ngcsproperty</b></em>' containment reference list.
	 * The list contents are of type {@link com.home.ludo.ngcs.ngcsmodel.NgcsProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ngcsproperty</em>' containment reference list.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsData_Ngcsproperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<NgcsProperty> getNgcsproperty();

} // NgcsData
