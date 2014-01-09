package de.htwg.se.PerangKolom;

import java.util.Scanner;

import de.htwg.se.PerangKolom.aview.tui.FillCharMatrixOfASingleCell;
import de.htwg.se.PerangKolom.aview.tui.PrintGameField;
import de.htwg.se.PerangKolom.aview.tui.TextUI;
import de.htwg.se.PerangKolom.model.impl.CellArray;

public final class PerangKolom {

	private static Scanner scanner;
	private static PerangKolom instance = null;
	private static TextUI tui;
	
	
	public static PerangKolom getInstance() {
		if (instance == null) instance = new PerangKolom();
		return instance;
	}
	
	public static void main(String[] args) {
		
		PerangKolom.getInstance();
		
		//create CellArray to have a Container for the Cell thats keeps them in order
		//this is so to say the Gamefield
		new CellArray(3,3);
		
		//PrintGameField.makeAllBordersFilled();


		//fill textual data into the single cells and print out the whole array 
		TextUI.printTUI();
		
		// continue to read user input on the TUI until the user decides to quit
		boolean continu = true;
		scanner = new Scanner(System.in);
		while (continu) {
			continu = tui.processInputLine(scanner.next());
		}
		
		
	}
}
