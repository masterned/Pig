package edu.westga.cs6910.pig.testing.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;
import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of Game's currentPlayer
 * accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-16
 */
public class TestWhenGetCurrentPlayer {

	/**
	 * When called on a new Game, should return null.
	 */
	@Test
	public void testWithNewGameShouldReturnNull() {
		Game testGame = new Game(new HumanPlayer("David Lightman"), new ComputerPlayer(new CautiousStrategy()));
		assertEquals(null, testGame.getCurrentPlayer());
	}
}
