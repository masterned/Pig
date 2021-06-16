package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * addTurnTotalToTotal method.
 * 
 * @author Spencer Dent
 * @version 2021-06-16
 */
public class TestWhenAddTurnTotalToTotal {

	/**
	 * When called on a new ComputerPlayer, the total should stay 0 (0 + 0)
	 */
	@Test
	public void testAddTurnTotalToTotal() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		testComputerPlayer.addTurnTotalToTotal();
		assertEquals(0, testComputerPlayer.getTotal());
	}
}
