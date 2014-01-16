package de.htwg.se.PerangKolom.aview.tui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import de.htwg.se.PerangKolom.controller.IPerangKolomChrisController;
import de.htwg.se.PerangKolom.model.impl.MessagesForUser2;
import de.htwg.se.PerangKolom.util.observer.Event;
import de.htwg.se.PerangKolom.util.observer.IObserver;

public class TextUI implements IObserver  {

	private IPerangKolomChrisController controller;
	private Logger logger = Logger.getLogger("de.htwg.se.perangkolom.aview.tui.TextUI");
	private String newLine = System.getProperty("line.separator");
	
	public TextUI(IPerangKolomChrisController controller) {
		this.controller = controller;
		controller.addObserver(this);
	}
	
	@Override
	public void update(Event e) {
		printTUI();
	}

	
	public void printTUI() {
		logger.info(newLine + controller.getGridString());
		//logger.info(newLine + controller.getStatus());
		//logger.info(newLine + controller.getShortInstructions());
	}
	
	
	public boolean processInputLine(String line) {
		boolean continueGame = true;
		boolean finishedAfterSwitchCase = false;
		switch (line) {
	
		case "n":
//			askForGameFieldParameters();
			controller.createNewGrid(3,3);
			finishedAfterSwitchCase = true;
			break;
		case "b":
//			askForGameFieldParameters();
			controller.createNewGrid(7,7);
			finishedAfterSwitchCase = true;
			break;
		case "q":
			continueGame = false;
			finishedAfterSwitchCase = true;
			break;
		case "h":
			logger.info(controller.showHelp());
			finishedAfterSwitchCase = true;
			break;
		}
		
		if ( !finishedAfterSwitchCase) {

			//format to fill Border z of a given cell(x,y)
			if (line.matches("[0-9][0-9][0-9]")) {
				int[] arg = readToArray(line);
				controller.fillBorder(arg[0], arg[1], arg[2]);
				logger.info(MessagesForUser2.shortInstruction);

			//if the input was not of the correct format
			} else {
				logger.info("Your input was not in the desired format. Please try your input again. (to show help press \'h\')");
			}
				
		}
		if (finishedAfterSwitchCase)
			logger.info(MessagesForUser2.shortInstruction);
		return continueGame;
	}
	
	
	private int[] readToArray(String line) {
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(line);
		int[] arg = new int[line.length()];
		for (int i = 0; i < arg.length; i++) {
			m.find();
			arg[i] = Integer.parseInt(m.group());
		}
		return arg;
	}

/*
	
	this method could be used to parse arguments for x parameters. but it is not finished yet. maybe useful later?
	
	private int[] askForGameFieldParameters(int x) {
		logger.info("Please type in "+ x +" numbers (between 0-9 and not seperated by a newline) to set the number of rows and colums for the game-field\n"
				+ "(e.g. an input of \'34\' means that the game-field will have 3 rows and 2 colums.\n");
		boolean running = true;
		while (running) {
		Scanner tmpScan = new Scanner(System.in);
		String tmpString = tmpScan.next();
		if (tmpString.length() != x) {
			logger.info("Your input was not correct. You have to type in " +x+ " numbers. Please try to type it in correctly now: \n");
			askForGameFieldParameters(x);
			return null;
		}
	}
*/
	
	
}


