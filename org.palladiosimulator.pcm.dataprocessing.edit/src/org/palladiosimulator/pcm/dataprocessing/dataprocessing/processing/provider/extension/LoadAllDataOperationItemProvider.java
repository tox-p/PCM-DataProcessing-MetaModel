package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.extension;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.DefaultLabelProvider;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.util.ItemPropertyDescriptorWrapper;

public class LoadAllDataOperationItemProvider extends
		org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.provider.LoadAllDataOperationItemProvider {

	public LoadAllDataOperationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	public String getText(Object object) {
		return DefaultLabelProvider.getLabel(object, getString("_UI_LoadAllDataOperation_type"), super::getText);
	}

	@Override
	protected void addStorePropertyDescriptor(Object object) {
		super.addStorePropertyDescriptor(object);
		IItemPropertyDescriptor originalDescriptor = itemPropertyDescriptors.remove(itemPropertyDescriptors.size() - 1);
		ItemPropertyDescriptorWrapper wrapper = new ItemPropertyDescriptorWrapper(originalDescriptor) {
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				if (!(object instanceof EObject)) {
					return super.getChoiceOfValues(object);
				}
				return LoadDataOperationItemProvider.filterChoiceOfStores(super.getChoiceOfValues(object), object);
			}
		};
		itemPropertyDescriptors.add(wrapper);
	}

}
