package com.prodapt.project1.request;

import com.prodapt.project1.bean.Result;

import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
public class ResultRequest {
	private String rollno;
	private String course_code;
	private int semester;
	private String grade;
	private String result;
	private String student_login;
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
	public String getStudent_login() {
		return student_login;
	}
	public void setStudent_login(String student_login) {
		this.student_login = student_login;
	}
	 public Result toResult()  {
		 Result a=new Result();
	    	a.setRollno(rollno);
	    	a.setSemester(semester);
	    	a.setCourse_code(course_code);
	    	a.setGrade(grade);
	    	a.setResult(result);
			return a;
	    }
	
}
