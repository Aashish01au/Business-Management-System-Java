package com.spring.SpringProject.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.SpringProject.Model.DoctAppointForm;
import com.spring.SpringProject.Service.DoctApointService;



@Controller
public class DoctorAppointForm {

	@Autowired
	private DoctApointService doctApointService;
	
	@GetMapping("/doctorForm")
	public String getDoctForm() {
		
		return "DoctorAppointmentForm";
	}
	
	@PostMapping("/doctorForm")
	public String postDoctForm(@ModelAttribute DoctAppointForm docApoint) {
		
		doctApointService.addAppoint(docApoint);
		
		return "DoctorAppointmentForm";
	}
}
