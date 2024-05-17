package com.spring.SpringProject.Controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class GalleryController {

	@GetMapping("/gallery")
	public String getGallery(Model model, HttpSession session) {
		
		if(session.getAttribute("activeUser") == null) {
			
			return"LoginForm";
			
		}
		
		String[] imageNameList= new File("src\\main\\resources\\static\\img").list(); // imageNameList= creating object/ beans 
		model.addAttribute("imgList",imageNameList); // imgList= creating string/ variables to store the values that is in the object
		return"Gallery";
	}
	
}
