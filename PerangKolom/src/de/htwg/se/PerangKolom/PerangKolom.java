package de.htwg.se.PerangKolom;

import java.util.Scanner;

import de.htwg.se.PerangKolom.aview.tui.TextUI;

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
		TextUI.printTUI();
		// continue to read user input on the tui until the user decides to quit
		boolean continu = true;
		scanner = new Scanner(System.in);
		while (continu) {
			continu = tui.processInputLine(scanner.next());
		}
		
		
	}
}
