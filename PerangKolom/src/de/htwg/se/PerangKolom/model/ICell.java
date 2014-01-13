package de.htwg.se.PerangKolom.model;

public interface ICell {

	/**
	 * returns the value of the cell
	 */
	int getValue();
	
	/*
	 * sets the value for the cell
	 */
	void setValue(int value); 

	/*
	 * create the Borders for the cell
	 */
	void makeBordersForCell();
	
	
	
}

