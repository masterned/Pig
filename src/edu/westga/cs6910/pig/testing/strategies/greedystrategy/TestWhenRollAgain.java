package edu.westga.cs6910.pig.testing.strategies.greedystrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.strategies.GreedyStrategy;

/**
 * Provides unit testing to verify the expected behavior of GreedyStrategy's
 * rollAgain method.
 * 
 * @author Spencer Dent
 * @version 2021-06-23
 */
public class TestWhenRollAgain {

	/**
	 * Verifies that it returns true if passed a number less than 3 for number of
	 * rolls taken.
	 */
	@Test
	public void testShouldReturnTrueWhenRollsTakenLessThan3() {
		GreedyStrategy testGreedyStrategy = new GreedyStrategy();
		assertEquals(true, testGreedyStrategy.rollAgain(0, 0, 0));
	}

	/**
	 * Verifies that it returns false if passed 3 for number of rolls taken.
	 */
	@Test
	public void testShouldReturnFalseWhenRollsTakenEqualTo3() {
		GreedyStrategy testGreedyStrategy = new GreedyStrategy();
		assertEquals(false, testGreedyStrategy.rollAgain(3, 0, 0));
	}

	/**
	 * Verifies that it returns false if passed a number greater than 3 for rolls
	 * taken.
	 */
	@Test
	public void testShouldReturnFalesWhenRollsTakenGreaterThan3() {
		GreedyStrategy testGreedyStrategy = new GreedyStrategy();
		assertEquals(false, testGreedyStrategy.rollAgain(5, 0, 0));
	}
}
