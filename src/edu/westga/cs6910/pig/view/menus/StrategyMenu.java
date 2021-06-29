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

	private ToggleGroup strategiesToggleGroup;

	private Game theGame;

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

		this.getItems().addAll(this.createCautiousMenuItem(this.strategiesToggleGroup),
				this.createGreedyMenuItem(this.strategiesToggleGroup),
				this.createRandomMenuItem(this.strategiesToggleGroup));
	}

	private RadioMenuItem createCautiousMenuItem(ToggleGroup strategiesToggleGroup) {
		RadioMenuItem cautiousMenuItem = this.createStrategyMenuItem("_Cautious", KeyCode.C, new CautiousStrategy(),
				strategiesToggleGroup);
		cautiousMenuItem.setSelected(true);
		return cautiousMenuItem;
	}

	private RadioMenuItem createGreedyMenuItem(ToggleGroup strategiesToggleGroup) {
		return this.createStrategyMenuItem("Gr_eedy", KeyCode.E, new GreedyStrategy(), strategiesToggleGroup);
	}

	private RadioMenuItem createRandomMenuItem(ToggleGroup strategiesToggleGroup) {
		return this.createStrategyMenuItem("_Random", KeyCode.R, new RandomStrategy(), strategiesToggleGroup);
	}

	private RadioMenuItem createStrategyMenuItem(String label, KeyCode accelerator, PigStrategy strategy,
			ToggleGroup strategiesToggleGroup) {
		RadioMenuItem randomMenuItem = new RadioMenuItem(label);
		randomMenuItem.setMnemonicParsing(true);
		randomMenuItem.setAccelerator(new KeyCodeCombination(accelerator, KeyCombination.SHORTCUT_DOWN));
		randomMenuItem.setOnAction(actionEvent -> this.theGame.getComputerPlayer().setStrategy(strategy));
		randomMenuItem.setToggleGroup(strategiesToggleGroup);
		return randomMenuItem;
	}

}
