package game_StructureElements;

public class GameField {

	private static int numberOfRows;
	private static int numberOfColums;
	private static int[][] fieldMatrix;
	private static boolean gameFieldAlreadyCreated = false;
	
	public static boolean testVariabletoBeDeleted = true;
	public static boolean testVariabletoBeDeleted2 = true;
	
	/**
	 * This constructor sets
	 * 
	 * @param x sets the value for numberOfRows
	 * @param y sets the value for numberOfRows
	 */
	public GameField(int x, int y) {
		if (gameFieldAlreadyCreated == true) { 
			throw new IllegalAccessError();
		} else {
		numberOfRows = x;
		numberOfColums = y;
		fieldMatrix = new int[numberOfRows][numberOfColums];
		}
	}
	

	public static int getNumberOfRows() {
		return numberOfRows;
	}

	private static void setNumberOfRows(int numberOfRows) {
		GameField.numberOfRows = numberOfRows;
	}

	public static int getNumberOfColums() {
		return numberOfColums;
	}

	public static void setNumberOfColums(int numberOfColums) {
		GameField.numberOfColums = numberOfColums;
	}

	public static int[][] getFieldMatrix() {
		return fieldMatrix;
	}

	public static void setFieldMatrix(int[][] fieldMatrix) {
		GameField.fieldMatrix = fieldMatrix;
	}
	
	
}
