package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="registerUsers")
@XmlRootElement(name="users")
public class Register {

	@Id
	@GeneratedValue
	private int id;
	String username;
	String password;
	String reenterpassword;
	long phone;
	String email;
	String confirmemail;
	public Register()
	{
		
	}
	public Register(int id, String username, String password, String reenterpassword, long phone, String email,
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
