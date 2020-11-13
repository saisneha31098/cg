package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.dtos.Doctor;

@Repository
public interface DoctorDao extends JpaRepository<Doctor,Long> {
	

	List<Doctor> findAll();
	void deleteById(Long id);
	
	
	

}
