package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacman.pacman.Pellet;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman;

@SuppressWarnings("all")
public class PelletAdapter extends EObjectAdapter<Pellet> implements org.tetrabox.example.pacman.xpacmanmt.pacman.Pellet {
  private XPacmanMTAdaptersFactory adaptersFactory;
  
  public PelletAdapter() {
    super(org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance();
  }
  
  @Override
  public void eat(final Pacman pacman) {
    org.tetrabox.example.pacman.xpacman.aspects.PelletAspect.eat(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.Pacman)((EObjectAdapter)pacman).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.eINSTANCE.getPellet();
  }
}
