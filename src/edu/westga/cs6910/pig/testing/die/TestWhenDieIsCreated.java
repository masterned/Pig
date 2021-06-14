package edu.westga.cs6910.pig.testing.die;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.Die;

/**
 * Provides testing to verify the expected behavior of the Die constructor.
 * 
 * @author Spencer Dent
 * @version 2021-06-14
 */
public class TestWhenDieIsCreated {

	/**
	 * The constructor should create a new Die with 1 pip showing.
	 */
	@Test
	public void testShouldProduceDieWith1Pip() {
		Die newDie = new Die();
		assertEquals("pips: 1", newDie.toString());
	}
}
