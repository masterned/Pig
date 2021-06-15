package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.DicePair;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * thePair accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetThePair {

	/**
	 * When called on a new ComputerPlayer, it should return a DicePair in its
	 * original state.
	 */
	@Test
	public void testWithNewComputerPlayerShouldReturnNewDicePair() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		assertEquals(new DicePair().toString(), testComputerPlayer.getThePair().toString());
	}
}
