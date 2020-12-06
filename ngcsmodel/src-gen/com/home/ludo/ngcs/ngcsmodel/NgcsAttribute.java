/**
 */
package com.home.ludo.ngcs.ngcsmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ngcs Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsAttribute#getType <em>Type</em>}</li>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsAttribute#isUnique <em>Unique</em>}</li>
 * </ul>
 *
 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsAttribute()
 * @model
 * @generated
 */
public interface NgcsAttribute extends NgcsSingleProperty {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.home.ludo.ngcs.ngcsmodel.NgcsDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsDataType
	 * @see #setType(NgcsDataType)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsAttribute_Type()
	 * @model
	 * @generated
	 */
	NgcsDataType getType();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsAttribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(NgcsDataType value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsAttribute_Unique()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsAttribute#isUnique <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

} // NgcsAttribute
