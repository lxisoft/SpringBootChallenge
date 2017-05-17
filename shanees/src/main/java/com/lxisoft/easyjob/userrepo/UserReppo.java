package com.lxisoft.easyjob.userrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.easyjob.entity.User;


public interface UserReppo extends JpaRepository<User, Long> {

}
