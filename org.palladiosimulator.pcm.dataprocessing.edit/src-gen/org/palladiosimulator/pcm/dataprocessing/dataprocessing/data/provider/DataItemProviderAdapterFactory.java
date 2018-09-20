/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.provider;

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

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.util.DataAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataItemProviderAdapterFactory extends DataAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
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
	public DataItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.OriginalData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OriginalDataItemProvider originalDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.OriginalData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOriginalDataAdapter()
	{
		if (originalDataItemProvider == null)
		{
			originalDataItemProvider = new OriginalDataItemProvider(this);
		}

		return originalDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBasedDataItemProvider parameterBasedDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ParameterBasedData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParameterBasedDataAdapter()
	{
		if (parameterBasedDataItemProvider == null)
		{
			parameterBasedDataItemProvider = new ParameterBasedDataItemProvider(this);
		}

		return parameterBasedDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultBasedDataItemProvider resultBasedDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.ResultBasedData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResultBasedDataAdapter()
	{
		if (resultBasedDataItemProvider == null)
		{
			resultBasedDataItemProvider = new ResultBasedDataItemProvider(this);
		}

		return resultBasedDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedDataItemProvider derivedDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DerivedData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDerivedDataAdapter()
	{
		if (derivedDataItemProvider == null)
		{
			derivedDataItemProvider = new DerivedDataItemProvider(this);
		}

		return derivedDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedResultBasedData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinedResultBasedDataItemProvider refinedResultBasedDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedResultBasedData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRefinedResultBasedDataAdapter()
	{
		if (refinedResultBasedDataItemProvider == null)
		{
			refinedResultBasedDataItemProvider = new RefinedResultBasedDataItemProvider(this);
		}

		return refinedResultBasedDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedParameterBasedData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinedParameterBasedDataItemProvider refinedParameterBasedDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.RefinedParameterBasedData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRefinedParameterBasedDataAdapter()
	{
		if (refinedParameterBasedDataItemProvider == null)
		{
			refinedParameterBasedDataItemProvider = new RefinedParameterBasedDataItemProvider(this);
		}

		return refinedParameterBasedDataItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.CopiedData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopiedDataItemProvider copiedDataItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.CopiedData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCopiedDataAdapter()
	{
		if (copiedDataItemProvider == null)
		{
			copiedDataItemProvider = new CopiedDataItemProvider(this);
		}

		return copiedDataItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
			{
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
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null)
		{
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose()
	{
		if (originalDataItemProvider != null) originalDataItemProvider.dispose();
		if (parameterBasedDataItemProvider != null) parameterBasedDataItemProvider.dispose();
		if (resultBasedDataItemProvider != null) resultBasedDataItemProvider.dispose();
		if (derivedDataItemProvider != null) derivedDataItemProvider.dispose();
		if (refinedResultBasedDataItemProvider != null) refinedResultBasedDataItemProvider.dispose();
		if (refinedParameterBasedDataItemProvider != null) refinedParameterBasedDataItemProvider.dispose();
		if (copiedDataItemProvider != null) copiedDataItemProvider.dispose();
	}

}
