package com.prodapt.project.controller;

import java.util.List;

import com.prodapt.project.bean.Admin_login;
import com.prodapt.project.bean.Student_login;
import com.prodapt.project.service.Student_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Student_Controller {
	@Autowired
	private Student_Service service;
	@PostMapping("/add")
	public ResponseEntity<Student_login> addStudent(@RequestBody Student_login student) {
		Student_login newStudent = service.addStudent_login(student);
		return new ResponseEntity<>(newStudent,HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Student_login>> findAllStudents() {
		List<Student_login> students = service.findAllStudent_logins();
		return new ResponseEntity<>(students,HttpStatus.OK);
	}
	@GetMapping("/find/{regno}")
	public ResponseEntity<Student_login> getEmployeeByRegno(@PathVariable("regno") String regno) {
		Student_login students_id = service.findStudentByRegno(regno);
		return new ResponseEntity<>(students_id,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Student_login> updateStudent(@RequestBody Student_login student) {
		Student_login updateStudent = service.updateStudent_login(student);
		return new ResponseEntity<>(updateStudent,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{regno}")
	public String deleteStudent(@PathVariable("regno") String regno) {
		service.deleteStudent_login(regno);
		return "Student removed!! "+regno;
	}
	@PostMapping("/studentlogin")
	public Student_login studentlogin(@RequestBody Student_login student) throws Exception {
		 String tempregno = student.getRegno();
         String temppassword = student.getPassword();
         Student_login studentObj=null;
         if(tempregno!=null && temppassword!=null)
         {
        	 studentObj=service.findByRegnoAndPassword(tempregno, temppassword);
         }
         if(studentObj == null) {
             throw new Exception("Wrong credentials");
         }
         return studentObj;
     }
    @PostMapping("/addstudent")
 	public ResponseEntity<Student_login> addStudentDetails(@RequestBody Student_login student) throws Exception {
 		 String tempregno=student.getRegno();
 		Student_login newStudent = null;
         if(tempregno!=null && !"".equals(tempregno)) {
        	 Student_login studentObj =service.findByRegno(tempregno);
             if(studentObj !=null) {
                 throw new Exception("User with "+tempregno+" already exists");
             }
             else {
            	 newStudent = service.addStudent_login(student);
             }
         }
         return new ResponseEntity<>(newStudent,HttpStatus.CREATED);
 	}
}
