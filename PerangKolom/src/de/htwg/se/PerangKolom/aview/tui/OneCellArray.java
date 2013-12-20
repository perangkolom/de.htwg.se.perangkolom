package de.htwg.se.PerangKolom.aview.tui;

import de.htwg.se.PerangKolom.model.impl.*;

public class OneCellArray {

	//size (=width =height) of one cell
	public static int CELL_SIZE = 10; 	
	char[][] cellOutputStringArray;
		
	
	public OneCellArray(Cell cell) {
		cellOutputStringArray = new char[CELL_SIZE][CELL_SIZE];
		printBorders (cell, cell.getCellBorder_top(), true, true);
		printBorders (cell, cell.getCellBorder_bottom(), true, false);
		printBorders (cell, cell.getCellBorder_left(), false, true);
		printBorders (cell, cell.getCellBorder_right(), false, true);
		
		//printValue();
	}
		
	//isFirst: if it's the border with the low index (top or left)
	private void printBorders(Cell cell, Border border, boolean isVertical, boolean isFirst) {
		
		
		
		//print inner standard border
		printBorderString(isVertical, 1, isFirst);
		
		//if border is conquered print the outer border, too
		if (border.isBorderFilled()) {
			
			printBorderString(isVertical, 0 , isFirst);
		}
		
	}
			



	private void printBorderString (boolean isVertical, int lineIndexOfArray, boolean isFirst) {

		int index = 0;			//index of line or column: 
		int steps = 0;			//number of loop-repetitions
		
		
		//set steps for loop
		if (lineIndexOfArray == 0 || lineIndexOfArray ==CELL_SIZE) {
			steps = CELL_SIZE;
		} else {
			steps = CELL_SIZE -2;
		}
		
		//set index for loop
		if (isFirst) {
			index = lineIndexOfArray;
		} else {
			index = CELL_SIZE - lineIndexOfArray;
		}
		
		
		//if border is horizontal:
		if ( !isVertical ) {
			
			
			for ( int i = 0; i < steps; i++) {
				cellOutputStringArray[index] [i] = '*';
			}

			//if border is vertical	
		} else 
		{
			for (int i = 0; i < steps; i++) {
				cellOutputStringArray[i] [index] = '*';
			}
		}
		

	}
}