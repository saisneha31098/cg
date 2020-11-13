package com.demo.dtos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Doctor{
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Doctor{");
		sb.append("id:").append(id).append(",");
		sb.append("doctorName:").append(doctorName).append(",");
		sb.append("speciality:").append(speciality).append(",");
		sb.append("location:").append(location).append(",");
		sb.append("hospitalName:").append(hospitalName).append(",");
		sb.append("mobileNo:").append(mobileNo).append(",");
		sb.append("email:").append(email).append(",");
		sb.append("password:").append(password).append("");
		sb.append("chargesPerVisit:").append(chargesPerVisit).append("");
		sb.append("}");
		
		return sb.toString();
	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Long id;

	public Long getId() {
		return id;
	}
	String doctorName;
	String speciality;
	
	String location;
	String hospitalName;
	int mobileNo;
	String email;
	String password;
	int chargesPerVisit;
	
	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getChargesPerVisit() {
		return chargesPerVisit;
	}

	public void setChargesPerVisit(int chargesPerVisit) {
		this.chargesPerVisit = chargesPerVisit;
	}

	public Doctor() {
		
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	
	public Doctor(String doctorName, String speciality, String location, String hospitalName, int mobileNo,
			String email, int chargesPerVisit) {
		super();
		this.doctorName = doctorName;
		this.speciality = speciality;
		this.location = location;
		this.hospitalName = hospitalName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.chargesPerVisit = chargesPerVisit;
	}

	public Doctor(String doctorName, String speciality, String location, String hospitalName, int mobileNo,
			String email, String password, int chargesPerVisit) {
		super();
		this.doctorName = doctorName;
		this.speciality = speciality;
		this.location = location;
		this.hospitalName = hospitalName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
		this.chargesPerVisit = chargesPerVisit;
	}

	}
	
