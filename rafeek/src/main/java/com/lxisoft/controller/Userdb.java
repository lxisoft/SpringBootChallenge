package com.lxisoft.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;


	@Entity
	public class Userdb {
		@Id
		@GeneratedValue(strategy = GenerationType.TABLE)
		private int id=1;
		private String username;
		private String password;
		@Lob
		private byte[] file;
		
		@Lob
		private byte[] pdf;

		public byte[] getPdf() {
			return pdf;
		}

		public void setPdf(byte[] pdf) {
			this.pdf = pdf;
		}
		public void setFile(byte[] img) {
			this.pdf = pdf;
		}
		public byte[] getFile() {
			return file;
		}
		//private UserDetail UserDetail ;
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
	
}
