package de.htwg.se.PerangKolom.model;

public class AbstractBorder implements IBorder{
	
	protected boolean isBorderFilled = false;
	protected boolean isOuterBorder = false;
	
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

