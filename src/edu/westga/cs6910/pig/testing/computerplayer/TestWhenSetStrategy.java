package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * strategy mutator.
 * 
 * @author Spencer Dent
 * @version 2021-06-22
 */
public class TestWhenSetStrategy {

	/**
	 * Test to make sure ComputerPlayer's setStrategy method sets its selected
	 * strategy to the new strategy passed-in.
	 */
	@Test
	public void testShouldSetTheSelectedStrategyToTheStrategyPassedIn() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		CautiousStrategy testCautiousStrategy = new CautiousStrategy();
		testComputerPlayer.setStrategy(testCautiousStrategy);
		assertEquals(testCautiousStrategy, testComputerPlayer.getStrategy());
	}
}
