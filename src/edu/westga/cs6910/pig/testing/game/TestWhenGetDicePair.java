package edu.westga.cs6910.pig.testing.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.DicePair;
import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of Game's DicePair
 * accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-16
 */
public class TestWhenGetDicePair {

	/**
	 * When called on a new Game, it should return a DicePair in the same state as
	 * it was created.
	 */
	@Test
	public void testWithNewGameShouldReturnNewDicePair() {
		Game testGame = new Game(new HumanPlayer("David Lightman"), new ComputerPlayer());
		assertEquals(new DicePair().toString(), testGame.getDicePair().toString());
	}
}
