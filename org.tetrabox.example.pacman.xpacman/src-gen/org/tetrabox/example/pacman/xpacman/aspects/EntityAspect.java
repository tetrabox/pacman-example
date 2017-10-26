package org.tetrabox.example.pacman.xpacman.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.PassableTile;

@Aspect(className = Entity.class)
@SuppressWarnings("all")
public abstract class EntityAspect {
  public static void initialize(final Entity _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Pacman) {
		org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect
				.initialize((org.tetrabox.example.pacman.xpacman.pacman.Pacman) _self);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Ghost) {
		org.tetrabox.example.pacman.xpacman.aspects.GhostAspect
				.initialize((org.tetrabox.example.pacman.xpacman.pacman.Ghost) _self);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Entity) {
		org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_initialize(_self_,
				(org.tetrabox.example.pacman.xpacman.pacman.Entity) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  public static void reset(final Entity _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	_privk3_reset(_self_, _self);
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
	if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Pacman) {
		org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect
				.update((org.tetrabox.example.pacman.xpacman.pacman.Pacman) _self, deltaTime);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Ghost) {
		org.tetrabox.example.pacman.xpacman.aspects.GhostAspect
				.update((org.tetrabox.example.pacman.xpacman.pacman.Ghost) _self, deltaTime);
	} else if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Entity) {
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
			@Override
			public void execute() {
				org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_update(_self_,
						(org.tetrabox.example.pacman.xpacman.pacman.Entity) _self, deltaTime);
			}
		};
		fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
				.getInstance().findStepManager(_self);
		if (manager != null) {
			manager.executeStep(_self, command, "Entity", "update");
		} else {
			command.execute();
		}
		;
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
}
  
  private static int xTowardCenter(final Entity _self, final int progress) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_xTowardCenter(_self_, _self,progress);;
    return (int)result;
  }
  
  private static int yTowardCenter(final Entity _self, final int progress) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_yTowardCenter(_self_, _self,progress);;
    return (int)result;
  }
  
  @Abstract
  protected static PassableTile computeNextTile(final Entity _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Ghost){
    					result = org.tetrabox.example.pacman.xpacman.aspects.GhostAspect.computeNextTile((org.tetrabox.example.pacman.xpacman.pacman.Ghost)_self);
    } else  if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Pacman){
    					result = org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect.computeNextTile((org.tetrabox.example.pacman.xpacman.pacman.Pacman)_self);
    } else  if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Entity){
    					result = org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_computeNextTile(_self_, (org.tetrabox.example.pacman.xpacman.pacman.Entity)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.example.pacman.xpacman.pacman.PassableTile)result;
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
  
  public static PassableTile currentTile(final Entity _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_currentTile(_self_, _self);
	;
	return (org.tetrabox.example.pacman.xpacman.pacman.PassableTile) result;
}
  
  public static void currentTile(final Entity _self, final PassableTile currentTile) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	_privk3_currentTile(_self_, _self, currentTile);
	;
}
  
  protected static PassableTile nextTile(final Entity _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_nextTile(_self_, _self);;
    return (org.tetrabox.example.pacman.xpacman.pacman.PassableTile)result;
  }
  
  protected static void nextTile(final Entity _self, final PassableTile nextTile) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
    _privk3_nextTile(_self_, _self,nextTile);;
  }
  
  public static int xMoveProgress(final Entity _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_xMoveProgress(_self_, _self);
	;
	return (int) result;
}
  
  public static void xMoveProgress(final Entity _self, final int xMoveProgress) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	_privk3_xMoveProgress(_self_, _self, xMoveProgress);
	;
}
  
  public static int yMoveProgress(final Entity _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_yMoveProgress(_self_, _self);
	;
	return (int) result;
}
  
  public static void yMoveProgress(final Entity _self, final int yMoveProgress) {
	final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext
			.getSelf(_self);
	_privk3_yMoveProgress(_self_, _self, yMoveProgress);
	;
}
  
  protected static int baseMoveTime(final Entity _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_baseMoveTime(_self_, _self);;
    return (int)result;
  }
  
  protected static void _privk3_initialize(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    EntityAspect.currentTile(_self, _self.getInitialTile());
    EntityAspect.nextTile(_self, EntityAspect.computeNextTile(_self));
    EntityAspect.speed(_self, 100);
  }
  
  protected static void _privk3_reset(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    EntityAspect.currentTile(_self, _self.getInitialTile());
    EntityAspect.nextTile(_self, EntityAspect.computeNextTile(_self));
    EntityAspect.xMoveProgress(_self, 0);
    EntityAspect.yMoveProgress(_self, 0);
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
    int _speed = EntityAspect.speed(_self);
    long _multiply = (deltaTime * _speed);
    double _divide = (_multiply / 100.00);
    double _floor = Math.floor(_divide);
    int progress = ((int) _floor);
    int _direction = EntityAspect.direction(_self);
    switch (_direction) {
      case 0:
        progress = EntityAspect.xTowardCenter(_self, progress);
        if ((progress > 0)) {
          final PassableTile nextTile = EntityAspect.nextTile(_self);
          if (((nextTile != null) && (nextTile instanceof PassableTile))) {
            int _yMoveProgress = EntityAspect.yMoveProgress(_self);
            int yMoveProgress = (_yMoveProgress - progress);
            int _baseMoveTime = EntityAspect.baseMoveTime(_self);
            boolean _greaterThan = ((-yMoveProgress) > _baseMoveTime);
            if (_greaterThan) {
              int _baseMoveTime_1 = EntityAspect.baseMoveTime(_self);
              int _multiply_1 = (2 * _baseMoveTime_1);
              int _plus = (_multiply_1 + yMoveProgress);
              yMoveProgress = _plus;
              EntityAspect.yMoveProgress(_self, yMoveProgress);
              EntityAspect.enterNextTile(_self);
              EntityAspect.nextTile(_self, EntityAspect.computeNextTile(_self));
            } else {
              EntityAspect.yMoveProgress(_self, yMoveProgress);
            }
          } else {
            EntityAspect.yTowardCenter(_self, progress);
          }
        }
        break;
      case 1:
        progress = EntityAspect.yTowardCenter(_self, progress);
        if ((progress > 0)) {
          final PassableTile nextTile_1 = EntityAspect.nextTile(_self);
          if (((nextTile_1 != null) && (nextTile_1 instanceof PassableTile))) {
            int _xMoveProgress = EntityAspect.xMoveProgress(_self);
            int xMoveProgress = (_xMoveProgress - progress);
            int _baseMoveTime_2 = EntityAspect.baseMoveTime(_self);
            boolean _greaterThan_1 = ((-xMoveProgress) > _baseMoveTime_2);
            if (_greaterThan_1) {
              int _baseMoveTime_3 = EntityAspect.baseMoveTime(_self);
              int _multiply_2 = (2 * _baseMoveTime_3);
              int _plus_1 = (_multiply_2 + xMoveProgress);
              xMoveProgress = _plus_1;
              EntityAspect.xMoveProgress(_self, xMoveProgress);
              EntityAspect.enterNextTile(_self);
              EntityAspect.nextTile(_self, EntityAspect.computeNextTile(_self));
            } else {
              EntityAspect.xMoveProgress(_self, xMoveProgress);
            }
          } else {
            EntityAspect.xTowardCenter(_self, progress);
          }
        }
        break;
      case 2:
        progress = EntityAspect.xTowardCenter(_self, progress);
        if ((progress > 0)) {
          final PassableTile nextTile_2 = EntityAspect.nextTile(_self);
          if (((nextTile_2 != null) && (nextTile_2 instanceof PassableTile))) {
            int _yMoveProgress_1 = EntityAspect.yMoveProgress(_self);
            int yMoveProgress_1 = (_yMoveProgress_1 + progress);
            int _baseMoveTime_4 = EntityAspect.baseMoveTime(_self);
            boolean _greaterThan_2 = (yMoveProgress_1 > _baseMoveTime_4);
            if (_greaterThan_2) {
              int _baseMoveTime_5 = EntityAspect.baseMoveTime(_self);
              int _multiply_3 = (2 * _baseMoveTime_5);
              int _minus = (_multiply_3 - yMoveProgress_1);
              int _minus_1 = (-_minus);
              yMoveProgress_1 = _minus_1;
              EntityAspect.yMoveProgress(_self, yMoveProgress_1);
              EntityAspect.enterNextTile(_self);
              EntityAspect.nextTile(_self, EntityAspect.computeNextTile(_self));
            } else {
              EntityAspect.yMoveProgress(_self, yMoveProgress_1);
            }
          } else {
            EntityAspect.yTowardCenter(_self, progress);
          }
        }
        break;
      case 3:
        progress = EntityAspect.yTowardCenter(_self, progress);
        if ((progress > 0)) {
          final PassableTile nextTile_3 = EntityAspect.nextTile(_self);
          if (((nextTile_3 != null) && (nextTile_3 instanceof PassableTile))) {
            int _xMoveProgress_1 = EntityAspect.xMoveProgress(_self);
            int xMoveProgress_1 = (_xMoveProgress_1 + progress);
            int _baseMoveTime_6 = EntityAspect.baseMoveTime(_self);
            boolean _greaterThan_3 = (xMoveProgress_1 > _baseMoveTime_6);
            if (_greaterThan_3) {
              int _baseMoveTime_7 = EntityAspect.baseMoveTime(_self);
              int _multiply_4 = (2 * _baseMoveTime_7);
              int _minus_2 = (_multiply_4 - xMoveProgress_1);
              int _minus_3 = (-_minus_2);
              xMoveProgress_1 = _minus_3;
              EntityAspect.xMoveProgress(_self, xMoveProgress_1);
              EntityAspect.enterNextTile(_self);
              EntityAspect.nextTile(_self, EntityAspect.computeNextTile(_self));
            } else {
              EntityAspect.xMoveProgress(_self, xMoveProgress_1);
            }
          } else {
            EntityAspect.xTowardCenter(_self, progress);
          }
        }
        break;
    }
  }
  
  protected static int _privk3_xTowardCenter(final EntityAspectEntityAspectProperties _self_, final Entity _self, final int progress) {
    int _xMoveProgress = EntityAspect.xMoveProgress(_self);
    boolean _notEquals = (_xMoveProgress != 0);
    if (_notEquals) {
      int _abs = Math.abs(EntityAspect.xMoveProgress(_self));
      boolean _greaterThan = (progress > _abs);
      if (_greaterThan) {
        EntityAspect.xMoveProgress(_self, 0);
        int _abs_1 = Math.abs(EntityAspect.xMoveProgress(_self));
        return (progress - _abs_1);
      } else {
        int _xMoveProgress_1 = EntityAspect.xMoveProgress(_self);
        float _signum = Math.signum(EntityAspect.xMoveProgress(_self));
        int _multiply = (((int) _signum) * progress);
        int _minus = (_xMoveProgress_1 - _multiply);
        EntityAspect.xMoveProgress(_self, _minus);
        return 0;
      }
    }
    return progress;
  }
  
  protected static int _privk3_yTowardCenter(final EntityAspectEntityAspectProperties _self_, final Entity _self, final int progress) {
    int _yMoveProgress = EntityAspect.yMoveProgress(_self);
    boolean _notEquals = (_yMoveProgress != 0);
    if (_notEquals) {
      int _abs = Math.abs(EntityAspect.yMoveProgress(_self));
      boolean _greaterThan = (progress > _abs);
      if (_greaterThan) {
        EntityAspect.yMoveProgress(_self, 0);
        int _abs_1 = Math.abs(EntityAspect.yMoveProgress(_self));
        return (progress - _abs_1);
      } else {
        int _yMoveProgress_1 = EntityAspect.yMoveProgress(_self);
        float _signum = Math.signum(EntityAspect.yMoveProgress(_self));
        int _multiply = (((int) _signum) * progress);
        int _minus = (_yMoveProgress_1 - _multiply);
        EntityAspect.yMoveProgress(_self, _minus);
        return 0;
      }
    }
    return progress;
  }
  
  protected static PassableTile _privk3_computeNextTile(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_enterNextTile(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    EntityAspect.currentTile(_self, EntityAspect.nextTile(_self));
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
  
  protected static PassableTile _privk3_currentTile(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentTile") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.example.pacman.xpacman.pacman.PassableTile) ret;
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
  
  protected static void _privk3_currentTile(final EntityAspectEntityAspectProperties _self_, final Entity _self, final PassableTile currentTile) {
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
  
  protected static PassableTile _privk3_nextTile(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getNextTile") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.example.pacman.xpacman.pacman.PassableTile) ret;
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
  
  protected static void _privk3_nextTile(final EntityAspectEntityAspectProperties _self_, final Entity _self, final PassableTile nextTile) {
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
  
  protected static int _privk3_xMoveProgress(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getXMoveProgress") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.xMoveProgress;
  }
  
  protected static void _privk3_xMoveProgress(final EntityAspectEntityAspectProperties _self_, final Entity _self, final int xMoveProgress) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setXMoveProgress")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, xMoveProgress);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.xMoveProgress = xMoveProgress;
    }
  }
  
  protected static int _privk3_yMoveProgress(final EntityAspectEntityAspectProperties _self_, final Entity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getYMoveProgress") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.yMoveProgress;
  }
  
  protected static void _privk3_yMoveProgress(final EntityAspectEntityAspectProperties _self_, final Entity _self, final int yMoveProgress) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setYMoveProgress")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, yMoveProgress);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.yMoveProgress = yMoveProgress;
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
}
