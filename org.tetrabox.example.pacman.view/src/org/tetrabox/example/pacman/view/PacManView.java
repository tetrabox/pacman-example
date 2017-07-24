package org.tetrabox.example.pacman.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import org.gemoc.xdsmlframework.api.core.EngineStatus.RunStatus;
import org.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.tetrabox.example.pacman.xpacman.eventmanager.XPacmanEventManager;
import org.tetrabox.example.pacman.xpacman.pacman.Board;

import fr.inria.diverse.trace.commons.model.trace.Step;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PacManView extends Application implements IEngineAddon {

	private static Consumer<IExecutionEngine> updater;
	
	private BoardView boardView;
	
	private BorderPane root;

	@Override
	public void start(Stage primaryStage) throws Exception {
		updater = (engine) -> this.update(engine);
		
		root = new BorderPane();
		
		Scene scene = new Scene(root, 300, 250);

		primaryStage.setTitle("Pac-Man with GEMOC!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void update(IExecutionEngine engine) {
		if (boardView == null) {
			final XPacmanEventManager eventManager = engine.getAddonsTypedBy(XPacmanEventManager.class).stream().findFirst().orElse(null);
			final Board board = engine.getExecutionContext().getResourceModel().getContents().stream().findFirst()
					.filter(o -> o instanceof Board).map(o -> (Board) o).orElse(null);
			boardView = new BoardView(board, eventManager);
			Platform.runLater(() -> {
				root.setCenter(boardView);
				boardView.update();
			});
		}
		else {
			Platform.runLater(() -> {
				boardView.update();
			});
		}
	}

	@Override
	public void engineAboutToStart(IExecutionEngine engine) {
		launch();
	}

	@Override
	public void engineStarted(IExecutionEngine executionEngine) {
		
	}

	@Override
	public void aboutToExecuteStep(IExecutionEngine engine, Step<?> stepToExecute) {
		if (updater != null) {
			updater.accept(engine);
		}
	}

	@Override
	public void stepExecuted(IExecutionEngine engine, Step<?> stepExecuted) {
		if (updater != null) {
			updater.accept(engine);
		}
	}

	@Override
	public void engineAboutToStop(IExecutionEngine engine) {

	}

	@Override
	public void engineStopped(IExecutionEngine engine) {

	}

	@Override
	public void engineAboutToDispose(IExecutionEngine engine) {

	}

	@Override
	public void aboutToSelectStep(IExecutionEngine engine, Collection<Step<?>> steps) {

	}

	@Override
	public void proposedStepsChanged(IExecutionEngine engine, Collection<Step<?>> steps) {

	}

	@Override
	public void stepSelected(IExecutionEngine engine, Step<?> selectedStep) {

	}

	@Override
	public void engineStatusChanged(IExecutionEngine engine, RunStatus newStatus) {

	}

	@Override
	public List<String> validate(List<IEngineAddon> otherAddons) {
		return new ArrayList<>();
	}
}
