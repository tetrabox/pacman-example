package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Tile;

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
  public void changeTargetTile(final Tile targetTile) {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.changeTargetTile(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.Tile)((EObjectAdapter)targetTile).getAdaptee()
    );
  }
  
  @Override
  public void enterNextTile() {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.enterNextTile(adaptee);
  }
  
  @Override
  public Tile getTargetTile() {
    return (Tile) adaptersFactory.createAdapter(org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.targetTile(adaptee), eResource);
  }
  
  @Override
  public void setTargetTile(final Tile targetTile) {
    org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.targetTile(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.Tile)((EObjectAdapter)targetTile).getAdaptee()
    );
  }
  
  @Override
  public void changeDirection(final Integer newDirection) {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.changeDirection(adaptee, newDirection
    );
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
  public void initialize() {
    org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.initialize(adaptee);
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
  
  protected final static String NAME_EDEFAULT = null;
  
  protected final static GhostPersonality PERSONNALITY_EDEFAULT = org.tetrabox.example.pacman.xpacmanmt.pacman.GhostPersonality.SHADOW;
  
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
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__NEXT_TILE:
    		return getNextTile();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__NAME:
    		return getName();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__PERSONNALITY:
    		return getPersonnality();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__TARGET_TILE:
    		return getTargetTile();
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
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__NEXT_TILE:
    		return getNextTile() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__NAME:
    		return getName() != NAME_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__PERSONNALITY:
    		return getPersonnality() != PERSONNALITY_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__TARGET_TILE:
    		return getTargetTile() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__INITIAL_TILE:
    		setInitialTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Tile)
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
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Tile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__NEXT_TILE:
    		setNextTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Tile)
    		 newValue);
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
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.GHOST__TARGET_TILE:
    		setTargetTile(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Tile)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
