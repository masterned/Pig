package edu.westga.cs6910.pig.testing.computerplayer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.westga.cs6910.pig.model.ComputerPlayer;
import edu.westga.cs6910.pig.model.strategies.CautiousStrategy;
import javafx.collections.FXCollections;

/**
 * Provides unit tests to verify the expected behavior of ComputerPlayer's
 * getDiceValues method.
 * 
 * @author Spencer Dent
 * @version 2021-06-15
 */
public class TestWhenGetDiceValues {

	/**
	 * Calling on a new ComputerPlayer should return a new ObservableArrayList
	 */
	@Test
	public void testWithNewComputerPlayerShouldReturnNewObservableArrayList() {
		ComputerPlayer testComputerPlayer = new ComputerPlayer(new CautiousStrategy());
		assertEquals(FXCollections.observableArrayList(new ArrayList<String>()), testComputerPlayer.getDiceValues());
	}
}
