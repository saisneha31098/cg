package com.demo.dtos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patient{
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Patient{");
		sb.append("id:").append(id).append(",");
		sb.append("patientName:").append(patientName).append(",");
		sb.append("mobileNo:").append(mobileNo).append(",");
		sb.append("email:").append(email).append(",");
		sb.append("password:").append(password).append(",");
		sb.append("bloodGroup:").append(bloodGroup).append(",");
		sb.append("gender:").append(gender).append(",");
		sb.append("age:").append(age).append(",");
		sb.append("address:").append(address).append("");
		sb.append("}");
		
		return sb.toString();
	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Long id;

	public Long getId() {
		return id;
	}
	String patientName;
	int mobileNo;
	String email;
	
	String password;
	String bloodGroup;
	
	String gender;
	int age;
	String address;

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
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

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Patient() {
		
	}

	
	
	
	
	public Patient(String patientName, int mobileNo, String email, String bloodGroup, String gender, int age,
			String address) {
		super();
		this.patientName = patientName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	public Patient(String patientName, int mobileNo, String email, String password, String bloodGroup, String gender,
			int age, String address) {
		super();
		this.patientName = patientName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}

	
	
	


}
	
