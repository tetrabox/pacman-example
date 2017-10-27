package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile;

@SuppressWarnings("all")
public class GhostAdapter extends EObjectAdapter<Ghost> implements org.tetrabox.example.pacman.xpacmanmt.pacman.Ghost {
  private XPacmanMTAdaptersFactory adaptersFactory;
  
  public GhostAdapter() {
    super(org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public GhostPersonality getPersonnality() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality.get(adaptee.getPersonnality().getValue());
  }
  
  @Override
  public void setPersonnality(final GhostPersonality o) {
    adaptee.setPersonnality(org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality.get(o.getValue()));
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
  public AbstractTile getScatterTile() {
    return (AbstractTile) adaptersFactory.createAdapter(adaptee.getScatterTile(), eResource);
  }
  
  @Override
  public void setScatterTile(final AbstractTile o) {
    if (o != null)
    	adaptee.setScatterTile(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.AbstractTileAdapter) o).getAdaptee());
    else adaptee.setScatterTile(null);
  }
  
  @Override
  public void activate() {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.activate(adaptee);
  }
  
  @Override
  public void changeTargetTile(final AbstractTile targetTile) {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.changeTargetTile(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.AbstractTile)((EObjectAdapter)targetTile).getAdaptee()
    );
  }
  
  @Override
  public void eat() {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.eat(adaptee);
  }
  
  @Override
  public void enterChaseMode() {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.enterChaseMode(adaptee);
  }
  
  @Override
  public void enterNextTile(final int x, final int y) {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.enterNextTile(adaptee, x
    , y
    );
  }
  
  @Override
  public void enterScatterMode() {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.enterScatterMode(adaptee);
  }
  
  @Override
  public boolean isFrightenedMode() {
    return org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.frightenedMode(adaptee);
  }
  
  @Override
  public void setFrightenedMode(final boolean frightenedMode) {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.frightenedMode(adaptee, frightenedMode
    );
  }
  
  @Override
  public void initialize() {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.initialize(adaptee);
  }
  
  @Override
  public void switchFrightenedMode() {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.switchFrightenedMode(adaptee);
  }
  
  @Override
  public AbstractTile getTargetTile() {
    return (AbstractTile) adaptersFactory.createAdapter(org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.targetTile(adaptee), eResource);
  }
  
  @Override
  public void setTargetTile(final AbstractTile targetTile) {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.targetTile(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.AbstractTile)((EObjectAdapter)targetTile).getAdaptee()
    );
  }
  
  @Override
  public void update(final long deltaTime) {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.update(adaptee, deltaTime
    );
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
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static GhostPersonality PERSONNALITY_EDEFAULT = org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality.SHADOW;
  
  protected final static boolean FRIGHTENED_MODE_EDEFAULT = false;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.eINSTANCE.getGhost();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__INITIAL_TILE:
    		return getInitialTile();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__SPEED:
    		return new java.lang.Integer(getSpeed());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__DIRECTION:
    		return new java.lang.Integer(getDirection());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__CURRENT_TILE:
    		return getCurrentTile();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__XMOVE_PROGRESS:
    		return new java.lang.Integer(getXMoveProgress());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__YMOVE_PROGRESS:
    		return new java.lang.Integer(getYMoveProgress());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__NAME:
    		return getName();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__PERSONNALITY:
    		return getPersonnality();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__SCATTER_TILE:
    		return getScatterTile();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__TARGET_TILE:
    		return getTargetTile();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__FRIGHTENED_MODE:
    		return isFrightenedMode() ? Boolean.TRUE : Boolean.FALSE;
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__INITIAL_TILE:
    		return getInitialTile() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__SPEED:
    		return getSpeed() != SPEED_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__DIRECTION:
    		return getDirection() != DIRECTION_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__CURRENT_TILE:
    		return getCurrentTile() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__XMOVE_PROGRESS:
    		return getXMoveProgress() != XMOVE_PROGRESS_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__YMOVE_PROGRESS:
    		return getYMoveProgress() != YMOVE_PROGRESS_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__PERSONNALITY:
    		return getPersonnality() != PERSONNALITY_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__SCATTER_TILE:
    		return getScatterTile() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__TARGET_TILE:
    		return getTargetTile() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__FRIGHTENED_MODE:
    		return isFrightenedMode() != FRIGHTENED_MODE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__INITIAL_TILE:
    		setInitialTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__SPEED:
    		setSpeed(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__DIRECTION:
    		setDirection(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__CURRENT_TILE:
    		setCurrentTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.PassableTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__XMOVE_PROGRESS:
    		setXMoveProgress(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__YMOVE_PROGRESS:
    		setYMoveProgress(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__PERSONNALITY:
    		setPersonnality(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__SCATTER_TILE:
    		setScatterTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__TARGET_TILE:
    		setTargetTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__FRIGHTENED_MODE:
    		setFrightenedMode(((java.lang.Boolean) newValue).booleanValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
