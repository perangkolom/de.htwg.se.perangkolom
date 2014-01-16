package de.htwg.se.PerangKolom.controller.impl;

import java.util.ArrayList;
import java.util.List;
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
	public TreeSet<Cell> CellArraySet = new TreeSet<Cell>();
	
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

	/* 'ClosePossibleBorder' Algorithm */
	public void firstAlgo(List<Cell> CellSetBufferWithThreeBorders){
		
		/* Objects */
		CurrentStrategy strategyOne = new Algo_ClosePossibleBorder();
		ComputerPlayerLogic algorithmOne = new ComputerPlayerLogic();
		algorithmOne.setStrategy(strategyOne);
		
		Cell cellBuf = CellSetBufferWithThreeBorders.get(0);
		for(Cell c : CellSetBufferWithThreeBorders){
			if(c.getCellValue() >= cellBuf.getCellValue()){
				cellBuf = c;
			}
		}
		algorithmOne.chooseStrategy(cellBuf);
		// if computer chooses this algorithm and closes the 4th border, 
		// it is still his turn
		ComputerLogic();
		
		algorithmOne.setStrategy(strategyOne);
	}
	
	/* 'NotPutForward' Algorithm */
	public void secondAlgo(List<Cell> CellSetBufferLessThanTwoBorders){
		
		CurrentStrategy strategyTwo = new Algo_NotPutForward();
		ComputerPlayerLogic algorithmTwo = new ComputerPlayerLogic();
		algorithmTwo.setStrategy(strategyTwo);
		
		for(Cell c : CellSetBufferLessThanTwoBorders){
			if(c.getNumberOfFilledBorders() == 1){
				algorithmTwo.chooseStrategy(c);
				return;
			}
			
			
			
		}
		algorithmTwo.chooseStrategy(CellSetBufferLessThanTwoBorders.get(0)); //pr�fen ob cell 1 border oder 0 borders gef�llt hat, cell mit 1 border eine weitere f�llen
		
	}
	
	/* 'SacrificeLowestValue' Algorithm */
	public void ThirdAlgo(List<Cell> CellSetBufferWithTwoBorder){
		
		ComputerPlayerLogic algorithmThree = new ComputerPlayerLogic();
		CurrentStrategy strategyThree = new Algo_SacrificeLowestValue();
		algorithmThree.setStrategy(strategyThree);
		
		Cell cellBuf = CellSetBufferWithTwoBorder.get(0);
		for(Cell c : CellSetBufferWithTwoBorder){
			if(c.getCellValue() <= cellBuf.getCellValue()){
				cellBuf = c;
			}
		}
		algorithmThree.chooseStrategy(cellBuf);
	}
	
	@Override
	public void ComputerLogic() {

		List<Cell> CellSetBufferWithThreeBorders = new ArrayList<Cell>();
		List<Cell> CellSetBufferLessThanTwoBorders = new ArrayList<Cell>();
		List<Cell> CellSetBufferWithTwoBorder = new ArrayList<Cell>();
		
		/* fills a Set with all cells */
		for(int i = 0; i < CellArray.getNumberOfRows(); i++){
			for(int j = 0; j < CellArray.getNumberOfColums(); j++){
				Cell[][] tmp = CellArray.getInstance();
				CellArraySet.add(tmp[i][j]);
			}
		}
		
		/**** rout all cells in different Lists ****/
		for(Cell c : CellArraySet){
				/*** 'NotPutForward' Algorithm ***/
			if(c.getNumberOfFilledBorders() < 2){
				CellSetBufferLessThanTwoBorders.add(c);
			/*** 'SacrificeLowestValue' Algorithm ***/
			}else if(c.getNumberOfFilledBorders() == 2){
				CellSetBufferWithTwoBorder.add(c);
			/*** 'ClosePossibleBorder' Algorithm ***/
			} else if(c.getNumberOfFilledBorders() == 3){
				CellSetBufferWithThreeBorders.add(c);
			} 
		}
		
		/****** IF-Clause for the 'ClosePossibleBorder' Algorithm ******/
		if(!CellSetBufferWithThreeBorders.isEmpty()){
			firstAlgo(CellSetBufferWithThreeBorders);
		/****** IF-Clause for the 'NotPutForward Algorithm ******/
		} else if(!CellSetBufferLessThanTwoBorders.isEmpty()){
			secondAlgo(CellSetBufferLessThanTwoBorders);
		/****** IF-Clause for the 'SacrificeLowestValue' Algorithm ******/
		} else if(!CellSetBufferWithTwoBorder.isEmpty()){
			ThirdAlgo(CellSetBufferWithTwoBorder);
		}
	}

	
}