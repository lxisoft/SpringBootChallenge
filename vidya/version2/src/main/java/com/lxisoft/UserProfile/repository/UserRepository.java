package com.lxisoft.UserProfile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.UserProfile.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
