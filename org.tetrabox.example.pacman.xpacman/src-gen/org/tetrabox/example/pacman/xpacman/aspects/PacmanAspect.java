package org.tetrabox.example.pacman.xpacman.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.ecore.EObject;
import org.tetrabox.example.pacman.xpacman.aspects.BoardAspect;
import org.tetrabox.example.pacman.xpacman.aspects.EntityAspect;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties;
import org.tetrabox.example.pacman.xpacman.aspects.TileAspect;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

@Aspect(className = Pacman.class)
@SuppressWarnings("all")
public class PacmanAspect extends EntityAspect {
  @Step
  @OverrideAspectMethod
  public static void initialize(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_initialize(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "initialize");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step
  @OverrideAspectMethod
  public static void changeDirection(final Pacman _self, final Integer newDirection) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_changeDirection(_self_, _self, newDirection);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "changeDirection");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step(eventTriggerable = true)
  public static void up(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_up(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "up");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step(eventTriggerable = true)
  public static void left(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_left(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "left");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step(eventTriggerable = true)
  public static void down(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_down(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "down");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step(eventTriggerable = true)
  public static void right(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_right(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "right");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step
  @OverrideAspectMethod
  public static void enterNextTile(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_enterNextTile(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "enterNextTile");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void eatPellet(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_eatPellet(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "eatPellet");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void kill(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_kill(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "kill");
	} else {
		fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
				.getInstance().findEventManager();
		if (eventManager != null) {
			eventManager.manageEvents();
		}
		command.execute();
	}
	;
	;
}
  
  @OverrideAspectMethod
  protected static Tile computeNextTile(final Pacman _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Pacman){
    					result = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect._privk3_computeNextTile(_self_, (org.tetrabox.example.pacman.xpacman.pacman.Pacman)_self);
    } else  if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Entity){
    					result = org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.computeNextTile((org.tetrabox.example.pacman.xpacman.pacman.Entity)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.example.pacman.xpacman.pacman.Tile)result;
  }
  
  public static int pelletsEaten(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_pelletsEaten(_self_, _self);
	;
	return (int) result;
}
  
  public static void pelletsEaten(final Pacman _self, final int pelletsEaten) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	_privk3_pelletsEaten(_self_, _self, pelletsEaten);
	;
}
  
  public static int lives(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_lives(_self_, _self);
	;
	return (int) result;
}
  
  public static void lives(final Pacman _self, final int lives) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	_privk3_lives(_self_, _self, lives);
	;
}
  
  private static void super_initialize(final Pacman _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_initialize(_self_, _self);
  }
  
  protected static void _privk3_initialize(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    int _initialLives = _self.getInitialLives();
    PacmanAspect.lives(_self, _initialLives);
    PacmanAspect.super_initialize(_self);
  }
  
  private static void super_changeDirection(final Pacman _self, final Integer newDirection) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_changeDirection(_self_, _self,newDirection);
  }
  
  protected static void _privk3_changeDirection(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self, final Integer newDirection) {
    EntityAspect.direction(_self, (newDirection).intValue());
    PacmanAspect.computeNextTile(_self);
  }
  
  protected static void _privk3_up(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    EntityAspect.direction(_self, 0);
    PacmanAspect.computeNextTile(_self);
  }
  
  protected static void _privk3_left(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    EntityAspect.direction(_self, 1);
    PacmanAspect.computeNextTile(_self);
  }
  
  protected static void _privk3_down(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    EntityAspect.direction(_self, 2);
    PacmanAspect.computeNextTile(_self);
  }
  
  protected static void _privk3_right(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    EntityAspect.direction(_self, 3);
    PacmanAspect.computeNextTile(_self);
  }
  
  private static void super_enterNextTile(final Pacman _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_enterNextTile(_self_, _self);
  }
  
  protected static void _privk3_enterNextTile(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    final Tile tile = EntityAspect.nextTile(_self);
    if (((!Objects.equal(tile, null)) && tile.isPassable())) {
      PacmanAspect.super_enterNextTile(_self);
      PacmanAspect.eatPellet(_self);
    } else {
      int _moveProgress = EntityAspect.moveProgress(_self);
      int _baseMoveTime = EntityAspect.baseMoveTime(_self);
      int _divide = (_baseMoveTime / 2);
      int _plus = (_moveProgress + _divide);
      EntityAspect.moveProgress(_self, _plus);
    }
  }
  
  protected static void _privk3_eatPellet(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    Tile _currentTile = EntityAspect.currentTile(_self);
    TileAspect.hasPellet(_currentTile, false);
    int _pelletsEaten = PacmanAspect.pelletsEaten(_self);
    int _plus = (_pelletsEaten + 1);
    PacmanAspect.pelletsEaten(_self, _plus);
  }
  
  protected static void _privk3_kill(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    int _lives = PacmanAspect.lives(_self);
    int _minus = (_lives - 1);
    PacmanAspect.lives(_self, _minus);
    EObject _eContainer = _self.eContainer();
    BoardAspect.reset(((Board) _eContainer));
  }
  
  protected static Tile _privk3_computeNextTile(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    EObject _eContainer = _self.eContainer();
    final Tile currentTile = ((Tile) _eContainer);
    Tile result = null;
    int _direction = EntityAspect.direction(_self);
    switch (_direction) {
      case 0:
        Tile _top = currentTile.getTop();
        result = _top;
        break;
      case 1:
        Tile _left = currentTile.getLeft();
        result = _left;
        break;
      case 2:
        Tile _bottom = currentTile.getBottom();
        result = _bottom;
        break;
      case 3:
        Tile _right = currentTile.getRight();
        result = _right;
        break;
    }
    return result;
  }
  
  protected static int _privk3_pelletsEaten(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPelletsEaten") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.pelletsEaten;
  }
  
  protected static void _privk3_pelletsEaten(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self, final int pelletsEaten) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPelletsEaten")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, pelletsEaten);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.pelletsEaten = pelletsEaten;
    }
  }
  
  protected static int _privk3_lives(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getLives") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.lives;
  }
  
  protected static void _privk3_lives(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self, final int lives) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setLives")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, lives);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.lives = lives;
    }
  }
}
