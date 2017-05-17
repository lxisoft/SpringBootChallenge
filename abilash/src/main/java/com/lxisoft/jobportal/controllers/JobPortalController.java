package com.lxisoft.jobportal.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobPortalController {
	
	@RequestMapping("/test")
	public String getData(){
		
		return "runs fine";
	}

}
