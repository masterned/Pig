package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * addTurnTotalToTotal method.
 * 
 * @author Spencer Dent
 * @version 2021-06-16
 */
public class TestWhenAddTurnTotalToTotal {

	/**
	 * When called on a new HumanPlayer, the total should stay 0 (0 + 0)
	 */
	@Test
	public void testAddTurnTotalToTotal() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		testHumanPlayer.addTurnTotalToTotal();
		assertEquals(0, testHumanPlayer.getTotal());
	}
}
