package de.htwg.se.PerangKolom.aview.tui;

import de.htwg.se.PerangKolom.util.observer.Event;
import de.htwg.se.PerangKolom.util.observer.IObservable;

public class TextUI  implements IObservable  {

	@Override
	public void update(Event e) {
		printTUI();
	}
	
	
	public boolean processInputLine(String line) {
		boolean continu = true;
		switch (line) { 
		case "q" : 
			continu = false;
			break;
		case "r" :
			//controller.reset();
			break;
		case "n" : 
			//controller.create();
			break;
		}
			return continu;
		}
		
	public static void printTUI() {
		System.out.println("TUI of PerangKolom:");
	}

}
