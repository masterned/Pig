package edu.westga.cs6910.pig.testing.strategies.randomstrategy;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.strategies.RandomStrategy;

/**
 * Verifies the expected behavior of RandomStrategy's rollAgain method.
 * 
 * @author Spencer Dent
 * @version 2021-06-24
 */
public class TestWhenRollAgain {

	/**
	 * Verifies that it always (as much as testable, anyway) returns false if the
	 * goal score has been met (the difference between the goal and total is zero)
	 */
	@Test
	public void testWhenTotalAndGoalScoreDifferenceEquals0ShoulReturnFalse() {
		RandomStrategy testRandomStrategy = new RandomStrategy();

		for (int iteration = 0; iteration < 1000; iteration++) {
			if (testRandomStrategy.rollAgain(0, 0, 0)) {
				fail("Should always return false when total and goal score difference is zero");
			}
		}
	}

	/**
	 * Verifies that it always returns false if the goal score has been exceeded by
	 * the accumulated score.
	 */
	@Test
	public void testWhenTotalAndGoalScoreDifferenceIsNegativeShoulReturnFalse() {
		RandomStrategy testRandomStrategy = new RandomStrategy();

		for (int iteration = -1; iteration > -1000; iteration--) {
			if (testRandomStrategy.rollAgain(0, 0, iteration)) {
				fail("Should always return false when total and goal score difference is zero");
			}
		}
	}
}
