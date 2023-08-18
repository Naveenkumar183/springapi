package com.springrest.springrest.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PlayerDefenseData {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	    
	    private String position;
	    private String team;
	    private Integer tackles;
	    private Integer tacklesWon;
	    
		public PlayerDefenseData(Long id, String position, String team, Integer tackles, Integer tacklesWon) {
			super();
			this.id = id;
			this.position = position;
			this.team = team;
			this.tackles = tackles;
			this.tacklesWon = tacklesWon;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}

		public Integer getTackles() {
			return tackles;
		}

		public void setTackles(Integer tackles) {
			this.tackles = tackles;
		}

		public Integer getTacklesWon() {
			return tacklesWon;
		}

		public void setTacklesWon(Integer tacklesWon) {
			this.tacklesWon = tacklesWon;
		}

		@Override
		public String toString() {
			return "PlayerDefenseData [id=" + id + ", position=" + position + ", team=" + team + ", tackles=" + tackles
					+ ", tacklesWon=" + tacklesWon + "]";
		}
		
}
