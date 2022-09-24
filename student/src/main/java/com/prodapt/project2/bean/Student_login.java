package com.prodapt.project2.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_login")
public class Student_login {
	@Id
	private String regno;
	@Column(nullable=false)
	private String name;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String dob;
	@Column(nullable=false)
	private String gender;
	@Column(nullable=false)
	private String Department;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private long phonenumber;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "college",nullable=false)
	private Institution institution;
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Institution getInstitution() {
		return institution;
	}
	public void setInstitution(Institution institution) {
		this.institution = institution;
	}
	@Override
	public String toString() {
		return "Student_login [regno=" + regno + ", name=" + name + ", password=" + password + ", dob=" + dob
				+ ", gender=" + gender + ", Department=" + Department + ", email=" + email + ", phonenumber="
				+ phonenumber + ", institution=" + institution + "]";
	}
	
}