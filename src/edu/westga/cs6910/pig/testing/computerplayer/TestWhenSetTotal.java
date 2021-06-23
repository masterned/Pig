package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit tests to verify the expected behavior of ComputerPlayer's total
 * mutator.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenSetTotal {

	/**
	 * When passed 7, it should set the total to 7.
	 */
	@Test
	public void testWhenPassed7ShouldSetTotalTo7() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.setTotal(7);
		assertEquals(7, testComputerPlayer.getTotal());
	}

	/**
	 * When passed 18, it should set the total to 18. This second method is here to
	 * prevent the developer from hard-coding the values.
	 */
	@Test
	public void testWhenPassed18ShouldSetTotalTo18() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.setTotal(18);
		assertEquals(18, testComputerPlayer.getTotal());
	}
}
