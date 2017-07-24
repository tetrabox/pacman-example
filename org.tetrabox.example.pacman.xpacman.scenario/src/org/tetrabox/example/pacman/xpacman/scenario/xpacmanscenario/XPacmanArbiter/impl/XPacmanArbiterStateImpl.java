/**
 */
package org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.impl;

import fr.inria.diverse.event.commons.model.scenario.ArbiterTransition;
import fr.inria.diverse.event.commons.model.scenario.ScenarioPackage;

import fr.inria.diverse.event.commons.model.scenario.impl.ArbiterStateImpl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterPackage;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterState;
import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanArbiter.XPacmanArbiterTransition;

import org.tetrabox.example.pacman.xpacman.scenario.xpacmanscenario.XPacmanProperty.XPacmanProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class XPacmanArbiterStateImpl extends ArbiterStateImpl<XPacmanProperty, XPacmanArbiterTransition> implements XPacmanArbiterState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPacmanArbiterStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XPacmanArbiterPackage.Literals.XPACMAN_ARBITER_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XPacmanArbiterTransition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<XPacmanArbiterTransition>(XPacmanArbiterTransition.class, this, XPacmanArbiterPackage.XPACMAN_ARBITER_STATE__INCOMING_TRANSITIONS, ScenarioPackage.ARBITER_TRANSITION__TARGET) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ArbiterTransition.class; } };
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<XPacmanArbiterTransition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<XPacmanArbiterTransition>(XPacmanArbiterTransition.class, this, XPacmanArbiterPackage.XPACMAN_ARBITER_STATE__OUTGOING_TRANSITIONS, ScenarioPackage.ARBITER_TRANSITION__SOURCE) { private static final long serialVersionUID = 1L; @Override public Class<?> getInverseFeatureClass() { return ArbiterTransition.class; } };
		}
		return outgoingTransitions;
	}

} //XPacmanArbiterStateImpl
