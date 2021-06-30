package edu.westga.cs6910.pig.view;

import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;
import edu.westga.cs6910.pig.model.Player;
import javafx.beans.Observable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

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

	private DiceValuesBox diceValuesBox;
	private ButtonBox buttonBox;
	private TurnTotalBox turnTotalBox;

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
		this.theGame.addListener(this);

		this.theHuman = this.theGame.getHumanPlayer();

		this.diceValuesBox = new DiceValuesBox(this.theHuman);
		this.add(this.diceValuesBox, 0, 1);

		this.buttonBox = new ButtonBox();
		this.add(this.buttonBox, 0, 2);

		this.turnTotalBox = new TurnTotalBox();
		this.add(this.turnTotalBox, 0, 3);
	}

	private class DiceValuesBox extends VBox {
		
		private Player thePlayer;
		
		private Label diceValuesHeader;
		private ListView<String> diceValuesListView;

		DiceValuesBox(Player thePlayer) {
			super();
			
			this.thePlayer = thePlayer;

			this.getStyleClass().add("box-padding");

			this.diceValuesHeader = new Label("Dice Values: ");

			this.diceValuesListView = new ListView<String>(this.thePlayer.getDiceRolls());

			this.getChildren().addAll(this.diceValuesHeader, this.diceValuesListView);
		}
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

	private class TurnTotalBox extends HBox {
		private Label turnTotalHeader;
		private Label turnTotalLabel;

		TurnTotalBox() {
			super();
			this.getStyleClass().add("box-padding");

			this.turnTotalHeader = new Label("Turn Total: ");

			this.turnTotalLabel = new Label("0");

			this.getChildren().addAll(this.turnTotalHeader, this.turnTotalLabel);
		}

		/**
		 * Sets the value of the turnTotalLabel to the given value
		 * 
		 * @param turnTotal - the new turnTotal to display
		 */
		public void setTurnTotalValue(int turnTotal) {
			this.turnTotalLabel.setText("" + turnTotal);
		}
	}

	@Override
	public void invalidated(Observable observable) {
		boolean myTurn = this.theGame.getCurrentPlayer() == this.theHuman;

		int turnTotal = this.theHuman.getTurnTotal();
		this.turnTotalBox.setTurnTotalValue(turnTotal);

		this.setDisable(!myTurn);

		if (this.theGame.isGameOver()) {
			this.setDisable(true);
			return;
		}
	}
}
