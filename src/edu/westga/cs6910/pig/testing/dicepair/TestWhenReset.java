package edu.westga.cs6910.pig.testing.dicepair;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.DicePair;

/**
 * Provides unit testing to verify the expected behavior of DicePair's reset
 * method.
 * 
 * @author Spencer Dent
 * @version 2021-06-29
 */
public class TestWhenReset {

	/**
	 * Calling the method on a new DicePair should leave both of its faces on 1.
	 */
	@Test
	public void testWithNewDieShouldSetNumberOfPipsTo1() {
		DicePair testDicePair = new DicePair();
		testDicePair.reset();
		assertEquals("die 1: pips: 1, die 2: pips: 1", testDicePair.toString());
	}

	/**
	 * Calling on a DicePair that has been rolled should set the number of pips to 1
	 * on both Dice.
	 */
	@Test
	public void testWithRolledDieShouldSetNumberOfPipsTo1() {
		DicePair testDicePair = new DicePair();
		testDicePair.rollDice();
		testDicePair.reset();
		assertEquals("die 1: pips: 1, die 2: pips: 1", testDicePair.toString());
	}
}
