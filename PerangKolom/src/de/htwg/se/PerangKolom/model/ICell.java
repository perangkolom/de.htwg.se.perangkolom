package de.htwg.se.PerangKolom.model;

import de.htwg.se.PerangKolom.model.impl.Border;

public interface ICell {
	
	public int getPositionX();
	
	public int getPositionY();
	
	public boolean isCellFilled();
	
	public void setCellFilled(boolean cellFilled);
	
	public int getCellValue();
	
	public void setCellValue(int value);

	public String getCellOwner();

	public void setCellOwner(String cellOwner);

	public Border getCellBorder_top();

	public void setCellBorder_top(Border cellBorder_top);

	public Border getCellBorder_bottom();

	public void setCellBorder_bottom(Border cellBorder_bottom);

	public Border getCellBorder_left();

	public void setCellBorder_left(Border cellBorder_left);

	public Border getCellBorder_right();

	public void setCellBorder_right(Border cellBorder_right);

}
