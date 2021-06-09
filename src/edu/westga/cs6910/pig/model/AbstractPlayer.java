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

	@Override
	/**
	 * @see Player#getIsMyTurn()
	 */
	public boolean getIsMyTurn() {
		return this.isMyTurn;
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

	@Override
	/**
	 * @see Player#getDiceValues()
	 */
	public String getDiceValues() {
		return this.thePair.getDie1Value() + ", " + this.thePair.getDie2Value();
	}

}
