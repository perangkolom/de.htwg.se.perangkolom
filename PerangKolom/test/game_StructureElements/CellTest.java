package game_StructureElements;

import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {

	@Test
	public void testCell() {
		
		assertEquals(8, new Cell(8, 0, 0));
	}

	@Test
	public void testGetPositionX() {
		assertEquals(5, new Cell(5, 0, 0).getPositionX());
		assertEquals(7, new Cell(7, 0, 0).getPositionX());
	}


	@Test
	public void testGetPositionY() {
		assertEquals(5, new Cell(5, 0, 0).getPositionY());
		assertEquals(7, new Cell(7, 0, 0).getPositionY());
	}

	@Test
	public void testIsCellFilled() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCellFilled() {

	}

	@Test
	public void testGetCellValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCellOwner() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCellOwner() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCellBorder_top() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCellBorder_top() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCellBorder_bottom() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCellBorder_bottom() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCellBorder_left() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCellBorder_left() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCellBorder_right() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCellBorder_right() {
		fail("Not yet implemented");
	}

}
