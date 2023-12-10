package com.hexaware.coding.dto;



public class PlayerDTO {
	private int playerId;
	private String playerName;
	private int jerserNumber;
	private String role;
	private int totalMatches;
	private String teamName;
	private String countryName;
	private String description;
	
	public PlayerDTO() {
		super();
	}
	public PlayerDTO(int playerId, String playerName, int jerserNumber, String role, int totalMatches, String teamName,
			String countryName, String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerserNumber = jerserNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.countryName = countryName;
		this.description = description;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getJerserNumber() {
		return jerserNumber;
	}
	public void setJerserNumber(int jerserNumber) {
		this.jerserNumber = jerserNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
