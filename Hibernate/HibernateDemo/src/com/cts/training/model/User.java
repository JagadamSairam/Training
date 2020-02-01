package com.cts.training.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -5376520827710642568L;

	private int id;
	private String username;
	private String password;
	private String email;
	private long phone;
	private boolean enabled;

	public User() {

	}

	public User(int id, String username, String password, String email, long phone, boolean enabled) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {

		return id + " : " + username + " : " + password + " : " + email + " : " + phone + " : " + enabled;
	}

}
