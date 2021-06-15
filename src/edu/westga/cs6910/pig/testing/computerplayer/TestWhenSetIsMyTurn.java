package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;

/**
 * Provides unit testing to verify the expected behavior of ComputerPlayer's
 * isMyTurn mutator.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenSetIsMyTurn {

	/**
	 * When passed true, it should set the ComputerPlayer's isMyTurn to true.
	 */
	@Test
	public void testShouldSetIsMyTurnToTrueWhenPassedTrue() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		testComputerPlayer.setIsMyTurn(true);
		assertEquals(true, testComputerPlayer.getIsMyTurn());
	}

	/**
	 * When passed false, it should set the ComputerPlayer's isMyTurn to false even
	 * if it is already false.
	 */
	@Test
	public void testWhenPassedFalseShouldSetIsMyTurnToFalseWhenAlreadyFalse() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		testComputerPlayer.setIsMyTurn(false);
		assertEquals(false, testComputerPlayer.getIsMyTurn());
	}

	/**
	 * When passed true, it should set the ComputerPlayer's isMyTurn to true even it
	 * it is already true.
	 */
	@Test
	public void testWhenPassedTrueShouldSetIsMyTurnToTrueWhenAlreadyTrue() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		testComputerPlayer.setIsMyTurn(true);
		testComputerPlayer.setIsMyTurn(true);
		assertEquals(true, testComputerPlayer.getIsMyTurn());
	}

	/**
	 * When passed false, it should set the ComputerPlayer's isMyTurn to false even
	 * if isMyTurn is true.
	 */
	@Test
	public void testWhenPassedFalseShouldSetIsMyTurnToFalseWhenIsMyTurnIsTrue() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer();
		testComputerPlayer.setIsMyTurn(true);
		testComputerPlayer.setIsMyTurn(false);
		assertEquals(false, testComputerPlayer.getIsMyTurn());
	}
}
