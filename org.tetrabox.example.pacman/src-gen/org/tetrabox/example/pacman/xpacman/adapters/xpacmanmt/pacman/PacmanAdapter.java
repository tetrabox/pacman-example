package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile;

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
  public PassableTile getInitialTile() {
    return (PassableTile) adaptersFactory.createAdapter(adaptee.getInitialTile(), eResource);
  }
  
  @Override
  public void setInitialTile(final PassableTile o) {
    if (o != null)
    	adaptee.setInitialTile(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.PassableTileAdapter) o).getAdaptee());
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
  public void eat() {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.eat(adaptee);
  }
  
  @Override
  public void energize() {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.energize(adaptee);
  }
  
  @Override
  public void enterNextTile(final int x, final int y) {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.enterNextTile(adaptee, x
    , y
    );
  }
  
  @Override
  public void initialize() {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.initialize(adaptee);
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
  public void update(final long deltaTime) {
    org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.update(adaptee, deltaTime
    );
  }
  
  @Override
  public PassableTile getCurrentTile() {
    return (PassableTile) adaptersFactory.createAdapter(org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.currentTile(adaptee), eResource);
  }
  
  @Override
  public void setCurrentTile(final PassableTile currentTile) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.currentTile(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.PassableTile)((EObjectAdapter)currentTile).getAdaptee()
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
  public void reset() {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.reset(adaptee);
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
  public int getXMoveProgress() {
    return org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.xMoveProgress(adaptee);
  }
  
  @Override
  public void setXMoveProgress(final int xMoveProgress) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.xMoveProgress(adaptee, xMoveProgress
    );
  }
  
  @Override
  public int getYMoveProgress() {
    return org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.yMoveProgress(adaptee);
  }
  
  @Override
  public void setYMoveProgress(final int yMoveProgress) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.yMoveProgress(adaptee, yMoveProgress
    );
  }
  
  protected final static int SPEED_EDEFAULT = 0;
  
  protected final static int DIRECTION_EDEFAULT = 0;
  
  protected final static int XMOVE_PROGRESS_EDEFAULT = 0;
  
  protected final static int YMOVE_PROGRESS_EDEFAULT = 0;
  
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
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__XMOVE_PROGRESS:
    		return new java.lang.Integer(getXMoveProgress());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__YMOVE_PROGRESS:
    		return new java.lang.Integer(getYMoveProgress());
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
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__XMOVE_PROGRESS:
    		return getXMoveProgress() != XMOVE_PROGRESS_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__YMOVE_PROGRESS:
    		return getYMoveProgress() != YMOVE_PROGRESS_EDEFAULT;
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
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile)
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
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__XMOVE_PROGRESS:
    		setXMoveProgress(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.PACMAN__YMOVE_PROGRESS:
    		setYMoveProgress(((java.lang.Integer) newValue).intValue());
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
