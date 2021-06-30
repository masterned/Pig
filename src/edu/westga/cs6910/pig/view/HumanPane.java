package edu.westga.cs6910.pig.view;

import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;
import javafx.beans.Observable;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 * Defines the panel that lets the user indicate whether they want to roll or
 * hold on their turn
 * 
 * This class was started by CS6910
 * 
 * @author Spencer Dent
 * @version 2021-06-09
 */
public class HumanPane extends AbstractPlayerPane {

	private Game theGame;
	private HumanPlayer theHuman;

	private ButtonBox buttonBox;

	/**
	 * Creates a new HumanPane that observes the specified game.
	 * 
	 * @param theGame the model object from which this pane gets its data
	 * 
	 * @requires theGame != null
	 */
	public HumanPane(Game theGame) {
		super(theGame, theGame.getHumanPlayer());
		this.theGame = theGame;

		this.theHuman = this.theGame.getHumanPlayer();

		this.buttonBox = new ButtonBox();
		this.add(this.buttonBox, 0, 2);
	}

	private class ButtonBox extends HBox {
		private Button rollButton;
		private Button holdButton;

		ButtonBox() {
			super();
			this.getStyleClass().add("box-padding");

			this.buildRollButton();

			this.buildHoldButton();

			this.getChildren().addAll(this.rollButton, this.holdButton);
		}

		private void buildRollButton() {
			this.rollButton = new Button("Roll");
			this.rollButton.setOnAction(actionEvent -> {
				if (!HumanPane.this.theGame.isGameOver()) {
					HumanPane.this.theGame.play();
				}
			});
		}

		private void buildHoldButton() {
			this.holdButton = new Button("Hold");
			this.holdButton.setOnAction(actionEvent -> {
				if (!HumanPane.this.theGame.isGameOver()) {
					HumanPane.this.theGame.hold();
				}
			});
		}
	}

	@Override
	public void invalidated(Observable observable) {
		boolean myTurn = this.theGame.getCurrentPlayer() == this.theHuman;

		int turnTotal = this.theHuman.getTurnTotal();
		this.getTurnTotalBox().setTurnTotalValue(turnTotal);

		this.setDisable(!myTurn);

		if (this.theGame.isGameOver()) {
			this.setDisable(true);
			return;
		}
	}
}
