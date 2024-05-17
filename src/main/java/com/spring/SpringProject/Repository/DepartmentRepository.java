package com.spring.SpringProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.Model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
