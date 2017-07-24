package org.tetrabox.example.pacman;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.tetrabox.example.pacman.XPacmanMT;

@SuppressWarnings("all")
public class XPacman implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static XPacman load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    XPacman mm = new XPacman();
    mm.setResource(res);
    return mm ;
  }
  
  public XPacmanMT toXPacmanMT() {
    org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanAdapter adaptee = new org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
