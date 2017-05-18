package com.lxisoft.CandidateDetails.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lxisoft.CandidateDetails.model.Candidate;
import com.lxisoft.CandidateDetails.repository.CandidateRepo;

@RestController
public class CandidateController{
	
	private CandidateRepo repo;
	List<Candidate> lists;
	

    @Autowired
    public CandidateController(CandidateRepo repo)
    {
    	this.repo=repo; 
    	
    }
	
    @RequestMapping("/register")
    public ModelAndView saveDatas()
    {
    	ModelAndView modelAndView=new ModelAndView("save");
    	return modelAndView;
    }
    
    @RequestMapping("/loginpage")
    public ModelAndView loginpage()
    {
    	ModelAndView modelAndView=new ModelAndView("login");
    	return modelAndView;
    }

	
	@RequestMapping("/saving")
    public ModelAndView saveData(String name,String email,String password,String rePassword,MultipartFile image,MultipartFile resume) throws IOException
    {
		Candidate candidate=new Candidate();
		candidate.setName(name);
		candidate.setEmail(email);
		candidate.setPassword(password);
		candidate.setImage(image.getBytes());
		candidate.setResume(resume.getBytes());
    	repo.save(candidate);
    	return new ModelAndView("save");
    }
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String password)
	{
		
		List<Candidate> candidate= repo.findAll();
		String checked = null;
		
		for(Candidate candi:candidate)
		{
			if(candi.getPassword().equals(password))
			{
				checked="ok";
			}
		}
		
		if(checked.equals("ok"))
		{
			return new ModelAndView("userdetail");
		}
		else
		{
			return new ModelAndView("login");
		}
	
	}
	
	@RequestMapping("/home")
	public ModelAndView getUser(ModelMap map){
		
		List<Candidate> candidate= repo.findAll();
				
			map.put("list", candidate);
		
		return new ModelAndView("home");
	}
	
	}


