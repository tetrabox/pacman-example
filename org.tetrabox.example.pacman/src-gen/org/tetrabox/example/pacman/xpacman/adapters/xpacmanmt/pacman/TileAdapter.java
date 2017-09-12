package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Pellet;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType;

@SuppressWarnings("all")
public class TileAdapter extends EObjectAdapter<Tile> implements org.tetrabox.example.pacman.xpacmanmt.pacman.Tile {
  private XPacmanMTAdaptersFactory adaptersFactory;
  
  public TileAdapter() {
    super(org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getX() {
    return adaptee.getX();
  }
  
  @Override
  public void setX(final int o) {
    adaptee.setX(o);
  }
  
  @Override
  public int getY() {
    return adaptee.getY();
  }
  
  @Override
  public void setY(final int o) {
    adaptee.setY(o);
  }
  
  @Override
  public PelletType getInitialPellet() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType.get(adaptee.getInitialPellet().getValue());
  }
  
  @Override
  public void setInitialPellet(final PelletType o) {
    adaptee.setInitialPellet(org.tetrabox.example.pacman.xpacman.pacman.PelletType.get(o.getValue()));
  }
  
  @Override
  public AbstractTile getTop() {
    return (AbstractTile) adaptersFactory.createAdapter(adaptee.getTop(), eResource);
  }
  
  @Override
  public void setTop(final AbstractTile o) {
    if (o != null)
    	adaptee.setTop(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.AbstractTileAdapter) o).getAdaptee());
    else adaptee.setTop(null);
  }
  
  @Override
  public AbstractTile getRight() {
    return (AbstractTile) adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final AbstractTile o) {
    if (o != null)
    	adaptee.setRight(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.AbstractTileAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public AbstractTile getBottom() {
    return (AbstractTile) adaptersFactory.createAdapter(adaptee.getBottom(), eResource);
  }
  
  @Override
  public void setBottom(final AbstractTile o) {
    if (o != null)
    	adaptee.setBottom(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.AbstractTileAdapter) o).getAdaptee());
    else adaptee.setBottom(null);
  }
  
  @Override
  public AbstractTile getLeft() {
    return (AbstractTile) adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final AbstractTile o) {
    if (o != null)
    	adaptee.setLeft(((org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.AbstractTileAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public void eatPellet(final Pacman pacman) {
    org.tetrabox.example.pacman.xpacman.aspects.TileAspect.eatPellet(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.Pacman)((EObjectAdapter)pacman).getAdaptee()
    );
  }
  
  @Override
  public void initialize() {
    org.tetrabox.example.pacman.xpacman.aspects.TileAspect.initialize(adaptee);
  }
  
  @Override
  public Pellet getPellet() {
    return (Pellet) adaptersFactory.createAdapter(org.tetrabox.example.pacman.xpacman.aspects.TileAspect.pellet(adaptee), eResource);
  }
  
  @Override
  public void setPellet(final Pellet pellet) {
    org.tetrabox.example.pacman.xpacman.aspects.TileAspect.pellet(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.Pellet)((EObjectAdapter)pellet).getAdaptee()
    );
  }
  
  protected final static int X_EDEFAULT = 0;
  
  protected final static int Y_EDEFAULT = 0;
  
  protected final static PelletType INITIAL_PELLET_EDEFAULT = org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType.NO_PELLET;
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.eINSTANCE.getTile();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__TOP:
    		return getTop();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__RIGHT:
    		return getRight();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__BOTTOM:
    		return getBottom();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__LEFT:
    		return getLeft();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__X:
    		return new java.lang.Integer(getX());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__Y:
    		return new java.lang.Integer(getY());
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__INITIAL_PELLET:
    		return getInitialPellet();
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__PELLET:
    		return getPellet();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__TOP:
    		return getTop() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__RIGHT:
    		return getRight() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__BOTTOM:
    		return getBottom() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__LEFT:
    		return getLeft() != null;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__X:
    		return getX() != X_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__Y:
    		return getY() != Y_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__INITIAL_PELLET:
    		return getInitialPellet() != INITIAL_PELLET_EDEFAULT;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__PELLET:
    		return getPellet() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__TOP:
    		setTop(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__RIGHT:
    		setRight(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__BOTTOM:
    		setBottom(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__LEFT:
    		setLeft(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.AbstractTile)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__X:
    		setX(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__Y:
    		setY(((java.lang.Integer) newValue).intValue());
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__INITIAL_PELLET:
    		setInitialPellet(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.PelletType)
    		 newValue);
    		return;
    	case org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.TILE__PELLET:
    		setPellet(
    		(org.tetrabox.example.pacman.xpacmanmt.pacman.Pellet)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
