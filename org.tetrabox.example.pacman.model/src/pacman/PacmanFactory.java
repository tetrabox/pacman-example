/**
 */
package pacman;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pacman.PacmanPackage
 * @generated
 */
public interface PacmanFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PacmanFactory eINSTANCE = pacman.impl.PacmanFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tile</em>'.
	 * @generated
	 */
	Tile createTile();

	/**
	 * Returns a new object of class '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Board</em>'.
	 * @generated
	 */
	Board createBoard();

	/**
	 * Returns a new object of class '<em>Pacman</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pacman</em>'.
	 * @generated
	 */
	Pacman createPacman();

	/**
	 * Returns a new object of class '<em>Ghost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ghost</em>'.
	 * @generated
	 */
	Ghost createGhost();

	/**
	 * Returns a new object of class '<em>Ghost House Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ghost House Tile</em>'.
	 * @generated
	 */
	GhostHouseTile createGhostHouseTile();

	/**
	 * Returns a new object of class '<em>Wall Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wall Tile</em>'.
	 * @generated
	 */
	WallTile createWallTile();

	/**
	 * Returns a new object of class '<em>Pellet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pellet</em>'.
	 * @generated
	 */
	Pellet createPellet();

	/**
	 * Returns a new object of class '<em>Super Pellet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Super Pellet</em>'.
	 * @generated
	 */
	SuperPellet createSuperPellet();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PacmanPackage getPacmanPackage();

} //PacmanFactory
