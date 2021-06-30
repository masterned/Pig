package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * clearDiceValues method.
 * 
 * @author Spencer Dent
 * @version 2021-06-30s
 */
public class TestWhenClearDiceValues {

	/**
	 * When called on a HumanPlayer that has rolled a few times, it should set the
	 * size of the numberOfRolls to 0.
	 */
	@Test
	public void testShouldSetDiceValuesSizeTo0() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Jane");

		testHumanPlayer.rollDice();
		testHumanPlayer.rollDice();
		testHumanPlayer.rollDice();

		testHumanPlayer.clearDiceValues();

		assertEquals(0, testHumanPlayer.getDiceValues().size());
	}
}
