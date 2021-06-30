package edu.westga.cs6910.pig.testing.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of Game's resetDice
 * method.
 * 
 * @author Spencer Dent
 * @version 2021-06-30
 */
public class TestWhenResetDice {

	/**
	 * Should reset HumanPlayer's DicePair, setting its internal values to 1.
	 */
	@Test
	public void testShouldResetHumanPlayersDicePair() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Doug");
		Game testGame = new Game(testHumanPlayer, new ComputerPlayer(new CautiousStrategy()));

		testHumanPlayer.rollDice();
		testHumanPlayer.rollDice();
		testHumanPlayer.rollDice();

		testGame.resetDice();

		assertEquals("die 1: pips: 1, die 2: pips: 1", testGame.getHumanPlayer().getThePair().toString());
	}

	/**
	 * Should reset ComputerPlayer's DicePair, setting its internal values to 1.
	 */
	@Test
	public void testShouldResetComputerPlayersDicePair() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		Game testGame = new Game(new HumanPlayer("Joe"), testComputerPlayer);

		testComputerPlayer.rollDice();
		testComputerPlayer.rollDice();
		testComputerPlayer.rollDice();

		testGame.resetDice();

		assertEquals("die 1: pips: 1, die 2: pips: 1", testGame.getComputerPlayer().getThePair().toString());
	}

	/**
	 * Should clear the HumanPlayer's rolled dice values, setting its length to 0.
	 */
	@Test
	public void testShouldClearHumanPlayersDiceValues() {
		HumanPlayer testHumanPlayer = new HumanPlayer("Tim");
		Game testGame = new Game(testHumanPlayer, new ComputerPlayer(new CautiousStrategy()));

		testHumanPlayer.rollDice();
		testHumanPlayer.rollDice();
		testHumanPlayer.rollDice();

		testGame.resetDice();

		assertEquals(0, testGame.getHumanPlayer().getDiceValues().size());
	}

	/**
	 * Should clear the ComputerPlayer's rolled dice values, setting its length to
	 * 0.
	 */
	@Test
	public void testShouldClearComputerPlayersDiceValues() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		Game testGame = new Game(new HumanPlayer("Mark"), testComputerPlayer);

		testComputerPlayer.rollDice();
		testComputerPlayer.rollDice();
		testComputerPlayer.rollDice();

		testGame.resetDice();

		assertEquals(0, testGame.getComputerPlayer().getDiceValues().size());
	}
}
