package de.htwg.se.PerangKolom.model;

public abstract class AbstractPlayer implements IPlayer{

	private static final int NUMBER_OF_PLAYERS = 2;
	private boolean isPlayerHuman;
	private int amountOfPoints = 0;
	private final static char CHAR_PLAYER_1 = '1';
	private final static char CHAR_PLAYER_2 = '2';
	
	
	@Override
	public int getNumberOfPlayers() {
		return NUMBER_OF_PLAYERS;
	}
	
	public int getNumberOfPoints(){{
		
	}
		return amountOfPoints;
	}

	public boolean isPlayerHuman() {
		return isPlayerHuman;
	}
	
	protected void setPlayerHuman(boolean isHuman) {
		isPlayerHuman = isHuman;
	}


}
