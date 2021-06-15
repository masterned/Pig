package edu.westga.cs6910.pig.testing.dicepair;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.DicePair;

/**
 * Provides testing to verify the expected behavior of DicePair's getDie2Value
 * method.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetDie2Value {

	/**
	 * Method should return 1 when called on new DicePair.
	 */
	@Test
	public void testWithNewDicePairShouldReturn1() {
		DicePair testDicePair = new DicePair();
		assertEquals(1, testDicePair.getDie2Value());
	}

}
