package de.htwg.se.PerangKolom.controller.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
	Cell[][] cellArray;
	Cell cell;
	Border b;
	Border r;
	Border t;
	Border l; 
	@Before
	public void setUp() {
		controller = new PerangKolomController();
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

		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(true);
		l.setBorderFilled(false);
		CellSetBufferWithThreeBorders.add(cell);
		controller.ClosePossibleBorderAlgo(CellSetBufferWithThreeBorders);
		assertTrue(l.isBorderFilled());
	}
	@Test
	public void testNotPutForwardAlgo(){
		List<Cell> CellSetBufferWithTwoBorder = new ArrayList<Cell>();
		
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(false);
		l.setBorderFilled(false);
		CellSetBufferWithTwoBorder.add(cell);
		controller.NotPutForwardAlgo(CellSetBufferWithTwoBorder);
		assertTrue(t.isBorderFilled() || l.isBorderFilled());
	}
	@Test
	public void testSacrificeLowestValueAlgo(){
		
	}
	@Test
	public void testComputerLogic(){
		/* test first case --> 3 Border filled */
		cell = cellArray[0][0];
		b.setBorderFilled(true);
		r.setBorderFilled(true);
		t.setBorderFilled(true);
		l.setBorderFilled(false);
		assertTrue(cell.getNumberOfFilledBorders() == 3);
	}


	@Test
	public void testGetController() {
		controller = new PerangKolomController();
		assertNotNull(controller);
	}


	@Test
	public void testSetValue() {
		controller.setCellValue(1, 1, 50);
		assertTrue(cellArray[1][1].getCellValue() == 50);
	}
	
}
