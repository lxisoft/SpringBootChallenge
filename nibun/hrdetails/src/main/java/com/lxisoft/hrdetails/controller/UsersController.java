package com.lxisoft.hrdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lxisoft.hrdetails.entity.User;
import com.lxisoft.hrdetails.repository.UsersRepository;

@RestController
public class UsersController {

	private UsersRepository usersRepo;

	@Autowired
	public UsersController(UsersRepository repo) {
		this.usersRepo = repo;

	}

	@RequestMapping("/registration")
	public ModelAndView registration() {

		ModelAndView modelAndView = new ModelAndView("register");
		return modelAndView;

	}

	@RequestMapping("/saving")
	public String saveUser(@ModelAttribute User user) {
		usersRepo.save(user);
		
		
		return "Registration successfully completed";
	}
	

	
	
	@RequestMapping("/getusers")
	public ModelMap listOfUsers(ModelMap map){
		ModelMap userMap= new ModelMap("listofuser");
		List<User> list= usersRepo.findAll();
		map.put("list", list);
		return  userMap;
		
	}
}
