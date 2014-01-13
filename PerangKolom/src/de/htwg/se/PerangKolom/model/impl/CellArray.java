package de.htwg.se.PerangKolom.model.impl;

import de.htwg.se.PerangKolom.model.AbstractCellArray;
import de.htwg.se.PerangKolom.model.impl.Cell;

public class CellArray extends AbstractCellArray{
	
	public CellArray() {
		new CellArray(DEFAULT_NUMBEROFROWS, DEFAULT_NUMBEROFCOLS);
	}
	
	
	public CellArray(int rows, int cols) {
		if (gameFieldAlreadyCreated == true) { 
			throw new IllegalAccessError();   	//is this necessary?
		} else {
			this.setNumberOfRows(rows);
			this.setNumberOfColums(cols);
			this.cellArray= new Cell[rows][cols];
	
			//fill cellArray with cells
			for (int i = 0; i < rows; i++) {
			
				for (int j = 0; j < cols; j++) {
					cellArray[i][j] = new Cell(i,j, 0);					
				}
			}
		gameFieldAlreadyCreated = true;	
		}
	}
	
}