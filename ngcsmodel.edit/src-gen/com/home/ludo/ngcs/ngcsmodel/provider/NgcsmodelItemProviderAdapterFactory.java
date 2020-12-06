/**
 */
package com.home.ludo.ngcs.ngcsmodel.provider;

import com.home.ludo.ngcs.ngcsmodel.util.NgcsmodelAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NgcsmodelItemProviderAdapterFactory extends NgcsmodelAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NgcsmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.home.ludo.ngcs.ngcsmodel.NgcsData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NgcsDataItemProvider ngcsDataItemProvider;

	/**
	 * This creates an adapter for a {@link com.home.ludo.ngcs.ngcsmodel.NgcsData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNgcsDataAdapter() {
		if (ngcsDataItemProvider == null) {
			ngcsDataItemProvider = new NgcsDataItemProvider(this);
		}

		return ngcsDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.home.ludo.ngcs.ngcsmodel.NgcsProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NgcsProjectItemProvider ngcsProjectItemProvider;

	/**
	 * This creates an adapter for a {@link com.home.ludo.ngcs.ngcsmodel.NgcsProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNgcsProjectAdapter() {
		if (ngcsProjectItemProvider == null) {
			ngcsProjectItemProvider = new NgcsProjectItemProvider(this);
		}

		return ngcsProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.home.ludo.ngcs.ngcsmodel.NgcsModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NgcsModuleItemProvider ngcsModuleItemProvider;

	/**
	 * This creates an adapter for a {@link com.home.ludo.ngcs.ngcsmodel.NgcsModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNgcsModuleAdapter() {
		if (ngcsModuleItemProvider == null) {
			ngcsModuleItemProvider = new NgcsModuleItemProvider(this);
		}

		return ngcsModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.home.ludo.ngcs.ngcsmodel.NgcsAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NgcsAttributeItemProvider ngcsAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link com.home.ludo.ngcs.ngcsmodel.NgcsAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNgcsAttributeAdapter() {
		if (ngcsAttributeItemProvider == null) {
			ngcsAttributeItemProvider = new NgcsAttributeItemProvider(this);
		}

		return ngcsAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.home.ludo.ngcs.ngcsmodel.NgcsAggregation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NgcsAggregationItemProvider ngcsAggregationItemProvider;

	/**
	 * This creates an adapter for a {@link com.home.ludo.ngcs.ngcsmodel.NgcsAggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNgcsAggregationAdapter() {
		if (ngcsAggregationItemProvider == null) {
			ngcsAggregationItemProvider = new NgcsAggregationItemProvider(this);
		}

		return ngcsAggregationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.home.ludo.ngcs.ngcsmodel.NgcsReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NgcsReferenceItemProvider ngcsReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link com.home.ludo.ngcs.ngcsmodel.NgcsReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNgcsReferenceAdapter() {
		if (ngcsReferenceItemProvider == null) {
			ngcsReferenceItemProvider = new NgcsReferenceItemProvider(this);
		}

		return ngcsReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (ngcsDataItemProvider != null)
			ngcsDataItemProvider.dispose();
		if (ngcsProjectItemProvider != null)
			ngcsProjectItemProvider.dispose();
		if (ngcsModuleItemProvider != null)
			ngcsModuleItemProvider.dispose();
		if (ngcsAttributeItemProvider != null)
			ngcsAttributeItemProvider.dispose();
		if (ngcsAggregationItemProvider != null)
			ngcsAggregationItemProvider.dispose();
		if (ngcsReferenceItemProvider != null)
			ngcsReferenceItemProvider.dispose();
	}

}