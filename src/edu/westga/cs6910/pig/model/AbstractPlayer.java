package edu.westga.cs6910.pig.model;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * AbstractPlayer represents the concept of a Player. It includes
 * implementations of methods shared within all Player objects, reducing
 * duplication.
 * 
 * @author Spencer Dent
 * @version 2021-06-09
 */
public abstract class AbstractPlayer implements Player {

	private String name;
	private DicePair thePair;

	private boolean isMyTurn;

	private ObservableList<String> rolls;

	private int turnTotal;
	private int total;

	/**
	 * Serves as a template constructor to reduce repetition in Player class
	 * constructors.
	 * 
	 * @param name the name of the Player
	 */
	public AbstractPlayer(String name) {
		this.name = name;
		this.thePair = new DicePair();

		this.isMyTurn = false;

		this.rolls = FXCollections.observableArrayList(new ArrayList<String>());

		this.turnTotal = 0;
		this.total = 0;
	}

	@Override
	/**
	 * @see Player#toString()
	 */
	public String toString() {
		return this.name + ": total: " + this.total + ", dice pair: " + this.thePair.toString();
	}

	@Override
	/**
	 * @see Player#getName()
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Returns the pair of dice the Player is using to roll
	 * 
	 * @return the DicePair
	 */
	public DicePair getThePair() {
		return this.thePair;
	}

	/**
	 * Rolls the dice.
	 */
	public void rollDice() {
		this.thePair.rollDice();
		this.rolls.add(this.thePair.getDie1Value() + ", " + this.thePair.getDie2Value());
	}

	@Override
	/**
	 * @see Player#getDiceValues()
	 */
	public String getDiceValues() {
		return this.thePair.getDie1Value() + ", " + this.thePair.getDie2Value();
	}

	@Override
	/**
	 * @see Player#getDiceRolls()
	 */
	public ObservableList<String> getDiceRolls() {
		return this.rolls;
	}
	
	@Override
	/**
	 * @see Player#resetDiceValues
	 */
	public void resetDiceValues() {
		this.rolls.clear();
	}

	/**
	 * Returns whether one or both of the dice have one pip showing
	 * 
	 * @return whether one or both of the dice have one pip showing
	 */
	public boolean hasRolledAOne() {
		return this.thePair.getDie1Value() == 1 || this.thePair.getDie2Value() == 1;
	}

	@Override
	/**
	 * @see Player#getIsMyTurn()
	 */
	public boolean getIsMyTurn() {
		return this.isMyTurn;
	}

	/**
	 * Sets the turn indicator flag to the given boolean.
	 * 
	 * @param isTurn whether or not it's the Player's turn
	 */
	public void setIsMyTurn(boolean isTurn) {
		this.isMyTurn = isTurn;
	}

	@Override
	/**
	 * @see Player#getTurnTotal()
	 */
	public int getTurnTotal() {
		return this.turnTotal;
	}

	/**
	 * Sets the turnTotal to the given value.
	 * 
	 * @param newTurnTotal the new total for the turn
	 */
	public void setTurnTotal(int newTurnTotal) {
		this.turnTotal = newTurnTotal;
	}

	@Override
	/**
	 * @see Player#resetTurnTotal()
	 */
	public void resetTurnTotal() {
		this.setTurnTotal(0);
	}

	/**
	 * Adds the value of the two dice to the turnTotal.
	 */
	public void addDiceToTurnTotal() {
		this.turnTotal += this.thePair.getDie1Value() + this.thePair.getDie2Value();
	}

	@Override
	/**
	 * @see Player#getTotal()
	 */
	public int getTotal() {
		return this.total;
	}

	/**
	 * Sets the total to a new integer
	 * 
	 * @param newTotal the new integer to use
	 */
	public void setTotal(int newTotal) {
		this.total = newTotal;
	}

	/**
	 * Subtracts the turnTotal from the total.
	 */
	public void removeTurnTotalFromTotal() {
		this.total -= this.turnTotal;
	}

	/**
	 * Adds the dice total to the total.
	 */
	public void addDiceToTotal() {
		this.total += this.thePair.getDie1Value() + this.thePair.getDie2Value();
	}

	@Override
	/**
	 * @see Player#takeTurn()
	 */
	public void takeTurn() {
		this.rollDice();

		if (this.hasRolledAOne()) {
			this.removeTurnTotalFromTotal();
			this.resetTurnTotal();
			this.setIsMyTurn(false);
		} else {
			this.addDiceToTurnTotal();
			this.addDiceToTotal();
			this.setIsMyTurn(true);
		}
	}
}
