package de.htwg.se.PerangKolom.controller.impl;

import de.htwg.se.PerangKolom.controller.CurrentStrategy;
import de.htwg.se.PerangKolom.model.impl.Cell;




public class Algo_ClosePossibleBorder implements CurrentStrategy{
	
	/*
	 * Algorithm that closes the 4th Border, if 3 Borders of one cell are closed.
	 */
	public void StrategyAlgorithm(Cell cell) {
		if(cell.getCellBorder_bottom().isBorderFilled() == false){
			cell.getCellBorder_bottom().setBorderFilled(true);
		}
		if(cell.getCellBorder_left().isBorderFilled() == false){
			cell.getCellBorder_left().setBorderFilled(true);
		}
		if(cell.getCellBorder_right().isBorderFilled() == false){
			cell.getCellBorder_right().setBorderFilled(true);
		}
		if(cell.getCellBorder_top().isBorderFilled() == false){
			cell.getCellBorder_top().setBorderFilled(true);
		}
		//-->>>nochmals Algorithmenauswahl wiederholen
	}


}
