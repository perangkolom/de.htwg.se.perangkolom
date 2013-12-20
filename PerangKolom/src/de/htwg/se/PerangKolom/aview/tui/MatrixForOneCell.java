package de.htwg.se.PerangKolom.aview.tui;

import de.htwg.se.PerangKolom.model.impl.*;

/**
 * this class provides the functionality to write the TUI-string (aka char-matrix) for one single cell
 */

public class MatrixForOneCell {

	
	/**
	 * @param cell: tells the cell for which the graphical information shall be computed and wrote into cell.cellOutputStringArray) 
	 */
	private MatrixForOneCell(Cell cell) {}
		
	public static void writeOneCellToArray(Cell cell) {
		printBorders (cell, cell.getCellBorder_top(), true, true);
		printBorders (cell, cell.getCellBorder_bottom(), true, false);
		printBorders (cell, cell.getCellBorder_left(), false, true);
		printBorders (cell, cell.getCellBorder_right(), false, true);
	}
	
	/** this method writes the characters for the given border of the given cell (inner and if it is set also the outter border)
	 * 
	 * @param cell
	 * @param border
	 * @param isVertical: true if it's either border_left or border_right
	 * @param isFirst: true if it's the border with the low index (top or left)
	 */
	private static void printBorders(Cell cell, Border border, boolean isVertical, boolean isFirst) {
		
		//print inner standard border
		printBorderString(cell, isVertical, 1, isFirst);
		
		//if border is conquered also print the outer border
		if (border.isBorderFilled()) {
			printBorderString(cell, isVertical, 0 , isFirst);
		}		
	}	
	
	/**
	 * this method finally writes the characters for the specific border into
	 * the correct matrix-fields. 
	 * 
	 * @param isVertical: true if it's either border_left or border_right
	 * @param lineIndexOfArray: row-index of line that shall be printed
	 * @param isFirst: true if it's the border with the low index (top or left)
	 */
	private static void printBorderString (Cell cell, boolean isVertical, int lineIndexOfArray, boolean isFirst) {

		int index = 0;			//index of line or column 
		int steps = 0;			//number of loop-repetitions
		
		
		//set steps for loop
		if (lineIndexOfArray == 0 || lineIndexOfArray == cell.CELL_SIZE) {
			steps = cell.CELL_SIZE;
		} else {
			steps = cell.CELL_SIZE -2;
		}
		
		//set index for loop
		if (isFirst) {
			index = lineIndexOfArray;
		} else {
			index = cell.CELL_SIZE - lineIndexOfArray;
		}
		
		
		//if border is horizontal:
		if ( !isVertical ) {
		
			for ( int i = 0; i < steps; i++) {
				cell.cellOutputStringArray[index] [i] = '*';
			}

			//if border is vertical	
		} else 
		{
			for (int i = 0; i < steps; i++) {
				cell.cellOutputStringArray[i] [index] = '*';
			}
		}
	}
}