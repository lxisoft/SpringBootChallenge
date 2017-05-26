package com.lxisoft;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class HrDbController {
	
	@Autowired
	HrDbRepo hrRepo;
	
	
	//.................create with image.....................
	
	
	/*
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
	}*/
	
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
	
	
	@RequestMapping(value="/registration")
	public ModelAndView login(ModelMap map,@ModelAttribute Hr hr){
		
		ModelAndView mav = new ModelAndView("registration");
        
       
       
        
        hrRepo.save(hr);
        map.put("message", "update successful");
        
        return mav;
	}
	
	/*@RequestMapping("/findbyname")
	public String find(ModelMap map){
		
		
		List<Hr> list =hrRepo.findAll();
		map.put("list", list);
		
		return list.size()+"";		//return new ModelAndView("list");
	}*/
	

	@RequestMapping("/findbyname")
	public ModelAndView find(ModelMap map){
		
		
		List<Hr> list =hrRepo.findAll();
		map.put("list", list);
		//return ""+list.size();
	return new ModelAndView("list");
	}
	
	
	
	
	@RequestMapping(value="/get/{username}")
	public ModelAndView view(@PathVariable("username") String username, ModelMap map){
		
		List<Hr> list=hrRepo.findByUsername(username);
		map.put("list", list);
		return new ModelAndView("view");
		
	}
	
}
