package com.ltts.demoweb2.model;

import java.sql.Date;

public class Player {
	
	private int playerId;
	private String name;
	private Date dateOfBirth;
	private int age;
	private String email;
	private String country;
	private String skills;
	private String batting;
	private String bowling;
	private int match;
	private int runs;
	private int wickets;
	
	
	public Player(int playerId, String name, Date dateOfBirth, int age, String email, String country, String skills,
			String batting, String bowling, int match, int runs, int wickets) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.email = email;
		this.country = country;
		this.skills = skills;
		this.batting = batting;
		this.bowling = bowling;
		this.match = match;
		this.runs = runs;
		this.wickets = wickets;
	}


	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getPlayerId() {
		return playerId;
	}


	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	public String getBatting() {
		return batting;
	}


	public void setBatting(String batting) {
		this.batting = batting;
	}


	public String getBowling() {
		return bowling;
	}


	public void setBowling(String bowling) {
		this.bowling = bowling;
	}


	public int getMatch() {
		return match;
	}


	public void setMatch(int match) {
		this.match = match;
	}


	public int getRuns() {
		return runs;
	}


	public void setRuns(int runs) {
		this.runs = runs;
	}


	public int getWickets() {
		return wickets;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	
	
	
	
}
