package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;

/**
 * Provides testing to verify the expected behavior of ComputerPlayer's
 * constructor.
 * 
 * @author Spencer Dent
 * @version 2021-06-14
 */
public class TestWhenComputerPlayerIsCreated {

	/**
	 * Tests the constructor to verify it produces a ComputerPlayer named "Simple
	 * computer" with a total of 0 and a newly generated DicePair.
	 */
	@Test
	void testShouldProduceComputerPlayerWithNameSimpleComputerAndTotal0() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		assertEquals("Simple computer: total: 0, dice pair: die 1: pips: 1, die 2: pips: 1",
				testComputerPlayer.toString());
	}
}
