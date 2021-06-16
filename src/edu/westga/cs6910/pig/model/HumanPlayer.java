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
		this.rollDice();

		if (this.hasRolledAOne()) {
			this.setTotal(this.getTotal() - this.getTurnTotal());
			this.resetTurnTotal();
			this.setIsMyTurn(false);
		} else {
			this.addDiceToTurnTotal();
			this.addTurnTotalToTotal();
			this.setIsMyTurn(true);
		}
	}
}
