package com.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.dtos.User;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
	

	List<User> findAll();
	void deleteById(Long id);

}
