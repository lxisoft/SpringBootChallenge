package com.lxisoft.jobportal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.jobportal.entities.Candidate;
import com.lxisoft.jobportal.entities.Profile;
import com.lxisoft.jobportal.service.CandidateService;
import com.lxisoft.jobportal.service.ProfileService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {
	
	@Autowired
	private CandidateService service;
	
	@Autowired
	private ProfileService profileService;
	
	@RequestMapping("/registerCandidate")
	public void registerCandidate(@ModelAttribute Candidate candidate,Profile profile){
		
		profileService.saveProfile(profile);
		
		candidate.setProfile(profile);
		
		service.registerCandidate(candidate);
		
	}
	
	@RequestMapping("/candidates")
	public Page<Candidate> getCandidates(){
		
		return service.getCandidates(1);
	}
	

}
