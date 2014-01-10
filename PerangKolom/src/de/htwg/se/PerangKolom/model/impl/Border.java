package de.htwg.se.PerangKolom.model.impl;

import de.htwg.se.PerangKolom.model.IBorder;

public class Border implements IBorder{

	private boolean isBorderFilled = false;
	private boolean isOuterBorder = false;
	
	
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
