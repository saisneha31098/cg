package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.PatientDao;
import com.demo.dtos.Patient;
import com.demo.exception.PatientNotFoundException;

@Service
public class PatientService {

	@Autowired
	private PatientDao hospital;

	public List<Patient> getAllpatients() {
		System.out.println("Patients...");
		return hospital.findAll();
	}

	public Patient getPatientById(Long id)   
	{
		System.out.println("Patient accessed");
		Optional<Patient>optional=hospital.findById(id);
		if(!optional.isPresent()) {
			throw new PatientNotFoundException("Patient could not be accessed for id="+id);
		}
		else
			return optional.get();
		
	   
	     	}
	

	public Patient addPatient(Patient patient) throws IllegalArgumentException  {
		try {
			System.out.println("Patient Added");
			
			return hospital.save(patient);
			}
			catch(IllegalArgumentException e)
			{
			    System.out.println("Patient could not be added");
				e.printStackTrace();
			    return null;
			}
		
	}

	public Patient updatePatient(Long id, Patient patient)   {
		System.out.println("Patient updated.");
		Optional<Patient> repPatient = hospital.findById(id);
		if(!repPatient.isPresent()) {
			throw new PatientNotFoundException("Patient not found for id="+id);
		}
		else
		{
			Patient patientToBeUpdated = repPatient.get();
			patientToBeUpdated.setMobileNo(patient.getMobileNo());
			patientToBeUpdated.setEmail(patient.getEmail());
			patientToBeUpdated.setPassword(patient.getPassword());
			patientToBeUpdated.setAge(patient.getAge());
			patientToBeUpdated.setAddress(patient.getAddress());
						

			return hospital.save(patientToBeUpdated);
			
		}
	}
		
			public Patient removePatientById(Long id)   
	{
		System.out.println("Patient removed");
		Optional<Patient>optional=hospital.findById(id);
		if(!optional.isPresent()) {
			throw new PatientNotFoundException("Patient could not be removed for id="+id);
		}
		else
			return optional.get();
		

	
}
}