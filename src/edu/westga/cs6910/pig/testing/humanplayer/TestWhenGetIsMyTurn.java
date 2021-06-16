package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * isMyTurn accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetIsMyTurn {

	/**
	 * When called on a new HumanPlayer, getIsMyTurn should return false.
	 */
	@Test
	public void testWithNewHumanPlayerShouldReturnFalse() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		assertEquals(false, testHumanPlayer.getIsMyTurn());
	}
}
