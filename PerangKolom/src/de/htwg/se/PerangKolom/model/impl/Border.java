package de.htwg.se.PerangKolom.model.impl;

public class Border {

	private boolean isBorderFilled;
	private boolean isOuterBorder;
	
	public Border(boolean isBorderFilled, boolean isOuterBorder) {
		this.isBorderFilled = isBorderFilled;
		this.isOuterBorder = isOuterBorder;
	}
	
	public boolean isBorderFilled() {
		return isBorderFilled;
	}
	
	public void setBorderFilled(boolean isBorderFilled) {
		this.isBorderFilled = isBorderFilled;
	}
	
	public boolean isOuterBorder() {
		return isOuterBorder;
	}
	public void setOuterBorder(boolean isOuterBorder) {
		this.isOuterBorder = isOuterBorder;
	}

}
