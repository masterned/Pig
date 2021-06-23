package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * maximumRolls setter.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenSetMaximumRolls {

	/**
	 * The method should change the ComputerPlayer's maximumRolls to the given
	 * value.
	 */
	@Test
	public void testWhenPassed5ShouldSetMaximumRollsTo5() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.setMaximumRolls(5);
		assertEquals(5, testComputerPlayer.getMaximumRolls());
	}

	/**
	 * Tests setMaximumRolls again to prevent the developer from hard-coding the
	 * value.
	 */
	@Test
	public void testWhenPassed34ShouldSetMaximumRollsTo34() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.setMaximumRolls(34);
		assertEquals(34, testComputerPlayer.getMaximumRolls());
	}

	/**
	 * Tests the setMaximumRolls method without any arguments. It should set the
	 * maximumRolls to 1
	 */
	@Test
	public void testWhenCalledWithNoArgumentsShouldSetMaximumRollsTo1() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.setMaximumRolls();
		assertEquals(1, testComputerPlayer.getMaximumRolls());
	}
}
