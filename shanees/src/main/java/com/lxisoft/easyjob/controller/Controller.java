package com.lxisoft.easyjob.controller;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lxisoft.easyjob.entity.User;
import com.lxisoft.easyjob.userrepo.UserReppo;

@org.springframework.stereotype.Controller
public class Controller {
	

	@Autowired
	private UserReppo uReppo;
	
	@RequestMapping("/create")
	public String addUser(String name,String email,String password,String rePassword, MultipartFile image,MultipartFile resume){
		
		String nextPage="register";
		
		User user=new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setRePassword(rePassword);
		
		try {
		
			user.setImage(image.getBytes());
			user.setResume(resume.getBytes());
			
		} catch (IOException e) {}
	
		
		Validation valid=new Validation();
		String result=valid.validation(user);
		if(result.equals("correct")){
			
			uReppo.save(user);
			nextPage="index";
			
		}
		
		return nextPage;
	}
	
	@RequestMapping("/getUsers")
	public String getUser(ModelMap map){
		
		List<User> users= uReppo.findAll();
		if(users!=null){
			
			map.put("list", users);
			map.put("list1", users.get(1).getName());
			
		}
		else{
			
			map.put("count", "no users");
		}
		
		
		return "candidates";
	}
	
/*	@RequestMapping("/test")
	public String tes(ModelMap map) throws MalformedURLException, IOException{
	ObjectMapper mapper = new ObjectMapper();
		List<User> us=new ArrayList<User>();

	
	
				List<User> obj2 =  (List<User>) mapper.readValue(new URL("http://localhost:8080/getUsersList"),(TypeReference) us);
				
				
		
	
		map.put("rr", obj2);
		
		return "index";
	}*/
	
	@RequestMapping("/login")
	public String log(ModelMap map,long id,String email,String pass) throws JsonParseException, JsonMappingException, MalformedURLException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		User obj2=null;
		
		if(email !=null && pass !=null){
			obj2 =mapper.readValue(new URL("http://localhost:8080/findEmail?email="+email+""),User.class);
				if(obj2 !=null){
					String pas1=obj2.getPassword();
					if(pass.equals(pas1)){
					
						User user2=mapper.readValue(new URL("http://localhost:8080/findId?id="+id+""),User.class);
						
						map.put("user", user2);
						
						return "home";
					}else{
						
						return "login";
					}
					
					
					
				}else{
					
					return "login";
				}
				
			
			
		}else{
			return "login";
			
		}
	
		
		
		
	
	}
	
	

}
