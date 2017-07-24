package org.tetrabox.example.pacman;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.tetrabox.example.pacman.xpacmanmt.pacman.PacmanFactory;

@SuppressWarnings("all")
public interface XPacmanMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract PacmanFactory getPacmanFactory();
  
  public abstract void save(final String uri) throws IOException;
}
