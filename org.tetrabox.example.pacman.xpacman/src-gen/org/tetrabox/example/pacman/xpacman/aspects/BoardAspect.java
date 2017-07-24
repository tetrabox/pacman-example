package org.tetrabox.example.pacman.xpacman.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.example.pacman.xpacman.aspects.BoardAspectBoardAspectProperties;
import org.tetrabox.example.pacman.xpacman.aspects.EntityAspect;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect;
import org.tetrabox.example.pacman.xpacman.aspects.TileAspect;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
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
    	fr.inria.diverse.event.commons.model.IEventManager eventManager = fr.inria.diverse.event.commons.model.EventManagerRegistry.getInstance().findEventManager();
    	if (eventManager != null) {
    	
    		eventManager.manageEvents();
    	}
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
  
  protected static void _privk3_initializeModel(final BoardAspectBoardAspectProperties _self_, final Board _self, final EList<String> args) {
    EList<Tile> _tiles = _self.getTiles();
    final Consumer<Tile> _function = (Tile it) -> {
      TileAspect.initialize(it);
    };
    _tiles.forEach(_function);
    EList<Entity> _entities = _self.getEntities();
    final Consumer<Entity> _function_1 = (Entity it) -> {
      EntityAspect.initialize(it);
    };
    _entities.forEach(_function_1);
  }
  
  protected static void _privk3_reset(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    EList<Entity> _entities = _self.getEntities();
    final Consumer<Entity> _function = (Entity it) -> {
      Tile _initialTile = it.getInitialTile();
      EntityAspect.currentTile(it, _initialTile);
    };
    _entities.forEach(_function);
  }
  
  protected static void _privk3_run(final BoardAspectBoardAspectProperties _self_, final Board _self) {
    EList<Entity> _entities = _self.getEntities();
    final Function1<Entity, Boolean> _function = (Entity it) -> {
      return Boolean.valueOf(((it instanceof Pacman) && (PacmanAspect.lives(((Pacman) it)) > 0)));
    };
    boolean pacmanAlive = IterableExtensions.<Entity>exists(_entities, _function);
    EList<Tile> _tiles = _self.getTiles();
    final Function1<Tile, Boolean> _function_1 = (Tile it) -> {
      return Boolean.valueOf(TileAspect.hasPellet(it));
    };
    boolean pelletsRemaining = IterableExtensions.<Tile>exists(_tiles, _function_1);
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
        final Function1<Entity, Boolean> _function_2 = (Entity it) -> {
          return Boolean.valueOf(((it instanceof Pacman) && (PacmanAspect.lives(((Pacman) it)) > 0)));
        };
        boolean _exists = IterableExtensions.<Entity>exists(_entities_1, _function_2);
        pacmanAlive = _exists;
        EList<Tile> _tiles_1 = _self.getTiles();
        final Function1<Tile, Boolean> _function_3 = (Tile it) -> {
          return Boolean.valueOf(TileAspect.hasPellet(it));
        };
        boolean _exists_1 = IterableExtensions.<Tile>exists(_tiles_1, _function_3);
        pelletsRemaining = _exists_1;
      }
    }
  }
  
  protected static void _privk3_update(final BoardAspectBoardAspectProperties _self_, final Board _self, final long deltaTime) {
    EList<Entity> _entities = _self.getEntities();
    final Function1<Entity, Boolean> _function = (Entity it) -> {
      return Boolean.valueOf((it instanceof Ghost));
    };
    Iterable<Entity> _filter = IterableExtensions.<Entity>filter(_entities, _function);
    final Consumer<Entity> _function_1 = (Entity it) -> {
      EntityAspect.update(it, deltaTime);
    };
    _filter.forEach(_function_1);
    EList<Entity> _entities_1 = _self.getEntities();
    final Function1<Entity, Boolean> _function_2 = (Entity it) -> {
      return Boolean.valueOf((it instanceof Pacman));
    };
    Iterable<Entity> _filter_1 = IterableExtensions.<Entity>filter(_entities_1, _function_2);
    final Consumer<Entity> _function_3 = (Entity it) -> {
      EntityAspect.update(it, deltaTime);
    };
    _filter_1.forEach(_function_3);
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
}
