package com.lxisoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import antlr.collections.List;

@RestController
public class HrDbController {
	
	@Autowired
	HrDbRepo hrRepo;
	
	@RequestMapping(value="/registration",consumes={"multipart/mixed"})
	public ModelAndView login(ModelMap map,@ModelAttribute Hr hr,MultipartFile file){
		
		ModelAndView mav = new ModelAndView("registration");
        
       
        try{
    		
			hr.setImage(file.getBytes());
		}
		catch (Exception e){
			
		}
        
        hrRepo.save(hr);
        map.put("message", "update successful");
        
        return mav;
	}
	
	@RequestMapping("/test")
	public String get(){
		 return "hai";
	}
	
	
	/*@RequestMapping("/getlist")
	public ModelAndView getList(ModelMap map,@ModelAttribute Hr hr){
		
		ModelAndView mav = new ModelAndView("list");
		
		return "hai";
	}
	*/
	/*@RequestMapping("/findbyname")
	public String findByName(@RequestParam String username){
		
		return hrRepo.findByusername(username);
		
	}*/
	
	
	@RequestMapping("/findbyname")
	public ModelAndView findAll(@RequestParam String username,ModelMap map){
		
		ModelAndView get=new ModelAndView("list");
		hrRepo.findByusername(username);
		get.addAllObjects(map);
		
		return get;
	}
	
	

}
