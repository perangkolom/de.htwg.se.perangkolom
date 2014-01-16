package de.htwg.se.PerangKolom.model.impl;

import de.htwg.se.PerangKolom.model.AbstractCell;
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
	/**
	 * this is the final output-char-array for the TUI
	 */
	private static char[][] gameFieldString;
	
	private CellArray() {
		
		cellArrayInstance= new Cell[numberOfRows][numberOfColums];
		
		for (int i = 0; i < numberOfRows; i++) {
		
			for (int j = 0; j < numberOfColums; j++) {
				cellArrayInstance[i][j] = new Cell(i,j, 0);		
			}
		}
		gameFieldAlreadyCreated = true;
	}

	public static boolean isGameFieldAlreadyCreated() {
		return gameFieldAlreadyCreated;
	}
	
	public static Cell[][] getInstance() {
		if (gameFieldAlreadyCreated == true) { 
			return cellArrayInstance;
		} else {
			new CellArray();
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
	
	public static Cell getSpecificCell(int row, int col) {
		return getInstance()[row][col];
	}

	
	/**
	 * fills the char-matrix gameFieldString cell by cell
	 */
	public static void fillGameMatrix() {
		
		if (gameFieldString == null) {
			gameFieldString = new char[CellArray.getNumberOfColums() * Cell.CELL_SIZE][CellArray.getNumberOfColums()  * Cell.CELL_SIZE];
		}
	
		//loop to fill up the game-field with 
		for (int i = 0; i < CellArray.getNumberOfRows(); i++) {
			
			for (int j = 0; j < CellArray.getNumberOfColums(); j++) {
				Cell tmpCell = CellArray.cellArrayInstance[i][j]; 
				tmpCell.fillCharArray();
					
				//copy the chars of one single Cell into the char-matrix that shall finally be printed
				copyCelltoGameFieldMatrix(i,j, tmpCell);
			}
		}
	}
	
	/**
	 * copies the chars of one single cell into matrix gameFieldString
	 * @param gameFieldRow is the row that the selected cell to be filled in lies in
	 * @param gameFieldColumn is the column that the selected cell to be filled in lies in
	 */
	private static void copyCelltoGameFieldMatrix(int gameFieldRow, int gameFieldColumn, Cell cell) {
		int indX = (gameFieldRow * Cell.CELL_SIZE);
		int indY = (gameFieldColumn * Cell.CELL_SIZE);
		
		for (int i = 0; i < Cell.CELL_SIZE; i++) {
			
			for (int j = 0; j < Cell.CELL_SIZE; j++) {
				gameFieldString[indX + i][indY + j] = cell.cellOutputStringArray[i][j];
			}
		}
	}
	
	
	/**
	 * this method prints the matrix for the whole game-field char by char. (it is the TUIs final output method for the game-field)
	 */
	public static void printGameFieldString() {
		int stepsForRows = CellArray.getNumberOfRows() * Cell.CELL_SIZE;
		int stepsForCols = CellArray.getNumberOfColums() * Cell.CELL_SIZE;
		System.out.println("stepsForRows: " + stepsForRows + "\n");
		System.out.println("stepsForCols: " + stepsForCols + "\n");
		
		for (int i = 0; i < stepsForRows; i++ ) {		
		
			for (int j = 0; j < stepsForCols; j++ ) {
				System.out.print(gameFieldString[i][j]);		
			}
			System.out.print("\n");
		}
	}




}