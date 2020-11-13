package com.demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.dtos.User;
import com.demo.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController{
	
	@GetMapping("/hi")
	public String hi() {
		return "Hi!";
	}
	
	@Autowired
	private UserService userService;
	


@GetMapping(value = {"/" })
public @ResponseBody List<User> getUsers() 
{ 
	
	List<User> users = userService.getAllusers();
	

	
	return users;
}

@GetMapping("/{id}")
public @ResponseBody  User getUserById(@PathVariable Long id) 
{
	
	return userService.getUserById(id);
}



@PostMapping("/")
public @ResponseBody User addUser(@RequestBody User user) 
{
	return userService.addUser(user);
}

@PutMapping("/{id}")
public @ResponseBody User updateUser(@PathVariable Long id,@RequestBody User user) 
{
	
	return userService.updateUser(id,user);
}

@DeleteMapping("/{id}")
public @ResponseBody User removeUser(@PathVariable Long id) 
{
	return userService.removeUserById(id);
}


}
