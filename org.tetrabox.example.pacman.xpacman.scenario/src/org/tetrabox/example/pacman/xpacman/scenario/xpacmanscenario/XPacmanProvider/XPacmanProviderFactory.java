/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.XPacmanProviderPackage
 * @generated
 */
public interface XPacmanProviderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XPacmanProviderFactory eINSTANCE = org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProvider.impl.XPacmanProviderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pacman Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pacman Reference</em>'.
	 * @generated
	 */
	PacmanReference createPacmanReference();

	/**
	 * Returns a new object of class '<em>Pacman Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pacman Query</em>'.
	 * @generated
	 */
	PacmanQuery createPacmanQuery();

	/**
	 * Returns a new object of class '<em>Ghost Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ghost Reference</em>'.
	 * @generated
	 */
	GhostReference createGhostReference();

	/**
	 * Returns a new object of class '<em>Ghost Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ghost Query</em>'.
	 * @generated
	 */
	GhostQuery createGhostQuery();

	/**
	 * Returns a new object of class '<em>Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Reference</em>'.
	 * @generated
	 */
	EntityReference createEntityReference();

	/**
	 * Returns a new object of class '<em>Entity Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Query</em>'.
	 * @generated
	 */
	EntityQuery createEntityQuery();

	/**
	 * Returns a new object of class '<em>Board Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board Reference</em>'.
	 * @generated
	 */
	BoardReference createBoardReference();

	/**
	 * Returns a new object of class '<em>Board Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board Query</em>'.
	 * @generated
	 */
	BoardQuery createBoardQuery();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XPacmanProviderPackage getXPacmanProviderPackage();

} //XPacmanProviderFactory
