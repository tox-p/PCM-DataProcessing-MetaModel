package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DataFilterUtils;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;

public class SelectionDataOperationItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.SelectionDataOperationItemProvider {

	public SelectionDataOperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_SelectionDataOperation_type"), super::getText);
	}

	@Override
	protected void addInputPropertyDescriptor(Object object) {
		super.addInputPropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size()-1);
		ItemPropertyDescriptorWrapper wrapper = new ItemPropertyDescriptorWrapper(originalDescriptor) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				return DataFilterUtils.filterDataBySameBehavior(super.getChoiceOfValues(object), object);
			}
		};
		itemPropertyDescriptors.add(wrapper);
	}

	@Override
	protected void addParameterDataPropertyDescriptor(Object object) {
		super.addParameterDataPropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size()-1);
		ItemPropertyDescriptorWrapper wrapper = new ItemPropertyDescriptorWrapper(originalDescriptor) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				return DataFilterUtils.filterDataBySameBehavior(super.getChoiceOfValues(object), object);
			}
		};
		itemPropertyDescriptors.add(wrapper);
	}

}
