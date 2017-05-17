package com.lxisoft.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;



@RestController

public class HrController {
@Autowired
	private HrService hrService;
	@RequestMapping(value = "/register",consumes = { "multipart/mixed" })
	public String save( @RequestParam String username, @RequestParam String password, @RequestParam MultipartFile file) {
		Userdb user=new Userdb();
		try {
			
			
			user.setFile(file.getBytes());
			user.setPassword(password);
			user.setUsername( username);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hrService.save(user);

		ModelAndView view=new ModelAndView("index");
	
			hrService.save(user);
		
			return "view";

	}
	

	
}
