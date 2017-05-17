package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controler {

	
	private Repo repo;
	

    @Autowired
    public Controler(Repo repo)
    {
    	this.repo=repo;
    }

    @RequestMapping("/User")
    public ModelAndView saveDatas()
    {
    	ModelAndView modelAndView=new ModelAndView("index");
    	return modelAndView;
    }
    
    
    @RequestMapping("/save")
    public String getdata(@ModelAttribute User user)
    {
    	repo.save(user);
    	return "successfully saved..!!!";
    }
    
    
}
