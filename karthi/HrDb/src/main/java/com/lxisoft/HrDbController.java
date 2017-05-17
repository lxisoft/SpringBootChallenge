package com.lxisoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HrDbController {
	
	@Autowired
	HrDbRepo hrRepo;
	
	@RequestMapping(value="/login")
	public ModelAndView login(ModelMap map,@RequestParam String userName,@RequestParam String password){
		
		ModelAndView mav = new ModelAndView("Home");
        Hr hr=new Hr();
        hr.setUserName(userName);
        hr.setPassword(password);
        hrRepo.save(hr);
        map.put("message", "update successfully");
        return mav;
	}
	
	@RequestMapping("/test")
	public String get(){
		 return "hai";
	}

}
