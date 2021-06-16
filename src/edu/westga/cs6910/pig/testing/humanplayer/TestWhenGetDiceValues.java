package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit tests to verify the expected behavior of HumanPlayer's
 * getDiceValues method.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetDiceValues {

	/**
	 * Calling on a new HumanPlayer should return the String "1, 1"
	 */
	@Test
	public void testWithNewHumanPlayerShouldReturnStringOf1And1() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		assertEquals("1, 1", testHumanPlayer.getDiceValues());
	}
}
