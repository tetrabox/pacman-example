/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl;

import fr.inria.diverse.event.commons.model.scenario.impl.ArbiterImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiter;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterPackage;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterState;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterTransition;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPacman Arbiter</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XPacmanArbiterImpl extends ArbiterImpl<XPacmanProperty, XPacmanArbiterState, XPacmanArbiterTransition> implements XPacmanArbiter {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPacmanArbiterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanArbiterPackage.Literals.XPACMAN_ARBITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XPacmanArbiterState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<XPacmanArbiterState>(XPacmanArbiterState.class, this, XPacmanArbiterPackage.XPACMAN_ARBITER__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XPacmanArbiterTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<XPacmanArbiterTransition>(XPacmanArbiterTransition.class, this, XPacmanArbiterPackage.XPACMAN_ARBITER__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setInitialState(XPacmanArbiterState newInitialState) {
		super.setInitialState(newInitialState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XPacmanArbiterState> getAcceptingStates() {
		if (acceptingStates == null) {
			acceptingStates = new EObjectResolvingEList<XPacmanArbiterState>(XPacmanArbiterState.class, this, XPacmanArbiterPackage.XPACMAN_ARBITER__ACCEPTING_STATES);
		}
		return acceptingStates;
	}

} //XPacmanArbiterImpl
