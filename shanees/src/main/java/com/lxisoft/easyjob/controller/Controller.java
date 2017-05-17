package com.lxisoft.easyjob.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.lxisoft.easyjob.userrepo.UserReppo;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private UserReppo user;

}
