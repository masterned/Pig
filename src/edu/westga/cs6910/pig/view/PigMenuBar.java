package edu.westga.cs6910.pig.view;

import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.view.menus.GameMenu;
import edu.westga.cs6910.pig.view.menus.StrategyMenu;
import javafx.scene.control.MenuBar;

/**
 * Creates the MenuBar for the Pig game window.
 * 
 * @author Spencer Dent
 * @version 2021-06-28
 */
public class PigMenuBar extends MenuBar {

	private Game theGame;

	/**
	 * Creates a new MenuBar to be attached to the Pig Game window.
	 * 
	 * @param theGame - the game model
	 */
	public PigMenuBar(Game theGame) {
		this.theGame = theGame;

		this.buildMenuBar();
	}

	private void buildMenuBar() {
		this.getMenus().addAll(new GameMenu(), new StrategyMenu(this.theGame));
	}
}
