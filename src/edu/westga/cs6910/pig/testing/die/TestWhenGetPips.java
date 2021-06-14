package edu.westga.cs6910.pig.testing.die;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.Die;

/**
 * Provides testing to verify the expected behavior of Die's getPips method.
 * 
 * @author Spencer Dent
 * @version 2021-06-14
 */
public class TestWhenGetPips {

	/**
	 * Method should return 1 when called on a new Die.
	 */
	@Test
	public void testWithNewDieShouldHave1Pip() {
		Die newDie = new Die();
		assertEquals(1, newDie.getNumberOfPips());
	}
}
