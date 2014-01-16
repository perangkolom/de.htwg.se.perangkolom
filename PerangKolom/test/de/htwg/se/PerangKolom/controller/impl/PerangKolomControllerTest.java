package de.htwg.se.PerangKolom.controller.impl;

import static org.junit.Assert.*;

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
	
	public void setUp() {
		controller = new PerangKolomController();
		cellArray = CellArray.getInstance();
	}
	
	
	public void testComputerLogic(){
		/* test first case --> 3 Border filled */
		Cell cell = cellArray[0][0];
		cell.getCellBorder_bottom().setBorderFilled(true);
		cell.getCellBorder_left().setBorderFilled(true);
		cell.getCellBorder_right().setBorderFilled(true);
		cell.getCellBorder_top().setBorderFilled(false);
		assertTrue(cell.getNumberOfFilledBorders() == 3);
	}


	/**
	 * @return the controller
	 */
	public void testGetController() {
		controller = new PerangKolomController();
		assertNotNull(controller);
	}


	/**
	 * @param controller the controller to set
	 */
	public void testSetValue() {
		controller.setValue(2, 2, 50);
		assertTrue(cellArray[2][2].getCellValue() == 50);
	}
	
}
