package game_StructureElements;

public class Border {

	
	private boolean borderFilled;
	private boolean outerBorder;
	
	
	public Border(boolean borderFilled, boolean outerBorder) {
		this.borderFilled = borderFilled;
		this.outerBorder = outerBorder;
	}
	
	public boolean isBorderFilled() {
		return borderFilled; 
	}
	public void setBorderFilled(boolean borderFilled) {
		this.borderFilled = borderFilled;
	}
	public boolean isOuterBorder() {
		return outerBorder;
	}
	public void setOuterBorder(boolean outerBorder) {
		this.outerBorder = outerBorder;
	}
 
	
}
