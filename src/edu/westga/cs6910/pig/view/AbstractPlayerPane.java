package edu.westga.cs6910.pig.view;

import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.Player;
import javafx.beans.InvalidationListener;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Servers as a basis for the concrete Player Panes, extracting shared
 * functionality to reduce repetition.
 * 
 * @author Spencer Dent
 * @version 2021-06-29
 */
public abstract class AbstractPlayerPane extends GridPane implements InvalidationListener {

	private Game theGame;
	private Player thePlayer;

	private HBox playerTitleBox;
	private DiceValuesBox diceValuesBox;
	private TurnTotalBox turnTotalBox;

	/**
	 * Contains functionality shared between all Player constructors.
	 * 
	 * @param theGame   - the Pig Game model
	 * @param thePlayer - the Player model to base the display off of
	 */
	public AbstractPlayerPane(Game theGame, Player thePlayer) {
		this.theGame = theGame;
		this.thePlayer = thePlayer;

		this.theGame.addListener(this);

		this.playerTitleBox = new PlayerTitleBox(this.thePlayer.getName());
		this.add(this.playerTitleBox, 0, 0, 2, 1);

		this.diceValuesBox = new DiceValuesBox(this.thePlayer);
		this.add(this.diceValuesBox, 0, 1);

		this.turnTotalBox = new TurnTotalBox();
		this.add(this.turnTotalBox, 0, 3);
	}

	/**
	 * Retrieves the turnTotal HBox from the Pane
	 * 
	 * @return turnTotalBox - the HBox displaying the turnTotal
	 */
	public TurnTotalBox getTurnTotalBox() {
		return this.turnTotalBox;
	}

	private class PlayerTitleBox extends HBox {
		PlayerTitleBox(String playerName) {
			super();
			this.getStyleClass().add("box-center");
			this.getStyleClass().add("box-padding");
			this.getChildren().add(new Label("~~ " + playerName + " ~~"));
		}
	}

	private class DiceValuesBox extends VBox {

		private Player thePlayer;

		private Label diceValuesHeader;
		private ListView<String> diceValuesListView;

		DiceValuesBox(Player thePlayer) {
			super();
			
			this.thePlayer = thePlayer;

			this.getStyleClass().add("box-padding");

			this.diceValuesHeader = new Label("Dice Values: (Most recent on top)");

			this.diceValuesListView = new ListView<String>(this.thePlayer.getDiceValues());

			this.getChildren().addAll(this.diceValuesHeader, this.diceValuesListView);
		}
	}

	protected class TurnTotalBox extends HBox {
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
}
