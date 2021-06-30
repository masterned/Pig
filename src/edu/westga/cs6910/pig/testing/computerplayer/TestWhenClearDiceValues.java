package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * clearDiceValues method.
 * 
 * @author Spencer Dent
 * @version 2021-06-30s
 */
public class TestWhenClearDiceValues {

	/**
	 * When called on a ComputerPlayer that has rolled a few times, it should set the size
	 * of the numberOfRolls to 0.
	 */
	@Test
	public void testShouldSetDiceValuesSizeTo0() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		
		testComputerPlayer.rollDice();
		testComputerPlayer.rollDice();
		testComputerPlayer.rollDice();
		
		testComputerPlayer.clearDiceValues();
		
		assertEquals(0, testComputerPlayer.getDiceValues().size());
	}
}
