package de.htwg.se.PerangKolom.model;

public class AbstractPlayer implements IPlayer{

	private String PlayerName;
	private int numberOfPlayers;
	private int numberOfPoints;
	
	protected void setName(String PlayerName){
		this.PlayerName = PlayerName;
	}
	
	@Override
	public String getName() {
		return PlayerName;
	}
	
	@Override
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	
	public int getNumberOfPoints(){
		return numberOfPoints;
	}

}
