package com.lxisoft.CandidateDetails.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.lxisoft.CandidateDetails.model.Candidate;


public interface CandidateServiceRepo {

	
	public Page<Candidate> findAll(int id);
	public List<Candidate> findAll();
	
	public void save(Candidate candidate);
	public Candidate findOne(int id);
	
}
