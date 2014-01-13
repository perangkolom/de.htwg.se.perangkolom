package de.htwg.se.PerangKolom.model.impl;

import de.htwg.se.PerangKolom.model.ICellArray;
import de.htwg.se.PerangKolom.model.impl.Cell;

public class CellArray implements ICellArray{

	private static int numberOfRows;
	private static int numberOfColums;
	
	/**
	 * this array is necessary to be able to save the cells in the correct ordering
	 * there's no graphical information directly in this class
	 */
	public static Cell[][] cellArray;
	private static boolean gameFieldAlreadyCreated = false;
	
	/**
	 * This constructor sets
	 * 
	 * @param x sets the value for numberOfRows
	 * @param y sets the value for numberOfRows
	 */
	public CellArray(int x, int y) {
		if (gameFieldAlreadyCreated == true) { 
			throw new IllegalAccessError();   	//is this necessary?
		} else {
			numberOfRows = x;
			numberOfColums = y;
			cellArray= new Cell[numberOfRows][numberOfColums];
			
			for (int i = 0; i < numberOfRows; i++) {
			
				for (int j = 0; j < numberOfColums; j++) {
					cellArray[i][j] = new Cell(i,j, 0);					
				}
			}
		gameFieldAlreadyCreated = true;	
		}
	}
	

	public int getNumberOfRows() {
		return numberOfRows;
	}

	private void setNumberOfRows(int numberOfRows) {
		CellArray.numberOfRows = numberOfRows;
	}

	public int getNumberOfColums() {
		return numberOfColums;
	}

	private void setNumberOfColums(int numberOfColums) {
		CellArray.numberOfColums = numberOfColums;
	}

	public Cell[][] getCellArray() {
		return cellArray;
	}

	private void setCellArray(Cell[][] array) {
		CellArray.cellArray = array;
	}
	
	
}
