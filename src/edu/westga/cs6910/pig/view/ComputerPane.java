package edu.westga.cs6910.pig.view;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.Game;
import javafx.beans.Observable;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 * Defines the pane that lets the user either roll or hold during their turn
 * This class was started by CS6910
 * 
 * @author Spencer Dent
 * @version 2021-06-08
 */
public class ComputerPane extends AbstractPlayerPane {
	private Button btnTakeTurn;

	private ComputerPlayer theComputer;
	private Game theGame;

	/**
	 * Creates a new ComputerPane that observes the specified game.
	 * 
	 * @param theGame the model object from which this pane gets its data
	 * 
	 * @requires theGame != null
	 */
	public ComputerPane(Game theGame) {
		super(theGame, theGame.getComputerPlayer());

		this.theGame = theGame;

		this.theGame.addListener(this);

		this.theComputer = this.theGame.getComputerPlayer();

		this.buildPane();
	}

	private void buildPane() {
		HBox buttonBox = new HBox();
		buttonBox.getStyleClass().add("box-padding");
		this.btnTakeTurn = new Button("Take Turn");
		this.btnTakeTurn.setOnAction(actionEvent -> {
			if (!ComputerPane.this.theGame.isGameOver()) {
				ComputerPane.this.theComputer.setMaximumRolls();
				ComputerPane.this.theGame.play();
			}
		});
		buttonBox.getChildren().add(this.btnTakeTurn);
		this.add(buttonBox, 0, 2);
	}

	@Override
	public void invalidated(Observable theObservable) {
		boolean myTurn = this.theGame.getCurrentPlayer() == this.theComputer;

		if (!myTurn) {
			int turnTotal = this.theComputer.getTurnTotal();
			this.getTurnTotalBox().setTurnTotalValue(turnTotal);
		}

		this.setDisable(!myTurn);

		if (this.theGame.isGameOver()) {
			this.setDisable(true);
			return;
		}
	}
}
