package com.cts.training.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "technology")
public class Technology {
	
	@Id
	@GeneratedValue
	private int id;
	private String language;
	private String expertise;
	
	@ManyToMany(mappedBy = "technology")
	 private Set<Developer> developer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public Set<Developer> getDeveloper() {
		return developer;
	}

	public void setDeveloper(Set<Developer> developer) {
		this.developer = developer;
	}

	
}
