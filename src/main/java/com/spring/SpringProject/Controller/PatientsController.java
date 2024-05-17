package com.spring.SpringProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.SpringProject.Model.Patients;
import com.spring.SpringProject.Repository.PatientRepository;
import com.spring.SpringProject.Service.PatientsService;

@Controller
public class PatientsController {

	@Autowired
	private PatientsService patientsService;
	
	@GetMapping("/patients")
	public String getPatients() {
		
		return "PatientsForm";
	}
	@PostMapping("/patients")
	public String postPatients(@ModelAttribute Patients ptnts) {
		
		patientsService.addPatients(ptnts);
		return "PatientsForm";
	}
}
