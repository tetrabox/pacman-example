package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.BoardAdapter;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.EntityAdapter;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.GhostAdapter;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.PacmanAdapter;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.TileAdapter;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

@SuppressWarnings("all")
public class XPacmanMTAdaptersFactory implements AdaptersFactory {
  private static XPacmanMTAdaptersFactory instance;
  
  public static XPacmanMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public XPacmanMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof org.tetrabox.example.pacman.xpacman.pacman.Tile){
    	return createTileAdapter((org.tetrabox.example.pacman.xpacman.pacman.Tile) o, res);
    }
    if (o instanceof org.tetrabox.example.pacman.xpacman.pacman.Board){
    	return createBoardAdapter((org.tetrabox.example.pacman.xpacman.pacman.Board) o, res);
    }
    if (o instanceof org.tetrabox.example.pacman.xpacman.pacman.Pacman){
    	return createPacmanAdapter((org.tetrabox.example.pacman.xpacman.pacman.Pacman) o, res);
    }
    if (o instanceof org.tetrabox.example.pacman.xpacman.pacman.Ghost){
    	return createGhostAdapter((org.tetrabox.example.pacman.xpacman.pacman.Ghost) o, res);
    }
    
    return null;
  }
  
  public TileAdapter createTileAdapter(final Tile adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.TileAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.TileAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.TileAdapter) adapter;
    }
  }
  
  public BoardAdapter createBoardAdapter(final Board adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.BoardAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.BoardAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.BoardAdapter) adapter;
    }
  }
  
  public EntityAdapter createEntityAdapter(final Entity adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.EntityAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.EntityAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.EntityAdapter) adapter;
    }
  }
  
  public PacmanAdapter createPacmanAdapter(final Pacman adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.PacmanAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.PacmanAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.PacmanAdapter) adapter;
    }
  }
  
  public GhostAdapter createGhostAdapter(final Ghost adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.GhostAdapter) adapter;
    else {
    	adapter = new org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.GhostAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.GhostAdapter) adapter;
    }
  }
}
