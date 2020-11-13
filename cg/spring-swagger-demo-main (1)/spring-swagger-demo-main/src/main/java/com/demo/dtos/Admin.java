package com.demo.dtos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin{
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Admin{");
		sb.append("id:").append(id).append(",");
		sb.append("adminName:").append(adminName).append(",");
		sb.append("contactNumber:").append(contactNumber).append(",");
		sb.append("email:").append(email).append(",");
		sb.append("password:").append(password).append(",");
		sb.append("}");
		return sb.toString();
	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Long id;
	String adminName;
	double contactNumber;
	String email;
	String password;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public double getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(double contactNumber) {
		this.contactNumber = contactNumber;
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
	
	
	public Admin() {
		super();
	}
	
	public Admin(String adminName, double contactNumber, String email) {
		super();
		this.adminName = adminName;
		this.contactNumber = contactNumber;
		this.email = email;
	}
	public Admin(String adminName, double contactNumber, String email, String password) {
		super();
		this.adminName = adminName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.password = password;
	}
	
}
	
