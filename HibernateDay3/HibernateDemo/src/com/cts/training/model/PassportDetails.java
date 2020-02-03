package com.cts.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passport")
public class PassportDetails {
	@Id
	@GeneratedValue
	private int id;
	private String passno;
	
	@OneToOne
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassno() {
		return passno;
	}
	public void setPassno(String passno) {
		this.passno = passno;
	}
	
	
}
