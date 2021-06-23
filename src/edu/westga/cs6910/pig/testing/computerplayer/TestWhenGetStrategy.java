package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;
import edu.westga.cs6910.pig.model.strategies.PigStrategy;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * strategy accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-22
 */
public class TestWhenGetStrategy {

	/**
	 * Tests getStrategy on a new ComputerPlayer, should return the PigStrategy
	 * passed into its constructor.
	 */
	@Test
	public void testWithNewComputerPlayerShouldReturnStrategyPassedIntoConstructor() {
		PigStrategy testCautiousStrategy = new CautiousStrategy();
		ComputerPlayer testComputerPlayer = new ComputerPlayer(testCautiousStrategy);
		assertEquals(testCautiousStrategy, testComputerPlayer.getStrategy());
	}
}
