package com.spring.SpringProject.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringProject.Model.Department;
import com.spring.SpringProject.Repository.DepartmentRepository;
import com.spring.SpringProject.Service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository deptRepo;
	
	@Override
	public void addDept(Department dept) {
		// TODO Auto-generated method stub
		deptRepo.save(dept);
		
	}

	@Override
	public void deleteDept(int id) {
		// TODO Auto-generated method stub
		
		deptRepo.deleteById(id);
	}

	@Override
	public void updateDept(Department dept) {
		// TODO Auto-generated method stub
		deptRepo.save(dept);
	}

	@Override
	public List<Department> getAllDepts() {
		// TODO Auto-generated method stub
		return deptRepo.findAll();
	}

	@Override
	public Department getDeptById(int id) {
		// TODO Auto-generated method stub
		return deptRepo.findById(id).get();
	}

	
	
}
