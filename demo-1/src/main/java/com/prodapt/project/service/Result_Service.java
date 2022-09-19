package com.prodapt.project.service;

import java.util.List;

import com.prodapt.project.bean.Result;
import com.prodapt.project.exception.UserNotFoundException;
import com.prodapt.project.repositiory.Result_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
@Service
@RequestMapping("/result")
public class Result_Service {
	@Autowired
	private Result_Repository repository;
	public Result addResult(Result result) {
		return repository.save(result);
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
