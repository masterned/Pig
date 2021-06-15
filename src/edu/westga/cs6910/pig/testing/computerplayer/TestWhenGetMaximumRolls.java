package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * maximumRolls getter.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetMaximumRolls {

	/**
	 * The method should return 0 when called on a new ComputerPlayer.
	 */
	@Test
	public void testWithNewComputerPlayerShouldHave0Rolls() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		assertEquals(0, testComputerPlayer.getMaximumRolls());
	}
}
