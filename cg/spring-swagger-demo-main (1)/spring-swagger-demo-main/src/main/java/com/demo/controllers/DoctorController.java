package com.demo.controllers;

import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
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

import com.demo.dtos.Doctor;
import com.demo.service.DoctorService;


//connect from postman as http://localhost:8080/doctors/
@Controller
@RequestMapping("/doctors")
public class DoctorController{
	
	@GetMapping("/hi")
	public String hi() {
		return "Hi!";
	}
	//Logger log = LoggerFactory.getLogger(DoctorController.class);
	
	@Autowired
	private DoctorService doctorService;
	


@GetMapping(value = {"/" })
public @ResponseBody List<Doctor> getHospitalDoctors() 
{ 
	
	List<Doctor> doctors = doctorService.getAlldoctors();
	

	
	return doctors;
}

@GetMapping("/{id}")
public @ResponseBody  Doctor getDoctorById(@PathVariable Long id) 
{
	
	return doctorService.getDoctorById(id);
}



@PostMapping("/")
public @ResponseBody Doctor addDoctor(@RequestBody Doctor doctor) 
{
	return doctorService.addDoctor(doctor);
}

@PutMapping("/{id}")
public @ResponseBody Doctor updateDoctor(@PathVariable Long id,@RequestBody Doctor doctor) 
{
	
	return doctorService.updateDoctor(id,doctor);
}

@DeleteMapping("/{id}")
public @ResponseBody Doctor removeDoctorById(@PathVariable Long id) 
{
	return doctorService.removeDoctorById(id);
}



}