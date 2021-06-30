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

	private Game theGame;
	private ComputerPlayer theComputer;

	private TurnTakingBox turnTakingBox;

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

		this.turnTakingBox = new TurnTakingBox();
		this.add(this.turnTakingBox, 0, 2);
	}

	private class TurnTakingBox extends HBox {
		private Button takeTurnButton;

		TurnTakingBox() {
			super();
			this.getStyleClass().add("box-padding");

			this.buildTakeTurnButton();

			this.getChildren().add(this.takeTurnButton);
		}

		private void buildTakeTurnButton() {
			this.takeTurnButton = new Button("Take Turn");
			this.takeTurnButton.setOnAction(actionEvent -> {
				if (!ComputerPane.this.theGame.isGameOver()) {
					ComputerPane.this.theComputer.setMaximumRolls();
					ComputerPane.this.theGame.play();
				}
			});
		}
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
