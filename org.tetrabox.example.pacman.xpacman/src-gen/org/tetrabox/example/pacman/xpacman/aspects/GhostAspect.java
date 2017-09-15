package org.tetrabox.example.pacman.xpacman.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.example.pacman.xpacman.aspects.EntityAspect;
import org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties;
import org.tetrabox.example.pacman.xpacman.aspects.PacmanAspect;
import org.tetrabox.example.pacman.xpacman.pacman.AbstractTile;
import org.tetrabox.example.pacman.xpacman.pacman.Board;
import org.tetrabox.example.pacman.xpacman.pacman.Entity;
import org.tetrabox.example.pacman.xpacman.pacman.Ghost;
import org.tetrabox.example.pacman.xpacman.pacman.GhostHouseTile;
import org.tetrabox.example.pacman.xpacman.pacman.GhostPersonality;
import org.tetrabox.example.pacman.xpacman.pacman.Pacman;
import org.tetrabox.example.pacman.xpacman.pacman.PassableTile;
import org.tetrabox.example.pacman.xpacman.pacman.Tile;

@Aspect(className = Ghost.class)
@SuppressWarnings("all")
public class GhostAspect extends EntityAspect {
  @OverrideAspectMethod
  public static void initialize(final Ghost _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	_privk3_initialize(_self_, _self);
	;
}
  
  @Step
  @OverrideAspectMethod
  public static void update(final Ghost _self, final long deltaTime) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
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
		manager.executeStep(_self, command, "Ghost", "update");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void activate(final Ghost _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_activate(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Ghost", "activate");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void enterChaseMode(final Ghost _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_enterChaseMode(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Ghost", "enterChaseMode");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void enterScatterMode(final Ghost _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_enterScatterMode(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Ghost", "enterScatterMode");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void switchFrightenedMode(final Ghost _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_switchFrightenedMode(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Ghost", "switchFrightenedMode");
	} else {
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void changeTargetTile(final Ghost _self, final AbstractTile targetTile) {
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
		command.execute();
	}
	;
	;
}
  
  @Step
  public static void eat(final Ghost _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
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
		manager.executeStep(_self, command, "Ghost", "eat");
	} else {
		command.execute();
	}
	;
	;
}
  
  private static void findGhostHouseExit(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    _privk3_findGhostHouseExit(_self_, _self);;
  }
  
  private static void addToOpenList(final Ghost _self, final AbstractTile tile, final List<PassableTile> openList, final Set<PassableTile> closedSet) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    _privk3_addToOpenList(_self_, _self,tile,openList,closedSet);;
  }
  
  private static AbstractTile findTargetTile(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_findTargetTile(_self_, _self);;
    return (org.tetrabox.example.pacman.xpacman.pacman.AbstractTile)result;
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
		command.execute();
	}
	;
	;
}
  
  @OverrideAspectMethod
  protected static PassableTile computeNextTile(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Ghost){
    					result = org.tetrabox.example.pacman.xpacman.aspects.GhostAspect._privk3_computeNextTile(_self_, (org.tetrabox.example.pacman.xpacman.pacman.Ghost)_self);
    } else  if (_self instanceof org.tetrabox.example.pacman.xpacman.pacman.Entity){
    					result = org.tetrabox.example.pacman.xpacman.aspects.EntityAspect.computeNextTile((org.tetrabox.example.pacman.xpacman.pacman.Entity)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (org.tetrabox.example.pacman.xpacman.pacman.PassableTile)result;
  }
  
  private static int computeDistanceBetweenTiles(final Ghost _self, final AbstractTile from, final AbstractTile to) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_computeDistanceBetweenTiles(_self_, _self,from,to);;
    return (int)result;
  }
  
  public static AbstractTile targetTile(final Ghost _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_targetTile(_self_, _self);
	;
	return (org.tetrabox.example.pacman.xpacman.pacman.AbstractTile) result;
}
  
  public static void targetTile(final Ghost _self, final AbstractTile targetTile) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	_privk3_targetTile(_self_, _self, targetTile);
	;
}
  
  public static boolean frightenedMode(final Ghost _self) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_frightenedMode(_self_, _self);
	;
	return (boolean) result;
}
  
  public static void frightenedMode(final Ghost _self, final boolean frightenedMode) {
	final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext
			.getSelf(_self);
	_privk3_frightenedMode(_self_, _self, frightenedMode);
	;
}
  
  private static Board board(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_board(_self_, _self);;
    return (org.tetrabox.example.pacman.xpacman.pacman.Board)result;
  }
  
  private static void board(final Ghost _self, final Board board) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    _privk3_board(_self_, _self,board);;
  }
  
  private static PassableTile previousTile(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_previousTile(_self_, _self);;
    return (org.tetrabox.example.pacman.xpacman.pacman.PassableTile)result;
  }
  
  private static void previousTile(final Ghost _self, final PassableTile previousTile) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    _privk3_previousTile(_self_, _self,previousTile);;
  }
  
  private static boolean activated(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_activated(_self_, _self);;
    return (boolean)result;
  }
  
  private static void activated(final Ghost _self, final boolean activated) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    _privk3_activated(_self_, _self,activated);;
  }
  
  private static Tile ghostHouseExit(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_ghostHouseExit(_self_, _self);;
    return (org.tetrabox.example.pacman.xpacman.pacman.Tile)result;
  }
  
  private static void ghostHouseExit(final Ghost _self, final Tile ghostHouseExit) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    _privk3_ghostHouseExit(_self_, _self,ghostHouseExit);;
  }
  
  private static boolean chaseMode(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_chaseMode(_self_, _self);;
    return (boolean)result;
  }
  
  private static void chaseMode(final Ghost _self, final boolean chaseMode) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    _privk3_chaseMode(_self_, _self,chaseMode);;
  }
  
  private static Random rand(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.GhostAspectGhostAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_rand(_self_, _self);;
    return (java.util.Random)result;
  }
  
  private static void super_initialize(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_initialize(_self_, _self);
  }
  
  protected static void _privk3_initialize(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    EntityAspect.speed(_self, 100);
    EObject _eContainer = _self.eContainer();
    GhostAspect.board(_self, ((Board) _eContainer));
    PassableTile _initialTile = _self.getInitialTile();
    EntityAspect.currentTile(_self, _initialTile);
    GhostAspect.previousTile(_self, null);
    GhostAspect.findGhostHouseExit(_self);
    GhostAspect.chaseMode(_self, true);
    GhostAspect.frightenedMode(_self, false);
    if ((Objects.equal(_self.getPersonnality(), GhostPersonality.SHADOW) || Objects.equal(_self.getPersonnality(), GhostPersonality.SPEEDY))) {
      GhostAspect.activate(_self);
    } else {
      GhostAspect.activated(_self, false);
    }
  }
  
  private static void super_update(final Ghost _self, final long deltaTime) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_update(_self_, _self,deltaTime);
  }
  
  protected static void _privk3_update(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final long deltaTime) {
    boolean _activated = GhostAspect.activated(_self);
    if (_activated) {
      GhostAspect.super_update(_self, deltaTime);
      Board _board = GhostAspect.board(_self);
      EList<Entity> _entities = _board.getEntities();
      final Function1<Entity, Boolean> _function = (Entity it) -> {
        return Boolean.valueOf(((it instanceof Pacman) && Objects.equal(EntityAspect.currentTile(it), EntityAspect.currentTile(_self))));
      };
      final Iterable<Entity> pacmen = IterableExtensions.<Entity>filter(_entities, _function);
      boolean _isEmpty = IterableExtensions.isEmpty(pacmen);
      boolean _not = (!_isEmpty);
      if (_not) {
        boolean _frightenedMode = GhostAspect.frightenedMode(_self);
        if (_frightenedMode) {
          GhostAspect.eat(_self);
        } else {
          final Consumer<Entity> _function_1 = (Entity it) -> {
            PacmanAspect.eat(((Pacman) it));
          };
          pacmen.forEach(_function_1);
        }
      }
    }
  }
  
  protected static void _privk3_activate(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    GhostAspect.activated(_self, true);
    AbstractTile _findTargetTile = GhostAspect.findTargetTile(_self);
    GhostAspect.changeTargetTile(_self, _findTargetTile);
    PassableTile _computeNextTile = GhostAspect.computeNextTile(_self);
    EntityAspect.nextTile(_self, _computeNextTile);
  }
  
  protected static void _privk3_enterChaseMode(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    GhostAspect.chaseMode(_self, true);
  }
  
  protected static void _privk3_enterScatterMode(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    GhostAspect.chaseMode(_self, false);
  }
  
  protected static void _privk3_switchFrightenedMode(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    boolean _frightenedMode = GhostAspect.frightenedMode(_self);
    if (_frightenedMode) {
      GhostAspect.frightenedMode(_self, false);
      EntityAspect.modifySpeed(_self, Integer.valueOf(50));
    } else {
      GhostAspect.frightenedMode(_self, true);
      EntityAspect.modifySpeed(_self, Integer.valueOf((-50)));
    }
  }
  
  protected static void _privk3_changeTargetTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final AbstractTile targetTile) {
    GhostAspect.targetTile(_self, targetTile);
    PassableTile _computeNextTile = GhostAspect.computeNextTile(_self);
    EntityAspect.nextTile(_self, _computeNextTile);
  }
  
  protected static void _privk3_eat(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    EntityAspect.reset(_self);
  }
  
  protected static void _privk3_findGhostHouseExit(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    final HashSet<PassableTile> closedSet = CollectionLiterals.<PassableTile>newHashSet();
    PassableTile _initialTile = _self.getInitialTile();
    final ArrayList<PassableTile> openList = CollectionLiterals.<PassableTile>newArrayList(_initialTile);
    boolean found = false;
    while (((!openList.isEmpty()) && (!found))) {
      {
        final PassableTile t = openList.remove(0);
        if ((t instanceof Tile)) {
          GhostAspect.ghostHouseExit(_self, ((Tile)t));
          found = true;
        }
        closedSet.add(t);
        AbstractTile _top = t.getTop();
        GhostAspect.addToOpenList(_self, _top, openList, closedSet);
        AbstractTile _bottom = t.getBottom();
        GhostAspect.addToOpenList(_self, _bottom, openList, closedSet);
        AbstractTile _left = t.getLeft();
        GhostAspect.addToOpenList(_self, _left, openList, closedSet);
        AbstractTile _right = t.getRight();
        GhostAspect.addToOpenList(_self, _right, openList, closedSet);
      }
    }
  }
  
  protected static void _privk3_addToOpenList(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final AbstractTile tile, final List<PassableTile> openList, final Set<PassableTile> closedSet) {
    if ((((!openList.contains(tile)) && (!closedSet.contains(tile))) && (tile instanceof PassableTile))) {
      openList.add(((PassableTile) tile));
    }
  }
  
  protected static AbstractTile _privk3_findTargetTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    Tile _xifexpression = null;
    boolean _activated = GhostAspect.activated(_self);
    if (_activated) {
      Tile _xblockexpression = null;
      {
        final PassableTile selfTile = EntityAspect.currentTile(_self);
        Tile _xifexpression_1 = null;
        if ((selfTile instanceof GhostHouseTile)) {
          _xifexpression_1 = GhostAspect.ghostHouseExit(_self);
        } else {
          boolean _frightenedMode = GhostAspect.frightenedMode(_self);
          if (_frightenedMode) {
            final PassableTile previousTile = GhostAspect.previousTile(_self);
            final Function1<AbstractTile, Boolean> _function = (AbstractTile t) -> {
              return Boolean.valueOf(((((!Objects.equal(t, null)) && 
                (!Objects.equal(t, previousTile))) && 
                (t instanceof PassableTile)) && 
                (!(t instanceof GhostHouseTile))));
            };
            final Function1<AbstractTile, Boolean> filter = _function;
            AbstractTile _top = selfTile.getTop();
            AbstractTile _left = selfTile.getLeft();
            AbstractTile _bottom = selfTile.getBottom();
            AbstractTile _right = selfTile.getRight();
            ArrayList<AbstractTile> _newArrayList = CollectionLiterals.<AbstractTile>newArrayList(_top, _left, _bottom, _right);
            Iterable<AbstractTile> _filter = IterableExtensions.<AbstractTile>filter(_newArrayList, filter);
            final Function1<AbstractTile, PassableTile> _function_1 = (AbstractTile it) -> {
              return ((PassableTile) it);
            };
            final Iterable<PassableTile> candidateTiles = IterableExtensions.<AbstractTile, PassableTile>map(_filter, _function_1);
            Random _rand = GhostAspect.rand(_self);
            int _size = IterableExtensions.size(candidateTiles);
            int _nextInt = _rand.nextInt(_size);
            return ((AbstractTile[])Conversions.unwrapArray(candidateTiles, AbstractTile.class))[_nextInt];
          } else {
            boolean _chaseMode = GhostAspect.chaseMode(_self);
            if (_chaseMode) {
              Board _board = GhostAspect.board(_self);
              EList<Entity> _entities = _board.getEntities();
              final Function1<Entity, Boolean> _function_2 = (Entity it) -> {
                return Boolean.valueOf((it instanceof Pacman));
              };
              Iterable<Entity> _filter_1 = IterableExtensions.<Entity>filter(_entities, _function_2);
              final Entity pacman = IterableExtensions.<Entity>head(_filter_1);
              final PassableTile pacmanTile = EntityAspect.currentTile(pacman);
              AbstractTile _switchResult = null;
              GhostPersonality _personnality = _self.getPersonnality();
              if (_personnality != null) {
                switch (_personnality) {
                  case SHADOW:
                    _switchResult = EntityAspect.currentTile(pacman);
                    break;
                  case SPEEDY:
                    AbstractTile _switchResult_1 = null;
                    int _direction = EntityAspect.direction(pacman);
                    switch (_direction) {
                      case 0:
                        AbstractTile _top_1 = null;
                        if (pacmanTile!=null) {
                          _top_1=pacmanTile.getTop();
                        }
                        AbstractTile _top_2 = null;
                        if (_top_1!=null) {
                          _top_2=_top_1.getTop();
                        }
                        AbstractTile _top_3 = null;
                        if (_top_2!=null) {
                          _top_3=_top_2.getTop();
                        }
                        AbstractTile _top_4 = null;
                        if (_top_3!=null) {
                          _top_4=_top_3.getTop();
                        }
                        _switchResult_1 = _top_4;
                        break;
                      case 1:
                        AbstractTile _left_1 = null;
                        if (pacmanTile!=null) {
                          _left_1=pacmanTile.getLeft();
                        }
                        AbstractTile _left_2 = null;
                        if (_left_1!=null) {
                          _left_2=_left_1.getLeft();
                        }
                        AbstractTile _left_3 = null;
                        if (_left_2!=null) {
                          _left_3=_left_2.getLeft();
                        }
                        AbstractTile _left_4 = null;
                        if (_left_3!=null) {
                          _left_4=_left_3.getLeft();
                        }
                        _switchResult_1 = _left_4;
                        break;
                      case 2:
                        AbstractTile _bottom_1 = null;
                        if (pacmanTile!=null) {
                          _bottom_1=pacmanTile.getBottom();
                        }
                        AbstractTile _bottom_2 = null;
                        if (_bottom_1!=null) {
                          _bottom_2=_bottom_1.getBottom();
                        }
                        AbstractTile _bottom_3 = null;
                        if (_bottom_2!=null) {
                          _bottom_3=_bottom_2.getBottom();
                        }
                        AbstractTile _bottom_4 = null;
                        if (_bottom_3!=null) {
                          _bottom_4=_bottom_3.getBottom();
                        }
                        _switchResult_1 = _bottom_4;
                        break;
                      case 3:
                        AbstractTile _right_1 = null;
                        if (pacmanTile!=null) {
                          _right_1=pacmanTile.getRight();
                        }
                        AbstractTile _right_2 = _right_1.getRight();
                        AbstractTile _right_3 = _right_2.getRight();
                        _switchResult_1 = _right_3.getRight();
                        break;
                      default:
                        _switchResult_1 = null;
                        break;
                    }
                    _switchResult = _switchResult_1;
                    break;
                  case BASHFUL:
                    AbstractTile _xblockexpression_1 = null;
                    {
                      AbstractTile _switchResult_2 = null;
                      int _direction_1 = EntityAspect.direction(pacman);
                      switch (_direction_1) {
                        case 0:
                          AbstractTile _top_5 = null;
                          if (pacmanTile!=null) {
                            _top_5=pacmanTile.getTop();
                          }
                          AbstractTile _top_6 = null;
                          if (_top_5!=null) {
                            _top_6=_top_5.getTop();
                          }
                          _switchResult_2 = _top_6;
                          break;
                        case 1:
                          AbstractTile _left_5 = null;
                          if (pacmanTile!=null) {
                            _left_5=pacmanTile.getLeft();
                          }
                          AbstractTile _left_6 = null;
                          if (_left_5!=null) {
                            _left_6=_left_5.getLeft();
                          }
                          _switchResult_2 = _left_6;
                          break;
                        case 2:
                          AbstractTile _bottom_5 = null;
                          if (pacmanTile!=null) {
                            _bottom_5=pacmanTile.getBottom();
                          }
                          AbstractTile _bottom_6 = null;
                          if (_bottom_5!=null) {
                            _bottom_6=_bottom_5.getBottom();
                          }
                          _switchResult_2 = _bottom_6;
                          break;
                        case 3:
                          AbstractTile _right_4 = null;
                          if (pacmanTile!=null) {
                            _right_4=pacmanTile.getRight();
                          }
                          AbstractTile _right_5 = null;
                          if (_right_4!=null) {
                            _right_5=_right_4.getRight();
                          }
                          _switchResult_2 = _right_5;
                          break;
                        default:
                          _switchResult_2 = null;
                          break;
                      }
                      final AbstractTile tile2 = _switchResult_2;
                      Board _board_1 = GhostAspect.board(_self);
                      EList<Entity> _entities_1 = _board_1.getEntities();
                      final Function1<Entity, Boolean> _function_3 = (Entity it) -> {
                        return Boolean.valueOf((it instanceof Ghost));
                      };
                      Iterable<Entity> _filter_2 = IterableExtensions.<Entity>filter(_entities_1, _function_3);
                      final Function1<Entity, Boolean> _function_4 = (Entity it) -> {
                        GhostPersonality _personnality_1 = ((Ghost) it).getPersonnality();
                        return Boolean.valueOf(Objects.equal(_personnality_1, GhostPersonality.SHADOW));
                      };
                      Entity _findFirst = IterableExtensions.<Entity>findFirst(_filter_2, _function_4);
                      PassableTile _currentTile = null;
                      if (_findFirst!=null) {
                        _currentTile=EntityAspect.currentTile(_findFirst);
                      }
                      final PassableTile tile1 = _currentTile;
                      int _x = tile2.getX();
                      int _multiply = (2 * _x);
                      int _x_1 = tile1.getX();
                      int _plus = (_multiply + _x_1);
                      final int x = (_plus % 28);
                      int _y = tile2.getY();
                      int _multiply_1 = (2 * _y);
                      int _y_1 = tile1.getY();
                      int _plus_1 = (_multiply_1 + _y_1);
                      final int y = (_plus_1 % 36);
                      Board _board_2 = GhostAspect.board(_self);
                      EList<AbstractTile> _tiles = _board_2.getTiles();
                      final Function1<AbstractTile, Boolean> _function_5 = (AbstractTile it) -> {
                        return Boolean.valueOf(((it.getX() == x) && (it.getY() == y)));
                      };
                      _xblockexpression_1 = IterableExtensions.<AbstractTile>findFirst(_tiles, _function_5);
                    }
                    _switchResult = _xblockexpression_1;
                    break;
                  case POKEY:
                    AbstractTile _xblockexpression_2 = null;
                    {
                      final int d = GhostAspect.computeDistanceBetweenTiles(_self, selfTile, pacmanTile);
                      AbstractTile _xifexpression_2 = null;
                      if ((d > 8)) {
                        return pacmanTile;
                      } else {
                        _xifexpression_2 = _self.getScatterTile();
                      }
                      _xblockexpression_2 = _xifexpression_2;
                    }
                    _switchResult = _xblockexpression_2;
                    break;
                  default:
                    break;
                }
              }
              return _switchResult;
            } else {
              return _self.getScatterTile();
            }
          }
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      return null;
    }
    return _xifexpression;
  }
  
  private static void super_enterNextTile(final Ghost _self) {
    final org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectProperties _self_ = org.tetrabox.example.pacman.xpacman.aspects.EntityAspectEntityAspectContext.getSelf(_self);
     org.tetrabox.example.pacman.xpacman.aspects.EntityAspect._privk3_enterNextTile(_self_, _self);
  }
  
  protected static void _privk3_enterNextTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    PassableTile _currentTile = EntityAspect.currentTile(_self);
    GhostAspect.previousTile(_self, _currentTile);
    GhostAspect.super_enterNextTile(_self);
    AbstractTile _findTargetTile = GhostAspect.findTargetTile(_self);
    GhostAspect.changeTargetTile(_self, _findTargetTile);
  }
  
  protected static PassableTile _privk3_computeNextTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    final PassableTile currentTile = EntityAspect.currentTile(_self);
    if ((GhostAspect.activated(_self) || (!(currentTile instanceof GhostHouseTile)))) {
      final PassableTile previousTile = GhostAspect.previousTile(_self);
      final Function1<AbstractTile, Boolean> _function = (AbstractTile t) -> {
        return Boolean.valueOf(((((!Objects.equal(t, null)) && 
          (!Objects.equal(t, previousTile))) && 
          (t instanceof PassableTile)) && ((currentTile instanceof GhostHouseTile) || (!(t instanceof GhostHouseTile)))));
      };
      final Function1<AbstractTile, Boolean> filter = _function;
      AbstractTile _top = currentTile.getTop();
      AbstractTile _left = currentTile.getLeft();
      AbstractTile _bottom = currentTile.getBottom();
      AbstractTile _right = currentTile.getRight();
      ArrayList<AbstractTile> _newArrayList = CollectionLiterals.<AbstractTile>newArrayList(_top, _left, _bottom, _right);
      Iterable<AbstractTile> _filter = IterableExtensions.<AbstractTile>filter(_newArrayList, filter);
      final Function1<AbstractTile, PassableTile> _function_1 = (AbstractTile it) -> {
        return ((PassableTile) it);
      };
      final Iterable<PassableTile> candidateTiles = IterableExtensions.<AbstractTile, PassableTile>map(_filter, _function_1);
      PassableTile result = null;
      int _size = IterableExtensions.size(candidateTiles);
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        final AbstractTile targetTile = GhostAspect.targetTile(_self);
        boolean _notEquals = (!Objects.equal(targetTile, null));
        if (_notEquals) {
          PassableTile _head = IterableExtensions.<PassableTile>head(candidateTiles);
          result = _head;
          int d1 = GhostAspect.computeDistanceBetweenTiles(_self, result, targetTile);
          Iterable<PassableTile> _tail = IterableExtensions.<PassableTile>tail(candidateTiles);
          for (final PassableTile tile : _tail) {
            {
              final int d2 = GhostAspect.computeDistanceBetweenTiles(_self, tile, targetTile);
              if ((d2 < d1)) {
                result = tile;
                d1 = d2;
              }
            }
          }
        }
      } else {
        PassableTile _head_1 = IterableExtensions.<PassableTile>head(candidateTiles);
        result = _head_1;
      }
      AbstractTile _top_1 = currentTile.getTop();
      boolean _equals = Objects.equal(result, _top_1);
      if (_equals) {
        EntityAspect.changeDirection(_self, Integer.valueOf(0));
      } else {
        AbstractTile _left_1 = currentTile.getLeft();
        boolean _equals_1 = Objects.equal(result, _left_1);
        if (_equals_1) {
          EntityAspect.changeDirection(_self, Integer.valueOf(1));
        } else {
          AbstractTile _bottom_1 = currentTile.getBottom();
          boolean _equals_2 = Objects.equal(result, _bottom_1);
          if (_equals_2) {
            EntityAspect.changeDirection(_self, Integer.valueOf(2));
          } else {
            AbstractTile _right_1 = currentTile.getRight();
            boolean _equals_3 = Objects.equal(result, _right_1);
            if (_equals_3) {
              EntityAspect.changeDirection(_self, Integer.valueOf(3));
            }
          }
        }
      }
      return result;
    } else {
      return null;
    }
  }
  
  protected static int _privk3_computeDistanceBetweenTiles(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final AbstractTile from, final AbstractTile to) {
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
  
  protected static AbstractTile _privk3_targetTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTargetTile") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.example.pacman.xpacman.pacman.AbstractTile) ret;
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
  
  protected static void _privk3_targetTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final AbstractTile targetTile) {
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
  
  protected static boolean _privk3_frightenedMode(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isFrightenedMode") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.frightenedMode;
  }
  
  protected static void _privk3_frightenedMode(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final boolean frightenedMode) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setFrightenedMode")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, frightenedMode);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.frightenedMode = frightenedMode;
    }
  }
  
  protected static Board _privk3_board(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getBoard") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.tetrabox.example.pacman.xpacman.pacman.Board) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.board;
  }
  
  protected static void _privk3_board(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final Board board) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setBoard")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, board);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.board = board;
    }
  }
  
  protected static PassableTile _privk3_previousTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getPreviousTile") &&
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
    return _self_.previousTile;
  }
  
  protected static void _privk3_previousTile(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final PassableTile previousTile) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setPreviousTile")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, previousTile);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.previousTile = previousTile;
    }
  }
  
  protected static boolean _privk3_activated(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isActivated") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.activated;
  }
  
  protected static void _privk3_activated(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final boolean activated) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setActivated")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, activated);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.activated = activated;
    }
  }
  
  protected static Tile _privk3_ghostHouseExit(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getGhostHouseExit") &&
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
    return _self_.ghostHouseExit;
  }
  
  protected static void _privk3_ghostHouseExit(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final Tile ghostHouseExit) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setGhostHouseExit")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, ghostHouseExit);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.ghostHouseExit = ghostHouseExit;
    }
  }
  
  protected static boolean _privk3_chaseMode(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isChaseMode") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.chaseMode;
  }
  
  protected static void _privk3_chaseMode(final GhostAspectGhostAspectProperties _self_, final Ghost _self, final boolean chaseMode) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setChaseMode")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, chaseMode);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.chaseMode = chaseMode;
    }
  }
  
  protected static Random _privk3_rand(final GhostAspectGhostAspectProperties _self_, final Ghost _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getRand") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.Random) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.rand;
  }
}
