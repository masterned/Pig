package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;
import edu.westga.cs6910.pig.model.DicePair;

/**
 * Provides unit testing to verify the expected behavior of HumanPlayer's
 * thePair accessor.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetThePair {

	/**
	 * When called on a new HumanPlayer, it should return a DicePair in its original
	 * state.
	 */
	@Test
	public void testWithNewHumanPlayerShouldReturnNewDicePair() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		assertEquals(new DicePair().toString(), testHumanPlayer.getThePair().toString());
	}
}
