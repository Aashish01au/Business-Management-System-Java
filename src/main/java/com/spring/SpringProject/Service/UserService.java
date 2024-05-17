package com.spring.SpringProject.Service;

import com.spring.SpringProject.Model.User;

public interface UserService {
	
	void userSignup(User user);
	User userLogin(String email, String psw);
	
	
	
}
