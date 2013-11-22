package game_StructureElements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.PerangKolom.StructureElements.Player;

public class PlayerTest {

	Player player1;
	
	@Before 
	public void setUp() {
		player1 = new Player("Bobo", 2);
	}
	
	@Test
	public void testPlayer() {
		assertEquals("Bobo", player1.getName());
		assertEquals(2, player1.getNumberOfPlayers());
	}

	@Test
	public void testGetName() {
		assertEquals("Bobo", player1.getName());
	}

	@Test
	public void testGetNumberOfPlayers() {
		assertEquals(2, player1.getNumberOfPlayers());
	}

}
