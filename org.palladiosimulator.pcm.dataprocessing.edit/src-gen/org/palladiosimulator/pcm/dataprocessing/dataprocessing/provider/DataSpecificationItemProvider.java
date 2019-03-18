/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.cdo.edit.CDOItemProviderAdapter;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataprocessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsFactory;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationFactory;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.EffectspecificationPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingFactory;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.RepositoryFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.DataSpecification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSpecificationItemProvider 
	extends CDOItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSpecificationItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addProcessingEffectsPropertyDescriptor(object);
			addExternalDataProcessingEffectsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Processing Effects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProcessingEffectsPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcessingEffectProvider_processingEffects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcessingEffectProvider_processingEffects_feature", "_UI_ProcessingEffectProvider_type"),
				 EffectspecificationPackage.Literals.PROCESSING_EFFECT_PROVIDER__PROCESSING_EFFECTS,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Data Processing Effects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalDataProcessingEffectsPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DataSpecification_externalDataProcessingEffects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DataSpecification_externalDataProcessingEffects_feature", "_UI_DataSpecification_type"),
				 DataprocessingPackage.Literals.DATA_SPECIFICATION__EXTERNAL_DATA_PROCESSING_EFFECTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(DataprocessingPackage.Literals.DATA_SPECIFICATION__DATA_PROCESSING_CONTAINERS);
			childrenFeatures.add(DataprocessingPackage.Literals.DATA_SPECIFICATION__CHARACTERISTIC_TYPE_CONTAINERS);
			childrenFeatures.add(DataprocessingPackage.Literals.DATA_SPECIFICATION__STORE_CONTAINERS);
			childrenFeatures.add(DataprocessingPackage.Literals.DATA_SPECIFICATION__CHARACTERISTIC_CONTAINER);
			childrenFeatures.add(DataprocessingPackage.Literals.DATA_SPECIFICATION__RELATED_CHARACTERISTICS);
			childrenFeatures.add(DataprocessingPackage.Literals.DATA_SPECIFICATION__OPERATION_SIGNATURE_DATA_REFINEMENT);
			childrenFeatures.add(DataprocessingPackage.Literals.DATA_SPECIFICATION__STORE_CHARACTERISTIC_CONTAINERS);
			childrenFeatures.add(DataprocessingPackage.Literals.DATA_SPECIFICATION__EXTENSIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DataSpecification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataSpecification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return getString("_UI_DataSpecification_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(DataSpecification.class))
		{
			case DataprocessingPackage.DATA_SPECIFICATION__DATA_PROCESSING_CONTAINERS:
			case DataprocessingPackage.DATA_SPECIFICATION__CHARACTERISTIC_TYPE_CONTAINERS:
			case DataprocessingPackage.DATA_SPECIFICATION__STORE_CONTAINERS:
			case DataprocessingPackage.DATA_SPECIFICATION__CHARACTERISTIC_CONTAINER:
			case DataprocessingPackage.DATA_SPECIFICATION__RELATED_CHARACTERISTICS:
			case DataprocessingPackage.DATA_SPECIFICATION__OPERATION_SIGNATURE_DATA_REFINEMENT:
			case DataprocessingPackage.DATA_SPECIFICATION__STORE_CHARACTERISTIC_CONTAINERS:
			case DataprocessingPackage.DATA_SPECIFICATION__EXTENSIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DataprocessingPackage.Literals.DATA_SPECIFICATION__DATA_PROCESSING_CONTAINERS,
				 ProcessingFactory.eINSTANCE.createDataProcessingContainer()));

		newChildDescriptors.add
			(createChildParameter
				(DataprocessingPackage.Literals.DATA_SPECIFICATION__CHARACTERISTIC_TYPE_CONTAINERS,
				 CharacteristicsFactory.eINSTANCE.createCharacteristicTypeContainer()));

		newChildDescriptors.add
			(createChildParameter
				(DataprocessingPackage.Literals.DATA_SPECIFICATION__STORE_CONTAINERS,
				 RepositoryFactory.eINSTANCE.createStoreContainer()));

		newChildDescriptors.add
			(createChildParameter
				(DataprocessingPackage.Literals.DATA_SPECIFICATION__CHARACTERISTIC_CONTAINER,
				 CharacteristicsFactory.eINSTANCE.createCharacteristicContainer()));

		newChildDescriptors.add
			(createChildParameter
				(DataprocessingPackage.Literals.DATA_SPECIFICATION__CHARACTERISTIC_CONTAINER,
				 CharacteristicsFactory.eINSTANCE.createStoreCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(DataprocessingPackage.Literals.DATA_SPECIFICATION__RELATED_CHARACTERISTICS,
				 CharacteristicsFactory.eINSTANCE.createRelatedCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(DataprocessingPackage.Literals.DATA_SPECIFICATION__OPERATION_SIGNATURE_DATA_REFINEMENT,
				 RepositoryFactory.eINSTANCE.createOperationSignatureDataRefinement()));

		newChildDescriptors.add
			(createChildParameter
				(DataprocessingPackage.Literals.DATA_SPECIFICATION__STORE_CHARACTERISTIC_CONTAINERS,
				 CharacteristicsFactory.eINSTANCE.createStoreCharacteristicContainer()));

		newChildDescriptors.add
			(createChildParameter
				(DataprocessingPackage.Literals.DATA_SPECIFICATION__EXTENSIONS,
				 EffectspecificationFactory.eINSTANCE.createProcessingEffectSpecification()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
