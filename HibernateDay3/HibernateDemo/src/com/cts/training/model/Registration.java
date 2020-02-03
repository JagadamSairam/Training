package com.cts.training.model;

import java.io.Serializable;

public class Registration implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4458869146678891868L;
	private String username;
	private String password;
	private String reenterpass;
	private long contact;
	private int id;
	private String email;
	private String cemail;
	
	public Registration() {
		
	}

	public Registration(String username, String password, String reenterpass, long contact, int id, String email,
			String cemail) {
		super();
		this.username = username;
		this.password = password;
		this.reenterpass = reenterpass;
		this.contact = contact;
		this.id = id;
		this.email = email;
		this.cemail = cemail;
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

	public String getReenterpass() {
		return reenterpass;
	}

	public void setReenterpass(String reenterpass) {
		this.reenterpass = reenterpass;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Registration [username=" + username + ", password=" + password + ", reenterpass=" + reenterpass
				+ ", contact=" + contact + ", id=" + id + ", email=" + email + ", cemail=" + cemail + "]";
	}
	
	
	
}

