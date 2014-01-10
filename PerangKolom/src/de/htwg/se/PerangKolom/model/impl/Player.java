package de.htwg.se.PerangKolom.model.impl;

public class Player {

	private final String PlayerName;
	private final int numberOfPlayers;
	private final int numberOfPoints;

	public Player(String playerName, int numberOfPlayers, int numberOfPoints) {
		this.PlayerName = playerName;
		this.numberOfPlayers = numberOfPlayers;
		this.numberOfPoints = numberOfPoints;
	}

	public String getName() {
		return PlayerName;
	}

	public int getNumberOfPlayers() {
			int i = 0;
		return numberOfPlayers;
	}

}
