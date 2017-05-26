package com.lxisoft.CandidateDetails.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.lxisoft.CandidateDetails.model.Candidate;

import com.lxisoft.CandidateDetails.service.CandidateServiceRepo;

@RestController
public class CandidateController {
	
	@Autowired
	private CandidateServiceRepo repo;
	List<Candidate> lists;

	@RequestMapping("/register")
	public ModelAndView saveDatas() {
		ModelAndView modelAndView = new ModelAndView("save");
		return modelAndView;
	}

	@RequestMapping("/loginpage")
	public ModelAndView loginpage(@ModelAttribute Candidate c, ModelMap map) {
		map.put("candidate", c);
		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}

	@RequestMapping("/saving")
	public ModelAndView saveData(String name, String email, String password, String address,int phonenumber, MultipartFile image,
			MultipartFile resume,ModelMap map) throws IOException {
		Candidate candidate1 = new Candidate();
		candidate1.setName(name);
		candidate1.setEmail(email);
		candidate1.setPassword(password);
		candidate1.setAddress(address);
		candidate1.setPhonenumber(phonenumber);
		candidate1.setImage(image.getBytes());
		candidate1.setResume(resume.getBytes());
		repo.save(candidate1);

		List<Candidate> candidatelist = repo.findAll();
		map.put("list", candidatelist);
		return new ModelAndView("home");
	}

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String password, ModelMap map) {

		List<Candidate> candidatelist = repo.findAll();
		String checked = "";

		for (Candidate candi : candidatelist) {
			if (candi.getPassword().equals(password)) {
				map.put("candidate", candi.getId());
				map.put("list", candidatelist);
				checked = "ok";
			}
		}

		if (checked.equals("ok")) {
			return new ModelAndView("userdetail");
		} else {
			return new ModelAndView("login");
		}

	}

	@RequestMapping("/home")
	public ModelAndView home(ModelMap map) {

		return new ModelAndView("home");
	}
	
	@RequestMapping("/userlist/{id}")
	public ModelAndView getUser(@PathVariable int id,ModelMap map) {
		Page<Candidate> currentPage=repo.findAll(id-1);
		map.put("userlist",currentPage);
		return new ModelAndView("userlist") ;
	}
	
	
	@RequestMapping(value ="image" , method=RequestMethod.GET, produces=MediaType.IMAGE_PNG_VALUE)
	public byte[] getImage(int id) {

		Candidate c=repo.findOne(id);

		return c.getImage();
	}
	
	@RequestMapping(value ="resume" , method=RequestMethod.GET, produces=MediaType.APPLICATION_PDF_VALUE)
	public byte[] getResume(int id) {

		Candidate c=repo.findOne(id);

		return c.getResume();
	}
}
