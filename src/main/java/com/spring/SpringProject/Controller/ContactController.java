package com.spring.SpringProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.SpringProject.Utils.MailUtils;

@Controller
public class ContactController {
	
	@Autowired
	private MailUtils mailUtil;
	
	@GetMapping("/contact")
	public String getContact() {
		
		return"Contact";
	}
	
	@PostMapping("/contact")
	public String postContact(@RequestParam String toEmail, @RequestParam String subject,  @RequestParam String message ) {
		
		mailUtil.sendEmail(toEmail,subject,message);
		
		return"Contact";
	}

}
