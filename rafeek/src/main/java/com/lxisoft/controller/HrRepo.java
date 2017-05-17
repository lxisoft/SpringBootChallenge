package com.lxisoft.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HrRepo extends JpaRepository<Userdb, Integer> {

}
