package com.lxisoft.applicants;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Applicants {
	@Id
	private String username;
	private	String password;
	private String ph;
	private String address;
	
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
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

	
}
