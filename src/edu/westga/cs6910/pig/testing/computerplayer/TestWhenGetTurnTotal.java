package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * turnTotal accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetTurnTotal {

	/**
	 * When called on a new ComputerPlayer, the turnTotal should be 0.
	 */
	@Test
	public void testWithNewComputerPlayerShouldHave0Points() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		assertEquals(0, testComputerPlayer.getTurnTotal());
	}

}
