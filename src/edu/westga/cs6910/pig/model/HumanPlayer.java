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
	 * Creates a new HumanPlayer with the specified name.
	 * 
	 * @param name this Player's name
	 * 
	 * @requires name != null
	 * @ensure name().equals(name) && getTotal() == 0
	 */
	public HumanPlayer(String name) {
		super(name);
	}
}
