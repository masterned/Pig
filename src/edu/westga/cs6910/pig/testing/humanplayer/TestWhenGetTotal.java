package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit tests to verify the expected behavior of HumanPlayer's total
 * accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetTotal {

	/**
	 * When called on a new HumanPlayer, it should return 0.
	 */
	@Test
	public void testWithNewHumanPlayerShouldHaveTotalOf0() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		assertEquals(0, testHumanPlayer.getTotal());
	}
}
