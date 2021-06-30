package edu.westga.cs6910.pig.testing.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of Game's resetScores
 * method.
 * 
 * @author Spencer Dent
 * @version 2021-06-29
 */
public class TestWhenResetScores {

	/**
	 * Should reset the HumanPlayer's total to 0.
	 */
	@Test
	public void testShouldSetHumanPlayersTotalTo0() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Fred");
		testHumanPlayer.setTotal(18);

		Game testGame = new Game(testHumanPlayer, new ComputerPlayer(new CautiousStrategy()));
		testGame.resetScores();

		assertEquals(0, testGame.getHumanPlayer().getTotal());
	}

	/**
	 * Should reset the HumanPlayer's turnTotal to 0.
	 */
	@Test
	public void testShouldSetHumanPlayersTurnTotalTo0() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Fred");
		testHumanPlayer.setTurnTotal(18);

		Game testGame = new Game(testHumanPlayer, new ComputerPlayer(new CautiousStrategy()));
		testGame.resetScores();

		assertEquals(0, testGame.getHumanPlayer().getTurnTotal());
	}

	/**
	 * Should reset ComputerPlayer's total to 0.
	 */
	@Test
	public void testShouldSetComputerPlayersTotalTo0() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.setTotal(12);

		Game testGame = new Game(new HumanPlayer("Earl"), testComputerPlayer);
		testGame.resetScores();

		assertEquals(0, testGame.getComputerPlayer().getTotal());
	}

	/**
	 * Should reset ComputerPlayer's turnTotal to 0.
	 */
	@Test
	public void testShouldSetComputerPlayersTurnTotalTo0() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		testComputerPlayer.setTurnTotal(8);

		Game testGame = new Game(new HumanPlayer("Earl"), testComputerPlayer);
		testGame.resetScores();

		assertEquals(0, testGame.getComputerPlayer().getTurnTotal());
	}
}
