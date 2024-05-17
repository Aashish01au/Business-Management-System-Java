package com.spring.SpringProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	

}
