package game_StructureElements;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.se.PerangKolom.StructureElements.Border;

public class BorderTest {

	Border testBorder; 
	
	@Before
	public void setUp() {
		testBorder = new Border(true, true);
	}
	
	@Test
	public void testBorder() {
		assertNotEquals(testBorder, null);
		assertTrue(testBorder.isBorderFilled());
		assertTrue(testBorder.isOuterBorder());
	}

	@Test
	public void testIsBorderFilled() {
		testBorder = new Border(true, true);
		assertTrue(testBorder.isBorderFilled());
	}

	@Test
	public void testSetBorderFilled() {
		testBorder.setBorderFilled(true);
		assertTrue(testBorder.isBorderFilled());
	}

	@Test
	public void testIsOuterBorder() {
		testBorder = new Border(true, true);
		assertTrue(testBorder.isOuterBorder());
	}

	@Test
	public void testSetOuterBorder() {
		testBorder.setOuterBorder(true);
		assertTrue(testBorder.isOuterBorder());
	}

}
