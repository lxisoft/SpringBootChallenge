package com.lxisoft.UserProfile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	
	
		@RequestMapping("/home")
		public String showUsers(){
			
			return "show_User_Data";
		}
	
	

		@RequestMapping("/registration")
		public String RegisterUser(){
			
			return "register_User_Data";
		}
		

		@RequestMapping("/login")
		public String loginUser(){
			
			return "login_User";
		}
		
		@RequestMapping("/viewHome")
		public String viewUserHome(){
			
			return "view_User_Home";
		}
	
}
