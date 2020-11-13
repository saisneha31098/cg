package com.demo.dtos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_records")
public class User{
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("User{");
		sb.append("id:").append(id).append(",");
		sb.append("UserName:").append(UserName).append(",");
		sb.append("password:").append(password).append(",");
		sb.append("role:").append(role).append(",");
		sb.append("}");
		
		return sb.toString();
	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	Long id;
	String UserName;
	String password;
	String role;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User() {
		
	}
	public User(String userName, String role) {
		super();
		UserName = userName;
		this.role = role;
	}
	public User(String userName, String password, String role) {
		super();
		UserName = userName;
		this.password = password;
		this.role = role;
	}
}