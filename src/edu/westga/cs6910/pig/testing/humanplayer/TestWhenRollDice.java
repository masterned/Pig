package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * rollDice method.
 * 
 * @author Spencer Dent
 * @version 2021-06-29
 */
public class TestWhenRollDice {

	/**
	 * When called on a new HumanPlayer, it should increase the number of rolls to
	 * one.
	 */
	@Test
	public void testWithNewHumanPlayerShouldSetDiceValuesSizeTo1() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Jack");
		testHumanPlayer.rollDice();
		assertEquals(1, testHumanPlayer.getDiceValues().size());
	}
}
