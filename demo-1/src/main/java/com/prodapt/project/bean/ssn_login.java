package com.prodapt.project.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ssn_login")
public class ssn_login {
	@Id
	private String name;
	private String username;
	private String password;
	private String dob;
	private String gender;
	private String Department;
	private String email;
	private long phonenumber;
	@Override
	public String toString() {
		return "Actech_login [name=" + name + ", username=" + username + ", password=" + password + ", dob=" + dob
				+ ", gender=" + gender + ", Department=" + Department + ", email=" + email + ", phonenumber="
				+ phonenumber + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
}
