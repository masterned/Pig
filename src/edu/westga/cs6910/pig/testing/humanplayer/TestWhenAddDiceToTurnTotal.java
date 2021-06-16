package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * addDiceToTurnTotal method.
 * 
 * @author Spencer Dent
 * @version 2021-06-16
 */
public class TestWhenAddDiceToTurnTotal {

	/**
	 * When called on a new HumanPlayer, turnTotal should be set to 2 (0 + 1 + 1).
	 */
	@Test
	public void testWithNewHumanPlayerShouldSetTurnTotalTo2() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		testHumanPlayer.addDiceToTurnTotal();
		assertEquals(2, testHumanPlayer.getTurnTotal());
	}

}
