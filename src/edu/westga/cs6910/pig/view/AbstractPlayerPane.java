package edu.westga.cs6910.pig.view;

import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.Player;
import javafx.beans.InvalidationListener;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

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
	}
	
	private class PlayerTitleBox extends HBox {
		PlayerTitleBox(String playerName) {
			super();
			this.getStyleClass().add("box-center");
			this.getStyleClass().add("box-padding");
			this.getChildren().add(new Label("~~ " + playerName + " ~~"));
		}
	}
}
