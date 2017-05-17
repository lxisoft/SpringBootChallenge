package com.lxisoft.easyjob.controller;

import com.lxisoft.easyjob.entity.User;

public class Validation {

	public String validation(User ug) {

		String name = ug.getName();
		String email = ug.getEmail();
		String password = ug.getPassword();
		String reEnterPassword = ug.getRePassword();

		if (name != "" && email != "" && password != "" && reEnterPassword != "") {

		

				if (password.equals(reEnterPassword)) {

				

					return "correct";

				} else {

					return "Password is not matching";
				}

			}
		else{
			
			return "some field is missing";
			
		}


	}

	public String signinValidation(User ug, String email, String password) {

		if (password.equals(ug.getPassword())) {

			return "correct";

		}

		return "Password is not correct" + ug.getPassword() + password;
	}

}
