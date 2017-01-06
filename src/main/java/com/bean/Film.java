package com.bean;

public class Film {

	private long film_id;
	private String title;
	private String description;
	private String name;
	private int language_id;
	
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	public long getFilm_id() {
		return film_id;
	}
	public void setFilm_id(long film_id) {
		this.film_id = film_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Film(long film_id, String title, String description, String name,int language_id) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.name = name;
		this.language_id=language_id;
	}
	public Film() {
	}
	@Override
	public String toString() {
		return "Film [film_id=" + film_id + ", title=" + title + ", description=" + description + ", name=" + name
				+ ", language_id=" + language_id + "]";
	}
	
	
}
