package org.tetrabox.example.pacman.view;

import java.util.function.Consumer;

import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;
import org.tetrabox.example.pacman.xpacman.pacman.Board;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PacManView extends Application implements IEngineAddon {

	private Consumer<IExecutionEngine> updater = (engine) -> update(engine);
	
	private BoardView boardView;
	
	private BorderPane root;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		root = new BorderPane();
		
		Scene scene = new Scene(root, 300, 250);

		primaryStage.setTitle("Pac-Man with GEMOC!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void update(IExecutionEngine engine) {
		if (boardView == null) {
			final Board board = engine.getExecutionContext().getResourceModel().getContents().stream().findFirst()
					.filter(o -> o instanceof Board).map(o -> (Board) o).orElse(null);
			boardView = new BoardView(board);
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
}
