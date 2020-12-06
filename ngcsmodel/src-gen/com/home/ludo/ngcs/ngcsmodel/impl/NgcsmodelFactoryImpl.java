/**
 */
package com.home.ludo.ngcs.ngcsmodel.impl;

import com.home.ludo.ngcs.ngcsmodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NgcsmodelFactoryImpl extends EFactoryImpl implements NgcsmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NgcsmodelFactory init() {
		try {
			NgcsmodelFactory theNgcsmodelFactory = (NgcsmodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(NgcsmodelPackage.eNS_URI);
			if (theNgcsmodelFactory != null) {
				return theNgcsmodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NgcsmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NgcsmodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NgcsmodelPackage.NGCS_DATA:
			return createNgcsData();
		case NgcsmodelPackage.NGCS_PROJECT:
			return createNgcsProject();
		case NgcsmodelPackage.NGCS_MODULE:
			return createNgcsModule();
		case NgcsmodelPackage.NGCS_ATTRIBUTE:
			return createNgcsAttribute();
		case NgcsmodelPackage.NGCS_AGGREGATION:
			return createNgcsAggregation();
		case NgcsmodelPackage.NGCS_REFERENCE:
			return createNgcsReference();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case NgcsmodelPackage.NGCS_DATA_TYPE:
			return createNgcsDataTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case NgcsmodelPackage.NGCS_DATA_TYPE:
			return convertNgcsDataTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NgcsData createNgcsData() {
		NgcsDataImpl ngcsData = new NgcsDataImpl();
		return ngcsData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NgcsProject createNgcsProject() {
		NgcsProjectImpl ngcsProject = new NgcsProjectImpl();
		return ngcsProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NgcsModule createNgcsModule() {
		NgcsModuleImpl ngcsModule = new NgcsModuleImpl();
		return ngcsModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NgcsAttribute createNgcsAttribute() {
		NgcsAttributeImpl ngcsAttribute = new NgcsAttributeImpl();
		return ngcsAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NgcsAggregation createNgcsAggregation() {
		NgcsAggregationImpl ngcsAggregation = new NgcsAggregationImpl();
		return ngcsAggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NgcsReference createNgcsReference() {
		NgcsReferenceImpl ngcsReference = new NgcsReferenceImpl();
		return ngcsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NgcsDataType createNgcsDataTypeFromString(EDataType eDataType, String initialValue) {
		NgcsDataType result = NgcsDataType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNgcsDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NgcsmodelPackage getNgcsmodelPackage() {
		return (NgcsmodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NgcsmodelPackage getPackage() {
		return NgcsmodelPackage.eINSTANCE;
	}

} //NgcsmodelFactoryImpl
