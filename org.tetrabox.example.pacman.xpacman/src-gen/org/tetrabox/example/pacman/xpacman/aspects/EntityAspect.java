package org.tetrabox.example.pacman.xpacman.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

@Aspect(className = Entity.class)
@SuppressWarnings("all")
public abstract class EntityAspect {
  @Step
  public static void initialize(final Entity _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Pacman) {
		org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect
				.initialize((org.tetrabox.example.pacman.xpacman.pacman.Pacman) _self);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Ghost) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_initialize(_self_,
						(org.tetrabox.example.pacman.xpacman.pacman.Ghost) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Entity", "initialize");
		} else {
			fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Entity) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_initialize(_self_,
						(org.tetrabox.example.pacman.xpacman.pacman.Entity) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Entity", "initialize");
		} else {
			fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  @Step
  public static void modifySpeed(final Entity _self, final Integer speed) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_modifySpeed(_self_, _self, speed);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Entity", "modifySpeed");
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
  public static void changeDirection(final Entity _self, final Integer newDirection) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Pacman) {
		org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect
				.changeDirection((org.tetrabox.example.pacman.xpacman.pacman.Pacman) _self, newDirection);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Ghost) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_changeDirection(_self_,
						(org.tetrabox.example.pacman.xpacman.pacman.Ghost) _self, newDirection);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Entity", "changeDirection");
		} else {
			fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Entity) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_changeDirection(_self_,
						(org.tetrabox.example.pacman.xpacman.pacman.Entity) _self, newDirection);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Entity", "changeDirection");
		} else {
			fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  @Step
  public static void update(final Entity _self, final long deltaTime) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
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
		manager.executeStep(_self, command, "Entity", "update");
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
  
  @Abstract
  protected static Tile computeNextTile(final Entity _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Pacman){
    					result = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.computeNextTile((org.tetrabox.example.pacman.xpacman.pacman.Pacman)_self);
    } else  if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Ghost){
    					result = org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.computeNextTile((org.tetrabox.example.pacman.xpacman.pacman.Ghost)_self);
    } else  if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Entity){
    					result = org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_computeNextTile(_self_, (org.tetrabox.example.pacman.xpacman.pacman.Entity)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.example.pacman.xpacman.pacman.Tile)result;
  }
  
  @Step
  public static void enterNextTile(final Entity _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Pacman) {
		org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect
				.enterNextTile((org.tetrabox.example.pacman.xpacman.pacman.Pacman) _self);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Ghost) {
		org.tetrabox.example.pacman.xpacman.aspects.GhostAspect
				.enterNextTile((org.tetrabox.example.pacman.xpacman.pacman.Ghost) _self);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Entity) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_enterNextTile(_self_,
						(org.tetrabox.example.pacman.xpacman.pacman.Entity) _self);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Entity", "enterNextTile");
		} else {
			fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry
					.getInstance().findEventManager();
			if (eventManager != null) {
				eventManager.manageEvents();
			}
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  public static int speed(final Entity _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_speed(_self_, _self);
	;
	return (int) result;
}
  
  public static void speed(final Entity _self, final int speed) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	_privk3_speed(_self_, _self, speed);
	;
}
  
  public static int direction(final Entity _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_direction(_self_, _self);
	;
	return (int) result;
}
  
  public static void direction(final Entity _self, final int direction) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	_privk3_direction(_self_, _self, direction);
	;
}
  
  public static Tile currentTile(final Entity _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentTile(_self_, _self);
	;
	return (org.tetrabox.example.pacman.xpacman.pacman.Tile) result;
}
  
  public static void currentTile(final Entity _self, final Tile currentTile) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	_privk3_currentTile(_self_, _self, currentTile);
	;
}
  
  public static Tile nextTile(final Entity _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_nextTile(_self_, _self);
	;
	return (org.tetrabox.example.pacman.xpacman.pacman.Tile) result;
}
  
  public static void nextTile(final Entity _self, final Tile nextTile) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	_privk3_nextTile(_self_, _self, nextTile);
	;
}
  
  protected static int baseMoveTime(final Entity _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_baseMoveTime(_self_, _self);;
    return (int)result;
  }
  
  protected static int moveProgress(final Entity _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_moveProgress(_self_, _self);;
    return (int)result;
  }
  
  protected static void moveProgress(final Entity _self, final int moveProgress) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
    _privk3_moveProgress(_self_, _self,moveProgress);;
  }
  
  protected static void _privk3_initialize(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    Tile _initialTile = _self.getInitialTile();
    EntityAspect.currentTile(_self, _initialTile);
  }
  
  protected static void _privk3_modifySpeed(final EntityAspectEntityAspectProperties _self_, final Entity _self, final Integer speed) {
    int _speed = EntityAspect.speed(_self);
    int _plus = (_speed + (speed).intValue());
    EntityAspect.speed(_self, _plus);
  }
  
  protected static void _privk3_changeDirection(final EntityAspectEntityAspectProperties _self_, final Entity _self, final Integer newDirection) {
    EntityAspect.direction(_self, (newDirection).intValue());
  }
  
  protected static void _privk3_update(final EntityAspectEntityAspectProperties _self_, final Entity _self, final long deltaTime) {
    int _moveProgress = EntityAspect.moveProgress(_self);
    int _speed = EntityAspect.speed(_self);
    long _multiply = (deltaTime * _speed);
    double _divide = (_multiply / 100.00);
    double _plus = (_moveProgress + _divide);
    double _floor = Math.floor(_plus);
    EntityAspect.moveProgress(_self, ((int) _floor));
    int _moveProgress_1 = EntityAspect.moveProgress(_self);
    int _baseMoveTime = EntityAspect.baseMoveTime(_self);
    boolean _greaterEqualsThan = (_moveProgress_1 >= _baseMoveTime);
    if (_greaterEqualsThan) {
      int _moveProgress_2 = EntityAspect.moveProgress(_self);
      int _baseMoveTime_1 = EntityAspect.baseMoveTime(_self);
      int _modulo = (_moveProgress_2 % _baseMoveTime_1);
      EntityAspect.moveProgress(_self, _modulo);
      EntityAspect.enterNextTile(_self);
      Tile _computeNextTile = EntityAspect.computeNextTile(_self);
      EntityAspect.nextTile(_self, _computeNextTile);
    }
  }
  
  protected static Tile _privk3_computeNextTile(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_enterNextTile(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    Tile _nextTile = EntityAspect.nextTile(_self);
    EntityAspect.currentTile(_self, _nextTile);
  }
  
  protected static int _privk3_speed(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getSpeed") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.speed;
  }
  
  protected static void _privk3_speed(final EntityAspectEntityAspectProperties _self_, final Entity _self, final int speed) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setSpeed")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, speed);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.speed = speed;
    }
  }
  
  protected static int _privk3_direction(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDirection") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.direction;
  }
  
  protected static void _privk3_direction(final EntityAspectEntityAspectProperties _self_, final Entity _self, final int direction) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDirection")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, direction);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.direction = direction;
    }
  }
  
  protected static Tile _privk3_currentTile(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentTile") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.example.pacman.xpacman.pacman.Tile) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentTile;
  }
  
  protected static void _privk3_currentTile(final EntityAspectEntityAspectProperties _self_, final Entity _self, final Tile currentTile) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentTile")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentTile);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentTile = currentTile;
    }
  }
  
  protected static Tile _privk3_nextTile(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getNextTile") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.example.pacman.xpacman.pacman.Tile) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.nextTile;
  }
  
  protected static void _privk3_nextTile(final EntityAspectEntityAspectProperties _self_, final Entity _self, final Tile nextTile) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setNextTile")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, nextTile);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.nextTile = nextTile;
    }
  }
  
  protected static int _privk3_baseMoveTime(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getBaseMoveTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.baseMoveTime;
  }
  
  protected static int _privk3_moveProgress(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getMoveProgress") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.moveProgress;
  }
  
  protected static void _privk3_moveProgress(final EntityAspectEntityAspectProperties _self_, final Entity _self, final int moveProgress) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setMoveProgress")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, moveProgress);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.moveProgress = moveProgress;
    }
  }
}
