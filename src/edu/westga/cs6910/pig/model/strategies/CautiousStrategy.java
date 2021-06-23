package edu.westga.cs6910.pig.model.strategies;

/**
 * This strategy causes the computer to never take an additional roll on their
 * turn.
 * 
 * @author Spencer Dent
 * @version 2021-06-22
 */
public class CautiousStrategy implements PigStrategy {

	/**
	 * Always returns false, causing the computer to roll at most once per round.
	 */
	@Override
	public boolean rollAgain(int numberOfRollsTaken, int numberOfPointsRolled, int totalAndGoalScoreDifference) {
		return false;
	}

}
