package com.lxisoft.jobportal.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.lxisoft.jobportal.entities.Candidate;


public interface CandidateService {
	
	public void registerCandidate(Candidate candidate);
	
	public Candidate findCandidate(int id);
	
	public Page<Candidate> getCandidates(int pageNumber);

}
