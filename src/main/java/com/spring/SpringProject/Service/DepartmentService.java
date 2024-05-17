package com.spring.SpringProject.Service;

import java.util.List;

import com.spring.SpringProject.Model.Department;

public interface DepartmentService {

	void addDept(Department dept);
	void deleteDept(int id);
	void updateDept(Department dept);
	List<Department> getAllDepts();
	Department getDeptById(int id);
}
