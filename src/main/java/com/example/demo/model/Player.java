package com.example.demo.model;

public class Player {
	private String playerID;
    public String getPlayerID() {
		return playerID;
	}
	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	private String playerName;
    private Country country;
	@Override
	public String toString() {
		return "Player [playerID=" + playerID + ", playerName=" + playerName + ", country=" + country + "]";
	}
    
}
