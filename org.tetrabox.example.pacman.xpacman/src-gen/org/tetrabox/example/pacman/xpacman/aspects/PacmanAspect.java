package org.tetrabox.example.pacman.xpacman.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.ecore.EObject;
import org.tetrabox.example.pacman.xpacman.aspects.BoardAspect;
import org.tetrabox.example.pacman.xpacman.aspects.EntityAspect;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties;
import org.tetrabox.example.pacman.xpacman.aspects.TileAspect;
import org.tetrabox.example.pacman.xpacman.pacman.AbstractTile;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.GhostHouseTile;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.PassableTile;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;
import org.tetrabox.example.pacman.xpacman.pacman.WallTile;

@Aspect(className = Pacman.class)
@SuppressWarnings("all")
public class PacmanAspect extends EntityAspect {
  @OverrideAspectMethod
  public static void initialize(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	_privk3_initialize(_self_, _self);
	;
}
  
  @Step
  @OverrideAspectMethod
  public static void update(final Pacman _self, final long deltaTime) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_update(_self_, _self, deltaTime);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "update");
	} else {
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
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void energize(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_energize(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "energize");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step(eventHandler = true)
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
		command.execute();
	}
	;
	;
}
  
  @Step(eventHandler = true)
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
		command.execute();
	}
	;
	;
}
  
  @Step(eventHandler = true)
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
		command.execute();
	}
	;
	;
}
  
  @Step(eventHandler = true)
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
		command.execute();
	}
	;
	;
}
  
  private static boolean canTakeDirection(final Pacman _self, final Integer direction) {
    final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_canTakeDirection(_self_, _self,direction);;
    return (boolean)result;
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
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void eat(final Pacman _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_eat(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Pacman", "eat");
	} else {
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
  
  private static int nextDirection(final Pacman _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_nextDirection(_self_, _self);;
    return (int)result;
  }
  
  private static void nextDirection(final Pacman _self, final int nextDirection) {
    final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext.getSelf(_self);
    _privk3_nextDirection(_self_, _self,nextDirection);;
  }
  
  private static long energizedRemainingDuration(final Pacman _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_energizedRemainingDuration(_self_, _self);;
    return (long)result;
  }
  
  private static void energizedRemainingDuration(final Pacman _self, final long energizedRemainingDuration) {
    final org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspectPacmanAspectContext.getSelf(_self);
    _privk3_energizedRemainingDuration(_self_, _self,energizedRemainingDuration);;
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
    PacmanAspect.lives(_self, _self.getInitialLives());
    EntityAspect.direction(_self, 1);
    PacmanAspect.super_initialize(_self);
  }
  
  private static void super_update(final Pacman _self, final long deltaTime) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_update(_self_, _self,deltaTime);
  }
  
  protected static void _privk3_update(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self, final long deltaTime) {
    PacmanAspect.super_update(_self, deltaTime);
    long _energizedRemainingDuration = PacmanAspect.energizedRemainingDuration(_self);
    boolean _greaterEqualsThan = (deltaTime >= _energizedRemainingDuration);
    if (_greaterEqualsThan) {
      PacmanAspect.energizedRemainingDuration(_self, 0);
    } else {
      long _energizedRemainingDuration_1 = PacmanAspect.energizedRemainingDuration(_self);
      long _minus = (_energizedRemainingDuration_1 - deltaTime);
      PacmanAspect.energizedRemainingDuration(_self, _minus);
    }
  }
  
  private static void super_changeDirection(final Pacman _self, final Integer newDirection) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_changeDirection(_self_, _self,newDirection);
  }
  
  protected static void _privk3_changeDirection(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self, final Integer newDirection) {
    EntityAspect.direction(_self, (newDirection).intValue());
    EntityAspect.nextTile(_self, PacmanAspect.computeNextTile(_self));
  }
  
  protected static void _privk3_energize(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    EObject _eContainer = _self.eContainer();
    BoardAspect.enterFrightenedMode(((Board) _eContainer));
  }
  
  protected static void _privk3_up(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    boolean _canTakeDirection = PacmanAspect.canTakeDirection(_self, Integer.valueOf(0));
    if (_canTakeDirection) {
      PacmanAspect.changeDirection(_self, Integer.valueOf(0));
    } else {
      PacmanAspect.nextDirection(_self, 0);
    }
  }
  
  protected static void _privk3_left(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    boolean _canTakeDirection = PacmanAspect.canTakeDirection(_self, Integer.valueOf(1));
    if (_canTakeDirection) {
      PacmanAspect.changeDirection(_self, Integer.valueOf(1));
    } else {
      PacmanAspect.nextDirection(_self, 1);
    }
  }
  
  protected static void _privk3_down(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    boolean _canTakeDirection = PacmanAspect.canTakeDirection(_self, Integer.valueOf(2));
    if (_canTakeDirection) {
      PacmanAspect.changeDirection(_self, Integer.valueOf(2));
    } else {
      PacmanAspect.nextDirection(_self, 2);
    }
  }
  
  protected static void _privk3_right(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    boolean _canTakeDirection = PacmanAspect.canTakeDirection(_self, Integer.valueOf(3));
    if (_canTakeDirection) {
      PacmanAspect.changeDirection(_self, Integer.valueOf(3));
    } else {
      PacmanAspect.nextDirection(_self, 3);
    }
  }
  
  protected static boolean _privk3_canTakeDirection(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self, final Integer direction) {
    boolean _xblockexpression = false;
    {
      AbstractTile _switchResult = null;
      if (direction != null) {
        switch (direction) {
          case 0:
            _switchResult = EntityAspect.currentTile(_self).getTop();
            break;
          case 1:
            _switchResult = EntityAspect.currentTile(_self).getLeft();
            break;
          case 2:
            _switchResult = EntityAspect.currentTile(_self).getBottom();
            break;
          case 3:
            _switchResult = EntityAspect.currentTile(_self).getRight();
            break;
          default:
            _switchResult = null;
            break;
        }
      } else {
        _switchResult = null;
      }
      final AbstractTile nextTile = _switchResult;
      _xblockexpression = (((nextTile != null) && (!(nextTile instanceof WallTile))) && (!(nextTile instanceof GhostHouseTile)));
    }
    return _xblockexpression;
  }
  
  private static void super_enterNextTile(final Pacman _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_enterNextTile(_self_, _self);
  }
  
  protected static void _privk3_enterNextTile(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    final PassableTile tile = EntityAspect.nextTile(_self);
    if (((tile != null) && (tile instanceof Tile))) {
      PacmanAspect.super_enterNextTile(_self);
      TileAspect.eatPellet(((Tile) tile), _self);
    }
    boolean _canTakeDirection = PacmanAspect.canTakeDirection(_self, Integer.valueOf(PacmanAspect.nextDirection(_self)));
    if (_canTakeDirection) {
      PacmanAspect.changeDirection(_self, Integer.valueOf(PacmanAspect.nextDirection(_self)));
    }
    PacmanAspect.nextDirection(_self, (-1));
  }
  
  protected static void _privk3_eat(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    int _lives = PacmanAspect.lives(_self);
    int _minus = (_lives - 1);
    PacmanAspect.lives(_self, _minus);
    EObject _eContainer = _self.eContainer();
    BoardAspect.reset(((Board) _eContainer));
  }
  
  protected static Tile _privk3_computeNextTile(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    final PassableTile currentTile = EntityAspect.currentTile(_self);
    AbstractTile result = null;
    int _direction = EntityAspect.direction(_self);
    switch (_direction) {
      case 0:
        result = currentTile.getTop();
        break;
      case 1:
        result = currentTile.getLeft();
        break;
      case 2:
        result = currentTile.getBottom();
        break;
      case 3:
        result = currentTile.getRight();
        break;
    }
    Tile _xifexpression = null;
    if ((result instanceof Tile)) {
      _xifexpression = ((Tile)result);
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  protected static int _privk3_nextDirection(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getNextDirection") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.nextDirection;
  }
  
  protected static void _privk3_nextDirection(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self, final int nextDirection) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setNextDirection")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, nextDirection);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.nextDirection = nextDirection;
    }
  }
  
  protected static long _privk3_energizedRemainingDuration(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getEnergizedRemainingDuration") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.energizedRemainingDuration;
  }
  
  protected static void _privk3_energizedRemainingDuration(final PacmanAspectPacmanAspectProperties _self_, final Pacman _self, final long energizedRemainingDuration) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setEnergizedRemainingDuration")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, energizedRemainingDuration);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.energizedRemainingDuration = energizedRemainingDuration;
    }
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
