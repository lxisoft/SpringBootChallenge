package com.lxisoft.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lxisoft.applicants.Applicants;
import com.lxisoft.repo.ChallengeRepo;

@RestController
public class ChallengeController {
	@Autowired
	ChallengeRepo repo;

	@RequestMapping("/home")
	public ModelAndView register() {

		return new ModelAndView("Home");
	}

	@RequestMapping("/save")
	public ModelAndView test(ModelMap map, @ModelAttribute Applicants applicant) {
		List appList = new ArrayList<Applicants>();
		appList.add(applicant);
		repo.save(applicant);
		map.put("user",appList);
		return new ModelAndView("loginview");
	}

	@RequestMapping(value = "/personaldata/{username}")
	public  ModelAndView login(ModelMap map,@PathVariable("username") String username ) {
		List appList = new ArrayList<Applicants>();
		
		Applicants applicant = repo.findOne(username);
		appList.add(applicant);
		map.put("user",appList);
	return new ModelAndView("loginview");
		//return applicant.getUsername();

	}

	@RequestMapping("/show")
	public ModelAndView showUser(ModelMap map) {
		List list = repo.findAll();
		map.put("user", list);
		return new ModelAndView("alreadyreg");
	}

}
