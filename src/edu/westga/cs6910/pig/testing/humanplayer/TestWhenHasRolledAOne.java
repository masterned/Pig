package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * hasRolledAOne method.
 * 
 * @author Spencer Dent
 * @version 2021-06-16
 */
public class TestWhenHasRolledAOne {

	/**
	 * When called on a new HumanPlayer, it should return true.
	 */
	@Test
	public void testHasRolledAOne() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		assertEquals(true, testHumanPlayer.hasRolledAOne());
	}

}
