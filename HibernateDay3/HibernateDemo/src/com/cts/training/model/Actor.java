package com.cts.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "actor")
public class Actor {
	@Id
	@GeneratedValue
	private long id;
	
	private String actorname;
	
	@ManyToOne
	private Movie movie;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getActorname() {
		return actorname;
	}

	public void setActorname(String actorname) {
		this.actorname = actorname;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", actorname=" + actorname + "]";
	}
	
	
	

}
