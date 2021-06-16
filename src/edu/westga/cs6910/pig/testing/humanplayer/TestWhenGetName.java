package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's name
 * accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetName {

	/**
	 * When getName is called on any HumanPlayer (in its current implementation), it
	 * should return "Simple Human"
	 */
	@Test
	public void testShouldReturnSimpleHuman() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		assertEquals("David Lightman", testHumanPlayer.getName());
	}

}
