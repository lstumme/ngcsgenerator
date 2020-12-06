/**
 */
package com.home.ludo.ngcs.ngcsmodel.impl;

import com.home.ludo.ngcs.ngcsmodel.NgcsAggregation;
import com.home.ludo.ngcs.ngcsmodel.NgcsArrayProperty;
import com.home.ludo.ngcs.ngcsmodel.NgcsAttribute;
import com.home.ludo.ngcs.ngcsmodel.NgcsData;
import com.home.ludo.ngcs.ngcsmodel.NgcsDataType;
import com.home.ludo.ngcs.ngcsmodel.NgcsModule;
import com.home.ludo.ngcs.ngcsmodel.NgcsProject;
import com.home.ludo.ngcs.ngcsmodel.NgcsProperty;
import com.home.ludo.ngcs.ngcsmodel.NgcsReference;
import com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty;
import com.home.ludo.ngcs.ngcsmodel.NgcsmodelFactory;
import com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NgcsmodelPackageImpl extends EPackageImpl implements NgcsmodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ngcsDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ngcsProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ngcsModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ngcsPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ngcsArrayPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ngcsAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ngcsAggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ngcsReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ngcsSinglePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ngcsDataTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NgcsmodelPackageImpl() {
		super(eNS_URI, NgcsmodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NgcsmodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NgcsmodelPackage init() {
		if (isInited)
			return (NgcsmodelPackage) EPackage.Registry.INSTANCE.getEPackage(NgcsmodelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNgcsmodelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NgcsmodelPackageImpl theNgcsmodelPackage = registeredNgcsmodelPackage instanceof NgcsmodelPackageImpl
				? (NgcsmodelPackageImpl) registeredNgcsmodelPackage
				: new NgcsmodelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNgcsmodelPackage.createPackageContents();

		// Initialize created meta-data
		theNgcsmodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNgcsmodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NgcsmodelPackage.eNS_URI, theNgcsmodelPackage);
		return theNgcsmodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNgcsData() {
		return ngcsDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsData_Name() {
		return (EAttribute) ngcsDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNgcsData_Ngcsproperty() {
		return (EReference) ngcsDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNgcsProject() {
		return ngcsProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNgcsProject_Ngcsmodule() {
		return (EReference) ngcsProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsProject_Name() {
		return (EAttribute) ngcsProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsProject_Manager() {
		return (EAttribute) ngcsProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNgcsModule() {
		return ngcsModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsModule_Name() {
		return (EAttribute) ngcsModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNgcsModule_Edata() {
		return (EReference) ngcsModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNgcsProperty() {
		return ngcsPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsProperty_Name() {
		return (EAttribute) ngcsPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsProperty_Hidden() {
		return (EAttribute) ngcsPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNgcsArrayProperty() {
		return ngcsArrayPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNgcsAttribute() {
		return ngcsAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsAttribute_Type() {
		return (EAttribute) ngcsAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsAttribute_Unique() {
		return (EAttribute) ngcsAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNgcsAggregation() {
		return ngcsAggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNgcsAggregation_RefTo() {
		return (EReference) ngcsAggregationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNgcsReference() {
		return ngcsReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNgcsReference_RefTo() {
		return (EReference) ngcsReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsReference_IsKey() {
		return (EAttribute) ngcsReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNgcsSingleProperty() {
		return ngcsSinglePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsSingleProperty_Editable() {
		return (EAttribute) ngcsSinglePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsSingleProperty_Required() {
		return (EAttribute) ngcsSinglePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsSingleProperty_Crypted() {
		return (EAttribute) ngcsSinglePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNgcsSingleProperty_Default() {
		return (EAttribute) ngcsSinglePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNgcsDataType() {
		return ngcsDataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NgcsmodelFactory getNgcsmodelFactory() {
		return (NgcsmodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		ngcsDataEClass = createEClass(NGCS_DATA);
		createEAttribute(ngcsDataEClass, NGCS_DATA__NAME);
		createEReference(ngcsDataEClass, NGCS_DATA__NGCSPROPERTY);

		ngcsProjectEClass = createEClass(NGCS_PROJECT);
		createEReference(ngcsProjectEClass, NGCS_PROJECT__NGCSMODULE);
		createEAttribute(ngcsProjectEClass, NGCS_PROJECT__NAME);
		createEAttribute(ngcsProjectEClass, NGCS_PROJECT__MANAGER);

		ngcsModuleEClass = createEClass(NGCS_MODULE);
		createEAttribute(ngcsModuleEClass, NGCS_MODULE__NAME);
		createEReference(ngcsModuleEClass, NGCS_MODULE__EDATA);

		ngcsPropertyEClass = createEClass(NGCS_PROPERTY);
		createEAttribute(ngcsPropertyEClass, NGCS_PROPERTY__NAME);
		createEAttribute(ngcsPropertyEClass, NGCS_PROPERTY__HIDDEN);

		ngcsArrayPropertyEClass = createEClass(NGCS_ARRAY_PROPERTY);

		ngcsAttributeEClass = createEClass(NGCS_ATTRIBUTE);
		createEAttribute(ngcsAttributeEClass, NGCS_ATTRIBUTE__TYPE);
		createEAttribute(ngcsAttributeEClass, NGCS_ATTRIBUTE__UNIQUE);

		ngcsAggregationEClass = createEClass(NGCS_AGGREGATION);
		createEReference(ngcsAggregationEClass, NGCS_AGGREGATION__REF_TO);

		ngcsReferenceEClass = createEClass(NGCS_REFERENCE);
		createEReference(ngcsReferenceEClass, NGCS_REFERENCE__REF_TO);
		createEAttribute(ngcsReferenceEClass, NGCS_REFERENCE__IS_KEY);

		ngcsSinglePropertyEClass = createEClass(NGCS_SINGLE_PROPERTY);
		createEAttribute(ngcsSinglePropertyEClass, NGCS_SINGLE_PROPERTY__EDITABLE);
		createEAttribute(ngcsSinglePropertyEClass, NGCS_SINGLE_PROPERTY__REQUIRED);
		createEAttribute(ngcsSinglePropertyEClass, NGCS_SINGLE_PROPERTY__CRYPTED);
		createEAttribute(ngcsSinglePropertyEClass, NGCS_SINGLE_PROPERTY__DEFAULT);

		// Create enums
		ngcsDataTypeEEnum = createEEnum(NGCS_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ngcsArrayPropertyEClass.getESuperTypes().add(this.getNgcsProperty());
		ngcsAttributeEClass.getESuperTypes().add(this.getNgcsSingleProperty());
		ngcsAggregationEClass.getESuperTypes().add(this.getNgcsArrayProperty());
		ngcsReferenceEClass.getESuperTypes().add(this.getNgcsSingleProperty());
		ngcsSinglePropertyEClass.getESuperTypes().add(this.getNgcsProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(ngcsDataEClass, NgcsData.class, "NgcsData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNgcsData_Name(), ecorePackage.getEString(), "name", null, 0, 1, NgcsData.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNgcsData_Ngcsproperty(), this.getNgcsProperty(), null, "ngcsproperty", null, 0, -1,
				NgcsData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ngcsProjectEClass, NgcsProject.class, "NgcsProject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNgcsProject_Ngcsmodule(), this.getNgcsModule(), null, "ngcsmodule", null, 0, -1,
				NgcsProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNgcsProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, NgcsProject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNgcsProject_Manager(), ecorePackage.getEString(), "manager", null, 0, 1, NgcsProject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ngcsModuleEClass, NgcsModule.class, "NgcsModule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNgcsModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, NgcsModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNgcsModule_Edata(), this.getNgcsData(), null, "edata", null, 0, -1, NgcsModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ngcsPropertyEClass, NgcsProperty.class, "NgcsProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNgcsProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, NgcsProperty.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNgcsProperty_Hidden(), ecorePackage.getEBoolean(), "hidden", null, 0, 1, NgcsProperty.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ngcsArrayPropertyEClass, NgcsArrayProperty.class, "NgcsArrayProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ngcsAttributeEClass, NgcsAttribute.class, "NgcsAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNgcsAttribute_Type(), this.getNgcsDataType(), "type", null, 0, 1, NgcsAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNgcsAttribute_Unique(), theXMLTypePackage.getBoolean(), "unique", null, 0, 1,
				NgcsAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(ngcsAggregationEClass, NgcsAggregation.class, "NgcsAggregation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNgcsAggregation_RefTo(), this.getNgcsData(), null, "refTo", null, 0, 1, NgcsAggregation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ngcsReferenceEClass, NgcsReference.class, "NgcsReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNgcsReference_RefTo(), this.getNgcsData(), null, "refTo", null, 0, 1, NgcsReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNgcsReference_IsKey(), ecorePackage.getEBoolean(), "isKey", null, 0, 1, NgcsReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ngcsSinglePropertyEClass, NgcsSingleProperty.class, "NgcsSingleProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNgcsSingleProperty_Editable(), ecorePackage.getEBoolean(), "editable", null, 0, 1,
				NgcsSingleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNgcsSingleProperty_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1,
				NgcsSingleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNgcsSingleProperty_Crypted(), ecorePackage.getEBoolean(), "crypted", null, 0, 1,
				NgcsSingleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNgcsSingleProperty_Default(), ecorePackage.getEBoolean(), "default", null, 0, 1,
				NgcsSingleProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ngcsDataTypeEEnum, NgcsDataType.class, "NgcsDataType");
		addEEnumLiteral(ngcsDataTypeEEnum, NgcsDataType.STRING);
		addEEnumLiteral(ngcsDataTypeEEnum, NgcsDataType.NUMBER);
		addEEnumLiteral(ngcsDataTypeEEnum, NgcsDataType.DATE);
		addEEnumLiteral(ngcsDataTypeEEnum, NgcsDataType.BOOLEAN);

		// Create resource
		createResource(eNS_URI);
	}

} //NgcsmodelPackageImpl
