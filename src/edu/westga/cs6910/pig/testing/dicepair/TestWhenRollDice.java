package edu.westga.cs6910.pig.testing.dicepair;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.DicePair;

/**
 * Provides unit testing to verify the expected behavior of DicePair's rollDice
 * method.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenRollDice {

	/**
	 * Tests to make sure rollDice does not cause die1Value to be less than 1 or
	 * greater than 6
	 */
	@Test
	public void testShouldNotSetNumberOfPipsToLessThan1OrGreaterThan6AsValue1() {
		DicePair testDicePair = new DicePair();
		for (int count = 0; count < 10000; count++) {
			testDicePair.rollDice();
			int die1Value = testDicePair.getDie1Value();
			if (die1Value < 1 || die1Value > 6) {
				fail("Rolled a die with value: " + die1Value);
			}
		}
	}

	/**
	 * Tests to make sure rollDice does not cause die2Value to be less than 1 or
	 * greater than 6
	 */
	@Test
	public void testShouldNotSetNumberOfPipsToLessThan1OrGreaterThan6AsValue2() {
		DicePair testDicePair = new DicePair();
		for (int count = 0; count < 10000; count++) {
			testDicePair.rollDice();
			int die2Value = testDicePair.getDie2Value();
			if (die2Value < 1 || die2Value > 6) {
				fail("Rolled a die with value: " + die2Value);
			}
		}
	}
}
