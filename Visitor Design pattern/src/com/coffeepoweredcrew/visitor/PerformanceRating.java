package com.coffeepoweredcrew.visitor;

import java.util.Objects;

public class PerformanceRating {

	private int id;
	
	private int personalRating;
	
	private int teamAverageRating;
	
	private int finalRating;

	public PerformanceRating(int id, int personalRating) {
		this.id = id;
		this.personalRating = personalRating;
	}
	
	public int getId() {
		return id;
	}

	public int getPersonalRating() {
		return personalRating;
	}

	public int getTeamAverageRating() {
		return teamAverageRating;
	}

	public int getFinalRating() {
		return finalRating;
	}

	public void setTeamAverageRating(int teamAverageRating) {
		this.teamAverageRating = teamAverageRating;
	}

	public void setFinalRating(int finalRating) {
		this.finalRating = finalRating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(finalRating, id, personalRating, teamAverageRating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PerformanceRating other = (PerformanceRating) obj;
		return finalRating == other.finalRating && id == other.id && personalRating == other.personalRating
				&& teamAverageRating == other.teamAverageRating;
	}

	@Override
	public String toString() {
		return "PerformanceRating [id=" + id + ", personalRating=" + personalRating + ", teamAverageRating="
				+ teamAverageRating + ", finalRating=" + finalRating + "]";
	}
	
	
}
