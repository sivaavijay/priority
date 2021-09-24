package com.project.priority.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rating {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rating_id;
	
	
	//Column in table
	private String Connection;
	
	private String Relationships;
	
	private String Career;
	
	private String Wealth;
	
	private String name;

	public int getRating_id() {
		return rating_id;
	}

	public void setRating_id(int rating_id) {
		this.rating_id = rating_id;
	}

	public String getConnection() {
		return Connection;
	}

	public void setConnection(String connection) {
		Connection = connection;
	}

	public String getRelationships() {
		return Relationships;
	}

	public void setRelationships(String relationships) {
		Relationships = relationships;
	}

	public String getCareer() {
		return Career;
	}

	public void setCareer(String career) {
		Career = career;
	}

	public String getWealth() {
		return Wealth;
	}

	public void setWealth(String wealth) {
		Wealth = wealth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
