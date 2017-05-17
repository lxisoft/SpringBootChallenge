package com.lxisoft.jobportal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.jobportal.entities.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Integer>{
	

}
