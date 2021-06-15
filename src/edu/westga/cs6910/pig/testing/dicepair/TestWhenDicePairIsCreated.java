package edu.westga.cs6910.pig.testing.dicepair;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.DicePair;

/**
 * Provides testing to verify the expected behavior of DicePair's constructor
 * and toString method.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenDicePairIsCreated {

	/**
	 * The constructor should use the Die constructor to produce and store 2 Die
	 * objects.
	 */
	@Test
	public void testShouldProduceDicePairWithTwoDice() {
		DicePair testDicePair = new DicePair();
		assertEquals(testDicePair.toString(), "die 1: pips: 1, die 2: pips: 1");
	}

}
