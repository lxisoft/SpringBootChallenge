package com.lxisoft.jobportal.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int profileID;
	
	@Lob
	private byte[] profilePicture;
	
	@Lob
	private byte[] biodata;

	public int getProfileID() {
		return profileID;
	}

	public void setProfileID(int profileID) {
		this.profileID = profileID;
	}

	public byte[] getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(byte[] profilePicture) {
		this.profilePicture = profilePicture;
	}

	public byte[] getBiodata() {
		return biodata;
	}

	public void setBiodata(byte[] biodata) {
		this.biodata = biodata;
	}

}
