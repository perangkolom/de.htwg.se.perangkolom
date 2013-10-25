package game_StructureElements;

public class Player {

	private final String name;
	private final int numberOfPlayers;
		
	public Player(String name, int numberOfPlayers) {
		this.name = name;
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	
	
}
