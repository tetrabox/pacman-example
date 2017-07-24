/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ScenarioFSMImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanEvent.XPacmanEvent;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanProperty;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioFSM;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioFSMState;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioFSMTransition;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanScenario.XPacmanScenarioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XPacmanScenarioFSMImpl extends ScenarioFSMImpl<XPacmanProperty, XPacmanEvent<?>, XPacmanScenarioFSMState, XPacmanScenarioFSMTransition> implements XPacmanScenarioFSM {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPacmanScenarioFSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanScenarioPackage.Literals.XPACMAN_SCENARIO_FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XPacmanScenarioFSMState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<XPacmanScenarioFSMState>(XPacmanScenarioFSMState.class, this, XPacmanScenarioPackage.XPACMAN_SCENARIO_FSM__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInitialState(XPacmanScenarioFSMState newInitialState) {
		super.setInitialState(newInitialState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XPacmanScenarioFSMState> getAcceptingStates() {
		if (acceptingStates == null) {
			acceptingStates = new EObjectResolvingEList<XPacmanScenarioFSMState>(XPacmanScenarioFSMState.class, this, XPacmanScenarioPackage.XPACMAN_SCENARIO_FSM__ACCEPTING_STATES);
		}
		return acceptingStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XPacmanScenarioFSMTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<XPacmanScenarioFSMTransition>(XPacmanScenarioFSMTransition.class, this, XPacmanScenarioPackage.XPACMAN_SCENARIO_FSM__TRANSITIONS);
		}
		return transitions;
	}

} //XPacmanScenarioFSMImpl
