package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify ComputerPlayer's addDiceToTotal method.
 * 
 * @author Spencer Dent
 * @version 2021-06-28
 */
public class TestWhenAddDiceToTotal {

	/**
	 * Verifies that the method adds 2 to the initial total of 0 on a new
	 * ComputerPlayer (DieSet starts at 1 and 1).
	 */
	@Test
	public void testWithNewComputerPlayerShouldSetTotalTo2() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.addDiceToTotal();
		assertEquals(2, testComputerPlayer.getTotal());
	}

	/**
	 * Verifies that the method adds the dice values to the total.
	 */
	@Test
	public void testShouldAddDiceValuesToTotal() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.setTotal(4);
		testComputerPlayer.addDiceToTotal();
		
		int dieValue1 = testComputerPlayer.getThePair().getDie1Value();
		int dieVaule2 = testComputerPlayer.getThePair().getDie2Value();
		
		assertEquals((4 + dieValue1 + dieVaule2), testComputerPlayer.getTotal());
	}
}
