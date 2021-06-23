package edu.westga.cs6910.pig.testing.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;
import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of Game's humanPlayer
 * accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetHumanPlayer {

	/**
	 * When called on a new Game, should return the HumanPlayer passed into the
	 * constructor.
	 */
	@Test
	public void testWithNewGameShouldReturnHumanPlayerPassedIntoConstructor() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		Game testGame = new Game(testHumanPlayer, new ComputerPlayer(new CautiousStrategy()));
		assertEquals(testHumanPlayer, testGame.getHumanPlayer());
	}
}
