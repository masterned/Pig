package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;

/**
 * Provides unit tests to verify the expected behavior of ComputerPlayer's total
 * accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetTotal {

	/**
	 * When called on a new ComputerPlayer, it should return 0.
	 */
	@Test
	public void testWithNewComputerPlayerShouldHaveTotalOf0() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		assertEquals(0, testComputerPlayer.getTotal());
	}

}
