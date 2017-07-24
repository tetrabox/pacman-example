package org.tetrabox.example.pacman.xpacman.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.example.pacman.xpacman.aspects.EntityAspect;
import org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

@Aspect(className = Ghost.class)
@SuppressWarnings("all")
public class GhostAspect extends EntityAspect {
  @Step
  public static void changeTargetTile(final Ghost _self, final Tile targetTile) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_changeTargetTile(_self_, _self, targetTile);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Ghost", "changeTargetTile");
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
  public static void enterNextTile(final Ghost _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
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
		manager.executeStep(_self, command, "Ghost", "enterNextTile");
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
  protected static Tile computeNextTile(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Ghost){
    					result = org.tetrabox.example.pacman.xpacman.aspects.GhostAspect._privk3_computeNextTile(_self_, (org.tetrabox.example.pacman.xpacman.pacman.Ghost)_self);
    } else  if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Entity){
    					result = org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.computeNextTile((org.tetrabox.example.pacman.xpacman.pacman.Entity)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.example.pacman.xpacman.pacman.Tile)result;
  }
  
  private static int computeDistanceBetweenTiles(final Ghost _self, final Tile from, final Tile to) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_computeDistanceBetweenTiles(_self_, _self,from,to);;
    return (int)result;
  }
  
  public static Tile targetTile(final Ghost _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_targetTile(_self_, _self);
	;
	return (org.tetrabox.example.pacman.xpacman.pacman.Tile) result;
}
  
  public static void targetTile(final Ghost _self, final Tile targetTile) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	_privk3_targetTile(_self_, _self, targetTile);
	;
}
  
  protected static void _privk3_changeTargetTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final Tile targetTile) {
    GhostAspect.targetTile(_self, targetTile);
  }
  
  private static void super_enterNextTile(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_enterNextTile(_self_, _self);
  }
  
  protected static void _privk3_enterNextTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    GhostAspect.super_enterNextTile(_self);
    Tile _currentTile = EntityAspect.currentTile(_self);
    EObject _eContainer = _currentTile.eContainer();
    final Board board = ((Board) _eContainer);
    EList<Entity> _entities = board.getEntities();
    final Function1<Entity, Boolean> _function = (Entity it) -> {
      return Boolean.valueOf((Objects.equal(EntityAspect.currentTile(it), EntityAspect.currentTile(_self)) && (it instanceof Pacman)));
    };
    Iterable<Entity> _filter = IterableExtensions.<Entity>filter(_entities, _function);
    final Consumer<Entity> _function_1 = (Entity it) -> {
      PacmanAspect.kill(((Pacman) it));
    };
    _filter.forEach(_function_1);
  }
  
  protected static Tile _privk3_computeNextTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    final Tile currentTile = EntityAspect.nextTile(_self);
    Iterable<Tile> _switchResult = null;
    int _direction = EntityAspect.direction(_self);
    switch (_direction) {
      case 0:
        Tile _top = currentTile.getTop();
        Tile _left = currentTile.getLeft();
        Tile _right = currentTile.getRight();
        ArrayList<Tile> _newArrayList = CollectionLiterals.<Tile>newArrayList(_top, _left, _right);
        final Function1<Tile, Boolean> _function = (Tile it) -> {
          return Boolean.valueOf((!Objects.equal(it, null)));
        };
        _switchResult = IterableExtensions.<Tile>filter(_newArrayList, _function);
        break;
      case 1:
        Tile _top_1 = currentTile.getTop();
        Tile _left_1 = currentTile.getLeft();
        Tile _bottom = currentTile.getBottom();
        ArrayList<Tile> _newArrayList_1 = CollectionLiterals.<Tile>newArrayList(_top_1, _left_1, _bottom);
        final Function1<Tile, Boolean> _function_1 = (Tile it) -> {
          return Boolean.valueOf((!Objects.equal(it, null)));
        };
        _switchResult = IterableExtensions.<Tile>filter(_newArrayList_1, _function_1);
        break;
      case 2:
        Tile _left_2 = currentTile.getLeft();
        Tile _bottom_1 = currentTile.getBottom();
        Tile _right_1 = currentTile.getRight();
        ArrayList<Tile> _newArrayList_2 = CollectionLiterals.<Tile>newArrayList(_left_2, _bottom_1, _right_1);
        final Function1<Tile, Boolean> _function_2 = (Tile it) -> {
          return Boolean.valueOf((!Objects.equal(it, null)));
        };
        _switchResult = IterableExtensions.<Tile>filter(_newArrayList_2, _function_2);
        break;
      case 3:
        Tile _top_2 = currentTile.getTop();
        Tile _bottom_2 = currentTile.getBottom();
        Tile _right_2 = currentTile.getRight();
        ArrayList<Tile> _newArrayList_3 = CollectionLiterals.<Tile>newArrayList(_top_2, _bottom_2, _right_2);
        final Function1<Tile, Boolean> _function_3 = (Tile it) -> {
          return Boolean.valueOf((!Objects.equal(it, null)));
        };
        _switchResult = IterableExtensions.<Tile>filter(_newArrayList_3, _function_3);
        break;
    }
    final Iterable<Tile> candidateTiles = _switchResult;
    Tile result = null;
    int _size = IterableExtensions.size(candidateTiles);
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      final Tile targetTile = GhostAspect.targetTile(_self);
      Tile _head = IterableExtensions.<Tile>head(candidateTiles);
      result = _head;
      int d1 = GhostAspect.computeDistanceBetweenTiles(_self, result, targetTile);
      Iterable<Tile> _tail = IterableExtensions.<Tile>tail(candidateTiles);
      for (final Tile tile : _tail) {
        {
          final int d2 = GhostAspect.computeDistanceBetweenTiles(_self, tile, targetTile);
          if ((d2 > d1)) {
            result = tile;
            d1 = d2;
          }
        }
      }
    } else {
      Tile _head_1 = IterableExtensions.<Tile>head(candidateTiles);
      result = _head_1;
    }
    Tile _top_3 = currentTile.getTop();
    boolean _equals = Objects.equal(result, _top_3);
    if (_equals) {
      EntityAspect.changeDirection(_self, Integer.valueOf(0));
    } else {
      Tile _left_3 = currentTile.getLeft();
      boolean _equals_1 = Objects.equal(result, _left_3);
      if (_equals_1) {
        EntityAspect.changeDirection(_self, Integer.valueOf(1));
      } else {
        Tile _bottom_3 = currentTile.getBottom();
        boolean _equals_2 = Objects.equal(result, _bottom_3);
        if (_equals_2) {
          EntityAspect.changeDirection(_self, Integer.valueOf(2));
        } else {
          Tile _right_3 = currentTile.getRight();
          boolean _equals_3 = Objects.equal(result, _right_3);
          if (_equals_3) {
            EntityAspect.changeDirection(_self, Integer.valueOf(3));
          }
        }
      }
    }
    return result;
  }
  
  protected static int _privk3_computeDistanceBetweenTiles(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final Tile from, final Tile to) {
    int _x = to.getX();
    int _x_1 = from.getX();
    int _minus = (_x - _x_1);
    int _x_2 = to.getX();
    int _x_3 = from.getX();
    int _minus_1 = (_x_2 - _x_3);
    int _multiply = (_minus * _minus_1);
    int _y = to.getY();
    int _y_1 = from.getY();
    int _minus_2 = (_y - _y_1);
    int _y_2 = to.getY();
    int _y_3 = from.getY();
    int _minus_3 = (_y_2 - _y_3);
    int _multiply_1 = (_minus_2 * _minus_3);
    return (_multiply + _multiply_1);
  }
  
  protected static Tile _privk3_targetTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTargetTile") &&
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
    return _self_.targetTile;
  }
  
  protected static void _privk3_targetTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final Tile targetTile) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setTargetTile")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, targetTile);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.targetTile = targetTile;
    }
  }
}
