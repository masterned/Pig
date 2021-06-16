package edu.westga.cs6910.pig.testing.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of Game's isGameOver
 * method.
 * 
 * @author Spencer Dent
 * @version 2021-06-16
 */
public class TestWhenIsGameOver {

	/**
	 * When called on a new Game, should return true.
	 */
	@Test
	public void testWithNewGameShouldReturnTrue() {
		Game testGame = new Game(new HumanPlayer("David Lightman"), new ComputerPlayer());
		assertEquals(true, testGame.isGameOver());
	}

	/**
	 * When called on a game that has just started, it should return false.
	 */
	@Test
	public void testWithStartedGameShouldReturnFalse() {
		Game testGame = new Game(new HumanPlayer("Jennifer Mack"), new ComputerPlayer());
		testGame.startNewGame(new ComputerPlayer());
		assertEquals(false, testGame.isGameOver());
	}

	/**
	 * When HumanPlayer's total is greater than or equal to goal score, it should
	 * return true.
	 */
	@Test
	public void testWithHumanPlayerWinnerShouldReturnTrue() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Stephen Falken");
		testHumanPlayer.setTotal(20);
		Game testGame = new Game(testHumanPlayer, new ComputerPlayer());
		assertEquals(true, testGame.isGameOver());
	}

	/**
	 * When ComputerPlayer's total is greater than or equal to goal score, it should
	 * return true.
	 */
	@Test
	public void testWithComputerPlayerWinnerShouldReturnTrue() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		testComputerPlayer.setTotal(20);
		Game testGame = new Game(new HumanPlayer("Jack Beringer"), testComputerPlayer);
		assertEquals(true, testGame.isGameOver());
	}
}
