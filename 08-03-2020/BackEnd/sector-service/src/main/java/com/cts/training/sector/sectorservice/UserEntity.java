package com.cts.training.sector.sectorservice;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;



public class UserEntity {
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String password;
	private String reenterpassword;
	private long phone;
	private String email;
	private String confirmemail;
	@Transient
	private String regStatus;
	private String active="no";

	public UserEntity()
	{
		
	}
	public UserEntity(int id, String username, String password, String reenterpassword, long phone, String email,
			String confirmemail) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.reenterpassword = reenterpassword;
		this.phone = phone;
		this.email = email;
		this.confirmemail = confirmemail;
	}
	
	

	public String getRegStatus() {
		return regStatus;
	}
	public void setRegStatus(String regStatus) {
		this.regStatus = regStatus;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
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


	public String getReenterpassword() {
		return reenterpassword;
	}


	public void setReenterpassword(String reenterpassword) {
		this.reenterpassword = reenterpassword;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getConfirmemail() {
		return confirmemail;
	}


	public void setConfirmemail(String confirmemail) {
		this.confirmemail = confirmemail;
	}



	


	@Override
	public String toString() {
		return "Register [id=" + id + ", username=" + username + ", password=" + password + ", reenterpassword="
				+ reenterpassword + ", phone=" + phone + ", email=" + email + ", confirmemail=" + confirmemail + "]";
	}

	
}
