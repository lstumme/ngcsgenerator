/**
 */
package com.home.ludo.ngcs.ngcsmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ngcs Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsReference#getRefTo <em>Ref To</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsReference#isIsKey <em>Is Key</em>}</li>
 * </ul>
 *
 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsReference()
 * @model
 * @generated
 */
public interface NgcsReference extends NgcsSingleProperty {
	/**
	 * Returns the value of the '<em><b>Ref To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref To</em>' reference.
	 * @see #setRefTo(NgcsData)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsReference_RefTo()
	 * @model
	 * @generated
	 */
	NgcsData getRefTo();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsReference#getRefTo <em>Ref To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref To</em>' reference.
	 * @see #getRefTo()
	 * @generated
	 */
	void setRefTo(NgcsData value);

	/**
	 * Returns the value of the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Key</em>' attribute.
	 * @see #setIsKey(boolean)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsReference_IsKey()
	 * @model
	 * @generated
	 */
	boolean isIsKey();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsReference#isIsKey <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Key</em>' attribute.
	 * @see #isIsKey()
	 * @generated
	 */
	void setIsKey(boolean value);

} // NgcsReference
