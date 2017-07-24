/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioPackage
 * @generated
 */
public interface XPacmanScenarioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XPacmanScenarioFactory eINSTANCE = org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.impl.XPacmanScenarioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XPacman Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XPacman Scenario</em>'.
	 * @generated
	 */
	XPacmanScenario createXPacmanScenario();

	/**
	 * Returns a new object of class '<em>XPacman Event Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XPacman Event Occurrence</em>'.
	 * @generated
	 */
	XPacmanEventOccurrence createXPacmanEventOccurrence();

	/**
	 * Returns a new object of class '<em>FSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM</em>'.
	 * @generated
	 */
	XPacmanScenarioFSM createXPacmanScenarioFSM();

	/**
	 * Returns a new object of class '<em>FSM State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM State</em>'.
	 * @generated
	 */
	XPacmanScenarioFSMState createXPacmanScenarioFSMState();

	/**
	 * Returns a new object of class '<em>FSM Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Transition</em>'.
	 * @generated
	 */
	XPacmanScenarioFSMTransition createXPacmanScenarioFSMTransition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XPacmanScenarioPackage getXPacmanScenarioPackage();

} //XPacmanScenarioFactory
