package de.htwg.se.PerangKolom.model.impl;

import de.htwg.se.PerangKolom.model.impl.CellArray;
import de.htwg.se.PerangKolom.model.AbstractCell;

public class Cell extends AbstractCell{
	
	public Cell(final int indexX, final int indexY, final int cellValue) {
		this.liesInRow = indexX;
		this.liesInCol = indexY;
		this.cellValue = cellValue;
		cellOutputStringArray = new char[CELL_SIZE][CELL_SIZE];
		makeBordersForCell();
	}


}
