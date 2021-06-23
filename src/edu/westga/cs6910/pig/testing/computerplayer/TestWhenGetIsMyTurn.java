package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * isMyTurn accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetIsMyTurn {

	/**
	 * When called on a new ComputerPlayer, getIsMyTurn should return false.
	 */
	@Test
	public void testWithNewComputerPlayerShouldReturnFalse() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		assertEquals(false, testComputerPlayer.getIsMyTurn());
	}
}
