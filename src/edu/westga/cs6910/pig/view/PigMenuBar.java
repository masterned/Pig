package edu.westga.cs6910.pig.view;

import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;
import edu.westga.cs6910.pig.model.strategies.GreedyStrategy;
import edu.westga.cs6910.pig.model.strategies.PigStrategy;
import edu.westga.cs6910.pig.model.strategies.RandomStrategy;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;

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
		Menu gameMenu = new Menu("_Game");
		gameMenu.setMnemonicParsing(true);

		gameMenu.getItems().add(this.createExitMenuItem());

		this.getMenus().addAll(gameMenu, this.createStrategyMenu());
	}

	private MenuItem createExitMenuItem() {
		MenuItem exitMenuItem = new MenuItem("E_xit");
		exitMenuItem.setMnemonicParsing(true);
		exitMenuItem.setAccelerator(new KeyCodeCombination(KeyCode.X, KeyCombination.SHORTCUT_DOWN));
		exitMenuItem.setOnAction(actionEvent -> System.exit(0));
		return exitMenuItem;
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

	private Menu createStrategyMenu() {
		Menu strategyMenu = new Menu("_Strategy");
		strategyMenu.setMnemonicParsing(true);

		ToggleGroup strategiesToggleGroup = new ToggleGroup();

		strategyMenu.getItems().addAll(this.createCautiousMenuItem(strategiesToggleGroup),
				this.createGreedyMenuItem(strategiesToggleGroup), this.createRandomMenuItem(strategiesToggleGroup));
		return strategyMenu;
	}
}
