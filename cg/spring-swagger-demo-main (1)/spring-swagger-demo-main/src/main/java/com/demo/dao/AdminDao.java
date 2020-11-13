package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.dtos.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin,Long> {
	

	List<Admin> findAll();
	void deleteById(Long id);

}
