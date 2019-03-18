/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.DataFactory;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.UtilFactory;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.PerformDataTransmissionOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PerformDataTransmissionOperationItemProvider extends DataOperationItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformDataTransmissionOperationItemProvider(AdapterFactory adapterFactory)
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__INPUT_MAPPINGS);
			childrenFeatures.add(ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_MAPPINGS);
			childrenFeatures.add(ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_DATA);
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
	 * This returns PerformDataTransmissionOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PerformDataTransmissionOperation"));
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
		String label = ((PerformDataTransmissionOperation)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_PerformDataTransmissionOperation_type") :
			getString("_UI_PerformDataTransmissionOperation_type") + " " + label;
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

		switch (notification.getFeatureID(PerformDataTransmissionOperation.class))
		{
			case ProcessingPackage.PERFORM_DATA_TRANSMISSION_OPERATION__INPUT_MAPPINGS:
			case ProcessingPackage.PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_MAPPINGS:
			case ProcessingPackage.PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_DATA:
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
				(ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__INPUT_MAPPINGS,
				 UtilFactory.eINSTANCE.createDataMapping()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_MAPPINGS,
				 UtilFactory.eINSTANCE.createDataMapping()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_DATA,
				 DataFactory.eINSTANCE.createResultBasedData()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_DATA,
				 DataFactory.eINSTANCE.createRefinedResultBasedData()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__INPUT_MAPPINGS ||
			childFeature == ProcessingPackage.Literals.PERFORM_DATA_TRANSMISSION_OPERATION__OUTPUT_MAPPINGS;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
