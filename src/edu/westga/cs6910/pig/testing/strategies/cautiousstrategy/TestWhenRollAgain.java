package edu.westga.cs6910.pig.testing.strategies.cautiousstrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Random;

import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of CautiousStrategy's
 * rollAgain implementation.
 * 
 * @author Spencer Dent
 * @version 2021-06-22
 */
public class TestWhenRollAgain {

	/**
	 * The CautiousStratege's rollAgain should always return false no matter what
	 * input is provided.
	 */
	@Test
	public void testShouldAlwaysReturnFalseNoMatterTheInput() {
		CautiousStrategy testCautiousStrategy = new CautiousStrategy();

		assertEquals(false, testCautiousStrategy.rollAgain(0, 0, 0));
	}

	/**
	 * Test the method again with random values.
	 */
	@Test
	public void testShouldReturnFalseWhenPassedRandomValues() {
		CautiousStrategy testCautiousStrategy = new CautiousStrategy();

		Random randomizer = new Random();

		assertEquals(false,
				testCautiousStrategy.rollAgain(randomizer.nextInt(), randomizer.nextInt(), randomizer.nextInt()));
	}
}
