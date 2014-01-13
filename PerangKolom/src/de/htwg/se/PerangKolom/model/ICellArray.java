package de.htwg.se.PerangKolom.model;

import de.htwg.se.PerangKolom.model.impl.Cell;

public interface ICellArray {

	public int getNumberOfRows();

	public void setNumberOfRows(int number);

	public int getNumberOfColums();

	public void setNumberOfColums(int number);

	public Cell[][] getCellArray();
	
	public void setCellArray(Cell[][] array);
	
}
