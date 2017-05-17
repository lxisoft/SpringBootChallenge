package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	
	@Autowired
	private ExampleRepo repo;
	
	
	@RequestMapping("/save")
	public Example save(@ModelAttribute Example ex){
		
		repo.save(ex);
		
		return ex;
		
		
	}
}
