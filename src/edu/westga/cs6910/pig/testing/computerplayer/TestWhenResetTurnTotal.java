package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * resetTurnTotal method.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenResetTurnTotal {

	/**
	 * When called on a new ComputerPlayer, the TurnTotal should stay 0.
	 */
	@Test
	public void testWithNewComputerPlayerShouldSetTurnTotalTo0() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.resetTurnTotal();
		assertEquals(0, testComputerPlayer.getTurnTotal());
	}

	/**
	 * When called on a ComputerPlayer with its turnTotal set, it should set its
	 * turn total to 0.
	 */
	@Test
	public void testWithPresetTurnTotalShouldSetTurnTotalTo0() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.setTurnTotal(58);
		testComputerPlayer.resetTurnTotal();
		assertEquals(0, testComputerPlayer.getTurnTotal());
	}
}
