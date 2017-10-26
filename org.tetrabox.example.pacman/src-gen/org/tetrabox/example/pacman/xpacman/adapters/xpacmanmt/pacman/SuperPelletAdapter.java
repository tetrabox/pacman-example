package org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.pacman;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory;
import org.tetrabox.example.pacman.xpacman.pacman.SuperPellet;
import org.tetrabox.example.pacman.xpacmanmt.pacman.Pacman;

@SuppressWarnings("all")
public class SuperPelletAdapter extends EObjectAdapter<SuperPellet> implements org.tetrabox.example.pacman.xpacmanmt.pacman.SuperPellet {
  private XPacmanMTAdaptersFactory adaptersFactory;
  
  public SuperPelletAdapter() {
    super(org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance());
    adaptersFactory = org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanMTAdaptersFactory.getInstance();
  }
  
  @Override
  public void eat(final Pacman pacman) {
    org.tetrabox.example.pacman.xpacman.aspects.SuperPelletAspect.eat(adaptee, (org.tetrabox.example.pacman.xpacman.pacman.Pacman)((EObjectAdapter)pacman).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanPackage.eINSTANCE.getSuperPellet();
  }
}
