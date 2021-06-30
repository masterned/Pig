package edu.westga.cs6910.pig.testing.die;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.Die;

/**
 * Provides unit testing to verify the expected behavior of Die's reset method.
 * 
 * @author Spencer Dent
 * @version 2021-06-29
 */
public class TestWhenReset {

	/**
	 * Calling the method on a new Die should leave its face value at 1.
	 */
	@Test
	public void testWithNewDieShouldSetNumberOfPipsTo1() {
		Die testDie = new Die();
		testDie.reset();
		assertEquals(1, testDie.getNumberOfPips());
	}

	/**
	 * Calling on a Die that has been rolled should set the number of pips to 1.
	 */
	@Test
	public void testWithRolledDieShouldSetNumberOfPipsTo1() {
		Die testDie = new Die();
		testDie.roll();
		testDie.reset();
		assertEquals(1, testDie.getNumberOfPips());
	}
}
