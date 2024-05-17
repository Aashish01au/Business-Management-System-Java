package com.spring.SpringProject.Service;

import java.util.List;

import com.spring.SpringProject.Model.Employee;

public interface EmployeeService {
// crud opr
	void addEmp(Employee emp);
	
	void deleteEmp(int id);
	void updateEmployee(Employee emp);
	Employee getEmpByIdEmployee(int id);
	List<Employee>getAllEmps();
	
}
