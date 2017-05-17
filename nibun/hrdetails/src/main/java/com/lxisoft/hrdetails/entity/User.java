package com.lxisoft.hrdetails.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	private String name;
	private String address;
	@Id
	private String emilId;
	private String password;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmilId() {
		return emilId;
	}
	public void setEmilId(String emilId) {
		this.emilId = emilId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
