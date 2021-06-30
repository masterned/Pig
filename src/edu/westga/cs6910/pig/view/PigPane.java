package edu.westga.cs6910.pig.view;

import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;
import edu.westga.cs6910.pig.model.Player;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 * Defines a GUI for the Pig game.
 * 
 * This class was started by CS6910
 * 
 * @author Spencer Dent
 * @version 2021-06-08
 */
public class PigPane extends BorderPane {
	private Game theGame;
	private BorderPane pnContent;
	private HumanPane pnHumanPlayer;
	private ComputerPane pnComputerPlayer;
	private StatusPane pnGameInfo;
	private Pane pnChooseFirstPlayer;

	private PigMenuBar menuBar;

	/**
	 * Creates a pane object to provide the view for the specified Game model
	 * object.
	 * 
	 * @param theGame the domain model object representing the Pig game
	 * 
	 * @requires theGame != null
	 * @ensures the pane is displayed properly
	 */
	public PigPane(Game theGame) {
		this.theGame = theGame;

		this.pnContent = new BorderPane();

		this.addFirstPlayerChooserPane(theGame);

		this.addHumanPlayerPane(theGame);

		this.addStatusPane(theGame);

		this.addComputerPlayerPane(theGame);

		this.setCenter(this.pnContent);

		this.addMenuBar();
	}

	private void addFirstPlayerChooserPane(Game theGame) {
		HBox topBox = new HBox();
		topBox.getStyleClass().add("pane-border");
		this.pnChooseFirstPlayer = new NewGamePane(theGame);
		topBox.getChildren().add(this.pnChooseFirstPlayer);
		this.pnContent.setTop(topBox);
	}

	private void addHumanPlayerPane(Game theGame) {
		HBox leftBox = new HBox();
		leftBox.getStyleClass().add("pane-border");
		this.pnHumanPlayer = new HumanPane(theGame);
		this.pnHumanPlayer.setDisable(true);
		leftBox.getChildren().add(this.pnHumanPlayer);
		this.pnContent.setLeft(leftBox);
	}

	private void addStatusPane(Game theGame) {
		HBox centerBox = new HBox();
		centerBox.getStyleClass().add("pane-border");
		this.pnGameInfo = new StatusPane(theGame);
		centerBox.getChildren().add(this.pnGameInfo);
		this.pnContent.setCenter(centerBox);
	}

	private void addComputerPlayerPane(Game theGame) {
		HBox rightBox = new HBox();
		rightBox.getStyleClass().add("pane-border");
		this.pnComputerPlayer = new ComputerPane(theGame);
		this.pnComputerPlayer.setDisable(true);
		rightBox.getChildren().add(this.pnComputerPlayer);
		this.pnContent.setRight(rightBox);
	}

	private void addMenuBar() {
		this.menuBar = new PigMenuBar(this.theGame);
		this.menuBar.prefWidthProperty().bind(this.widthProperty());
		this.setTop(this.menuBar);
	}

	/**
	 * Defines the pane in which the user selects which Player plays first.
	 */
	private final class NewGamePane extends GridPane {
		private RadioButton radHumanPlayer;
		private RadioButton radComputerPlayer;

		private Button randomPlayerSelectionButton;

		private Game theGame;
		private Player theHuman;
		private Player theComputer;

		private NewGamePane(Game theGame) {
			this.theGame = theGame;

			this.theHuman = this.theGame.getHumanPlayer();
			this.theComputer = this.theGame.getComputerPlayer();

			this.buildPane();
		}

		private void buildPane() {
			this.setHgap(20);

			this.radHumanPlayer = new RadioButton(this.theHuman.getName() + " first");
			this.radHumanPlayer.setOnAction(actionEvent -> {
				PigPane.this.pnChooseFirstPlayer.setDisable(true);

				PigPane.this.menuBar.toggleEnabledNewGameGameMenuItem();

				PigPane.this.theGame.startNewGame(NewGamePane.this.theHuman);
			});

			this.radComputerPlayer = new RadioButton(this.theComputer.getName() + " first");
			this.radComputerPlayer.setOnAction(actionEvent -> {
				PigPane.this.pnChooseFirstPlayer.setDisable(true);

				PigPane.this.menuBar.toggleEnabledNewGameGameMenuItem();

				PigPane.this.theGame.startNewGame(NewGamePane.this.theComputer);
			});

			ToggleGroup firstPlayerRadioButtonToggleGroup = new ToggleGroup();
			firstPlayerRadioButtonToggleGroup.getToggles().addAll(this.radHumanPlayer, this.radComputerPlayer);

			this.randomPlayerSelectionButton = new Button("Randomly Select First Player");
			this.randomPlayerSelectionButton.setOnAction(actionEvent -> {

				this.theGame.startNewGameWithRandomFirstPlayer();

				Player currentPlayer = this.theGame.getCurrentPlayer();

				PigPane.this.pnChooseFirstPlayer.setDisable(true);

				PigPane.this.menuBar.toggleEnabledNewGameGameMenuItem();

				if (currentPlayer instanceof HumanPlayer) {
					this.radHumanPlayer.setSelected(true);

					PigPane.this.pnHumanPlayer.setDisable(false);
				} else {
					this.radComputerPlayer.setSelected(true);

					PigPane.this.pnComputerPlayer.setDisable(false);
				}
			});

			this.add(this.radHumanPlayer, 0, 0);
			this.add(this.radComputerPlayer, 1, 0);
			this.add(this.randomPlayerSelectionButton, 2, 0);
		}
	}
}
