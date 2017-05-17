package com.lxisoft.hrdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lxisoft.hrdetails.entity.User;

@Repository
public interface UsersRepository extends JpaRepository<User, String>{

}
