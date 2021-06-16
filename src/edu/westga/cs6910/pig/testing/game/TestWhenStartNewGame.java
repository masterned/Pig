package edu.westga.cs6910.pig.testing.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.DicePair;
import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of Game's startNewGame
 * method.
 * 
 * @author Spencer Dent
 * @version 2021-06-16
 */
public class TestWhenStartNewGame {

	/**
	 * When called on a new Game, should set the currentPlayer to the provided
	 * Player.
	 */
	@Test
	public void testWithNewGameShouldSetCurrentPlayerToProvidedPlayer() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		Game testGame = new Game(testHumanPlayer, new ComputerPlayer());
		testGame.startNewGame(testHumanPlayer);
		assertEquals(testHumanPlayer, testGame.getCurrentPlayer());
	}

	/**
	 * Should set the current player to the provided ComputerPlayer. This method is
	 * added to prevent the developer from hard-coding the return value and to
	 * guarantee the method takes any Player type.
	 */
	@Test
	public void testShouldSetCurrentPlayerToProvidedComputerPlayer() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		Game testGame = new Game(new HumanPlayer("Jennifer Mack"), testComputerPlayer);
		testGame.startNewGame(testComputerPlayer);
		assertEquals(testComputerPlayer, testGame.getCurrentPlayer());
	}
	
	/**
	 * Should reset the DicePair to a new set whenever the method is called.
	 */
	@Test
	public void testShouldSetDicePairToNewDicePair() {
		Game testGame = new Game(new HumanPlayer("Stephen Falken"), new ComputerPlayer());
		testGame.startNewGame(new ComputerPlayer());
		assertEquals(new DicePair().toString(), testGame.getDicePair().toString());
	}
}
