package edu.westga.cs6910.pig.model;

/**
 * Represents a pair of dice
 * 
 * This class was started by CS6910 for Summer 2021
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class DicePair {
	private Die die1;
	private Die die2;

	/**
	 * Sets up dice pair to be ready for rolling
	 */
	public DicePair() {
		this.die1 = new Die();
		this.die2 = new Die();
	}

	/**
	 * Rolls each die
	 */
	public void rollDice() {
		this.die1.roll();
		this.die2.roll();
	}

	/**
	 * Returns the number of pips showing on the first die
	 * 
	 * @return The number of pips showing on the first die
	 */
	public int getDie1Value() {
		return this.die1.getNumberOfPips();
	}

	/**
	 * Returns the number of pips showing on the second die
	 * 
	 * @return The number of pips showing on the second die
	 */
	public int getDie2Value() {
		return this.die2.getNumberOfPips();
	}

	/**
	 * Resets both of the dice to their initial states.
	 */
	public void reset() {
		this.die1.reset();
		this.die2.reset();
	}

	@Override
	/**
	 * Returns the String representation of the DicePair
	 * 
	 * @return The String representation of the DicePair
	 */
	public String toString() {
		return "die 1: " + this.die1.toString() + ", die 2: " + this.die2.toString();
	}
}
