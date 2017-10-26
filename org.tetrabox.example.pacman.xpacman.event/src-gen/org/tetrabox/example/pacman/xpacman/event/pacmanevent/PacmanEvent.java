/**
 */
package org.tetrabox.example.pacman.xpacman.event.pacmanevent;

import org.tetrabox.example.pacman.xpacman.pacman.Pacman;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pacman Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanEvent#getPacman <em>Pacman</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmaneventPackage#getPacmanEvent()
 * @model abstract="true"
 * @generated
 */
public interface PacmanEvent extends PacmanDSLEvent {
	/**
	 * Returns the value of the '<em><b>Pacman</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pacman</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pacman</em>' reference.
	 * @see #setPacman(Pacman)
	 * @see org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmaneventPackage#getPacmanEvent_Pacman()
	 * @model required="true"
	 * @generated
	 */
	Pacman getPacman();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.pacman.xpacman.event.pacmanevent.PacmanEvent#getPacman <em>Pacman</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pacman</em>' reference.
	 * @see #getPacman()
	 * @generated
	 */
	void setPacman(Pacman value);

} // PacmanEvent
