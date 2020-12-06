/**
 */
package com.home.ludo.ngcs.ngcsmodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ngcs Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.home.ludo.ngcs.ngcsmodel.NgcsAggregation#getRefTo <em>Ref To</em>}</li>
 * </ul>
 *
 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsAggregation()
 * @model
 * @generated
 */
public interface NgcsAggregation extends NgcsArrayProperty {
	/**
	 * Returns the value of the '<em><b>Ref To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref To</em>' reference.
	 * @see #setRefTo(NgcsData)
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#getNgcsAggregation_RefTo()
	 * @model
	 * @generated
	 */
	NgcsData getRefTo();

	/**
	 * Sets the value of the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsAggregation#getRefTo <em>Ref To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref To</em>' reference.
	 * @see #getRefTo()
	 * @generated
	 */
	void setRefTo(NgcsData value);

} // NgcsAggregation
