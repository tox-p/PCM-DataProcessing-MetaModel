/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characteristic;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.CharacteristicsPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.characteristics.Characterizable;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.effectspecification.ProcessingEffectProvider;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataOperation;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.DataProcessingContainer;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataOperationImpl#getCharacteristicContainers <em>Characteristic Containers</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataOperationImpl#getCharacteristics <em>Characteristics</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataOperationImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataOperationImpl#getIncomingData <em>Incoming Data</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataOperationImpl#getProcessingEffectProvider <em>Processing Effect Provider</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.DataOperationImpl#getOutgoingData <em>Outgoing Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataOperationImpl extends EntityImpl implements DataOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataOperationImpl()
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
		return ProcessingPackage.Literals.DATA_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CharacteristicContainer> getCharacteristicContainers()
	{
		return (EList<CharacteristicContainer>)eGet(CharacteristicsPackage.Literals.CHARACTERIZABLE__CHARACTERISTIC_CONTAINERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Characteristic> getCharacteristics()
	{
		return (EList<Characteristic>)eGet(CharacteristicsPackage.Literals.CHARACTERIZABLE__CHARACTERISTICS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcessingContainer getContainer()
	{
		return (DataProcessingContainer)eGet(ProcessingPackage.Literals.DATA_OPERATION__CONTAINER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(DataProcessingContainer newContainer)
	{
		eSet(ProcessingPackage.Literals.DATA_OPERATION__CONTAINER, newContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Data> getIncomingData()
	{
		return (EList<Data>)eGet(ProcessingPackage.Literals.DATA_OPERATION__INCOMING_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingEffectProvider getProcessingEffectProvider()
	{
		return (ProcessingEffectProvider)eGet(ProcessingPackage.Literals.DATA_OPERATION__PROCESSING_EFFECT_PROVIDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Data> getOutgoingData()
	{
		return (EList<Data>)eGet(ProcessingPackage.Literals.DATA_OPERATION__OUTGOING_DATA, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #determineIncomingData() <em>Determine Incoming Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineIncomingData()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_INCOMING_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)ProcessingPackage.Literals.DATA_OPERATION.getEOperations().get(0)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Data> determineIncomingData()
	{
		try
		{
			return (EList<Data>)DETERMINE_INCOMING_DATA__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #determineOutgoingData() <em>Determine Outgoing Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineOutgoingData()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_OUTGOING_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)ProcessingPackage.Literals.DATA_OPERATION.getEOperations().get(1)).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Data> determineOutgoingData()
	{
		try
		{
			return (EList<Data>)DETERMINE_OUTGOING_DATA__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite)
		{
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == Characterizable.class)
		{
			switch (derivedFeatureID)
			{
				case ProcessingPackage.DATA_OPERATION__CHARACTERISTIC_CONTAINERS: return CharacteristicsPackage.CHARACTERIZABLE__CHARACTERISTIC_CONTAINERS;
				case ProcessingPackage.DATA_OPERATION__CHARACTERISTICS: return CharacteristicsPackage.CHARACTERIZABLE__CHARACTERISTICS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == Characterizable.class)
		{
			switch (baseFeatureID)
			{
				case CharacteristicsPackage.CHARACTERIZABLE__CHARACTERISTIC_CONTAINERS: return ProcessingPackage.DATA_OPERATION__CHARACTERISTIC_CONTAINERS;
				case CharacteristicsPackage.CHARACTERIZABLE__CHARACTERISTICS: return ProcessingPackage.DATA_OPERATION__CHARACTERISTICS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DataOperationImpl
