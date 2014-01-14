package de.htwg.se.PerangKolom.model.impl;

import de.htwg.se.PerangKolom.model.AbstractCellArray;
import de.htwg.se.PerangKolom.model.impl.Cell;

public class CellArray extends AbstractCellArray{


	
	/**
	 * This constructor sets
	 * 
	 * @param x sets the value for numberOfRows
	 * @param y sets the value for numberOfRows
	 */
	public CellArray(int x, int y) {
		if (gameFieldAlreadyCreated == true) { 
			throw new IllegalAccessError();   	//is this necessary?
		} else {
			numberOfRows = x;
			numberOfColums = y;
			cellArray= new Cell[numberOfRows][numberOfColums];
			
			for (int i = 0; i < numberOfRows; i++) {
			
				for (int j = 0; j < numberOfColums; j++) {
					cellArray[i][j] = new Cell(i,j, 0);					
				}
			}
		gameFieldAlreadyCreated = true;	
		}
	}
	

	
	
}
