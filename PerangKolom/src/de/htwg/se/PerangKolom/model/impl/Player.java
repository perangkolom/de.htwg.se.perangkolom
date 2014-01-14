package de.htwg.se.PerangKolom.model.impl;

import de.htwg.se.PerangKolom.model.AbstractPlayer;

public class Player extends AbstractPlayer{

	private final String PlayerName;
	private final int numberOfPlayers;
	private final int numberOfPoints;

	public Player(String playerName, int numberOfPlayers, int numberOfPoints) {

		this.PlayerName = playerName;
		this.numberOfPlayers = numberOfPlayers;
		this.numberOfPoints = numberOfPoints;
	}



}
