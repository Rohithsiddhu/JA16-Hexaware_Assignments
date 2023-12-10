package com.hexaware.coding.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

@Entity
public class Player {
		@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int playerId;
	@NotNull
	private String playerName;
	@NotNull
	@Positive
	private int jerserNumber;
	//@Pattern (regexp= "^(batsmen|bowler|allrounder)$")
	private String role;
	@NotNull
	private int totalMatches;
	@NotNull(message = "Teamname is Mandatory")
	private String teamName;
	@NotNull(message = "CountryName is Mandatory")
	private String countryName;
	@NotEmpty
	private String description;
	
	public Player() {
		super();
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
