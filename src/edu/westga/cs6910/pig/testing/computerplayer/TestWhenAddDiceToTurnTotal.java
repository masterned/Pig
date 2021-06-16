package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * addDiceToTurnTotal method.
 * 
 * @author Spencer Dent
 * @version 2021-06-16
 */
public class TestWhenAddDiceToTurnTotal {

	/**
	 * When called on a new ComputerPlayer, turnTotal should be set to 2 (0 + 1 +
	 * 1).
	 */
	@Test
	void testWithNewComputerPlayerShouldSetTurnTotalTo2() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		testComputerPlayer.addDiceToTurnTotal();
		assertEquals(2, testComputerPlayer.getTurnTotal());
	}

}
