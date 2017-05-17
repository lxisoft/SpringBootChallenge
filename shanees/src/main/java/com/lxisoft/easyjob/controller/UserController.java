package com.lxisoft.easyjob.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lxisoft.easyjob.entity.User;
import com.lxisoft.easyjob.userrepo.UserReppo;

@RestController
public class UserController {
	
	
	@Autowired
	private UserReppo uReppo;
	
	@RequestMapping("/create")
	public String addUser(String name,String email,String password,String rePassword, MultipartFile image){
		
		User user=new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setRePassword(rePassword);
		
		try {
			user.setImage(image.getBytes());
			
		} catch (IOException e) {}
		
		
		
		
		
		return "success";
	}

	
}
