/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.provider;

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

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.util.CharacteristicsAdapterFactory;

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
public class CharacteristicsItemProviderAdapterFactory extends CharacteristicsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(DataprocessingEditPlugin.INSTANCE, CharacteristicsPackage.eNS_URI);

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
	public CharacteristicsItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicTypeContainerItemProvider characteristicTypeContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicTypeContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacteristicTypeContainerAdapter()
	{
		if (characteristicTypeContainerItemProvider == null)
		{
			characteristicTypeContainerItemProvider = new CharacteristicTypeContainerItemProvider(this);
		}

		return characteristicTypeContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumCharacteristicTypeItemProvider enumCharacteristicTypeItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumCharacteristicTypeAdapter()
	{
		if (enumCharacteristicTypeItemProvider == null)
		{
			enumCharacteristicTypeItemProvider = new EnumCharacteristicTypeItemProvider(this);
		}

		return enumCharacteristicTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumCharacteristicLiteralItemProvider enumCharacteristicLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristicLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumCharacteristicLiteralAdapter()
	{
		if (enumCharacteristicLiteralItemProvider == null)
		{
			enumCharacteristicLiteralItemProvider = new EnumCharacteristicLiteralItemProvider(this);
		}

		return enumCharacteristicLiteralItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicContainerItemProvider characteristicContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacteristicContainerAdapter()
	{
		if (characteristicContainerItemProvider == null)
		{
			characteristicContainerItemProvider = new CharacteristicContainerItemProvider(this);
		}

		return characteristicContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristic} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumCharacteristicItemProvider enumCharacteristicItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.EnumCharacteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumCharacteristicAdapter()
	{
		if (enumCharacteristicItemProvider == null)
		{
			enumCharacteristicItemProvider = new EnumCharacteristicItemProvider(this);
		}

		return enumCharacteristicItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Enumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemProvider enumerationItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumerationAdapter()
	{
		if (enumerationItemProvider == null)
		{
			enumerationItemProvider = new EnumerationItemProvider(this);
		}

		return enumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelatedCharacteristicsItemProvider relatedCharacteristicsItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.RelatedCharacteristics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelatedCharacteristicsAdapter()
	{
		if (relatedCharacteristicsItemProvider == null)
		{
			relatedCharacteristicsItemProvider = new RelatedCharacteristicsItemProvider(this);
		}

		return relatedCharacteristicsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristicContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreCharacteristicContainerItemProvider storeCharacteristicContainerItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristicContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoreCharacteristicContainerAdapter()
	{
		if (storeCharacteristicContainerItemProvider == null)
		{
			storeCharacteristicContainerItemProvider = new StoreCharacteristicContainerItemProvider(this);
		}

		return storeCharacteristicContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristics} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreCharacteristicsItemProvider storeCharacteristicsItemProvider;

	/**
	 * This creates an adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStoreCharacteristicsAdapter()
	{
		if (storeCharacteristicsItemProvider == null)
		{
			storeCharacteristicsItemProvider = new StoreCharacteristicsItemProvider(this);
		}

		return storeCharacteristicsItemProvider;
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
		if (characteristicTypeContainerItemProvider != null) characteristicTypeContainerItemProvider.dispose();
		if (enumCharacteristicTypeItemProvider != null) enumCharacteristicTypeItemProvider.dispose();
		if (enumCharacteristicLiteralItemProvider != null) enumCharacteristicLiteralItemProvider.dispose();
		if (characteristicContainerItemProvider != null) characteristicContainerItemProvider.dispose();
		if (enumCharacteristicItemProvider != null) enumCharacteristicItemProvider.dispose();
		if (enumerationItemProvider != null) enumerationItemProvider.dispose();
		if (relatedCharacteristicsItemProvider != null) relatedCharacteristicsItemProvider.dispose();
		if (storeCharacteristicContainerItemProvider != null) storeCharacteristicContainerItemProvider.dispose();
		if (storeCharacteristicsItemProvider != null) storeCharacteristicsItemProvider.dispose();
	}

}
