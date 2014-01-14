package de.htwg.se.PerangKolom.model.impl;

import de.htwg.se.PerangKolom.model.impl.Cell;

public class CellArray {

	/**
	 * this array is necessary to be able to save the cells in the correct ordering
	 * there's no graphical information directly in this class
	 */
	
	private static final int DEFAULT_NUMBEROFROWS = 3;
	private static final int DEFAULT_NUMBEROFCOLUMS = 3;
	private static Cell[][] cellArrayInstance;
	private static int numberOfRows = DEFAULT_NUMBEROFROWS;
	private static int numberOfColums = DEFAULT_NUMBEROFCOLUMS;
	private static boolean gameFieldAlreadyCreated = false;
	
	
	private CellArray() {
		
		cellArrayInstance= new Cell[numberOfRows][numberOfColums];
		
		for (int i = 0; i < numberOfRows; i++) {
		
			for (int j = 0; j < numberOfColums; j++) {
				cellArrayInstance[i][j] = new Cell(i,j, 0);		
			}
		}
	}

	public static Cell[][] getInstance() {
		if (gameFieldAlreadyCreated == true) { 
			return cellArrayInstance;
		} else {
			new CellArray();
			gameFieldAlreadyCreated = true;
			return cellArrayInstance;
		}	
	}

	public static void createCellArray(int x, int y) {
		setNumberOfRows(x);
		setNumberOfColums(y);
		getInstance();
	}

	private static void setNumberOfRows(int x) {
		if (cellArrayInstance == null) 
			numberOfRows = x;
	}

	private static void setNumberOfColums(int x) {
		if (cellArrayInstance == null) 
			numberOfColums = x;
	}

	public static int getNumberOfRows() {
		return numberOfRows;
	}

	public static int getNumberOfColums() {
		return numberOfColums;
	}



}