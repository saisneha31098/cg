package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.DoctorDao;
import com.demo.dtos.Doctor;
import com.demo.exception.DoctorNotFoundException;

@Service
public class DoctorService {

	@Autowired
	private DoctorDao hospital;

	public List<Doctor> getAlldoctors() {
		System.out.println("Doctors...");
		return hospital.findAll();
	}

	public Doctor getDoctorById(Long id)  {
		System.out.println("Doctor accessed.");
		Optional<Doctor>optional=hospital.findById(id);
		if(!optional.isPresent()) {
			throw new DoctorNotFoundException("Doctor could not be accessed for id="+id);
		}
		else
			return optional.get();
	}

	public Doctor addDoctor(Doctor doctor) throws IllegalArgumentException {
		try {
			System.out.println("Doctor added.");
			return hospital.save(doctor);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Doctor could not be added");
			e.printStackTrace();
			return null;
		}

	}

	public Doctor updateDoctor(Long id, Doctor doctor)  {
		System.out.println("Doctor updated.");
		Optional<Doctor> repDoctor = hospital.findById(id);
		if (!repDoctor.isPresent()) {
			throw new DoctorNotFoundException("Doctor could not be updated for id="+id);
		}
		else {
			Doctor doctorToBeUpdated = repDoctor.get();
			doctorToBeUpdated.setLocation(doctor.getLocation());
			doctorToBeUpdated.setHospitalName(doctor.getHospitalName());
			doctorToBeUpdated.setMobileNo(doctor.getMobileNo());
			doctorToBeUpdated.setEmail(doctor.getEmail());
			doctorToBeUpdated.setPassword(doctor.getPassword());
			doctorToBeUpdated.setChargesPerVisit(doctor.getChargesPerVisit());
			return hospital.save(doctorToBeUpdated);

		}
        
	}
	public Doctor removeDoctorById(Long id)  {
		System.out.println("Doctor removed.");
		Optional<Doctor>optional=hospital.findById(id);
		if(!optional.isPresent()) {
			throw new DoctorNotFoundException("Doctor could not be removed for id="+id);
		}
		else
			return optional.get();
	}
	
}
