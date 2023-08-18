package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlayerStatistics {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    
    private Integer gamesPlayed;
    private Integer minutesPlayed;
	private Integer goalsScored;
    private Integer birthYear;
    
    public PlayerStatistics(Long id, Integer gamesPlayed, Integer minutesPlayed, Integer goalsScored,
			Integer birthYear) {
		super();
		this.id = id;
		this.gamesPlayed = gamesPlayed;
		this.minutesPlayed = minutesPlayed;
		this.goalsScored = goalsScored;
		this.birthYear = birthYear;
	}

	public PlayerStatistics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(Integer gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public Integer getMinutesPlayed() {
		return minutesPlayed;
	}

	public void setMinutesPlayed(Integer minutesPlayed) {
		this.minutesPlayed = minutesPlayed;
	}

	public Integer getGoalsScored() {
		return goalsScored;
	}

	public void setGoalsScored(Integer goalsScored) {
		this.goalsScored = goalsScored;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "PlayerStatistics [id=" + id + ", gamesPlayed=" + gamesPlayed + ", minutesPlayed=" + minutesPlayed
				+ ", goalsScored=" + goalsScored + ", birthYear=" + birthYear + "]";
	}
    
}
