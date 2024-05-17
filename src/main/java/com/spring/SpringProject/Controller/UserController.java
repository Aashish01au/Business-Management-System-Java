package com.spring.SpringProject.Controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.SpringProject.Model.User;
import com.spring.SpringProject.Service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {


	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping({"/login","/"})// multiple url pattern
	public String getLogin() {
		
		log.info("---------- Inside login pages ----------");
		return "LoginForm";
		
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user, Model model, HttpSession session) {
		
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
	User usr=userService.userLogin(user.getEmail(), user.getPassword());
		if(usr !=null) {
			
			log.info("-------------login Success-------------");
			session.setAttribute("activeUser", usr);
			session.setMaxInactiveInterval(200);
			/* model.addAttribute("userName",usr.getFirstName()); */
			return "Home";
		}
		model.addAttribute("message","user not Found!!!!");
		return "LoginForm" ;
	}
	@GetMapping("/signup")
	public String getSignup() {
		
		log.info("-----------------Signup file Loaded-----------");
		 
		return "SignupForm";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user) {
		
		
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		userService.userSignup(user);
		return "LoginForm";
	}
	
	
	@GetMapping("/logout")
	public String logout( HttpSession session) {
		
		log.info("----------Logout Success---------------");
		
		session.invalidate(); // killing Sesslion 
		return"LoginForm";
	}
	
	@GetMapping("/profile")
	public String getProfile() {
		
		return"Profile";
	}

}

