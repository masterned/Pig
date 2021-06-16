package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * isMyTurn mutator.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenSetIsMyTurn {

	/**
	 * When passed true, it should set the HumanPlayer's isMyTurn to true.
	 */
	@Test
	public void testShouldSetIsMyTurnToTrueWhenPassedTrue() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		testHumanPlayer.setIsMyTurn(true);
		assertEquals(true, testHumanPlayer.getIsMyTurn());
	}

	/**
	 * When passed false, it should set the HumanPlayer's isMyTurn to false even if
	 * it is already false.
	 */
	@Test
	public void testWhenPassedFalseShouldSetIsMyTurnToFalseWhenAlreadyFalse() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Jennifer Mack");
		testHumanPlayer.setIsMyTurn(false);
		assertEquals(false, testHumanPlayer.getIsMyTurn());
	}

	/**
	 * When passed true, it should set the HumanPlayer's isMyTurn to true even it it
	 * is already true.
	 */
	@Test
	public void testWhenPassedTrueShouldSetIsMyTurnToTrueWhenAlreadyTrue() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Stephen Falken");
		testHumanPlayer.setIsMyTurn(true);
		testHumanPlayer.setIsMyTurn(true);
		assertEquals(true, testHumanPlayer.getIsMyTurn());
	}

	/**
	 * When passed false, it should set the HumanPlayer's isMyTurn to false even if
	 * isMyTurn is true.
	 */
	@Test
	public void testWhenPassedFalseShouldSetIsMyTurnToFalseWhenIsMyTurnIsTrue() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Jack Beringer");
		testHumanPlayer.setIsMyTurn(true);
		testHumanPlayer.setIsMyTurn(false);
		assertEquals(false, testHumanPlayer.getIsMyTurn());
	}
}
