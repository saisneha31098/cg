package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.UserDao;
import com.demo.dtos.User;
import com.demo.exception.UserNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserDao hospital;

	public List<User> getAllusers() {
		System.out.println("Users...");
		return hospital.findAll();
	}
	public User getUserById(Long id)   
	{
		System.out.println("User accessed");
		Optional<User>optional=hospital.findById(id);
		if(!optional.isPresent()) {
			throw new UserNotFoundException("User could not be accessed for id="+id);
		}
		else
			return optional.get();
	}

	public User addUser(User user) throws IllegalArgumentException {
		try {
			System.out.println("User added.");
			return hospital.save(user);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("User could not be added");
			e.printStackTrace();
			return null;
		}

	}
       public User updateUser(Long id, User user )   {
		System.out.println("Admin updated.");
		Optional<User> repUser = hospital.findById(id);
		if(!repUser.isPresent()) {
			throw new UserNotFoundException("User not found for id="+id);
		}
		else
		{
			User userToBeUpdated = repUser.get();
			userToBeUpdated.setUserName(user.getUserName());
			userToBeUpdated.setPassword(user.getPassword());
			userToBeUpdated.setRole(user.getRole());
			System.out.println("User updated.");
			
			return hospital.save(userToBeUpdated);}
		}

	public User removeUserById(Long id)   
	{
		System.out.println("User removed");
		Optional<User>optional=hospital.findById(id);
		if(!optional.isPresent()) {
			throw new UserNotFoundException("User could not be deleted for id="+id);
		}
		else
			return optional.get();
	}

}
