package com.spring.SpringProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.Model.DoctAppointForm;

public interface DoctorApointRepository extends JpaRepository<DoctAppointForm, Integer> {
	

}
