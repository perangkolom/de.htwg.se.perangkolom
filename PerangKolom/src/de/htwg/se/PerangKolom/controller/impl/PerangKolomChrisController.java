package de.htwg.se.PerangKolom.controller.impl;

import java.util.logging.Logger;

import de.htwg.se.PerangKolom.controller.IPerangKolomChrisController;
import de.htwg.se.PerangKolom.model.impl.Cell;
import de.htwg.se.PerangKolom.model.impl.MessagesForUser;
import de.htwg.se.PerangKolom.model.impl.MessagesForUser2;
import de.htwg.se.PerangKolom.util.observer.Observable;

public class PerangKolomChrisController extends Observable implements IPerangKolomChrisController {

	private String notYet = "(no code written until now. Don't forget to do so!)";
	private Logger logger = Logger.getLogger("de.htwg.se.PerangKolom.controller.impl.IPerangKolomController");	
	
	public PerangKolomChrisController() {
	
		
	}
	
	
	@Override
	public void startNewGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createNewGrid() {	
		System.out.println("Now the controller should create a new Grid!" + notYet);
		
		
		notifyObservers();
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void endThisPlayersTurn() {
		// TODO Auto-generated method stub
	}


	@Override
	public String getGridString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fillBorder(int x, int y, int z) {
		logger.info("Now the border " + z + " of  cell("+x+","+y+") shall be filled\n");
		
		
	}

	@Override
	public void fillCell(Cell cell) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCellValue(Cell cell) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfFilledBorderOfCell(Cell cell) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String getStartGameString() {
		return MessagesForUser2.startOfTheGame;
	}


	@Override
	public String showHelp() {
		return MessagesForUser2.help_inputInstructionForConsole;
	}


	@Override
	public String getShortInstructions() {
		return MessagesForUser2.shortInstruction;
	}

}
