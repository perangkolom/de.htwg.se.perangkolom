package de.htwg.se.PerangKolom.aview.tui;

import de.htwg.se.PerangKolom.model.impl.Border;
import de.htwg.se.PerangKolom.model.impl.Cell;

public class FillCharMatrixOfASingleCell {

	private FillCharMatrixOfASingleCell() {}
	
	/**
	 * 
	 * @param cell: the cell of which the charArray is to be filled
	 */
	public static void fillOneSingleCellWithChars(Cell cell) {
	//print chars for the...
		//...top-Border:
		printHorizontalBorders(cell, true);
		//...bottom-Border:
		
		//...left-Border:
		
		//...right-Border:
		
	}
	

	
	private static void printHorizontalBorders (Cell cell, boolean isTop) {
		
		int ColStart_Inner = 1;
		int ColStart_Outer = 0;
		int ColEnd_Inner = Cell.CELL_SIZE - 2;
		int ColEnd_Outer = 0
		int rowIndexInner = ;
		int rowIndexOuter = ;
		
		
		if (isTop) {
			printOneHorizontalBorder(cell, 1, 1, cell.CELL_SIZE - 2);
		} else {
			printOneHorizontalBorder(cell, Cell.CELL_SIZE - 2, 1, cell.CELL_SIZE - 2);
		}
		
	}
	
	private static void printHorBord(Cell cell, int rowIndex, int startCol, int endCol) {
		
		for (int i = startCol; i< endCol; i++) {
			cell.cellOutputStringArray[rowIndex][i] = '=';
		}
	}
	
	
}
