package de.htwg.se.PerangKolom.controller;


import de.htwg.se.PerangKolom.model.impl.Cell;
import de.htwg.se.PerangKolom.util.observer.IObservable;


public interface IPerangKolomController extends IObservable{


	
	/*
	 * creates new gamefield as grid, starts the game
	 */
	public void createNewGrid(int x, int y);
	
	/*
	 * resets the game, starts the game again, with same parameters
	 */
	public void reset();
	
	/*
	 * exits the game
	 */
	public void exit();
	
	/*
	 * All Computer Logic:
	 * - chose one of the three strategies
	 * - calls function 'fillBorder()'
	 */
	public void ComputerLogic();

	String getShortInstructions();
	
	String showHelp();

	String getStartGameString();

	int getNumberOfFilledBorderOfCell(Cell cell);

	int getCellValue(Cell cell);

	void fillBorder(int x, int y, int z);

	void fillCell(Cell cell);

	String getGridString();

	void changePlayer();
	
	/*
	 * 
	 */
	//public void ();
}
