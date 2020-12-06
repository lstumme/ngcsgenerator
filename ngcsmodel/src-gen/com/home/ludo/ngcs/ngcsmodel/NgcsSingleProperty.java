/**
 */
package com.home.ludo.ngcs.ngcsmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ngcs Single Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isEditable <em>Editable</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isRequired <em>Required</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isCrypted <em>Crypted</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsSingleProperty()
 * @model abstract="true"
 * @generated
 */
public interface NgcsSingleProperty extends NgcsProperty {
	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(boolean)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsSingleProperty_Editable()
	 * @model
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsSingleProperty_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Crypted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crypted</em>' attribute.
	 * @see #setCrypted(boolean)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsSingleProperty_Crypted()
	 * @model
	 * @generated
	 */
	boolean isCrypted();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isCrypted <em>Crypted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crypted</em>' attribute.
	 * @see #isCrypted()
	 * @generated
	 */
	void setCrypted(boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsSingleProperty_Default()
	 * @model
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

} // NgcsSingleProperty
