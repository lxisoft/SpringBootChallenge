package com.lxisoft.easyjob.userrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.easyjob.entity.User;



public interface UserReppo extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
	public User findById(long id);
	

}
