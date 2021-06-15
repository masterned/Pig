package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * name accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetName {

	/**
	 * When getName is called on any ComputerPlayer (in its current implementation), it
	 * should return "Simple computer"
	 */
	@Test
	public void testShouldReturnSimpleComputer() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		assertEquals("Simple computer", testComputerPlayer.getName());
	}

}
