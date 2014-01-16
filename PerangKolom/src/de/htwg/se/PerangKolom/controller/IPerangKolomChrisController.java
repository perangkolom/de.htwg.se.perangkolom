package de.htwg.se.PerangKolom.controller;

import de.htwg.se.PerangKolom.model.impl.Border;
import de.htwg.se.PerangKolom.model.impl.Cell;
import de.htwg.se.PerangKolom.util.observer.Event;
import de.htwg.se.PerangKolom.util.observer.IObservable;
import de.htwg.se.PerangKolom.util.observer.IObserver;

public interface IPerangKolomChrisController extends IObservable {
	
	
//general
	
	void startNewGame();
	
	void createNewGrid();
	
	void exit();
	
	void endThisPlayersTurn();
	
//TUI/GUI-specific
	
	String getGridString();
	
	void fillBorder(int x, int y, int z);
	
	void fillCell(Cell cell);
	
	int getCellValue(Cell cell);
	
	int getNumberOfFilledBorderOfCell(Cell cell);

	String getStartGameString();

	String showHelp();
	
	String getShortInstructions();
	
	
	
}
