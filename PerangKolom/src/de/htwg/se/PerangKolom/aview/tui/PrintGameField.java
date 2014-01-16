package de.htwg.se.PerangKolom.aview.tui;

import de.htwg.se.PerangKolom.model.impl.Cell;
import de.htwg.se.PerangKolom.model.impl.CellArray;


/**
 * Class the collect the different methods responsible for the text-output of the game-field
 * @author Christian
 */
public class PrintGameField {
	
	/**
	 * this is the final output-char-array for the tui
	 */
	private static char[][] gameFieldString;
		
	/**
	 * fills the char-matrix gameFieldString cell by cell
	 */
	public static void fillGameMatrix() {
		
		if (gameFieldString == null) {
			gameFieldString = new char[CellArray.getNumberOfColums() * Cell.CELL_SIZE][CellArray.getNumberOfColums()  * Cell.CELL_SIZE];
		}
	
//		//loop to fill up the game-field with 
//		for (int i = 0; i < CellArray.getNumberOfRows(); i++) {
//			
//			for (int j = 0; j < CellArray.getNumberOfColums(); j++) {
//				
//				FillCharMatrixOfASingleCell.fillOneSingleCellWithChars(CellArray.cellArray[i][j]);
// 				
//				//copy the chars of one single Cell into the char-matrix that shall finally be printed
//				copyCelltoGameFieldMatrix(i,j, CellArray.cellArray[i][j]);
//			}
//		}
	}
	
	/**
	 * copies the chars of one single cell into matrix gameFieldString
	 * @param gameFieldRow is the row that the selected cell to be filled in lies in
	 * @param gameFieldColumn is the column that the selected cell to be filled in lies in
	 */
	public static void copyCelltoGameFieldMatrix(int gameFieldRow, int gameFieldColumn, Cell cell) {
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

//
//	public static void makeAllBordersFilled() {
//		
//		for (int i = 0; i < CellArray.getNumberOfRows(); i++) {
//			for (int j = 0; j < CellArray.getNumberOfColums(); j++) {
//				CellArray.cellArray[i][j].getCellBorder_top().setBorderFilled(true);
//				CellArray.cellArray[i][j].getCellBorder_bottom().setBorderFilled(true);
//				CellArray.cellArray[i][j].getCellBorder_left().setBorderFilled(true);
//				CellArray.cellArray[i][j].getCellBorder_right().setBorderFilled(true);
//			}
//		}
//	}

}