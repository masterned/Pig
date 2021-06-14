package edu.westga.cs6910.pig.testing.die;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.Die;

/**
 * Provides testing to verify the expected behavior of Die's roll method.
 * 
 * @author Spencer Dent
 * @version 2021-06-14
 */
public class TestWhenRoll {

	/**
	 * Roll should not set numberOfPips to a number less than one or greater than
	 * six.
	 */
	@Test
	public void testShouldNotSetNumberOfPipsToLessThan1OrGreaterThan6() {
		Die testDie = new Die();
		for (int count = 0; count < 10000; count++) {
			testDie.roll();
			int numberOfPips = testDie.getNumberOfPips();
			if (numberOfPips < 1 || numberOfPips > 6) {
				fail("Rolled a die with value: " + numberOfPips);
			}
		}
	}
}
