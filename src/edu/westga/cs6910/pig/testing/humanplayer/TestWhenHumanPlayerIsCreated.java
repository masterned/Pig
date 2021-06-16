package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * constructor and toString method.
 * 
 * @author Spencer Dent
 * @version 2021-06-14
 */
public class TestWhenHumanPlayerIsCreated {

	/**
	 * Tests the constructor to verify it produces a HumanPlayer named "David
	 * Lightman" with a total of 0 and a newly generated DicePair.
	 */
	@Test
	public void testShouldProduceHumanPlayerWithNameDavidLightmanAndTotal0() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		assertEquals("David Lightman: total: 0, dice pair: die 1: pips: 1, die 2: pips: 1", testHumanPlayer.toString());
	}

	/**
	 * Tests the constructor again to prevent the developer from hard-coding the
	 * return values.
	 */
	@Test
	public void testShouldProduceHumanPlayerWithNameJenniferMackAndTotal0() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Jennifer Mack");
		assertEquals("Jennifer Mack: total: 0, dice pair: die 1: pips: 1, die 2: pips: 1", testHumanPlayer.toString());
	}
}
