/**
 */
package pacman.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pacman.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pacman.PacmanPackage
 * @generated
 */
public class PacmanAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PacmanPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PacmanAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PacmanPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacmanSwitch<Adapter> modelSwitch =
		new PacmanSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractTile(AbstractTile object) {
				return createAbstractTileAdapter();
			}
			@Override
			public Adapter caseBoard(Board object) {
				return createBoardAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter casePacman(Pacman object) {
				return createPacmanAdapter();
			}
			@Override
			public Adapter caseGhost(Ghost object) {
				return createGhostAdapter();
			}
			@Override
			public Adapter casePassableTile(PassableTile object) {
				return createPassableTileAdapter();
			}
			@Override
			public Adapter caseTile(Tile object) {
				return createTileAdapter();
			}
			@Override
			public Adapter caseGhostHouseTile(GhostHouseTile object) {
				return createGhostHouseTileAdapter();
			}
			@Override
			public Adapter caseWallTile(WallTile object) {
				return createWallTileAdapter();
			}
			@Override
			public Adapter casePellet(Pellet object) {
				return createPelletAdapter();
			}
			@Override
			public Adapter caseSuperPellet(SuperPellet object) {
				return createSuperPelletAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pacman.AbstractTile <em>Abstract Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman.AbstractTile
	 * @generated
	 */
	public Adapter createAbstractTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman.Tile
	 * @generated
	 */
	public Adapter createTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman.Board
	 * @generated
	 */
	public Adapter createBoardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman.Pacman <em>Pacman</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman.Pacman
	 * @generated
	 */
	public Adapter createPacmanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman.Ghost <em>Ghost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman.Ghost
	 * @generated
	 */
	public Adapter createGhostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman.PassableTile <em>Passable Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman.PassableTile
	 * @generated
	 */
	public Adapter createPassableTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman.GhostHouseTile <em>Ghost House Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman.GhostHouseTile
	 * @generated
	 */
	public Adapter createGhostHouseTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman.WallTile <em>Wall Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman.WallTile
	 * @generated
	 */
	public Adapter createWallTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman.Pellet <em>Pellet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman.Pellet
	 * @generated
	 */
	public Adapter createPelletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pacman.SuperPellet <em>Super Pellet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pacman.SuperPellet
	 * @generated
	 */
	public Adapter createSuperPelletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PacmanAdapterFactory
