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

import com.demo.dtos.Patient;
import com.demo.service.PatientService;


//connect from postman as http://localhost:8080/patients/
@Controller
@RequestMapping("/patients")
 public class PatientController{

	@GetMapping("/hi")
	public String hi() {
		return "Hi!";
	}


	//Logger log = LoggerFactory.getLogger(PatientController.class);
	
	@Autowired
	private PatientService patientService;
	


@GetMapping(value = {"/" })
public @ResponseBody List<Patient> getHospitalPatients() 
{ 
	
	List<Patient> patients = patientService.getAllpatients();
	

	
	return patients;
}

@GetMapping("/{id}")
public @ResponseBody  Patient getPatientById(@PathVariable Long id) 
{
	
	return patientService.getPatientById(id);
}



@PostMapping("/")
public @ResponseBody Patient addPatient(@RequestBody Patient patient) 
{
	return patientService.addPatient(patient);
}

@PutMapping("/{id}")
public @ResponseBody Patient updatePatient(@PathVariable Long id,@RequestBody Patient patient) 
{
	
	return patientService.updatePatient(id,patient);
}

@DeleteMapping("/{id}")
public @ResponseBody Patient removePatientById(@PathVariable Long id) 
{
	return patientService.removePatientById(id);
}


}