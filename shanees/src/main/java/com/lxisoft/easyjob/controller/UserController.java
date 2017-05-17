package com.lxisoft.easyjob.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.easyjob.entity.User;
import com.lxisoft.easyjob.userrepo.UserReppo;

@RestController
public class UserController {

	@Autowired
	private UserReppo uReppo;

	@RequestMapping("/getUsersList")
	public List<User> getUser() {

		List<User> list = uReppo.findAll();

		return list;
	}

	@RequestMapping("/findEmail")
	public User findEmail(String email) {

		User user = uReppo.findByEmail(email);

		return user;
	}

	@RequestMapping("/findId")
	public User findEmail(long id) {

		User user = uReppo.findById(id);

		return user;
	}

	@RequestMapping(value = "/getImage", produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] getImage(long id) {

		User user = uReppo.findById(id);
		return user.getImage();

	}

}
