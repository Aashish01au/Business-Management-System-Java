package com.spring.SpringProject.Service;

import java.util.List;

import com.spring.SpringProject.Model.Patients;

public interface PatientsService {

	void addPatients(Patients ptnts);
	void deletePatients(int id);
	void updatePatients(Patients ptnts);
	List<Patients> getAllPatients();
	Patients getPatientsById(int id);
}
