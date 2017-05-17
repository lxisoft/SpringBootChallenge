package com.lxisoft.jobportal.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.lxisoft.jobportal.entities.Candidate;
import com.lxisoft.jobportal.repositories.CandidateRepository;
import com.lxisoft.jobportal.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService  {
	
	@Autowired
	private CandidateRepository repo;

	@Override
	public void registerCandidate(Candidate candidate) {
		
		repo.save(candidate);
		
	}

	@Override
	public Candidate findCandidate(int id) {
		
		return repo.findOne(id);
	}

	@Override
	public Page<Candidate> getCandidates(int pageNumber) {
		
		PageRequest pageRequest=new PageRequest(pageNumber, 1);
		
		return repo.findAll(pageRequest);
	
	}

}
