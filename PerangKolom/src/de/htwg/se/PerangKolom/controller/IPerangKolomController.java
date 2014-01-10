package de.htwg.se.PerangKolom.controller;

import de.htwg.se.PerangKolom.model.impl.Border;
import de.htwg.se.PerangKolom.model.impl.Cell;
import de.htwg.se.PerangKolom.model.impl.CellArray;
import de.htwg.se.PerangKolom.model.impl.Player;
import de.htwg.se.PerangKolom.util.observer.IObservable;
import de.htwg.se.PerangKolom.util.observer.Observable;

public interface IPerangKolomController extends IObservable{

	/*
	 * creates new gamefield as grid, starts the game
	 */
	public void createNewGrid();
	
	/*
	 * resets the game, starts the game again, with same parameters
	 */
	public void reset();
	
	/*
	 * exits the game
	 */
	public void exit();
	
	/*
	 * fills chosen Border and checks if cell has to be filled
	 */
	public void fillBorder(Border border);
	
	/*
	 * All Computer Logic:
	 * - chose one of the three strategies
	 * - calls function 'fillBorder()'
	 */
	public void ComputerLogic();
	
	/*
	 * 
	 */
	//public void ();
}
