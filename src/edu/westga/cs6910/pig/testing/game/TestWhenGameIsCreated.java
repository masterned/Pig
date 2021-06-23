package edu.westga.cs6910.pig.testing.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;
import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;

/**
 * Provides unit testing to verify the expected behavior of Game's constructor
 * and toString method.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGameIsCreated {

	/**
	 * The constructor should create a new Game with the given Players and goalScore
	 * of 20.
	 */
	@Test
	public void testShouldProduceGameWithGoalScore20AndGivenPlayers() {
		Game testGame = new Game(new HumanPlayer("David Lightman"), new ComputerPlayer(new CautiousStrategy()));
		String expectedResult = "Goal Score: 20" + System.getProperty("line.separator") + "David Lightman: 0"
				+ System.getProperty("line.separator") + "Simple computer: 0";
		assertEquals(expectedResult, testGame.toString());
	}

	/**
	 * Tests the constructor again to prevent the developer from hard-coding the
	 * return values.
	 */
	@Test
	public void testGoalConstructorAgainToPreventHardCoding() {
		Game testGame = new Game(new HumanPlayer("Jennifer Mack"), new ComputerPlayer(new CautiousStrategy()));
		String expectedResult = "Goal Score: 20" + System.getProperty("line.separator") + "Jennifer Mack: 0"
				+ System.getProperty("line.separator") + "Simple computer: 0";
		assertEquals(expectedResult, testGame.toString());
	}
}
