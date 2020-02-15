package com.cts.training.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="ecommerceusers")
public class User implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String password;
	private String email;
	private boolean enabled;
	
	public User() {
		
	}

	public User(int id, String name, String password, String email,boolean enabled) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.enabled=enabled;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
