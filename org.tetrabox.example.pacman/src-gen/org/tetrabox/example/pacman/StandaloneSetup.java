package org.tetrabox.example.pacman;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.eNS_URI,
    	org.tetrabox.example.pacman.xpacman.pacman.PacmanPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor xPacman = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"org.tetrabox.example.pacman.XPacman", "", "http://org.tetrabox.example.pacman.xpacman/pacman/", "org.tetrabox.example.pacman.XPacmanMT"
    );
    xPacman.addAdapter("org.tetrabox.example.pacman.XPacmanMT", org.tetrabox.example.pacman.xpacman.adapters.xpacmanmt.XPacmanAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"org.tetrabox.example.pacman.XPacman",
    	xPacman
    );
    MelangeRegistry.ModelTypeDescriptor xPacmanMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"org.tetrabox.example.pacman.XPacmanMT", "", "http://org.tetrabox.example.pacman.xpacmanmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"org.tetrabox.example.pacman.XPacmanMT",
    	xPacmanMT
    );
  }
}
