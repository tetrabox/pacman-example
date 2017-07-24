package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt;

import fr.inria.diverse.melange.adapters.ResourceAdapter;
import java.io.IOException;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.tetrabox.example.pacman.XPacmanMT;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanFactory;

@SuppressWarnings("all")
public class XPacmanAdapter extends ResourceAdapter implements XPacmanMT {
  public XPacmanAdapter() {
    super(org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance());
  }
  
  @Override
  public PacmanFactory getPacmanFactory() {
    return new org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman.PacmanFactoryAdapter();
  }
  
  @Override
  public Set getFactories() {
    java.util.Set<org.eclipse.emf.ecore.EFactory> res = new java.util.HashSet<org.eclipse.emf.ecore.EFactory>();
    res.add(getPacmanFactory());
    return res;
  }
  
  @Override
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(URI.createURI(uri));
    this.adaptee.save(null);
  }
}
