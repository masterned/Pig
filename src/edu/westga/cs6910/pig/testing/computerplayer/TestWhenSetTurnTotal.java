package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * turnTotal mutator.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenSetTurnTotal {

	/**
	 * When passed 5, it should set the ComputerPlayer's turnTotal to 5.
	 */
	@Test
	public void testWhenPassed5ShouldSetTurnTotalTo5() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.setTurnTotal(5);
		assertEquals(5, testComputerPlayer.getTurnTotal());
	}

	/**
	 * When passed 26, it should set the ComputerPlayer's turnTotal to 26.
	 */
	@Test
	public void testWhenPassed26ShouldSetTurnTotalTo26() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.setTurnTotal(26);
		assertEquals(26, testComputerPlayer.getTurnTotal());
	}
}
