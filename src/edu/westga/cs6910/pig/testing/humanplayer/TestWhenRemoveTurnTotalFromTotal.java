package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * removeTurnTotalFromTotal method.
 * 
 * @author Spencer Dent
 * @version 2021-06-25
 */
public class TestWhenRemoveTurnTotalFromTotal {

	/**
	 * When called on a new HumanPlayer, the total should stay 0 (0 - 0)
	 */
	@Test
	public void testShouldNotChangeTotalIfTurnTotalIs0() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		testHumanPlayer.removeTurnTotalFromTotal();
		assertEquals(0, testHumanPlayer.getTotal());
	}
	
	/**
	 * It should subtract the turnTotal from the total
	 */
	@Test
	public void testShouldSubtractTurnTotalFromTotal() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Spade");
		testHumanPlayer.setTurnTotal(16);
		testHumanPlayer.setTotal(64);
		testHumanPlayer.removeTurnTotalFromTotal();
		assertEquals(48, testHumanPlayer.getTotal());
	}
}
