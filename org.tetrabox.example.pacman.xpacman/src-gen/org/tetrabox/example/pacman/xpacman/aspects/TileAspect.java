package org.tetrabox.example.pacman.xpacman.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import fr.inria.diverse.melange.annotation.Containment;
import org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspect;
import org.tetrabox.example.pacman.xpacman.aspects.PelletAspect;
import org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.PacmanFactory;
import org.tetrabox.example.pacman.xpacman.pacman.Pellet;
import org.tetrabox.example.pacman.xpacman.pacman.PelletType;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

@Aspect(className = Tile.class)
@SuppressWarnings("all")
public class TileAspect extends AbstractTileAspect {
  @OverrideAspectMethod
  public static void initialize(final Tile _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectContext
			.getSelf(_self);
	_privk3_initialize(_self_, _self);
	;
}
  
  @Step
  public static void eatPellet(final Tile _self, final Pacman pacman) {
	final org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_eatPellet(_self_, _self, pacman);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Tile", "eatPellet");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Containment
  public static Pellet pellet(final Tile _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_pellet(_self_, _self);
	;
	return (org.tetrabox.example.pacman.xpacman.pacman.Pellet) result;
}
  
  @Containment
  public static void pellet(final Tile _self, final Pellet pellet) {
	final org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.TileAspectTileAspectContext
			.getSelf(_self);
	_privk3_pellet(_self_, _self, pellet);
	;
}
  
  private static void super_initialize(final Tile _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspectAbstractTileAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspectAbstractTileAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspect._privk3_initialize(_self_, _self);
  }
  
  protected static void _privk3_initialize(final TileAspectTileAspectProperties _self_, final Tile _self) {
    PelletType _initialPellet = _self.getInitialPellet();
    if (_initialPellet != null) {
      switch (_initialPellet) {
        case PELLET:
          TileAspect.pellet(_self, PacmanFactory.eINSTANCE.createPellet());
          break;
        case SUPER_PELLET:
          TileAspect.pellet(_self, PacmanFactory.eINSTANCE.createSuperPellet());
          break;
        default:
          break;
      }
    } else {
    }
  }
  
  protected static void _privk3_eatPellet(final TileAspectTileAspectProperties _self_, final Tile _self, final Pacman pacman) {
    Pellet _pellet = TileAspect.pellet(_self);
    boolean _tripleNotEquals = (_pellet != null);
    if (_tripleNotEquals) {
      PelletAspect.eat(TileAspect.pellet(_self), pacman);
      TileAspect.pellet(_self, null);
    }
  }
  
  protected static Pellet _privk3_pellet(final TileAspectTileAspectProperties _self_, final Tile _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPellet") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.example.pacman.xpacman.pacman.Pellet) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.pellet;
  }
  
  protected static void _privk3_pellet(final TileAspectTileAspectProperties _self_, final Tile _self, final Pellet pellet) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPellet")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, pellet);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.pellet = pellet;
    }
  }
}
