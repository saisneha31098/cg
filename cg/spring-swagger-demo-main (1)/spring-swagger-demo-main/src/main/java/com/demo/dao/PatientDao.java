package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.dtos.Patient;

@Repository
public interface PatientDao extends JpaRepository<Patient,Long> {
	
	List<Patient> findAll();
	void deleteById(Long id);
	
	}
