package de.htwg.se.PerangKolom.aview.tui;

import de.htwg.se.PerangKolom.model.impl.*;

/**
 * this class provides the functionality to write a char-matrix for one single cell
 */

public class MatrixForOneCell {

	
	/**
	 * @param cell: tells the cell for which the graphical information shall be computed and wrote into cell.cellOutputStringArray) 
	 */
	private MatrixForOneCell(Cell cell) {}
		
	

	public static void fillOneSingleCellWithChars(Cell cell) {
		printBorders (cell, cell.getCellBorder_top(), false, true);
		printBorders (cell, cell.getCellBorder_bottom(), false, false);
		printBorders (cell, cell.getCellBorder_left(), true, true);
		printBorders (cell, cell.getCellBorder_right(), true, false);
	}
	
	/** this method writes the characters for the given border of the given cell (inner and if it is set also the outer border)
	 * 
	 * @param cell
	 * @param border
	 * @param isVertical: true if it's either border_left or border_right
	 * @param isFirst: true if it's the border with the low index (top or left)
	 */
	private static void printBorders(Cell cell, Border border, boolean isVertical, boolean isFirst) {
		
		//print inner standard border
		printBorderString(cell, isVertical, false, isFirst);
		
		//if border is conquered also print the outer border
		if (border.isBorderFilled()) {
			printBorderString(cell, isVertical, true, isFirst);
		}		
	}	
	
	/**
	 * this method finally writes the characters for the specific border into
	 * the correct matrix-fields. 
	 * 
	 * @param isVertical: true if it's either border_left or border_right
	 * @param isOuter: true for an outer border, false for an inner border
	 * @param isFirst: true if it's the border with the low index (top or left)
	 */
	private static void printBorderString (Cell cell, boolean isVertical, boolean isOuter, boolean isFirst) {

		int index = 0;			//index of line or column 
		int steps = 0;			//number of loop-repetitions
		
		
		//set steps
		
		//if it's the outer border
		if (isOuter) {
			steps = cell.CELL_SIZE;
			
		//if it's the inner border	
		} else {
			steps = cell.CELL_SIZE -2;
		}
		
		//set index
		
		//if it's the top or left border
		if (isFirst) {
			if (isOuter) {
				index = 0;
			} else {
				index = 1;
			}
		//if it's the bottom or right border
		} else {
			if (isOuter) {
				index = Cell.CELL_SIZE;
			} else {
				index = Cell.CELL_SIZE - 1;
			}
		}
		
		//now finally print the chars for the border into cell.cellOutputStringArray
		
		//if border is vertical:	(-> left or right)
		if ( isVertical ) {
			for ()
		//if border is horizontal: (-> top or bottom)
		} else {
			for ( int i = index; i <= steps; i++) {
				cell.cellOutputStringArray[index][i]
				
			}
		}
	}
}
