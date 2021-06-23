package edu.westga.cs6910.pig.testing.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;
import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of Game's
 * computerPlayer accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetComputerPlayer {

	/**
	 * When called on a new Game, it should return the ComputerPlayer passed into
	 * the constructor.
	 */
	@Test
	public void testWithNewGameShouldReturnComputerPlayerPassedIntoConstructor() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		Game testGame = new Game(new HumanPlayer("David Lightman"), testComputerPlayer);
		assertEquals(testComputerPlayer, testGame.getComputerPlayer());
	}
}
