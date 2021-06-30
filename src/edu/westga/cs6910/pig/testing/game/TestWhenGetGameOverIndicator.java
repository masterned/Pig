package edu.westga.cs6910.pig.testing.game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.Game;
import edu.westga.cs6910.pig.model.HumanPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;

/**
 * Provides unit testing to verify the expected behavior of Game's
 * getGameOverIndicator method.
 * 
 * @author Spencer Dent
 * @version 2021-06-29
 */
public class TestWhenGetGameOverIndicator {

	/**
	 * When called on a new game, the indicator's value should be false.
	 */
	@Test
	public void testWithNewGameShouldReturnPropertyWithValueFalse() {
		Game testGame = new Game(new HumanPlayer("Bill"), new ComputerPlayer(new CautiousStrategy()));
		assertEquals(false, testGame.getGameOverIndicator().getValue());
	}

	/**
	 * When called on game after game over, should return indicator with true as its
	 * value.
	 */
	@Test
	public void testWithFinishedGameShouldReturnPropertyWithValueTrue() {
		HumanPlayer testPlayer = new HumanPlayer("Ted");
		Game testGame = new Game(testPlayer, new ComputerPlayer(new CautiousStrategy()));
		testGame.startNewGame(testPlayer);
		testPlayer.setTotal(Game.GOAL_SCORE);
		testGame.isGameOver();
		
		assertEquals(true, testGame.getGameOverIndicator().getValue());
	}
}
