/**
 */
package org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.data.Data;

import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.ProcessingPackage;
import org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.TransformDataOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Data Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.palladiosimulator.pcm.dataprocessing.dataprocessing.processing.impl.TransformDataOperationImpl#getParameterData <em>Parameter Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransformDataOperationImpl extends DataOperationImpl implements TransformDataOperation
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformDataOperationImpl()
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
		return ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getInput()
	{
		return (Data)eGet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__INPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(Data newInput)
	{
		eSet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getOutput()
	{
		return (Data)eGet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__OUTPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Data newOutput)
	{
		eSet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__OUTPUT, newOutput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Data> getParameterData()
	{
		return (EList<Data>)eGet(ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION__PARAMETER_DATA, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #determineIncomingData() <em>Determine Incoming Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #determineIncomingData()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_INCOMING_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION.getEOperations().get(0)).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate DETERMINE_OUTGOING_DATA__EINVOCATION_DELEGATE = ((EOperation.Internal)ProcessingPackage.Literals.TRANSFORM_DATA_OPERATION.getEOperations().get(1)).getInvocationDelegate();

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

} //TransformDataOperationImpl
