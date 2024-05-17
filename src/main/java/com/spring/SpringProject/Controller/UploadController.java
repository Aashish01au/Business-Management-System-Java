package com.spring.SpringProject.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	@GetMapping("/upload")
	public String getUpload() {
		
		return"Upload";
	}
	@PostMapping("/upload")
	public String postUpload(@RequestParam MultipartFile photo, Model model) {
		
		if(!photo.isEmpty()) {
			try {
				Files.copy(photo.getInputStream(), Path.of("src\\main\\resources\\static\\img\\"+photo.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
				
				model.addAttribute("message"," Upload Successful");
				return"Upload";
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		model.addAttribute("message"," Upload Failed!!!!");
		return"Upload";
	}
}
