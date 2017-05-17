package com.lxisoft.UserProfile.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lxisoft.UserProfile.model.User;
import com.lxisoft.UserProfile.repository.UserRepository;

@RestController
public class SampleController {

		@Autowired
		UserRepository userRepo;
	
		@RequestMapping("/home")
		public ModelAndView showUsers(){
			
			ModelAndView mav=new ModelAndView("ShowUsers");
			return mav;
		}
	
	

		@RequestMapping("/registration")
		public ModelAndView RegisterUser(){
			
			ModelAndView mav=new ModelAndView("Register");
			return mav;
		}
		
		@RequestMapping("/registerSucessfully")
		
		
			public User saveUser(MultipartFile photo, MultipartFile resumePdf,@RequestParam String name,@RequestParam String email,@RequestParam long phoneNumber,@RequestParam String username,@RequestParam String password) throws IOException {
				
			User user=new User(name, email, phoneNumber,username, password);
				user.setPhoto(photo.getBytes());
				user.setResumePdf(resumePdf.getBytes());
				
				userRepo.save(user);
				return user;
				
				
		}
		

		@RequestMapping("/login")
		public ModelAndView loginUser(){
		
			ModelAndView mav=new ModelAndView("Login");
			return mav;
		
		}
		
		@RequestMapping("/viewHome")
		public ModelAndView viewUserHome(){
			
			ModelAndView mav=new ModelAndView("ViewHome");
			return mav;
		}
	
}
