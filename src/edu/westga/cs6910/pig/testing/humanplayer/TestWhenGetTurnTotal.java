package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * turnTotal accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetTurnTotal {

	/**
	 * When called on a new HumanPlayer, the turnTotal should be 0.
	 */
	@Test
	public void testWithNewHumanPlayerShouldHave0Points() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		assertEquals(0, testHumanPlayer.getTurnTotal());
	}

}
