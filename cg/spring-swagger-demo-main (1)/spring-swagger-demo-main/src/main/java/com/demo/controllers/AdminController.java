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
import com.demo.dtos.Admin;
import com.demo.service.AdminService;
@Controller
@RequestMapping("/Admins")
 public class AdminController{
	@GetMapping("/hi")
	public String hi() {
		return "Hi!";
	}
	@Autowired
	private AdminService adminService;
@GetMapping(value = {"/" })
public @ResponseBody List<Admin> getAdmin() 
{ 
	List<Admin> admins = adminService.getAlladmins();
	return admins;
}
@GetMapping("/{id}")
public @ResponseBody  Admin getAdminById(@PathVariable Long id) 
{
	
	return adminService.getAdminById(id);
}
@PostMapping("/")
public @ResponseBody Admin addAdmin(@RequestBody Admin admin) 
{
	return adminService.addAdmin(admin);
}

@PutMapping("/{id}")
public @ResponseBody Admin updateAdmin(@PathVariable Long id,@RequestBody Admin admin) 
{
	
	return adminService.updateAdmin(id,admin);
}
@DeleteMapping("/{id}")
public @ResponseBody Admin removeAdminById(@PathVariable Long id) 
{
	return adminService.removeAdminById(id);
}
}
