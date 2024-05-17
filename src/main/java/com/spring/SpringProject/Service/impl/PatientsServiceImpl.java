package com.spring.SpringProject.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringProject.Model.Patients;
import com.spring.SpringProject.Repository.PatientRepository;
import com.spring.SpringProject.Service.PatientsService;

@Service
public class PatientsServiceImpl implements PatientsService{

	@Autowired
	private PatientRepository patientsRepo;
	
	@Override
	public void addPatients(Patients ptnts) {
		// TODO Auto-generated method stub
		patientsRepo.save(ptnts);
	}

	@Override
	public void deletePatients(int id) {
		// TODO Auto-generated method stub
		patientsRepo.deleteById( id);
	}

	@Override
	public void updatePatients(Patients ptnts) {
		// TODO Auto-generated method stub
		patientsRepo.save(ptnts);
	}

	@Override
	public List<Patients> getAllPatients() {
		// TODO Auto-generated method stub
		return patientsRepo.findAll();
	}

	@Override
	public Patients getPatientsById(int id) {
		// TODO Auto-generated method stub
		return patientsRepo.findById(id).get();
	}

}
