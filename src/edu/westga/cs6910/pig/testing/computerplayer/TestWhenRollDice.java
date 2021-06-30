package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * rollDice method.
 * 
 * @author Spencer Dent
 * @version 2021-06-29
 */
public class TestWhenRollDice {

	/**
	 * When called on a new ComputerPlayer, it should increase the number of rolls
	 * to one.
	 */
	@Test
	public void testWithNewComputerPlayerShouldSetDiceValuesSizeTo1() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.rollDice();
		assertEquals(1, testComputerPlayer.getDiceValues().size());
	}
}
