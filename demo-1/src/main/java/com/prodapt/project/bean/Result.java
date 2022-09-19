package com.prodapt.project.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Result {
@Id

private String rollno;
@Column(nullable=false)
private String course_code;
@Column(nullable=false)
private int semester;
@Column(nullable=false)
private String grade;
@Column(nullable=false)
private String result;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "regno")
private Student_login student_login;
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public String getCourse_code() {
	return course_code;
}
public void setCourse_code(String course_code) {
	this.course_code = course_code;
}
public int getSemester() {
	return semester;
}
public void setSemester(int semester) {
	this.semester = semester;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
public Student_login getStudent_login() {
	return student_login;
}
public void setStudent_login(Student_login student_login) {
	this.student_login = student_login;
}
@Override
public String toString() {
	return "Result [rollno=" + rollno + ", course_code=" + course_code + ", semester=" + semester + ", grade=" + grade
			+ ", result=" + result + ", student_login=" + student_login + "]";
}

}
