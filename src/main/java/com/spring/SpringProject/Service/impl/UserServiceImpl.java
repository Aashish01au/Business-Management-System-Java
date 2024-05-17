package com.spring.SpringProject.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringProject.Model.User;
import com.spring.SpringProject.Repository.UserRepository;
import com.spring.SpringProject.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public void userSignup(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);

	}

	@Override
	public User userLogin(String email, String psw) {
		// TODO Auto-generated method stub
		return userRepo.findByEmailAndPassword(email,psw);
	}

}
