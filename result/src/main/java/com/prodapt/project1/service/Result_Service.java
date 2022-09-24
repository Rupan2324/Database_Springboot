package com.prodapt.project1.service;

import java.util.List;

import javax.transaction.Transactional;

import com.prodapt.project1.bean.Result;
import com.prodapt.project1.exception.UserNotFoundException;
import com.prodapt.project1.repository.Result_Repository;
import com.prodapt.project1.request.ResultRequest;
import com.prodapt.project2.bean.Student_login;
import com.prodapt.project2.repository.Student_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Result_Service {
	@Autowired
	private Result_Repository repository;
	@Autowired
	private Student_Repository repo;
	@Transactional
	public Result addResult(ResultRequest r,String student_login) {
		Result rs = r.toResult();
		Student_login sl = repo.findByRegno(student_login);
		rs.setStudent_login(sl);
		return repository.save(rs);
	}
	public List<Result> findAllResults(){
		return repository.findAll();
	}
	public void deleteResults(String rollno) {
		repository.deleteResultByRollno(rollno);
	}
	public Result findResultByRegno(String rollno) {
		return repository.findResultByRollno(rollno)
				.orElseThrow(()->new UserNotFoundException("Result by rollno "+rollno+" was not found"));
	}
	public Result updateResult(Result result) {
		Result exisitingresult1 = repository.findByRollno(result.getRollno());
		exisitingresult1.setCourse_code(result.getCourse_code());
		exisitingresult1.setSemester(result.getSemester());
		exisitingresult1.setGrade(result.getGrade());
		exisitingresult1.setResult(result.getResult());
		exisitingresult1.setStudent_login(result.getStudent_login());
		return repository.save(exisitingresult1);
	}

}
