package edu.westga.cs6910.pig.testing.humanplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.HumanPlayer;
import javafx.collections.FXCollections;

/**
 * Provides unit tests to verify the expected behavior of HumanPlayer's
 * getDiceValues method.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetDiceValues {

	/**
	 * Calling on a new HumanPlayer should return a new ObservableArrayList
	 */
	@Test
	public void testWithNewHumanPlayerShouldReturnNewObservableArrayList() {
		HumanPlayer testHumanPlayer = new HumanPlayer("David Lightman");
		assertEquals(FXCollections.observableArrayList(new ArrayList<String>()), testHumanPlayer.getDiceValues());
	}
}
