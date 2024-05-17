package com.spring.SpringProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.Model.Patients;

public interface PatientRepository extends JpaRepository<Patients, Integer>{

}
