package com.spring.SpringProject.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringProject.Model.DoctAppointForm;
import com.spring.SpringProject.Repository.DoctorApointRepository;
import com.spring.SpringProject.Service.DoctApointService;

@Service
public class DoctAppointServiceImpl implements DoctApointService {

	@Autowired
	private DoctorApointRepository docApointRepo;
	
	@Override
	public void addAppoint(DoctAppointForm docApoint) {
		
		docApointRepo.save(docApoint);
		
	}

	@Override
	public void deleteAppoint(int id) {
		// TODO Auto-generated method stub
		docApointRepo.deleteById(id);
	}

	@Override
	public void updateAppoint(DoctAppointForm docApoint) {
		// TODO Auto-generated method stub
		docApointRepo.save(docApoint);
	}

	@Override
	public List<DoctAppointForm> getAlldocAppoints() {
		// TODO Auto-generated method stub
		return docApointRepo.findAll();
	}

	@Override
	public DoctAppointForm getDoctApointById(int id) {
		// TODO Auto-generated method stub
		return docApointRepo.findById(id).get() ;
	}

}
