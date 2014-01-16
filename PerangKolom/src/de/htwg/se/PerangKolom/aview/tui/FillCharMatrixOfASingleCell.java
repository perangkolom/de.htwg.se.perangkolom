package de.htwg.se.PerangKolom.aview.tui;

import de.htwg.se.PerangKolom.model.impl.Border;
import de.htwg.se.PerangKolom.model.impl.Cell;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class FillCharMatrixOfASingleCell {

	private FillCharMatrixOfASingleCell() {}
	
	private static char innerBorderChar = '+';
	private static char outerBorderChar = '#';
	
	/**
	 * 
	 * @param cell: the cell of which the charArray is to be filled
	 */
	public static void fillOneSingleCellWithChars(Cell cell) {
	//print chars for the...
		//...top-Border:
		printHorizontalBorders(cell, cell.getCellBorder_top(),  true);
		//...bottom-Border:
		printHorizontalBorders(cell, cell.getCellBorder_bottom(),  false);
		//...left-Border:
		printVerticalBorders(cell, cell.getCellBorder_left(), true);
		//...right-Border:
		printVerticalBorders(cell, cell.getCellBorder_right(), false);
	}
	

	private static void printHorizontalBorders (Cell cell, Border border, boolean isTop) {
	
		//define start and stop indexes for printSingleHorizontalBorder()
		int Col_Start_Inner = 1;
		int Col_Start_Outer = 0;
		int Col_End_Inner = Cell.CELL_SIZE - 2;
		int Col_End_Outer = Cell.CELL_SIZE - 1;
		int rowIndexOuter;
		int rowIndexInner;
		
		if (isTop) {
			rowIndexOuter = 0;
			rowIndexInner = 1;
		} else {
			rowIndexOuter = Cell.CELL_SIZE - 1;
			rowIndexInner = Cell.CELL_SIZE - 2;
		}
		
		//print the inner Border:
		printSingleHorizontalBorder(cell, rowIndexInner, Col_Start_Inner, Col_End_Inner, innerBorderChar);
		
		//if necessary print outer Border:
		if (border.isBorderFilled()) {
			printSingleHorizontalBorder(cell, rowIndexOuter, Col_Start_Outer, Col_End_Outer, outerBorderChar);
		}
	}
	
	
	private static void printSingleHorizontalBorder(Cell cell, int rowIndex, int startCol, int endCol, char borderChar) {
		
		for (int i = startCol; i<= endCol; i++) {
			cell.cellOutputStringArray[rowIndex][i] = borderChar;
		}
	}
	
	
	//======================================================================================
	

	
	private static void printVerticalBorders (Cell cell, Border border, boolean isLeft) {
		
		int row_Start_Inner = 1;
		int row_Start_Outer = 0;
		int row_End_Inner = Cell.CELL_SIZE - 2;
		int row_End_Outer = Cell.CELL_SIZE - 1;
		int colIndexOuter;
		int colIndexInner;
		
		if (isLeft) {
			colIndexOuter = 0;
			colIndexInner = 1;
		} else {
			colIndexOuter = Cell.CELL_SIZE - 1;
			colIndexInner = Cell.CELL_SIZE - 2;
		}
		
		//print the inner Border:
		printSingleVerticalBorder(cell, colIndexInner, row_Start_Inner, row_End_Inner, innerBorderChar);
		
		//if necessary print outer Border:
		if (border.isBorderFilled()) {
			printSingleVerticalBorder(cell, colIndexOuter, row_Start_Outer, row_End_Outer, outerBorderChar);
		}
	}
	
	private static void printSingleVerticalBorder(Cell cell, int colIndex, int startRow, int endRow, char borderChar) {
		
		for (int i = startRow; i<= endRow; i++) {
			cell.cellOutputStringArray[i][colIndex] = borderChar;
		}
	}
	
	
}
