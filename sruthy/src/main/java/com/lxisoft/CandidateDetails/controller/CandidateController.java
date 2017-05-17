package com.lxisoft.CandidateDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lxisoft.CandidateDetails.model.Candidate;
import com.lxisoft.CandidateDetails.repository.CandidateRepo;

@RestController
public class CandidateController {
	
	private CandidateRepo repo;
	

    @Autowired
    public CandidateController(CandidateRepo repo)
    {
    	this.repo=repo; 
    	
    }
	
    @RequestMapping("/candidates")
    public ModelAndView saveDatas()
    {
    	ModelAndView modelAndView=new ModelAndView("save");
    	return modelAndView;
    }

	
	@RequestMapping("/saving")
    public String saveData(@ModelAttribute Candidate c)
    {
    	repo.save(c);
    	return "saved";
    }

}
