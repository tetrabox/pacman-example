package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile;

@SuppressWarnings("all")
public class EntityAdapter extends EObjectAdapter<Entity> implements org.tetrabox.example.pacman.xpacmanmt.pacman.Entity {
  private XPacmanMTAdaptersFactory adaptersFactory;
  
  public EntityAdapter() {
    super(org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance();
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
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.changeDirection(adaptee, newDirection
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
  public void enterNextTile() {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.enterNextTile(adaptee);
  }
  
  @Override
  public void initialize() {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.initialize(adaptee);
  }
  
  @Override
  public void modifySpeed(final Integer speed) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.modifySpeed(adaptee, speed
    );
  }
  
  @Override
  public PassableTile getNextTile() {
    return (PassableTile) adaptersFactory.createAdapter(org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.nextTile(adaptee), eResource);
  }
  
  @Override
  public void setNextTile(final PassableTile nextTile) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.nextTile(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.PassableTile)((EObjectAdapter)nextTile).getAdaptee()
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
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.eINSTANCE.getEntity();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__INITIAL_TILE:
    		return getInitialTile();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__SPEED:
    		return new java.lang.Integer(getSpeed());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__DIRECTION:
    		return new java.lang.Integer(getDirection());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__CURRENT_TILE:
    		return getCurrentTile();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__NEXT_TILE:
    		return getNextTile();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__XMOVE_PROGRESS:
    		return new java.lang.Integer(getXMoveProgress());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__YMOVE_PROGRESS:
    		return new java.lang.Integer(getYMoveProgress());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__INITIAL_TILE:
    		return getInitialTile() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__SPEED:
    		return getSpeed() != SPEED_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__DIRECTION:
    		return getDirection() != DIRECTION_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__CURRENT_TILE:
    		return getCurrentTile() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__NEXT_TILE:
    		return getNextTile() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__XMOVE_PROGRESS:
    		return getXMoveProgress() != XMOVE_PROGRESS_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__YMOVE_PROGRESS:
    		return getYMoveProgress() != YMOVE_PROGRESS_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__INITIAL_TILE:
    		setInitialTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__SPEED:
    		setSpeed(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__DIRECTION:
    		setDirection(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__CURRENT_TILE:
    		setCurrentTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__NEXT_TILE:
    		setNextTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__XMOVE_PROGRESS:
    		setXMoveProgress(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.ENTITY__YMOVE_PROGRESS:
    		setYMoveProgress(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
