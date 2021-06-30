package edu.westga.cs6910.pig.model;

import javafx.collections.ObservableList;

/**
 * Player defines the interface for players in the game Pig.
 * 
 * This class was started by CS6910 for Summer 2021
 * 
 * @author Spencer Dent
 * @version 2021-06-14
 */
public interface Player {
	/**
	 * Rolls the die 1 or more times.
	 * 
	 */
	void takeTurn();

	/**
	 * Resets the turn total to 0
	 * 
	 */
	void resetTurnTotal();

	/**
	 * Returns whether or not it is this player's turn
	 * 
	 * @return True if and only if it is this player's turn
	 */
	boolean getIsMyTurn();

	/**
	 * Returns this Player's name.
	 * 
	 * @return the name
	 */
	String getName();

	/**
	 * Returns the total of all die rolls for this turn
	 * 
	 * @return The total of all die rolls for this turn
	 */
	int getTurnTotal();

	/**
	 * Returns the total number of pips rolled by this player during the game
	 * 
	 * @return The player's total score
	 */
	int getTotal();

	/**
	 * Returns the ObservableList of the pips of all the dice rolls stored
	 * 
	 * @return the list of rolls made by the Player
	 */
	ObservableList<String> getDiceValues();

	/**
	 * Clears the list of Dice values.
	 */
	void clearDiceValues();

	@Override
	/**
	 * Returns the String representation of the Player object
	 * 
	 * @return The String representation of the Player object
	 */
	String toString();
}
