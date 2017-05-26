package com.lxisoft.CandidateDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.lxisoft.CandidateDetails.model.Candidate;
import com.lxisoft.CandidateDetails.repository.CandidateRepo;

@Service
public class CandidateServiceImplement implements CandidateServiceRepo {
	
	@Autowired
	public CandidateRepo cRepo;

	@Override
	public Page<Candidate> findAll(int id) {
		return cRepo.findAll(new PageRequest(id,3));
	}

	@Override
	public List<Candidate> findAll() {
		return cRepo.findAll();
	}

	@Override
	public void save(Candidate candidate) {
		
	 cRepo.save(candidate);
	}

	@Override
	public Candidate findOne(int id) {
		return cRepo.findOne(id);
	}

}
