package de.htwg.se.PerangKolom.aview.tui;

import de.htwg.se.PerangKolom.model.impl.Cell;
import de.htwg.se.PerangKolom.model.impl.GameField;

/**
 * Class the collect the different methods responsible for the text-output of the game-field
 * @author Christian
 */
public class PrintGameField {
	
	private static char[][] gameField;
		
	/**
	 * fills the char-matrix gameField with the single Cell.cellOutputStringArray
	 */
	public static void fillGameMatrix() {
		
		if (gameField == null) {
			gameField = new char[GameField.getNumberOfColums()][GameField.getNumberOfColums()];
		}
	
		//loop to fill up the game-field
		for (int i = 0; i < GameField.getNumberOfRows(); i++) {
			
			for (int j = 0; j < GameField.getNumberOfColums(); j++) {
				
			}
		}
		
	}
		
	public static void printGameMatrix() {
		
		int widthInChars = GameField.getNumberOfRows() * Cell.CELL_SIZE;
		int heightInChars = GameField.getNumberOfColums() * Cell.CELL_SIZE; 
		
				
		//loop to fill up the game-field
		for (int i = 0; i < heightInChars; i++) {
			
			//build the 
			for (int j = 0; j < GameField.getNumberOfColums(); j++) {
				System.out.println("");
			}
		}
	}
	
}