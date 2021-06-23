package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * hasRolledAOne method.
 * 
 * @author Spencer Dent
 * @version 2021-06-16
 */
public class TestWhenHasRolledAOne {

	/**
	 * When called on a new ComputerPlayer, it should return true.
	 */
	@Test
	public void testHasRolledAOne() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		assertEquals(true, testComputerPlayer.hasRolledAOne());
	}

}
