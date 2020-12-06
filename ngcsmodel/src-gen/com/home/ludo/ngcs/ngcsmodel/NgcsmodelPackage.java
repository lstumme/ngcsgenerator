/**
 */
package com.home.ludo.ngcs.ngcsmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelFactory
 * @model kind="package"
 * @generated
 */
public interface NgcsmodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ngcsmodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://home.ludo.com/ngcsmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ngcsmodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NgcsmodelPackage eINSTANCE = com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsDataImpl <em>Ngcs Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsDataImpl
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsData()
	 * @generated
	 */
	int NGCS_DATA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Ngcsproperty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_DATA__NGCSPROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Ngcs Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ngcs Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsProjectImpl <em>Ngcs Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsProjectImpl
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsProject()
	 * @generated
	 */
	int NGCS_PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Ngcsmodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_PROJECT__NGCSMODULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_PROJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_PROJECT__MANAGER = 2;

	/**
	 * The number of structural features of the '<em>Ngcs Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_PROJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Ngcs Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsModuleImpl <em>Ngcs Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsModuleImpl
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsModule()
	 * @generated
	 */
	int NGCS_MODULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_MODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Edata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_MODULE__EDATA = 1;

	/**
	 * The number of structural features of the '<em>Ngcs Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ngcs Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsPropertyImpl <em>Ngcs Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsPropertyImpl
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsProperty()
	 * @generated
	 */
	int NGCS_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_PROPERTY__HIDDEN = 1;

	/**
	 * The number of structural features of the '<em>Ngcs Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ngcs Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsArrayPropertyImpl <em>Ngcs Array Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsArrayPropertyImpl
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsArrayProperty()
	 * @generated
	 */
	int NGCS_ARRAY_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ARRAY_PROPERTY__NAME = NGCS_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ARRAY_PROPERTY__HIDDEN = NGCS_PROPERTY__HIDDEN;

	/**
	 * The number of structural features of the '<em>Ngcs Array Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ARRAY_PROPERTY_FEATURE_COUNT = NGCS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ngcs Array Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ARRAY_PROPERTY_OPERATION_COUNT = NGCS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsSinglePropertyImpl <em>Ngcs Single Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsSinglePropertyImpl
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsSingleProperty()
	 * @generated
	 */
	int NGCS_SINGLE_PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_SINGLE_PROPERTY__NAME = NGCS_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_SINGLE_PROPERTY__HIDDEN = NGCS_PROPERTY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_SINGLE_PROPERTY__EDITABLE = NGCS_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_SINGLE_PROPERTY__REQUIRED = NGCS_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Crypted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_SINGLE_PROPERTY__CRYPTED = NGCS_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_SINGLE_PROPERTY__DEFAULT = NGCS_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Ngcs Single Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_SINGLE_PROPERTY_FEATURE_COUNT = NGCS_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Ngcs Single Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_SINGLE_PROPERTY_OPERATION_COUNT = NGCS_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsAttributeImpl <em>Ngcs Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsAttributeImpl
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsAttribute()
	 * @generated
	 */
	int NGCS_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ATTRIBUTE__NAME = NGCS_SINGLE_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ATTRIBUTE__HIDDEN = NGCS_SINGLE_PROPERTY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ATTRIBUTE__EDITABLE = NGCS_SINGLE_PROPERTY__EDITABLE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ATTRIBUTE__REQUIRED = NGCS_SINGLE_PROPERTY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Crypted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ATTRIBUTE__CRYPTED = NGCS_SINGLE_PROPERTY__CRYPTED;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ATTRIBUTE__DEFAULT = NGCS_SINGLE_PROPERTY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ATTRIBUTE__TYPE = NGCS_SINGLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ATTRIBUTE__UNIQUE = NGCS_SINGLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ngcs Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ATTRIBUTE_FEATURE_COUNT = NGCS_SINGLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ngcs Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_ATTRIBUTE_OPERATION_COUNT = NGCS_SINGLE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsAggregationImpl <em>Ngcs Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsAggregationImpl
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsAggregation()
	 * @generated
	 */
	int NGCS_AGGREGATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_AGGREGATION__NAME = NGCS_ARRAY_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_AGGREGATION__HIDDEN = NGCS_ARRAY_PROPERTY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Ref To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_AGGREGATION__REF_TO = NGCS_ARRAY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ngcs Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_AGGREGATION_FEATURE_COUNT = NGCS_ARRAY_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ngcs Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_AGGREGATION_OPERATION_COUNT = NGCS_ARRAY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsReferenceImpl <em>Ngcs Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsReferenceImpl
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsReference()
	 * @generated
	 */
	int NGCS_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_REFERENCE__NAME = NGCS_SINGLE_PROPERTY__NAME;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_REFERENCE__HIDDEN = NGCS_SINGLE_PROPERTY__HIDDEN;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_REFERENCE__EDITABLE = NGCS_SINGLE_PROPERTY__EDITABLE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_REFERENCE__REQUIRED = NGCS_SINGLE_PROPERTY__REQUIRED;

	/**
	 * The feature id for the '<em><b>Crypted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_REFERENCE__CRYPTED = NGCS_SINGLE_PROPERTY__CRYPTED;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_REFERENCE__DEFAULT = NGCS_SINGLE_PROPERTY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Ref To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_REFERENCE__REF_TO = NGCS_SINGLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_REFERENCE__IS_KEY = NGCS_SINGLE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ngcs Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_REFERENCE_FEATURE_COUNT = NGCS_SINGLE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ngcs Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NGCS_REFERENCE_OPERATION_COUNT = NGCS_SINGLE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsDataType <em>Ngcs Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsDataType
	 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsDataType()
	 * @generated
	 */
	int NGCS_DATA_TYPE = 9;

	/**
	 * Returns the meta object for class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsData <em>Ngcs Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ngcs Data</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsData
	 * @generated
	 */
	EClass getNgcsData();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsData#getName()
	 * @see #getNgcsData()
	 * @generated
	 */
	EAttribute getNgcsData_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.home.ludo.ngcs.ngcsmodel.NgcsData#getNgcsproperty <em>Ngcsproperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ngcsproperty</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsData#getNgcsproperty()
	 * @see #getNgcsData()
	 * @generated
	 */
	EReference getNgcsData_Ngcsproperty();

	/**
	 * Returns the meta object for class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsProject <em>Ngcs Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ngcs Project</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsProject
	 * @generated
	 */
	EClass getNgcsProject();

	/**
	 * Returns the meta object for the containment reference list '{@link com.home.ludo.ngcs.ngcsmodel.NgcsProject#getNgcsmodule <em>Ngcsmodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ngcsmodule</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsProject#getNgcsmodule()
	 * @see #getNgcsProject()
	 * @generated
	 */
	EReference getNgcsProject_Ngcsmodule();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsProject#getName()
	 * @see #getNgcsProject()
	 * @generated
	 */
	EAttribute getNgcsProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsProject#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manager</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsProject#getManager()
	 * @see #getNgcsProject()
	 * @generated
	 */
	EAttribute getNgcsProject_Manager();

	/**
	 * Returns the meta object for class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsModule <em>Ngcs Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ngcs Module</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsModule
	 * @generated
	 */
	EClass getNgcsModule();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsModule#getName()
	 * @see #getNgcsModule()
	 * @generated
	 */
	EAttribute getNgcsModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.home.ludo.ngcs.ngcsmodel.NgcsModule#getEdata <em>Edata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edata</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsModule#getEdata()
	 * @see #getNgcsModule()
	 * @generated
	 */
	EReference getNgcsModule_Edata();

	/**
	 * Returns the meta object for class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsProperty <em>Ngcs Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ngcs Property</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsProperty
	 * @generated
	 */
	EClass getNgcsProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsProperty#getName()
	 * @see #getNgcsProperty()
	 * @generated
	 */
	EAttribute getNgcsProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsProperty#isHidden <em>Hidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hidden</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsProperty#isHidden()
	 * @see #getNgcsProperty()
	 * @generated
	 */
	EAttribute getNgcsProperty_Hidden();

	/**
	 * Returns the meta object for class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsArrayProperty <em>Ngcs Array Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ngcs Array Property</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsArrayProperty
	 * @generated
	 */
	EClass getNgcsArrayProperty();

	/**
	 * Returns the meta object for class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsAttribute <em>Ngcs Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ngcs Attribute</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsAttribute
	 * @generated
	 */
	EClass getNgcsAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsAttribute#getType()
	 * @see #getNgcsAttribute()
	 * @generated
	 */
	EAttribute getNgcsAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsAttribute#isUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsAttribute#isUnique()
	 * @see #getNgcsAttribute()
	 * @generated
	 */
	EAttribute getNgcsAttribute_Unique();

	/**
	 * Returns the meta object for class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsAggregation <em>Ngcs Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ngcs Aggregation</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsAggregation
	 * @generated
	 */
	EClass getNgcsAggregation();

	/**
	 * Returns the meta object for the reference '{@link com.home.ludo.ngcs.ngcsmodel.NgcsAggregation#getRefTo <em>Ref To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref To</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsAggregation#getRefTo()
	 * @see #getNgcsAggregation()
	 * @generated
	 */
	EReference getNgcsAggregation_RefTo();

	/**
	 * Returns the meta object for class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsReference <em>Ngcs Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ngcs Reference</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsReference
	 * @generated
	 */
	EClass getNgcsReference();

	/**
	 * Returns the meta object for the reference '{@link com.home.ludo.ngcs.ngcsmodel.NgcsReference#getRefTo <em>Ref To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref To</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsReference#getRefTo()
	 * @see #getNgcsReference()
	 * @generated
	 */
	EReference getNgcsReference_RefTo();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsReference#isIsKey <em>Is Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Key</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsReference#isIsKey()
	 * @see #getNgcsReference()
	 * @generated
	 */
	EAttribute getNgcsReference_IsKey();

	/**
	 * Returns the meta object for class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty <em>Ngcs Single Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ngcs Single Property</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty
	 * @generated
	 */
	EClass getNgcsSingleProperty();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isEditable()
	 * @see #getNgcsSingleProperty()
	 * @generated
	 */
	EAttribute getNgcsSingleProperty_Editable();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isRequired()
	 * @see #getNgcsSingleProperty()
	 * @generated
	 */
	EAttribute getNgcsSingleProperty_Required();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isCrypted <em>Crypted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crypted</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isCrypted()
	 * @see #getNgcsSingleProperty()
	 * @generated
	 */
	EAttribute getNgcsSingleProperty_Crypted();

	/**
	 * Returns the meta object for the attribute '{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty#isDefault()
	 * @see #getNgcsSingleProperty()
	 * @generated
	 */
	EAttribute getNgcsSingleProperty_Default();

	/**
	 * Returns the meta object for enum '{@link com.home.ludo.ngcs.ngcsmodel.NgcsDataType <em>Ngcs Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ngcs Data Type</em>'.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsDataType
	 * @generated
	 */
	EEnum getNgcsDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NgcsmodelFactory getNgcsmodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsDataImpl <em>Ngcs Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsDataImpl
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsData()
		 * @generated
		 */
		EClass NGCS_DATA = eINSTANCE.getNgcsData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_DATA__NAME = eINSTANCE.getNgcsData_Name();

		/**
		 * The meta object literal for the '<em><b>Ngcsproperty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NGCS_DATA__NGCSPROPERTY = eINSTANCE.getNgcsData_Ngcsproperty();

		/**
		 * The meta object literal for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsProjectImpl <em>Ngcs Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsProjectImpl
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsProject()
		 * @generated
		 */
		EClass NGCS_PROJECT = eINSTANCE.getNgcsProject();

		/**
		 * The meta object literal for the '<em><b>Ngcsmodule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NGCS_PROJECT__NGCSMODULE = eINSTANCE.getNgcsProject_Ngcsmodule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_PROJECT__NAME = eINSTANCE.getNgcsProject_Name();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_PROJECT__MANAGER = eINSTANCE.getNgcsProject_Manager();

		/**
		 * The meta object literal for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsModuleImpl <em>Ngcs Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsModuleImpl
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsModule()
		 * @generated
		 */
		EClass NGCS_MODULE = eINSTANCE.getNgcsModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_MODULE__NAME = eINSTANCE.getNgcsModule_Name();

		/**
		 * The meta object literal for the '<em><b>Edata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NGCS_MODULE__EDATA = eINSTANCE.getNgcsModule_Edata();

		/**
		 * The meta object literal for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsPropertyImpl <em>Ngcs Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsPropertyImpl
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsProperty()
		 * @generated
		 */
		EClass NGCS_PROPERTY = eINSTANCE.getNgcsProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_PROPERTY__NAME = eINSTANCE.getNgcsProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Hidden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_PROPERTY__HIDDEN = eINSTANCE.getNgcsProperty_Hidden();

		/**
		 * The meta object literal for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsArrayPropertyImpl <em>Ngcs Array Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsArrayPropertyImpl
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsArrayProperty()
		 * @generated
		 */
		EClass NGCS_ARRAY_PROPERTY = eINSTANCE.getNgcsArrayProperty();

		/**
		 * The meta object literal for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsAttributeImpl <em>Ngcs Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsAttributeImpl
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsAttribute()
		 * @generated
		 */
		EClass NGCS_ATTRIBUTE = eINSTANCE.getNgcsAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_ATTRIBUTE__TYPE = eINSTANCE.getNgcsAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_ATTRIBUTE__UNIQUE = eINSTANCE.getNgcsAttribute_Unique();

		/**
		 * The meta object literal for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsAggregationImpl <em>Ngcs Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsAggregationImpl
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsAggregation()
		 * @generated
		 */
		EClass NGCS_AGGREGATION = eINSTANCE.getNgcsAggregation();

		/**
		 * The meta object literal for the '<em><b>Ref To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NGCS_AGGREGATION__REF_TO = eINSTANCE.getNgcsAggregation_RefTo();

		/**
		 * The meta object literal for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsReferenceImpl <em>Ngcs Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsReferenceImpl
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsReference()
		 * @generated
		 */
		EClass NGCS_REFERENCE = eINSTANCE.getNgcsReference();

		/**
		 * The meta object literal for the '<em><b>Ref To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NGCS_REFERENCE__REF_TO = eINSTANCE.getNgcsReference_RefTo();

		/**
		 * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_REFERENCE__IS_KEY = eINSTANCE.getNgcsReference_IsKey();

		/**
		 * The meta object literal for the '{@link com.home.ludo.ngcs.ngcsmodel.impl.NgcsSinglePropertyImpl <em>Ngcs Single Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsSinglePropertyImpl
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsSingleProperty()
		 * @generated
		 */
		EClass NGCS_SINGLE_PROPERTY = eINSTANCE.getNgcsSingleProperty();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_SINGLE_PROPERTY__EDITABLE = eINSTANCE.getNgcsSingleProperty_Editable();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_SINGLE_PROPERTY__REQUIRED = eINSTANCE.getNgcsSingleProperty_Required();

		/**
		 * The meta object literal for the '<em><b>Crypted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_SINGLE_PROPERTY__CRYPTED = eINSTANCE.getNgcsSingleProperty_Crypted();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NGCS_SINGLE_PROPERTY__DEFAULT = eINSTANCE.getNgcsSingleProperty_Default();

		/**
		 * The meta object literal for the '{@link com.home.ludo.ngcs.ngcsmodel.NgcsDataType <em>Ngcs Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.home.ludo.ngcs.ngcsmodel.NgcsDataType
		 * @see com.home.ludo.ngcs.ngcsmodel.impl.NgcsmodelPackageImpl#getNgcsDataType()
		 * @generated
		 */
		EEnum NGCS_DATA_TYPE = eINSTANCE.getNgcsDataType();

	}

} //NgcsmodelPackage
