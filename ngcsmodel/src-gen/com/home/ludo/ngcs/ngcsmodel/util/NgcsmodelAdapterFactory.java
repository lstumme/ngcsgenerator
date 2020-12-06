/**
 */
package com.home.ludo.ngcs.ngcsmodel.util;

import com.home.ludo.ngcs.ngcsmodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage
 * @generated
 */
public class NgcsmodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NgcsmodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NgcsmodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NgcsmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NgcsmodelSwitch<Adapter> modelSwitch = new NgcsmodelSwitch<Adapter>() {
		@Override
		public Adapter caseNgcsData(NgcsData object) {
			return createNgcsDataAdapter();
		}

		@Override
		public Adapter caseNgcsProject(NgcsProject object) {
			return createNgcsProjectAdapter();
		}

		@Override
		public Adapter caseNgcsModule(NgcsModule object) {
			return createNgcsModuleAdapter();
		}

		@Override
		public Adapter caseNgcsProperty(NgcsProperty object) {
			return createNgcsPropertyAdapter();
		}

		@Override
		public Adapter caseNgcsArrayProperty(NgcsArrayProperty object) {
			return createNgcsArrayPropertyAdapter();
		}

		@Override
		public Adapter caseNgcsAttribute(NgcsAttribute object) {
			return createNgcsAttributeAdapter();
		}

		@Override
		public Adapter caseNgcsAggregation(NgcsAggregation object) {
			return createNgcsAggregationAdapter();
		}

		@Override
		public Adapter caseNgcsReference(NgcsReference object) {
			return createNgcsReferenceAdapter();
		}

		@Override
		public Adapter caseNgcsSingleProperty(NgcsSingleProperty object) {
			return createNgcsSinglePropertyAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsData <em>Ngcs Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsData
	 * @generated
	 */
	public Adapter createNgcsDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsProject <em>Ngcs Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsProject
	 * @generated
	 */
	public Adapter createNgcsProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsModule <em>Ngcs Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsModule
	 * @generated
	 */
	public Adapter createNgcsModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsProperty <em>Ngcs Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsProperty
	 * @generated
	 */
	public Adapter createNgcsPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsArrayProperty <em>Ngcs Array Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsArrayProperty
	 * @generated
	 */
	public Adapter createNgcsArrayPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsAttribute <em>Ngcs Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsAttribute
	 * @generated
	 */
	public Adapter createNgcsAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsAggregation <em>Ngcs Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsAggregation
	 * @generated
	 */
	public Adapter createNgcsAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsReference <em>Ngcs Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsReference
	 * @generated
	 */
	public Adapter createNgcsReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty <em>Ngcs Single Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.home.ludo.ngcs.ngcsmodel.NgcsSingleProperty
	 * @generated
	 */
	public Adapter createNgcsSinglePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NgcsmodelAdapterFactory
