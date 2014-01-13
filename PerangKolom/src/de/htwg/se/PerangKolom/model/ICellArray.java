package de.htwg.se.PerangKolom.model;

import de.htwg.se.PerangKolom.model.impl.Cell;

public interface ICellArray {
	
	public int getNumberOfRows();

	public int getNumberOfColums();

	public Cell[][] getCellArray();

}
