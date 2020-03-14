package com.cts.training.userservice;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="registerUsers")
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
	private String usertype="ROLE_USER";
	private boolean active=false;
	private boolean admin=false;

	public UserEntity()
	{
		
	}
	
	public UserEntity(int id, String username, String password, String reenterpassword, long phone, String email,
			String confirmemail,String usertype,boolean active,boolean admin) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.reenterpassword = reenterpassword;
		this.phone = phone;
		this.email = email;
		this.confirmemail = confirmemail;
		this.usertype=usertype;
		this.active=active;
		this.admin=admin;
	}
	
	

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}


	
	public int getId() {
		return id;
	}


	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", username=" + username + ", password=" + password + ", reenterpassword="
				+ reenterpassword + ", phone=" + phone + ", email=" + email + ", confirmemail=" + confirmemail
				+ ", usertype=" + usertype + ", active=" + active + ", admin=" + admin + "]";
	}


	

	



	



	
}
