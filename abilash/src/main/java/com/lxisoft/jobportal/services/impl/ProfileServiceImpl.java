package com.lxisoft.jobportal.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxisoft.jobportal.entities.Profile;
import com.lxisoft.jobportal.repositories.ProfileRepository;
import com.lxisoft.jobportal.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService{
	
	@Autowired
	private ProfileRepository repo;


	public void saveProfile(Profile profile) {
	
		
		repo.save(profile);
		
		
		
	}

}
