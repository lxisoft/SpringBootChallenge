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
		
		private String name;

		private String address;
		
		private String email;

		private int phonenumber;
		
		private String userName;
		
		private String password;
		
		@Lob
		private byte[] image;
		
		@Lob
		private byte[] resume;
		
		public byte[] getResume() {
			return resume;
		}

		public void setResume(byte[] resume) {
			this.resume = resume;
		}

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

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
	}
