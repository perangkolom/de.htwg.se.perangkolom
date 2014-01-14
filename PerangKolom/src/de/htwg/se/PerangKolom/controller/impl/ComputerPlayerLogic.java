package de.htwg.se.PerangKolom.controller.impl;

import de.htwg.se.PerangKolom.controller.CurrentStrategy;
import de.htwg.se.PerangKolom.model.impl.Cell;

public class ComputerPlayerLogic {

	public CurrentStrategy strategy;
	public Cell cell;
	
	
	public void chooseStrategy(){
		strategy.StrategyAlgorithm(cell);
		return;
	}
	
	public void setStrategy(CurrentStrategy newStrategy){
		strategy = newStrategy;
	}
}
