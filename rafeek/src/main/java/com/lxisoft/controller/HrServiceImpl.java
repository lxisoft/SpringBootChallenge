package com.lxisoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;



@Service
public class HrServiceImpl implements HrService {
	@Autowired
	private HrRepo repo;

	public Userdb save(Userdb details) {
		// TODO Auto-generated method stub
		return repo.save(details);
	}
}
