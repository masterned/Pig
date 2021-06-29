package edu.westga.cs6910.pig.view.menus;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;

/**
 * Creates the Game Menu for the PigMenuBar.
 * 
 * @author Spencer Dent
 * @version 2021-06-29
 */
public class GameMenu extends Menu {
	
	private MenuItem exitMenuItem;
	private MenuItem restartMenuItem;
	private MenuItem newGameMenuItem;

	/**
	 * The constructor, creates the Menu and calls private helper functions to add
	 * the MenuItems.
	 */
	public GameMenu() {
		super("_Game");
		this.setMnemonicParsing(true);
		
		this.exitMenuItem = new GameMenuItem("E_xit", KeyCode.X, actionEvent -> System.exit(0));
		
		this.restartMenuItem = new GameMenuItem("Res_tart", KeyCode.T, actionEvent -> System.out.println("Restarting game"));

		this.newGameMenuItem = new GameMenuItem("_New Game", KeyCode.N, actionEvent -> System.out.println("Starting new game"));
		
		this.getItems().addAll(this.exitMenuItem, this.restartMenuItem, this.newGameMenuItem);
	}
	
	private class GameMenuItem extends MenuItem {
		GameMenuItem(String itemLabel, KeyCode acceleratorKey, EventHandler<ActionEvent> onActionHandler) {
			super(itemLabel);
			this.setMnemonicParsing(true);
			this.setAccelerator(new KeyCodeCombination(acceleratorKey, KeyCombination.SHORTCUT_DOWN));
			this.setOnAction(onActionHandler);
		}
	}
}
