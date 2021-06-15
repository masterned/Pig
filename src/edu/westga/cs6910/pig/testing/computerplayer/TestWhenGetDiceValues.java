package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;

/**
 * Provides unit tests to verify the expected behavior of ComputerPlayer's
 * getDiceValues method.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetDiceValues {

	/**
	 * Calling on a new ComputerPlayer should return the String "1, 1"
	 */
	@Test
	public void testWithNewComputerPlayerShouldReturnStringOf1And1() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		assertEquals("1, 1", testComputerPlayer.getDiceValues());
	}
}
