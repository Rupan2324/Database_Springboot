package com.prodapt.project2.service;

import java.util.List;

import javax.transaction.Transactional;

import com.prodapt.project2.bean.Institution;
import com.prodapt.project2.bean.Student_login;
import com.prodapt.project2.exception.UserNotFoundException;
import com.prodapt.project2.repository.Institution_Repository;
import com.prodapt.project2.repository.Student_Repository;
import com.prodapt.project2.request.StudentRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_Service {
	@Autowired
	private Student_Repository repository;
	@Autowired
	private Institution_Repository repo;
	@Transactional
	public Student_login addStudent_login(StudentRequest s,String institution) {
		Student_login st = s.toStudent();
		Institution d = repo.findByCollege(institution);
		st.setInstitution(d);
		return repository.save(st);
	}
	public List<Student_login> findAllStudent_logins(){
		return repository.findAll();
	}
	public void deleteStudent_login(String regno) {
		repository.deleteByRegno(regno);
	}
	public Student_login findStudentByRegno(String regno) {
		return repository.findStudentByRegno(regno)
				.orElseThrow(()->new UserNotFoundException("Student by regno "+regno+" was not found"));
	}
	public Student_login updateStudent_login(Student_login Student) {
		Student_login exisitingStudent1 = repository.findByRegno(Student.getRegno());
		exisitingStudent1.setName(Student.getName());
		exisitingStudent1.setPassword(Student.getPassword());
		exisitingStudent1.setDob(Student.getDob());
		exisitingStudent1.setGender(Student.getGender());
		exisitingStudent1.setDepartment(Student.getDepartment());
		exisitingStudent1.setEmail(Student.getEmail());
		exisitingStudent1.setPhonenumber(Student.getPhonenumber());
		exisitingStudent1.setInstitution(Student.getInstitution());
		return repository.save(exisitingStudent1);
	}
	  public Student_login findByRegnoAndPassword(String regno,String password) {
	        return repository.findByRegnoAndPassword(regno,password);
	        
	    }
	public Student_login findByRegno(String tempregno) {
		// TODO Auto-generated method stub
		return null;
	}


}
