/**
 */
package com.home.ludo.ngcs.ngcsmodel.util;

import com.home.ludo.ngcs.ngcsmodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.home.ludo.ngcs.ngcsmodel.NgcsmodelPackage
 * @generated
 */
public class NgcsmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NgcsmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NgcsmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = NgcsmodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case NgcsmodelPackage.NGCS_DATA: {
			NgcsData ngcsData = (NgcsData) theEObject;
			T result = caseNgcsData(ngcsData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NgcsmodelPackage.NGCS_PROJECT: {
			NgcsProject ngcsProject = (NgcsProject) theEObject;
			T result = caseNgcsProject(ngcsProject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NgcsmodelPackage.NGCS_MODULE: {
			NgcsModule ngcsModule = (NgcsModule) theEObject;
			T result = caseNgcsModule(ngcsModule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NgcsmodelPackage.NGCS_PROPERTY: {
			NgcsProperty ngcsProperty = (NgcsProperty) theEObject;
			T result = caseNgcsProperty(ngcsProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NgcsmodelPackage.NGCS_ARRAY_PROPERTY: {
			NgcsArrayProperty ngcsArrayProperty = (NgcsArrayProperty) theEObject;
			T result = caseNgcsArrayProperty(ngcsArrayProperty);
			if (result == null)
				result = caseNgcsProperty(ngcsArrayProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NgcsmodelPackage.NGCS_ATTRIBUTE: {
			NgcsAttribute ngcsAttribute = (NgcsAttribute) theEObject;
			T result = caseNgcsAttribute(ngcsAttribute);
			if (result == null)
				result = caseNgcsSingleProperty(ngcsAttribute);
			if (result == null)
				result = caseNgcsProperty(ngcsAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NgcsmodelPackage.NGCS_AGGREGATION: {
			NgcsAggregation ngcsAggregation = (NgcsAggregation) theEObject;
			T result = caseNgcsAggregation(ngcsAggregation);
			if (result == null)
				result = caseNgcsArrayProperty(ngcsAggregation);
			if (result == null)
				result = caseNgcsProperty(ngcsAggregation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NgcsmodelPackage.NGCS_REFERENCE: {
			NgcsReference ngcsReference = (NgcsReference) theEObject;
			T result = caseNgcsReference(ngcsReference);
			if (result == null)
				result = caseNgcsSingleProperty(ngcsReference);
			if (result == null)
				result = caseNgcsProperty(ngcsReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NgcsmodelPackage.NGCS_SINGLE_PROPERTY: {
			NgcsSingleProperty ngcsSingleProperty = (NgcsSingleProperty) theEObject;
			T result = caseNgcsSingleProperty(ngcsSingleProperty);
			if (result == null)
				result = caseNgcsProperty(ngcsSingleProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ngcs Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ngcs Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNgcsData(NgcsData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ngcs Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ngcs Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNgcsProject(NgcsProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ngcs Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ngcs Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNgcsModule(NgcsModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ngcs Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ngcs Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNgcsProperty(NgcsProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ngcs Array Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ngcs Array Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNgcsArrayProperty(NgcsArrayProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ngcs Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ngcs Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNgcsAttribute(NgcsAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ngcs Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ngcs Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNgcsAggregation(NgcsAggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ngcs Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ngcs Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNgcsReference(NgcsReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ngcs Single Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ngcs Single Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNgcsSingleProperty(NgcsSingleProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NgcsmodelSwitch
