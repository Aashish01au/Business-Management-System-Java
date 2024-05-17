package com.spring.SpringProject.Service;

import java.util.List;

import com.spring.SpringProject.Model.DoctAppointForm;

public interface DoctApointService {
	
	void addAppoint(DoctAppointForm docApoint);
	void deleteAppoint(int id);
	void updateAppoint(DoctAppointForm docApoint);
	List<DoctAppointForm> getAlldocAppoints();
	DoctAppointForm getDoctApointById(int id);

}
