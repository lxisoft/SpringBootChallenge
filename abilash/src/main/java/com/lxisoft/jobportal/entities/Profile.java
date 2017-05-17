package com.lxisoft.jobportal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int profileID;
	
	private int phn;
	
	@Lob
	private byte[] profilePicture;
	
	@Lob
	private byte[] biodata;
	
	@OneToOne
	private Candidate candidate;

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

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public int getPhn() {
		return phn;
	}

	public void setPhn(int phn) {
		this.phn = phn;
	}

}
