package edu.westga.cs6910.pig.model;

/**
 * ComputerPlayer represents a very simple automated player in the game Pig.
 * It rolls exactly 1 time and then holds.
 * 
 * This class was started by CS6910
 * 
 * @author Spencer Dent
 * @version 2021-06-09
 */
public class ComputerPlayer extends AbstractPlayer {
	private static final String NAME = "Simple computer";
	private int maximumRolls;
	
	/**
	 * Creates a new ComputerPlayer with the specified name.
	 * 
	 */
	public ComputerPlayer() {
		super(NAME);
	}
	
	/**
	 * Implements Player's setMaximumRolls, but is not normally
	 * called by client objects.  Instead, clients usually
	 * call the 0-parameter version
	 * 
	 * @param	maximumRolls	The maximum number of times the computer
	 * 							will roll before holding
	 */
	public void setMaximumRolls(int maximumRolls) {
		this.maximumRolls = maximumRolls;
	}

	/**
	 * Implements Player's setMaximumRolls() to set the 
	 * maximum number of rolls to 1
	 * 
	 */
	public void setMaximumRolls() {
		this.maximumRolls = 1;
	}

	@Override
	/**
	 * @see Player#takeTurn()
	 */	
	public void takeTurn() {				
		for (int count = 0; count < this.maximumRolls; count++) {
			this.getThePair().rollDice();
			
			int die1Value = this.getThePair().getDie1Value();
			int die2Value = this.getThePair().getDie2Value();
			if (die1Value == 1 || die2Value == 1) {
				this.setTotal(this.getTotal() - this.getTurnTotal());
				this.setIsMyTurn(false);
				return;
			} else {		
				this.setTurnTotal(this.getTurnTotal() + die1Value + die2Value);
				this.setTotal(this.getTotal() + die1Value + die2Value);		
			}		
		}
		this.setIsMyTurn(false);
	}
}
