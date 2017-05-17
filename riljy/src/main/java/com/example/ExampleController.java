package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	ExampleRepo repo;
	
	
	@RequestMapping("/register")
	public String save(){
		Example ex=new Example();
		
		
		return "success";
	}
}
