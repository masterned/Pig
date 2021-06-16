package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit tests to verify the expected behavior of HumanPlayer's total
 * mutator.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenSetTotal {

	/**
	 * When passed 13, it should set the total to 13.
	 */
	@Test
	public void testWhenPassed13ShouldSetTotalTo13() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		testHumanPlayer.setTotal(13);
		assertEquals(13, testHumanPlayer.getTotal());
	}

	/**
	 * When passed 24, it should set the total to 24. This second method is here to
	 * prevent the developer from hard-coding the values.
	 */
	@Test
	public void testWhenPassed24ShouldSetTotalTo24() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Jennifer Mack");
		testHumanPlayer.setTotal(24);
		assertEquals(24, testHumanPlayer.getTotal());
	}
}
