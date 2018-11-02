/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.util.EffectspecificationAdapterFactory;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.provider.DataprocessingEditPlugin;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EffectspecificationItemProviderAdapterFactory extends EffectspecificationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
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
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(DataprocessingEditPlugin.INSTANCE, EffectspecificationPackage.eNS_URI);

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
	public EffectspecificationItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingEffectSpecificationItemProvider processingEffectSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessingEffectSpecificationAdapter()
	{
		if (processingEffectSpecificationItemProvider == null)
		{
			processingEffectSpecificationItemProvider = new ProcessingEffectSpecificationItemProvider(this);
		}

		return processingEffectSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessingEffectOperationTypeItemProvider processingEffectOperationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectOperationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessingEffectOperationTypeAdapter()
	{
		if (processingEffectOperationTypeItemProvider == null)
		{
			processingEffectOperationTypeItemProvider = new ProcessingEffectOperationTypeItemProvider(this);
		}

		return processingEffectOperationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.OperationTypeDataProcessingEffect} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationTypeDataProcessingEffectItemProvider operationTypeDataProcessingEffectItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.OperationTypeDataProcessingEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationTypeDataProcessingEffectAdapter()
	{
		if (operationTypeDataProcessingEffectItemProvider == null)
		{
			operationTypeDataProcessingEffectItemProvider = new OperationTypeDataProcessingEffectItemProvider(this);
		}

		return operationTypeDataProcessingEffectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DataCreationProcessingEffect} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataCreationProcessingEffectItemProvider dataCreationProcessingEffectItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DataCreationProcessingEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataCreationProcessingEffectAdapter()
	{
		if (dataCreationProcessingEffectItemProvider == null)
		{
			dataCreationProcessingEffectItemProvider = new DataCreationProcessingEffectItemProvider(this);
		}

		return dataCreationProcessingEffectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicChangeItemProvider characteristicChangeItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.CharacteristicChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacteristicChangeAdapter()
	{
		if (characteristicChangeItemProvider == null)
		{
			characteristicChangeItemProvider = new CharacteristicChangeItemProvider(this);
		}

		return characteristicChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DirectCharacteristic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DirectCharacteristicItemProvider directCharacteristicItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.DirectCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDirectCharacteristicAdapter()
	{
		if (directCharacteristicItemProvider == null)
		{
			directCharacteristicItemProvider = new DirectCharacteristicItemProvider(this);
		}

		return directCharacteristicItemProvider;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders()
	{
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain)
	{
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator()
	{
		return childCreationExtenderManager;
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
		if (processingEffectSpecificationItemProvider != null) processingEffectSpecificationItemProvider.dispose();
		if (processingEffectOperationTypeItemProvider != null) processingEffectOperationTypeItemProvider.dispose();
		if (operationTypeDataProcessingEffectItemProvider != null) operationTypeDataProcessingEffectItemProvider.dispose();
		if (dataCreationProcessingEffectItemProvider != null) dataCreationProcessingEffectItemProvider.dispose();
		if (characteristicChangeItemProvider != null) characteristicChangeItemProvider.dispose();
		if (directCharacteristicItemProvider != null) directCharacteristicItemProvider.dispose();
	}

}