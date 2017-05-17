package com.lxisoft.CandidateDetails.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Candidate {

		@Id
		@GeneratedValue
		private int id;
		
		private String firstName;

		private String address;
		
		private String email;

		private int phonenumber;

		@Lob
		private byte[] image;
		
		public byte[] getImage() {
			return image;
		}

		public void setImage(byte[] image) {
			this.image = image;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public int getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(int phonenumber) {
			this.phonenumber = phonenumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		
	}
