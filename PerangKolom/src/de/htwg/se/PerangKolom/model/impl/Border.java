package de.htwg.se.PerangKolom.model.impl;

import de.htwg.se.PerangKolom.model.AbstractBorder;


public class Border extends AbstractBorder{

	public Border(boolean isBorderFilled, boolean isOuterBorder) {
		this.isBorderFilled = isBorderFilled;
		this.isOuterBorder = isOuterBorder;
	}
	@Override
	public String toString() {
		return "" + this.isBorderFilled;
	}

	

}
