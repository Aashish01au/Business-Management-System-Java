package com.spring.SpringProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.Model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByEmailAndPassword(String email,String psw);
	

}
