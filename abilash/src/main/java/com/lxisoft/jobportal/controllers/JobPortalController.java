package com.lxisoft.jobportal.controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lxisoft.jobportal.entities.Candidate;

@Controller
@RequestMapping("/app")
public class JobPortalController {
	
	@RequestMapping("/candidates")
	public  String getCandidates() throws JsonParseException, JsonMappingException, MalformedURLException, IOException{
		
		ObjectMapper mapper=new ObjectMapper();
		
		Page<Candidate> candidates=(Page<Candidate>) mapper.readValue(new URL("http://localhost:8080/candidate/candidates"), Candidate.class);
		
		List<Candidate> list=candidates.getContent();
		
		
		return "candidateList"+
		list.get(0).getUsername();
	}
	
	@RequestMapping("/login")
	public String registerUser(){
		
		return "/createUser.jsp";
	}
	

}
