package edu.westga.cs6910.pig.model;

/**
 * HumanPlayer represents a human player in the game Pig.
 * 
 * This class was started by CS6910
 * 
 * @author Spencer Dent
 * @version 2021-06-09
 */
public class HumanPlayer extends AbstractPlayer {

	/**
	 * Creates a new ComputerPlayer with the specified name.
	 * 
	 * @param name this Player's name
	 * 
	 * @requires name != null
	 * @ensure name().equals(name) && getTotal() == 0
	 */
	public HumanPlayer(String name) {
		super(name);
	}

	@Override
	/**
	 * @see Player#takeTurn()
	 */
	public void takeTurn() {
		this.getThePair().rollDice();

		int die1Value = this.getThePair().getDie1Value();
		int die2Value = this.getThePair().getDie2Value();
		if (die1Value == 1 || die2Value == 1) {
			this.setTotal(this.getTotal() - this.getTurnTotal());
			this.setIsMyTurn(false);
		} else {
			this.setTurnTotal(this.getTurnTotal() + die1Value + die2Value);
			this.setTotal(this.getTotal() + die1Value + die2Value);
			this.setIsMyTurn(true);
		}
	}
}
