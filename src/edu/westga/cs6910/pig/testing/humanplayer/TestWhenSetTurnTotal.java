package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * turnTotal mutator.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenSetTurnTotal {

	/**
	 * When passed 2, it should set the HumanPlayer's turnTotal to 2.
	 */
	@Test
	public void testWhenPassed2ShouldSetTurnTotalTo2() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		testHumanPlayer.setTurnTotal(2);
		assertEquals(2, testHumanPlayer.getTurnTotal());
	}

	/**
	 * When passed 8, it should set the HumanPlayer's turnTotal to 8.
	 */
	@Test
	public void testWhenPassed8ShouldSetTurnTotalTo8() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Jennifer Mack");
		testHumanPlayer.setTurnTotal(8);
		assertEquals(8, testHumanPlayer.getTurnTotal());
	}
}
