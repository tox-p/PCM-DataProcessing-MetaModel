/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.repository.Store;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Store Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristics#getStore <em>Store</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getStoreCharacteristics()
 * @model
 * @generated
 */
public interface StoreCharacteristics extends CharacteristicContainer
{
	/**
	 * Returns the value of the '<em><b>Store</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' reference.
	 * @see #setStore(Store)
	 * @see org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage#getStoreCharacteristics_Store()
	 * @model required="true"
	 * @generated
	 */
	Store getStore();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.StoreCharacteristics#getStore <em>Store</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(Store value);

} // StoreCharacteristics
