package de.htwg.se.PerangKolom.model;

import de.htwg.se.PerangKolom.model.impl.Cell;
import de.htwg.se.PerangKolom.model.impl.CellArray;

public class AbstractCellArray implements ICellArray{

	protected  int numberOfRows;
	protected int numberOfColums;
	
	/**
	 * this array is necessary to be able to save the cells in the correct ordering
	 * there's no graphical information directly in this class
	 */
	public static Cell[][] cellArray;
	protected static boolean gameFieldAlreadyCreated = false;
	
	
	public int getNumberOfRows() {
		return numberOfRows;
	}

	private void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}

	public int getNumberOfColums() {
		return numberOfColums;
	}

	private void setNumberOfColums(int numberOfColums) {
		this.numberOfColums = numberOfColums;
	}

	public Cell[][] getCellArray() {
		return cellArray;
	}

	private void setCellArray(Cell[][] array) {
		this.cellArray = array;
	}
}
