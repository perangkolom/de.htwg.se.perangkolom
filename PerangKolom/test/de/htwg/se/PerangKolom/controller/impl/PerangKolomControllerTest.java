package de.htwg.se.PerangKolom.controller.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.htwg.se.PerangKolom.model.impl.Border;
import de.htwg.se.PerangKolom.model.impl.Cell;
import de.htwg.se.PerangKolom.model.impl.CellArray;
import de.htwg.se.PerangKolom.model.impl.CellArrayTest;

public class PerangKolomControllerTest {

	PerangKolomController controller;
	public TreeSet<Cell> CellArraySet;
	Cell[][] cellArray;
	Cell cell;
	Border b;
	Border r;
	Border t;
	Border l; 
	@Before
	public void setUp() {
		controller = new PerangKolomController();
		CellArraySet = new TreeSet<Cell>();
		cellArray = CellArray.getInstance();
		cell = new Cell(1, 1, 50);
		b = cell.getCellBorder_bottom();
		r = cell.getCellBorder_right(); 
		t = cell.getCellBorder_top();
		l = cell.getCellBorder_left();
	}
	@Test
	public void testClosePossibleBorderAlgo(){
		
		List<Cell> CellSetBufferWithThreeBorders = new ArrayList<Cell>();

		/* case Border LEFT */
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(true);
		l.setBorderFilled(false);
		CellSetBufferWithThreeBorders.add(cell);
		controller.ClosePossibleBorderAlgo(CellSetBufferWithThreeBorders);
		assertTrue(l.isBorderFilled());
		
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(true);
		l.setBorderFilled(true);
		CellSetBufferWithThreeBorders.add(cell);
		controller.ClosePossibleBorderAlgo(CellSetBufferWithThreeBorders);
		assertTrue(l.isBorderFilled());
		
		/* case Border BOTTOM */
		b.setBorderFilled(false);
		r.setBorderFilled(true);
		t.setBorderFilled(true);
		l.setBorderFilled(true);
		CellSetBufferWithThreeBorders.add(cell);
		controller.ClosePossibleBorderAlgo(CellSetBufferWithThreeBorders);
		assertTrue(b.isBorderFilled());
		
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(true);
		l.setBorderFilled(true);
		CellSetBufferWithThreeBorders.add(cell);
		controller.ClosePossibleBorderAlgo(CellSetBufferWithThreeBorders);
		assertTrue(b.isBorderFilled());
		
		/* case Border RIGHT */
		b.setBorderFilled(true);
		r.setBorderFilled(false);
		t.setBorderFilled(true);
		l.setBorderFilled(true);
		CellSetBufferWithThreeBorders.add(cell);
		controller.ClosePossibleBorderAlgo(CellSetBufferWithThreeBorders);
		assertTrue(r.isBorderFilled());
		
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(true);
		l.setBorderFilled(true);
		CellSetBufferWithThreeBorders.add(cell);
		controller.ClosePossibleBorderAlgo(CellSetBufferWithThreeBorders);
		assertTrue(r.isBorderFilled());
		
		/* case Border TOP */
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(false);
		l.setBorderFilled(true);
		CellSetBufferWithThreeBorders.add(cell);
		controller.ClosePossibleBorderAlgo(CellSetBufferWithThreeBorders);
		assertTrue(t.isBorderFilled());
		
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(true);
		l.setBorderFilled(true);
		CellSetBufferWithThreeBorders.add(cell);
		controller.ClosePossibleBorderAlgo(CellSetBufferWithThreeBorders);
		assertTrue(t.isBorderFilled());
	}
	@Test
	public void testNotPutForwardAlgo(){
		List<Cell> CellSetBufferLessThanTwoBorders = new ArrayList<Cell>();
		
		b.setBorderFilled(false);
		r.setBorderFilled(false);
		t.setBorderFilled(false);
		l.setBorderFilled(false);
		CellSetBufferLessThanTwoBorders.clear();
		CellSetBufferLessThanTwoBorders.add(cell);
		controller.NotPutForwardAlgo(CellSetBufferLessThanTwoBorders);
		assertTrue(b.isBorderFilled());
		
		/* case border BOTTOM */
		b.setBorderFilled(false);
		r.setBorderFilled(true);
		t.setBorderFilled(false);
		l.setBorderFilled(false);
		CellSetBufferLessThanTwoBorders.clear();
		CellSetBufferLessThanTwoBorders.add(cell);
		controller.NotPutForwardAlgo(CellSetBufferLessThanTwoBorders);
		assertTrue(b.isBorderFilled());
		
		b.setBorderFilled(false);
		r.setBorderFilled(false);
		t.setBorderFilled(true);
		l.setBorderFilled(false);
		CellSetBufferLessThanTwoBorders.clear();
		CellSetBufferLessThanTwoBorders.add(cell);
		controller.NotPutForwardAlgo(CellSetBufferLessThanTwoBorders);
		assertTrue(b.isBorderFilled());
	
		
		b.setBorderFilled(false);
		r.setBorderFilled(false);
		t.setBorderFilled(false);
		l.setBorderFilled(true);
		CellSetBufferLessThanTwoBorders.clear();
		CellSetBufferLessThanTwoBorders.add(cell);
		controller.NotPutForwardAlgo(CellSetBufferLessThanTwoBorders);
		assertTrue(b.isBorderFilled());
		
		/* case border RIGHT */
		b.setBorderFilled(true);
		r.setBorderFilled(false);
		t.setBorderFilled(false);
		l.setBorderFilled(false);
		CellSetBufferLessThanTwoBorders.clear();
		CellSetBufferLessThanTwoBorders.add(cell);
		controller.NotPutForwardAlgo(CellSetBufferLessThanTwoBorders);
		assertTrue(b.isBorderFilled());
		
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(false);
		l.setBorderFilled(false);
		CellSetBufferLessThanTwoBorders.clear();
		CellSetBufferLessThanTwoBorders.add(cell);
		controller.NotPutForwardAlgo(CellSetBufferLessThanTwoBorders);
		assertTrue(b.isBorderFilled());
		
		/* case border TOP */
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(false);
		l.setBorderFilled(false);
		CellSetBufferLessThanTwoBorders.clear();
		CellSetBufferLessThanTwoBorders.add(cell);
		controller.NotPutForwardAlgo(CellSetBufferLessThanTwoBorders);
		assertTrue(t.isBorderFilled());
		
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(true);
		l.setBorderFilled(false);
		CellSetBufferLessThanTwoBorders.clear();
		CellSetBufferLessThanTwoBorders.add(cell);
		controller.NotPutForwardAlgo(CellSetBufferLessThanTwoBorders);
		assertTrue(t.isBorderFilled());

		/* case border LEFT */
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(true);
		l.setBorderFilled(false);
		CellSetBufferLessThanTwoBorders.clear();
		CellSetBufferLessThanTwoBorders.add(cell);
		controller.NotPutForwardAlgo(CellSetBufferLessThanTwoBorders);
		assertTrue(l.isBorderFilled());
		
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(true);
		l.setBorderFilled(true);
		CellSetBufferLessThanTwoBorders.clear();
		CellSetBufferLessThanTwoBorders.add(cell);
		controller.NotPutForwardAlgo(CellSetBufferLessThanTwoBorders);
		assertTrue(l.isBorderFilled());
		
		
	
	}
	@Test
	public void testSacrificeLowestValueAlgo(){
		
	}
	@Test
	public void testComputerLogic(){

		
		/* test first case --> 3 Border filled */
//		cell = cellArray[0][0];
		cell.setCellBorder_bottom(cell.getCellBorder_bottom());
		cell.setCellBorder_right(cell.getCellBorder_right());
		cell.setCellBorder_bottom(cell.getCellBorder_bottom());
		//cell.setCellBorder_left(cell.getCellBorder_left());
		
//		b.setBorderFilled(true);
//		r.setBorderFilled(true);
//		t.setBorderFilled(true);
//		l.setBorderFilled(false);
		assertTrue(cell.getNumberOfFilledBorders() == 3);
	}


	@Test
	public void testGetController() {
		controller = new PerangKolomController();
		assertNotNull(controller);
	}


	@Test
	public void testSetCellValue() {
		controller.setCellValue(1, 1, 50);
		assertTrue(cellArray[1][1].getCellValue() == 50 && cellArray[1][1].getPositionX() == 1 && cellArray[1][1].getPositionY() == 1);


	}
	
}
