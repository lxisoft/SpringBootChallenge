package com.lxisoft.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


	@Entity
	public class Userdb {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String Username;
		private String password;
}
