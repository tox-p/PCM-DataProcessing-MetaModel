/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.ecore.EClass;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicType;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.impl.CharacteristicImpl#getCharacteristicType <em>Characteristic Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CharacteristicImpl extends IdentifierImpl implements Characteristic
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return CharacteristicsPackage.Literals.CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacteristicType getCharacteristicType()
	{
		return (CharacteristicType)eGet(CharacteristicsPackage.Literals.CHARACTERISTIC__CHARACTERISTIC_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristicType(CharacteristicType newCharacteristicType)
	{
		eSet(CharacteristicsPackage.Literals.CHARACTERISTIC__CHARACTERISTIC_TYPE, newCharacteristicType);
	}

} //CharacteristicImpl
