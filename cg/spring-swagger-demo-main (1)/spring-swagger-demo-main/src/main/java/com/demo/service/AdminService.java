package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.AdminDao;
import com.demo.dtos.Admin;
import com.demo.exception.AdminNotFoundException;

@Service
public class AdminService {

	@Autowired
	private AdminDao hospital;

	public List<Admin> getAlladmins() {
		System.out.println("Admins...");
		return hospital.findAll();
	}
public Admin getAdminById(Long id)   
	{
		System.out.println("Admin accessed");
		Optional<Admin>optional=hospital.findById(id);
		if(!optional.isPresent()) {
			throw new AdminNotFoundException("Admin could not be accessed for id="+id);
		}
		else
			return optional.get();
	}
public Admin addAdmin(Admin admin) throws IllegalArgumentException  {
	try {
		System.out.println("Admin Added");
		
		return hospital.save(admin);
		}
		catch(IllegalArgumentException e)
		{
		    System.out.println("Admin could not be added");
			e.printStackTrace();
		    return null;
		}
}
public Admin updateAdmin(Long id, Admin admin )   {
	System.out.println("Admin updated.");
	Optional<Admin> repAdmin = hospital.findById(id);
	if(!repAdmin.isPresent()) {
		throw new AdminNotFoundException("Admin not found for id="+id);
	}
	else
	{
		Admin adminToBeUpdated = repAdmin.get();
		adminToBeUpdated.setContactNumber(admin.getContactNumber());
		adminToBeUpdated.setEmail(admin.getEmail());
		adminToBeUpdated.setPassword(admin.getPassword());
		System.out.println("Admin Updated");

		return hospital.save(adminToBeUpdated);
		
	}
}
public Admin removeAdminById(Long id)   
{
	System.out.println("Admin removed");
	Optional<Admin>optional=hospital.findById(id);
	if(!optional.isPresent()) {
		throw new AdminNotFoundException("Admin could not be removed for id="+id);
	}
	else
		return optional.get();
}
}