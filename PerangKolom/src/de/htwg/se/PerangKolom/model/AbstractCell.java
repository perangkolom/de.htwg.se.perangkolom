package de.htwg.se.PerangKolom.model;

import de.htwg.se.PerangKolom.model.impl.Border;
import de.htwg.se.PerangKolom.model.impl.CellArray;

public class AbstractCell implements ICell{

	protected int liesInRow; 
	protected int liesInCol;
	protected int cellValue;
	protected boolean cellFilled;
	protected String cellOwner; //CellColor
	protected Border cellBorder_top = new Border(false, false);
	protected Border cellBorder_bottom = new Border(false, false);
	protected Border cellBorder_left = new Border(false, false);
	protected Border cellBorder_right = new Border(false, false);
	protected CellArray cellArray = new CellArray(0, 0);
	//char-Matrix with the "graphical information" for one cell for the TUI
	public char[][] cellOutputStringArray;
	//size (=width =height) of one cell
	public static int CELL_SIZE = 10;
	
	protected void makeBordersForCell() {
		
		//check if Borders (left and right) are outer Borders (-> Column-Position gets checked)
		if (liesInCol == 0) {
			cellBorder_left.setOuterBorder(true);
		}
		
		if (liesInCol == (cellArray.getNumberOfColums() - 1) ) {
			cellBorder_right.setOuterBorder(true);
		}
		
		//check if Borders (top and bottom) are outer borders (-> Row-Position gets checked)
		if (liesInRow == 0) {
			cellBorder_top.setOuterBorder(true);
		}
		
		if (liesInRow == cellArray.getNumberOfRows() - 1) {
			cellBorder_bottom.setOuterBorder(true);
		}
	}
	
	public int getPositionX() {
		return liesInCol;
	}

	public int getPositionY() {
		return liesInRow;
	}

	public boolean isCellFilled() {
		return cellFilled;
	}

	public void setCellFilled(boolean cellFilled) {
		this.cellFilled = cellFilled;
	}

	public int getCellValue() {
		return cellValue;
	}

	public String getCellOwner() {
		return cellOwner;
	}

	public void setCellOwner(String cellOwner) {
		this.cellOwner = cellOwner;
	}

	public Border getCellBorder_top() {
		return cellBorder_top;
	}

	public void setCellBorder_top(Border cellBorder_top) {
		this.cellBorder_top = cellBorder_top;
	}

	public Border getCellBorder_bottom() {
		return cellBorder_bottom;
	}

	public void setCellBorder_bottom(Border cellBorder_bottom) {
		this.cellBorder_bottom = cellBorder_bottom;
	}

	public Border getCellBorder_left() {
		return cellBorder_left;
	}

	public void setCellBorder_left(Border cellBorder_left) {
		this.cellBorder_left = cellBorder_left;
	}

	public Border getCellBorder_right() {
		return cellBorder_right;
	}

	public void setCellBorder_right(Border cellBorder_right) {
		this.cellBorder_right = cellBorder_right;
	}

}
