/**
 */
package com.home.ludo.ngcs.ngcsmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage
 * @generated
 */
public interface NgcsmodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NgcsmodelFactory eINSTANCE = com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ngcs Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ngcs Data</em>'.
	 * @generated
	 */
	NgcsData createNgcsData();

	/**
	 * Returns a new object of class '<em>Ngcs Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ngcs Project</em>'.
	 * @generated
	 */
	NgcsProject createNgcsProject();

	/**
	 * Returns a new object of class '<em>Ngcs Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ngcs Module</em>'.
	 * @generated
	 */
	NgcsModule createNgcsModule();

	/**
	 * Returns a new object of class '<em>Ngcs Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ngcs Attribute</em>'.
	 * @generated
	 */
	NgcsAttribute createNgcsAttribute();

	/**
	 * Returns a new object of class '<em>Ngcs Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ngcs Aggregation</em>'.
	 * @generated
	 */
	NgcsAggregation createNgcsAggregation();

	/**
	 * Returns a new object of class '<em>Ngcs Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ngcs Reference</em>'.
	 * @generated
	 */
	NgcsReference createNgcsReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NgcsmodelPackage getNgcsmodelPackage();

} //NgcsmodelFactory
