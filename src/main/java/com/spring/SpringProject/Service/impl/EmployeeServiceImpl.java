package com.spring.SpringProject.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringProject.Model.Employee;
import com.spring.SpringProject.Repository.EmployeeRepository;
import com.spring.SpringProject.Service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public void addEmp(Employee emp) {
		// TODO Auto-generated method stub
		empRepo.save(emp);
	}

	@Override
	public void deleteEmp(int id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);;
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empRepo.save(emp);
	}

	@Override
	public Employee getEmpByIdEmployee(int id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmps() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	
	

}
