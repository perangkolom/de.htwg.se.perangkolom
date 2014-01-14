package de.htwg.se.PerangKolom.aview.tui;

import de.htwg.se.PerangKolom.model.impl.Cell;
import de.htwg.se.PerangKolom.model.impl.CellArray;

public class OutputTestWithOneCell {

	
	public static void main(String[] args) {
		/*
		//just a test for print():
		char[] testArray= new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		for (int tmp = 0; tmp < testArray.length; tmp++) {
			System.out.print(testArray[tmp]);
		}
		
		System.out.println("=================================================================");
		*/
		
		new CellArray();
		Cell theOnlyCell = new Cell(0, 0, 100);
		FillCharMatrixOfASingleCell.fillOneSingleCellWithChars(theOnlyCell);
		
		//print the chars of theOnlyCell to monitor if it is already filled
		for (int i= 0; i < Cell.CELL_SIZE; i++) {
			
			StringBuilder sb = new StringBuilder();
			
			for (int j= 0; j < Cell.CELL_SIZE; j++) {
				sb.append(theOnlyCell.cellOutputStringArray[i][j]);
			}
			System.out.println(sb.toString());
		}	
		
		
		PrintGameField.fillGameMatrix();
		//PrintGameField.printGameFieldString();
	}
}
