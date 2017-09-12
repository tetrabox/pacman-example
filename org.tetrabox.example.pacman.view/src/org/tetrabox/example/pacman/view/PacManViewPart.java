package org.tetrabox.example.pacman.view;


import org.eclipse.gemoc.executionframework.ui.views.engine.EngineSelectionDependentViewPart;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.tetrabox.example.pacman.xpacman.pacman.Board;

import javafx.application.Platform;
import javafx.embed.swt.FXCanvas;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

public class PacManViewPart extends EngineSelectionDependentViewPart {

	private FXCanvas fxCanvas;
	
	private PacManRenderer renderer;
	
	private BorderPane root;
	
	@Override
	public void engineSelectionChanged(IExecutionEngine engine) {
		if (renderer != null) {
			fxCanvas.removeKeyListener(renderer);
		}
		final Board board = engine.getExecutionContext().getResourceModel().getContents().stream().findFirst()
				.filter(o -> o instanceof Board).map(o -> (Board) o).orElse(null);
		renderer = new PacManRenderer(board);
		fxCanvas.addKeyListener(renderer);
		renderer.initialize();
		engine.getExecutionContext().getExecutionPlatform().addEngineAddon(renderer);
		Platform.runLater(() -> {
			root.setCenter(renderer);
		});
	}

	@Override
	public void createPartControl(Composite parent) {
		fxCanvas = new FXCanvas(parent, SWT.NONE);
		root = new BorderPane();
		root.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));
		Scene scene = new Scene(root, 300, 250);
		fxCanvas.setScene(scene);
	}

	@Override
	public void setFocus() {
		if (fxCanvas != null) {
			fxCanvas.setFocus();
		}
	}

}
