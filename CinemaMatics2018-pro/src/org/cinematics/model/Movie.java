package org.cinematics.model;

public class Movie {

	private static int MOVIE_ID = 0;
	private Integer id;
	private String name;
	private String description;
	
	public Movie() {
		id = MOVIE_ID;
		MOVIE_ID++;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Id: "+ id + " Name: " + name + " Description: " + description;
	}
	
}
