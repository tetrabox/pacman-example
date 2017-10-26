/**
 */
package org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.tetrabox.example.pacman.xpacman.event.pacmanevent.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PacmaneventFactoryImpl extends EFactoryImpl implements PacmaneventFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PacmaneventFactory init() {
		try {
			PacmaneventFactory thePacmaneventFactory = (PacmaneventFactory)EPackage.Registry.INSTANCE.getEFactory(PacmaneventPackage.eNS_URI);
			if (thePacmaneventFactory != null) {
				return thePacmaneventFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PacmaneventFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmaneventFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PacmaneventPackage.PACMAN_LEFT_EVENT: return createPacmanLeftEvent();
			case PacmaneventPackage.PACMAN_DOWN_EVENT: return createPacmanDownEvent();
			case PacmaneventPackage.PACMAN_UP_EVENT: return createPacmanUpEvent();
			case PacmaneventPackage.PACMAN_RIGHT_EVENT: return createPacmanRightEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanLeftEvent createPacmanLeftEvent() {
		PacmanLeftEventImpl pacmanLeftEvent = new PacmanLeftEventImpl();
		return pacmanLeftEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanDownEvent createPacmanDownEvent() {
		PacmanDownEventImpl pacmanDownEvent = new PacmanDownEventImpl();
		return pacmanDownEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanUpEvent createPacmanUpEvent() {
		PacmanUpEventImpl pacmanUpEvent = new PacmanUpEventImpl();
		return pacmanUpEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanRightEvent createPacmanRightEvent() {
		PacmanRightEventImpl pacmanRightEvent = new PacmanRightEventImpl();
		return pacmanRightEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmaneventPackage getPacmaneventPackage() {
		return (PacmaneventPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PacmaneventPackage getPackage() {
		return PacmaneventPackage.eINSTANCE;
	}

} //PacmaneventFactoryImpl
