package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ExampleController {
	
	@Autowired
	private ExampleRepo repo;
	
	
	/*@RequestMapping("/save")
	public Example save(@ModelAttribute Example ex){
		
		repo.save(ex);
		
		return ex;
		
		
	}*/
	
	
	@RequestMapping("/Main")
	  public ModelAndView homeView() {
	    ModelAndView home = new ModelAndView("Main");
	    return home;
	         
	    }
	 
	 @RequestMapping("/save")
	    public ModelAndView  addContact(ModelMap map,@RequestParam int id,@RequestParam String name,@RequestParam String email,@RequestParam String username,@RequestParam String password ) {
	ModelAndView mav = new ModelAndView("save");
	         Example ex=new Example();
	         ex.setId(id);
	         ex.setName(name);
	         ex.setEmail(email);
	         ex.setUsername(username);
	         ex.setPassword(password);
	         repo.save(ex);
	         
	         List<Example> exe=repo.findAll();
	         map.put("message", "update successfully");
	         map.put("detail1", exe.get(1).getName());
	         map.put("detail2", exe.get(2).getName());
	         
	         return mav;
	         
	         
	    }
	
	
	
}
