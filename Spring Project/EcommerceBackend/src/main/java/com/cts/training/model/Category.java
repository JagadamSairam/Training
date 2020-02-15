package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="ecommercecategory")
public class Category implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	private String type;
	
	
	public Category() {
		
	}
	


	public Category(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
}
