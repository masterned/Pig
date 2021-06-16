package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * resetTurnTotal method.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenResetTurnTotal {

	/**
	 * When called on a new HumanPlayer, the TurnTotal should stay 0.
	 */
	@Test
	public void testWithNewHumanPlayerShouldSetTurnTotalTo0() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		testHumanPlayer.resetTurnTotal();
		assertEquals(0, testHumanPlayer.getTurnTotal());
	}

	/**
	 * When called on a HumanPlayer with its turnTotal set, it should set its turn
	 * total to 0.
	 */
	@Test
	public void testWithPresetTurnTotalShouldSetTurnTotalTo0() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Jennifer Mack");
		testHumanPlayer.setTurnTotal(83);
		testHumanPlayer.resetTurnTotal();
		assertEquals(0, testHumanPlayer.getTurnTotal());
	}
}
