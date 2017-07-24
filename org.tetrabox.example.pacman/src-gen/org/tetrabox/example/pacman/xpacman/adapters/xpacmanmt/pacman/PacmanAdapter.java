package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Tile;

@SuppressWarnings("all")
public class PacmanAdapter extends EObjectAdapter<Pacman> implements org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman {
  private XPacmanMTAdaptersFactory adaptersFactory;
  
  public PacmanAdapter() {
    super(org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getInitialLives() {
    return adaptee.getInitialLives();
  }
  
  @Override
  public void setInitialLives(final int o) {
    adaptee.setInitialLives(o);
  }
  
  @Override
  public Tile getInitialTile() {
    return (Tile) adaptersFactory.createAdapter(adaptee.getInitialTile(), eResource);
  }
  
  @Override
  public void setInitialTile(final Tile o) {
    if (o != null)
    	adaptee.setInitialTile(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.TileAdapter) o).getAdaptee());
    else adaptee.setInitialTile(null);
  }
  
  @Override
  public void changeDirection(final Integer newDirection) {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.changeDirection(adaptee, newDirection
    );
  }
  
  @Override
  public void down() {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.down(adaptee);
  }
  
  @Override
  public void eatPellet() {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.eatPellet(adaptee);
  }
  
  @Override
  public void enterNextTile() {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.enterNextTile(adaptee);
  }
  
  @Override
  public void initialize() {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.initialize(adaptee);
  }
  
  @Override
  public void kill() {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.kill(adaptee);
  }
  
  @Override
  public void left() {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.left(adaptee);
  }
  
  @Override
  public int getLives() {
    return org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.lives(adaptee);
  }
  
  @Override
  public void setLives(final int lives) {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.lives(adaptee, lives
    );
  }
  
  @Override
  public int getPelletsEaten() {
    return org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.pelletsEaten(adaptee);
  }
  
  @Override
  public void setPelletsEaten(final int pelletsEaten) {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.pelletsEaten(adaptee, pelletsEaten
    );
  }
  
  @Override
  public void right() {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.right(adaptee);
  }
  
  @Override
  public void up() {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.up(adaptee);
  }
  
  @Override
  public Tile getCurrentTile() {
    return (Tile) adaptersFactory.createAdapter(org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.currentTile(adaptee), eResource);
  }
  
  @Override
  public void setCurrentTile(final Tile currentTile) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.currentTile(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.Tile)((EObjectAdapter)currentTile).getAdaptee()
    );
  }
  
  @Override
  public int getDirection() {
    return org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.direction(adaptee);
  }
  
  @Override
  public void setDirection(final int direction) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.direction(adaptee, direction
    );
  }
  
  @Override
  public void modifySpeed(final Integer speed) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.modifySpeed(adaptee, speed
    );
  }
  
  @Override
  public Tile getNextTile() {
    return (Tile) adaptersFactory.createAdapter(org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.nextTile(adaptee), eResource);
  }
  
  @Override
  public void setNextTile(final Tile nextTile) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.nextTile(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.Tile)((EObjectAdapter)nextTile).getAdaptee()
    );
  }
  
  @Override
  public int getSpeed() {
    return org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.speed(adaptee);
  }
  
  @Override
  public void setSpeed(final int speed) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.speed(adaptee, speed
    );
  }
  
  @Override
  public void update(final long deltaTime) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.update(adaptee, deltaTime
    );
  }
  
  protected final static int SPEED_EDEFAULT = 0;
  
  protected final static int DIRECTION_EDEFAULT = 0;
  
  protected final static int INITIAL_LIVES_EDEFAULT = 0;
  
  protected final static int PELLETS_EATEN_EDEFAULT = 0;
  
  protected final static int LIVES_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.eINSTANCE.getPacman();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__INITIAL_TILE:
    		return getInitialTile();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__SPEED:
    		return new java.lang.Integer(getSpeed());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__DIRECTION:
    		return new java.lang.Integer(getDirection());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__CURRENT_TILE:
    		return getCurrentTile();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__NEXT_TILE:
    		return getNextTile();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__INITIAL_LIVES:
    		return new java.lang.Integer(getInitialLives());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__PELLETS_EATEN:
    		return new java.lang.Integer(getPelletsEaten());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__LIVES:
    		return new java.lang.Integer(getLives());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__INITIAL_TILE:
    		return getInitialTile() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__SPEED:
    		return getSpeed() != SPEED_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__DIRECTION:
    		return getDirection() != DIRECTION_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__CURRENT_TILE:
    		return getCurrentTile() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__NEXT_TILE:
    		return getNextTile() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__INITIAL_LIVES:
    		return getInitialLives() != INITIAL_LIVES_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__PELLETS_EATEN:
    		return getPelletsEaten() != PELLETS_EATEN_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__LIVES:
    		return getLives() != LIVES_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__INITIAL_TILE:
    		setInitialTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Tile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__SPEED:
    		setSpeed(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__DIRECTION:
    		setDirection(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__CURRENT_TILE:
    		setCurrentTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Tile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__NEXT_TILE:
    		setNextTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Tile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__INITIAL_LIVES:
    		setInitialLives(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__PELLETS_EATEN:
    		setPelletsEaten(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__LIVES:
    		setLives(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
