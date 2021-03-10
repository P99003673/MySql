package com.ltts.demoweb2.model;

public class Team {
  
	private int teamId;
	private String teamName;
	private String ownerName;
	private String coachName;
	
	public Team() {
		super();
	}
	
	
	public Team(int teamId, String teamName, String ownerName, String coachName) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.ownerName = ownerName;
		this.coachName = coachName;
	}
	

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", ownerName=" + ownerName + ", coachName="
				+ coachName + "]";
	}
	
}
