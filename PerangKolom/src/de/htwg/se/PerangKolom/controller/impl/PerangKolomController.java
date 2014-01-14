package de.htwg.se.PerangKolom.controller.impl;

import java.util.Set;
import java.util.TreeSet;

import de.htwg.se.PerangKolom.controller.CurrentStrategy;
import de.htwg.se.PerangKolom.controller.IPerangKolomController;
import de.htwg.se.PerangKolom.model.ICell;
import de.htwg.se.PerangKolom.model.impl.Border;
import de.htwg.se.PerangKolom.model.impl.Cell;
import de.htwg.se.PerangKolom.model.impl.CellArray;
import de.htwg.se.PerangKolom.util.observer.Observable;

public class PerangKolomController extends Observable implements IPerangKolomController{

	public Cell cell;
	public TreeSet<Cell> set = new TreeSet<Cell>();

	
	public void setValue(int row, int column, int value){
		cell.setCellValue(value);
	}
	
	@Override
	public void createNewGrid(int x, int y) {
		CellArray.createCellArray(x, y);
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillBorder(Border border) {
		border.setBorderFilled(true);
	}

	@Override
	public void ComputerLogic() {
		
		for(int i = 0; i < CellArray.getNumberOfRows(); i++){
			for(int j = 0; j < CellArray.getNumberOfColums(); j++){
				Cell[][] tmp = CellArray.getInstance();
				set.add(tmp[i][j]);
			}
		
	
		
		/* new Objects */
		ComputerPlayerLogic algorithmOne = new ComputerPlayerLogic();
		ComputerPlayerLogic algorithmTwo = new ComputerPlayerLogic();
		ComputerPlayerLogic algorithmThree = new ComputerPlayerLogic();
		ComputerPlayerLogic algorithmFour = new ComputerPlayerLogic();
		
		CurrentStrategy strategyOne = new Algo_ClosePossibleBorder();
		CurrentStrategy strategyTwo = new Algo_NotPutForward();
		CurrentStrategy strategyThree = new Algo_RandomBorder();
		CurrentStrategy strategyFour = new Algo_SacrificeLowestValue();
		
		algorithmOne.setStrategy(strategyOne);
		algorithmTwo.setStrategy(strategyTwo);
		algorithmThree.setStrategy(strategyThree);
		algorithmFour.setStrategy(strategyFour);
		
		/****** IF-Clause for the first Algorithm ******/
		if(cell.getNumberOfFilledBorders() == 3){
			algorithmOne.chooseStrategy();
		}
		

		/****** IF-Clause for the second Algorithm ******/
		if(cell.getNumberOfFilledBorders() == 2)
			algorithmTwo.chooseStrategy();
		}
	}
}