package edu.westga.cs6910.pig.view.menus;

import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;
import edu.westga.cs6910.pig.model.strategies.GreedyStrategy;
import edu.westga.cs6910.pig.model.strategies.PigStrategy;
import edu.westga.cs6910.pig.model.strategies.RandomStrategy;
import javafx.scene.control.Menu;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;

/**
 * Creates the Strategy Menu for the PigMenuBar.
 * 
 * @author Spencer Dent
 * @version 2021-06-29
 */
public class StrategyMenu extends Menu {

	private Game theGame;

	private ToggleGroup strategiesToggleGroup;

	private RadioMenuItem cautiousMenuItem;
	private RadioMenuItem greedyMenuItem;
	private RadioMenuItem randomMenuItem;

	/**
	 * Creates a new strategy menu & adds MenuItems via private methods.
	 * 
	 * @param theGame - the Pig Game
	 */
	public StrategyMenu(Game theGame) {
		super("_Strategy");
		this.setMnemonicParsing(true);

		this.theGame = theGame;

		this.strategiesToggleGroup = new ToggleGroup();

		this.cautiousMenuItem = new StrategyMenuItem("_Cautious", KeyCode.C, new CautiousStrategy());
		this.cautiousMenuItem.setSelected(true);

		this.greedyMenuItem = new StrategyMenuItem("Gr_eedy", KeyCode.E, new GreedyStrategy());

		this.randomMenuItem = new StrategyMenuItem("_Random", KeyCode.R, new RandomStrategy());

		this.getItems().addAll(this.cautiousMenuItem, this.greedyMenuItem, this.randomMenuItem);
	}

	private class StrategyMenuItem extends RadioMenuItem {
		StrategyMenuItem(String label, KeyCode accelerator, PigStrategy strategy) {
			super(label);
			this.setMnemonicParsing(true);
			this.setAccelerator(new KeyCodeCombination(accelerator, KeyCombination.SHORTCUT_DOWN));
			this.setOnAction(actionEvent -> StrategyMenu.this.theGame.getComputerPlayer().setStrategy(strategy));
			this.setToggleGroup(StrategyMenu.this.strategiesToggleGroup);
		}
	}

}
