package org.tetrabox.example.pacman.xpacman.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.example.pacman.xpacman.aspects.AbstractTileAspect;
import org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties;
import org.tetrabox.example.pacman.xpacman.aspects.EntityAspect;
import org.tetrabox.example.pacman.xpacman.aspects.GhostAspect;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect;
import org.tetrabox.example.pacman.xpacman.aspects.TileAspect;
import org.tetrabox.example.pacman.xpacman.pacman.AbstractTile;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.Pellet;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

@Aspect(className = Board.class)
@SuppressWarnings("all")
public class BoardAspect {
  @InitializeModel
  @Step
  public static void initializeModel(final Board _self, final EList<String> args) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initializeModel(_self_, _self,args);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Board","initializeModel");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Step
  public static void reset(final Board _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_reset(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Board", "reset");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Main
  public static void run(final Board _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext
			.getSelf(_self);
	_privk3_run(_self_, _self);
	;
}
  
  @Step
  public static void update(final Board _self, final long deltaTime) {
	final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext
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
		manager.executeStep(_self, command, "Board", "update");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void enterFrightenedMode(final Board _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_enterFrightenedMode(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Board", "enterFrightenedMode");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static long elapsedTime(final Board _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_elapsedTime(_self_, _self);;
    return (long)result;
  }
  
  private static void elapsedTime(final Board _self, final long elapsedTime) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    _privk3_elapsedTime(_self_, _self,elapsedTime);;
  }
  
  private static long previousTime(final Board _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_previousTime(_self_, _self);;
    return (long)result;
  }
  
  private static void previousTime(final Board _self, final long previousTime) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    _privk3_previousTime(_self_, _self,previousTime);;
  }
  
  private static long targetFps(final Board _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_targetFps(_self_, _self);;
    return (long)result;
  }
  
  private static long targetFrameRate(final Board _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_targetFrameRate(_self_, _self);;
    return (long)result;
  }
  
  private static long modeChangeTimer(final Board _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_modeChangeTimer(_self_, _self);;
    return (long)result;
  }
  
  private static void modeChangeTimer(final Board _self, final long modeChangeTimer) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    _privk3_modeChangeTimer(_self_, _self,modeChangeTimer);;
  }
  
  private static boolean scatterMode(final Board _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_scatterMode(_self_, _self);;
    return (boolean)result;
  }
  
  private static void scatterMode(final Board _self, final boolean scatterMode) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    _privk3_scatterMode(_self_, _self,scatterMode);;
  }
  
  private static long frightenedTimer(final Board _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_frightenedTimer(_self_, _self);;
    return (long)result;
  }
  
  private static void frightenedTimer(final Board _self, final long frightenedTimer) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    _privk3_frightenedTimer(_self_, _self,frightenedTimer);;
  }
  
  private static int totalPellets(final Board _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_totalPellets(_self_, _self);;
    return (int)result;
  }
  
  private static void totalPellets(final Board _self, final int totalPellets) {
    final org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectContext.getSelf(_self);
    _privk3_totalPellets(_self_, _self,totalPellets);;
  }
  
  protected static void _privk3_initializeModel(final BoardAspectBoardAspectProperties _self_, final Board _self, final EList<String> args) {
    EList<AbstractTile> _tiles = _self.getTiles();
    final Consumer<AbstractTile> _function = (AbstractTile it) -> {
      AbstractTileAspect.initialize(it);
    };
    _tiles.forEach(_function);
    EList<Entity> _entities = _self.getEntities();
    final Consumer<Entity> _function_1 = (Entity it) -> {
      EntityAspect.initialize(it);
    };
    _entities.forEach(_function_1);
    EList<AbstractTile> _tiles_1 = _self.getTiles();
    final Function1<AbstractTile, Boolean> _function_2 = (AbstractTile it) -> {
      return Boolean.valueOf(((it instanceof Tile) && (!Objects.equal(TileAspect.pellet(((Tile) it)), null))));
    };
    Iterable<AbstractTile> _filter = IterableExtensions.<AbstractTile>filter(_tiles_1, _function_2);
    int _length = ((Object[])Conversions.unwrapArray(_filter, Object.class)).length;
    BoardAspect.totalPellets(_self, _length);
  }
  
  protected static void _privk3_reset(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    EList<Entity> _entities = _self.getEntities();
    final Consumer<Entity> _function = (Entity it) -> {
      EntityAspect.reset(it);
    };
    _entities.forEach(_function);
  }
  
  protected static void _privk3_run(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    try {
      EList<Entity> _entities = _self.getEntities();
      final Function1<Entity, Boolean> _function = (Entity it) -> {
        return Boolean.valueOf(((it instanceof Pacman) && (PacmanAspect.lives(((Pacman) it)) > 0)));
      };
      boolean pacmanAlive = IterableExtensions.<Entity>exists(_entities, _function);
      EList<AbstractTile> _tiles = _self.getTiles();
      final Function1<AbstractTile, Boolean> _function_1 = (AbstractTile it) -> {
        return Boolean.valueOf((it instanceof Tile));
      };
      Iterable<AbstractTile> _filter = IterableExtensions.<AbstractTile>filter(_tiles, _function_1);
      final Function1<AbstractTile, Tile> _function_2 = (AbstractTile it) -> {
        return ((Tile) it);
      };
      Iterable<Tile> _map = IterableExtensions.<AbstractTile, Tile>map(_filter, _function_2);
      final Function1<Tile, Boolean> _function_3 = (Tile it) -> {
        Pellet _pellet = TileAspect.pellet(it);
        return Boolean.valueOf((!Objects.equal(_pellet, null)));
      };
      boolean pelletsRemaining = IterableExtensions.<Tile>exists(_map, _function_3);
      long _nanoTime = System.nanoTime();
      BoardAspect.previousTime(_self, _nanoTime);
      while ((pacmanAlive && pelletsRemaining)) {
        {
          final long currentTime = System.nanoTime();
          long _previousTime = BoardAspect.previousTime(_self);
          final long deltaTime = (currentTime - _previousTime);
          BoardAspect.previousTime(_self, currentTime);
          BoardAspect.update(_self, deltaTime);
          EList<Entity> _entities_1 = _self.getEntities();
          final Function1<Entity, Boolean> _function_4 = (Entity it) -> {
            return Boolean.valueOf(((it instanceof Pacman) && (PacmanAspect.lives(((Pacman) it)) > 0)));
          };
          boolean _exists = IterableExtensions.<Entity>exists(_entities_1, _function_4);
          pacmanAlive = _exists;
          EList<AbstractTile> _tiles_1 = _self.getTiles();
          final Function1<AbstractTile, Boolean> _function_5 = (AbstractTile it) -> {
            return Boolean.valueOf((it instanceof Tile));
          };
          Iterable<AbstractTile> _filter_1 = IterableExtensions.<AbstractTile>filter(_tiles_1, _function_5);
          final Function1<AbstractTile, Tile> _function_6 = (AbstractTile it) -> {
            return ((Tile) it);
          };
          Iterable<Tile> _map_1 = IterableExtensions.<AbstractTile, Tile>map(_filter_1, _function_6);
          final Function1<Tile, Boolean> _function_7 = (Tile it) -> {
            Pellet _pellet = TileAspect.pellet(it);
            return Boolean.valueOf((!Objects.equal(_pellet, null)));
          };
          boolean _exists_1 = IterableExtensions.<Tile>exists(_map_1, _function_7);
          pelletsRemaining = _exists_1;
          long _targetFrameRate = BoardAspect.targetFrameRate(_self);
          boolean _lessThan = (deltaTime < _targetFrameRate);
          if (_lessThan) {
            long _targetFrameRate_1 = BoardAspect.targetFrameRate(_self);
            final long waitTime = (_targetFrameRate_1 - deltaTime);
            final long millis = (waitTime / 1000000);
            final int nanos = ((int) (waitTime % 1000000));
            Thread.sleep(millis, nanos);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static void _privk3_update(final BoardAspectBoardAspectProperties _self_, final Board _self, final long deltaTime) {
    long _elapsedTime = BoardAspect.elapsedTime(_self);
    long _plus = (_elapsedTime + deltaTime);
    BoardAspect.elapsedTime(_self, _plus);
    final int totalPellets = BoardAspect.totalPellets(_self);
    EList<AbstractTile> _tiles = _self.getTiles();
    final Function1<AbstractTile, Boolean> _function = (AbstractTile it) -> {
      return Boolean.valueOf(((it instanceof Tile) && (!Objects.equal(TileAspect.pellet(((Tile) it)), null))));
    };
    Iterable<AbstractTile> _filter = IterableExtensions.<AbstractTile>filter(_tiles, _function);
    final int remainingPellets = ((Object[])Conversions.unwrapArray(_filter, Object.class)).length;
    final boolean blueMilestoneReached = (remainingPellets == (totalPellets - (totalPellets / 8)));
    final boolean orangeMilestoneReached = (remainingPellets == (totalPellets - (totalPellets / 3)));
    final long frightenedTimer = BoardAspect.frightenedTimer(_self);
    long modeChangeTimer = BoardAspect.modeChangeTimer(_self);
    boolean modeChangeNeeded = false;
    if ((frightenedTimer > 0)) {
      if ((frightenedTimer > deltaTime)) {
        BoardAspect.frightenedTimer(_self, (frightenedTimer - deltaTime));
      } else {
        final long remainingDeltaTime = (deltaTime - frightenedTimer);
        BoardAspect.frightenedTimer(_self, 0);
        EList<Entity> _entities = _self.getEntities();
        final Function1<Entity, Boolean> _function_1 = (Entity it) -> {
          return Boolean.valueOf((it instanceof Ghost));
        };
        Iterable<Entity> _filter_1 = IterableExtensions.<Entity>filter(_entities, _function_1);
        final Function1<Entity, Ghost> _function_2 = (Entity it) -> {
          return ((Ghost) it);
        };
        Iterable<Ghost> _map = IterableExtensions.<Entity, Ghost>map(_filter_1, _function_2);
        final Consumer<Ghost> _function_3 = (Ghost it) -> {
          GhostAspect.switchFrightenedMode(it);
        };
        _map.forEach(_function_3);
        modeChangeTimer = (modeChangeTimer - remainingDeltaTime);
        if ((modeChangeTimer <= remainingDeltaTime)) {
          modeChangeNeeded = true;
        }
      }
    } else {
      modeChangeTimer = (modeChangeTimer - deltaTime);
      if ((modeChangeTimer <= deltaTime)) {
        modeChangeNeeded = true;
      }
    }
    if (modeChangeNeeded) {
      boolean _scatterMode = BoardAspect.scatterMode(_self);
      if (_scatterMode) {
        EList<Entity> _entities_1 = _self.getEntities();
        final Function1<Entity, Boolean> _function_4 = (Entity it) -> {
          return Boolean.valueOf((it instanceof Ghost));
        };
        Iterable<Entity> _filter_2 = IterableExtensions.<Entity>filter(_entities_1, _function_4);
        final Function1<Entity, Ghost> _function_5 = (Entity it) -> {
          return ((Ghost) it);
        };
        Iterable<Ghost> _map_1 = IterableExtensions.<Entity, Ghost>map(_filter_2, _function_5);
        final Consumer<Ghost> _function_6 = (Ghost it) -> {
          GhostAspect.enterChaseMode(it);
        };
        _map_1.forEach(_function_6);
        BoardAspect.scatterMode(_self, false);
        long _modeChangeTimer = modeChangeTimer;
        modeChangeTimer = (_modeChangeTimer + 20000000000l);
      } else {
        EList<Entity> _entities_2 = _self.getEntities();
        final Function1<Entity, Boolean> _function_7 = (Entity it) -> {
          return Boolean.valueOf((it instanceof Ghost));
        };
        Iterable<Entity> _filter_3 = IterableExtensions.<Entity>filter(_entities_2, _function_7);
        final Function1<Entity, Ghost> _function_8 = (Entity it) -> {
          return ((Ghost) it);
        };
        Iterable<Ghost> _map_2 = IterableExtensions.<Entity, Ghost>map(_filter_3, _function_8);
        final Consumer<Ghost> _function_9 = (Ghost it) -> {
          GhostAspect.enterScatterMode(it);
        };
        _map_2.forEach(_function_9);
        BoardAspect.scatterMode(_self, true);
        long _modeChangeTimer_1 = modeChangeTimer;
        modeChangeTimer = (_modeChangeTimer_1 + 5000000000l);
      }
    }
    BoardAspect.modeChangeTimer(_self, modeChangeTimer);
    EList<Entity> _entities_3 = _self.getEntities();
    final Function1<Entity, Boolean> _function_10 = (Entity it) -> {
      return Boolean.valueOf((it instanceof Ghost));
    };
    Iterable<Entity> _filter_4 = IterableExtensions.<Entity>filter(_entities_3, _function_10);
    final Consumer<Entity> _function_11 = (Entity it) -> {
      final Ghost ghost = ((Ghost) it);
      GhostPersonality _personnality = ghost.getPersonnality();
      boolean _equals = Objects.equal(_personnality, GhostPersonality.SHADOW);
      if (_equals) {
        if ((((BoardAspect.elapsedTime(_self) >= 10000000000l) && (EntityAspect.speed(ghost) == 100)) || ((BoardAspect.elapsedTime(_self) >= 20000000000l) && (EntityAspect.speed(ghost) == 105)))) {
          EntityAspect.modifySpeed(ghost, Integer.valueOf(5));
        }
      }
      if ((blueMilestoneReached && Objects.equal(ghost.getPersonnality(), GhostPersonality.BASHFUL))) {
        GhostAspect.activate(ghost);
      } else {
        if ((orangeMilestoneReached && Objects.equal(ghost.getPersonnality(), GhostPersonality.POKEY))) {
          GhostAspect.activate(ghost);
        }
      }
      GhostAspect.update(ghost, deltaTime);
    };
    _filter_4.forEach(_function_11);
    EList<Entity> _entities_4 = _self.getEntities();
    final Function1<Entity, Boolean> _function_12 = (Entity it) -> {
      return Boolean.valueOf((it instanceof Pacman));
    };
    Iterable<Entity> _filter_5 = IterableExtensions.<Entity>filter(_entities_4, _function_12);
    final Consumer<Entity> _function_13 = (Entity it) -> {
      EntityAspect.update(it, deltaTime);
    };
    _filter_5.forEach(_function_13);
  }
  
  protected static void _privk3_enterFrightenedMode(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    long _frightenedTimer = BoardAspect.frightenedTimer(_self);
    boolean _equals = (_frightenedTimer == 0);
    if (_equals) {
      EList<Entity> _entities = _self.getEntities();
      final Function1<Entity, Boolean> _function = (Entity it) -> {
        return Boolean.valueOf((it instanceof Ghost));
      };
      Iterable<Entity> _filter = IterableExtensions.<Entity>filter(_entities, _function);
      final Function1<Entity, Ghost> _function_1 = (Entity it) -> {
        return ((Ghost) it);
      };
      Iterable<Ghost> _map = IterableExtensions.<Entity, Ghost>map(_filter, _function_1);
      final Consumer<Ghost> _function_2 = (Ghost it) -> {
        GhostAspect.switchFrightenedMode(it);
      };
      _map.forEach(_function_2);
    }
    BoardAspect.frightenedTimer(_self, 10000000000l);
  }
  
  protected static long _privk3_elapsedTime(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getElapsedTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.elapsedTime;
  }
  
  protected static void _privk3_elapsedTime(final BoardAspectBoardAspectProperties _self_, final Board _self, final long elapsedTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setElapsedTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, elapsedTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.elapsedTime = elapsedTime;
    }
  }
  
  protected static long _privk3_previousTime(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPreviousTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.previousTime;
  }
  
  protected static void _privk3_previousTime(final BoardAspectBoardAspectProperties _self_, final Board _self, final long previousTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPreviousTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, previousTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.previousTime = previousTime;
    }
  }
  
  protected static long _privk3_targetFps(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTargetFps") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.targetFps;
  }
  
  protected static long _privk3_targetFrameRate(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTargetFrameRate") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.targetFrameRate;
  }
  
  protected static long _privk3_modeChangeTimer(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getModeChangeTimer") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.modeChangeTimer;
  }
  
  protected static void _privk3_modeChangeTimer(final BoardAspectBoardAspectProperties _self_, final Board _self, final long modeChangeTimer) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setModeChangeTimer")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, modeChangeTimer);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.modeChangeTimer = modeChangeTimer;
    }
  }
  
  protected static boolean _privk3_scatterMode(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isScatterMode") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.scatterMode;
  }
  
  protected static void _privk3_scatterMode(final BoardAspectBoardAspectProperties _self_, final Board _self, final boolean scatterMode) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setScatterMode")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, scatterMode);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.scatterMode = scatterMode;
    }
  }
  
  protected static long _privk3_frightenedTimer(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getFrightenedTimer") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.frightenedTimer;
  }
  
  protected static void _privk3_frightenedTimer(final BoardAspectBoardAspectProperties _self_, final Board _self, final long frightenedTimer) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setFrightenedTimer")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, frightenedTimer);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.frightenedTimer = frightenedTimer;
    }
  }
  
  protected static int _privk3_totalPellets(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTotalPellets") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.totalPellets;
  }
  
  protected static void _privk3_totalPellets(final BoardAspectBoardAspectProperties _self_, final Board _self, final int totalPellets) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTotalPellets")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, totalPellets);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.totalPellets = totalPellets;
    }
  }
}
