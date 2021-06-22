package edu.westga.cs6910.pig.model.strategies;

/**
 * Defines a common interface for all game-play algorithms for Pig.
 * 
 * @author Spencer Dent
 * @version 2021-06-22
 */
public interface PigStrategy {

	/**
	 * Dictates to the computer whether or not it should roll again based on the
	 * game state.
	 * 
	 * @param numberOfRollsTaken          - the number of rolls already taken this
	 *                                    turn
	 * @param numberOfPointsRolled        - the number of points rolled so far this
	 *                                    turn
	 * @param totalAndGoalScoreDifference - the difference between the total points
	 *                                    so far and the goal score
	 * @return true if the player should roll again, false otherwise
	 */
	boolean rollAgain(int numberOfRollsTaken, int numberOfPointsRolled, int totalAndGoalScoreDifference);
}
