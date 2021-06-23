package edu.westga.cs6910.pig.model;

import edu.westga.cs6910.pig.model.strategies.PigStrategy;

/**
 * ComputerPlayer represents a very simple automated player in the game Pig. It
 * rolls exactly 1 time and then holds.
 * 
 * This class was started by CS6910
 * 
 * @author Spencer Dent
 * @version 2021-06-09
 */
public class ComputerPlayer extends AbstractPlayer {
	private static final String NAME = "Simple computer";
	private int maximumRolls;

	private PigStrategy selectedStrategy;

	/**
	 * Creates a new ComputerPlayer with the strategy and name from the selected
	 * strategy.
	 * 
	 * @param specifiedStrategy - the strategy the computer will use on their turn
	 */
	public ComputerPlayer(PigStrategy specifiedStrategy) {
		super(NAME);
		
		if (specifiedStrategy == null) {
			throw new IllegalArgumentException("Specified strategy cannot be null");
		}
		
		this.maximumRolls = 0;
		this.selectedStrategy = specifiedStrategy;
	}

	/**
	 * Retrieves the computer player's maximumRolls.
	 * 
	 * @return The maximum number of times the computer will roll before holding
	 */
	public int getMaximumRolls() {
		return this.maximumRolls;
	}

	/**
	 * Sets the computer player's maximumRolls to the given value.
	 * 
	 * @param maximumRolls The maximum number of times the computer will roll before
	 *                     holding
	 */
	public void setMaximumRolls(int maximumRolls) {
		this.maximumRolls = maximumRolls;
	}

	/**
	 * Implements Player's setMaximumRolls() to set the maximum number of rolls to 1
	 * 
	 */
	public void setMaximumRolls() {
		this.setMaximumRolls(1);
	}

	@Override
	/**
	 * @see Player#takeTurn()
	 */
	public void takeTurn() {
		this.resetTurnTotal();

		for (int count = 0; count < this.maximumRolls; count++) {
			this.rollDice();

			if (this.hasRolledAOne()) {
				this.resetTurnTotal();
				this.setIsMyTurn(false);
				return;
			} else {
				this.addDiceToTurnTotal();
			}
		}

		this.addTurnTotalToTotal();
		this.setIsMyTurn(false);
	}
}
