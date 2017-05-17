package com.lxisoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController

public class HrController {
@Autowired
	private HrService hrService;
	@RequestMapping("/register")
	public String save(@ModelAttribute Userdb user) {

		ModelAndView view=new ModelAndView("index");
	
			hrService.save(user);
			return user.getUsername();

	}

}
