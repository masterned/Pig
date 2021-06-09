package edu.westga.cs6910.pig.model;

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
	private int total;
	private int turnTotal;

	/**
	 * Serves as a template constructor to reduce repetition in Player class
	 * constructors.
	 * 
	 * @param name the name of the Player
	 */
	public AbstractPlayer(String name) {
		this.name = name;
		this.total = 0;
		this.thePair = new DicePair();
	}

	@Override
	/**
	 * @see Player#takeTurn()
	 */
	public abstract void takeTurn();

	@Override
	/**
	 * @see Player#resetTurnTotal()
	 */
	public void resetTurnTotal() {
		this.turnTotal = 0;
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
	 * @see Player#getName()
	 */
	public String getName() {
		return this.name;
	}

	@Override
	/**
	 * @see Player#getTurnTotal()
	 */
	public int getTurnTotal() {
		return this.turnTotal;
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
	 * Returns the pair of dice the Player is using to roll
	 * 
	 * @return the DicePair
	 */
	public DicePair getThePair() {
		return this.thePair;
	}

	@Override
	/**
	 * @see Player#getDiceValues()
	 */
	public String getDiceValues() {
		return this.thePair.getDie1Value() + ", " + this.thePair.getDie2Value();
	}

}
