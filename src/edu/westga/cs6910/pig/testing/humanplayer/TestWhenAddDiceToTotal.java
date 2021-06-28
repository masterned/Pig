package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify HumanPlayer's addDiceToTotal method.
 * 
 * @author Spencer Dent
 * @version 2021-06-28
 */
public class TestWhenAddDiceToTotal {

	/**
	 * Verifies that the method adds 2 to the initial total of 0 on a new
	 * HumanPlayer (DieSet starts at 1 and 1).
	 */
	@Test
	public void testWithNewHumanPlayerShouldSetTotalTo2() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Ellen Ripley");
		testHumanPlayer.addDiceToTotal();
		assertEquals(2, testHumanPlayer.getTotal());
	}

	/**
	 * Verifies that the method adds the dice values to the total.
	 */
	@Test
	public void testShouldAddDiceValuesToTotal() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Ellen Ripley");
		testHumanPlayer.setTotal(4);
		testHumanPlayer.addDiceToTotal();

		int dieValue1 = testHumanPlayer.getThePair().getDie1Value();
		int dieVaule2 = testHumanPlayer.getThePair().getDie2Value();

		assertEquals((4 + dieValue1 + dieVaule2), testHumanPlayer.getTotal());
	}
}
