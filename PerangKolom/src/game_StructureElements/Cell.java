package game_StructureElements;

public class Cell {
	private final int positionX;
	private final int positionY;
	private boolean cellFilled;
	private final int cellValue;
	private String cellOwner;
	private Border cellBorder_top;
	private Border cellBorder_bottom;
	private Border cellBorder_left;
	private Border cellBorder_right;
	
	
	public Cell(final int positionX, final int positionY, final int cellValue) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.cellValue = cellValue;
	}
	
	
	public int getPositionX() {
		return positionX;
	}

	public int getPositionY() {
		return positionY;
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