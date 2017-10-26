/**
 */
package org.tetrabox.example.pacman.xpacman.event.pacmanevent;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmaneventPackage
 * @generated
 */
public interface PacmaneventFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmaneventFactory eINSTANCE = org.tetrabox.example.pacman.xpacman.event.pacmanevent.impl.PacmaneventFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pacman Left Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pacman Left Event</em>'.
	 * @generated
	 */
	PacmanLeftEvent createPacmanLeftEvent();

	/**
	 * Returns a new object of class '<em>Pacman Down Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pacman Down Event</em>'.
	 * @generated
	 */
	PacmanDownEvent createPacmanDownEvent();

	/**
	 * Returns a new object of class '<em>Pacman Up Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pacman Up Event</em>'.
	 * @generated
	 */
	PacmanUpEvent createPacmanUpEvent();

	/**
	 * Returns a new object of class '<em>Pacman Right Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pacman Right Event</em>'.
	 * @generated
	 */
	PacmanRightEvent createPacmanRightEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PacmaneventPackage getPacmaneventPackage();

} //PacmaneventFactory
