package com.prodapt.project1.controller;

import java.util.List;

import com.prodapt.project1.bean.Result;
import com.prodapt.project1.request.ResultRequest;
import com.prodapt.project1.service.Result_Service;

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
@RequestMapping("/result")
public class Result_Controller {
	@Autowired
	private Result_Service service;
	@PostMapping("/add/{Student_login}")
	public ResponseEntity<Result> addResult(@RequestBody ResultRequest rs,@PathVariable("Student_login")String Student_login  ) {
		Result result =rs.toResult();
		Result newResult = service.addResult(rs,Student_login);
		return new ResponseEntity<>(newResult,HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Result>> findAllResults() {
		List<Result> Results = service.findAllResults();
		return new ResponseEntity<>(Results,HttpStatus.OK);
	}
	@GetMapping("/find/{rollno}")
	public ResponseEntity<Result> getEmployeeByRegno(@PathVariable("rollno") String rollno) {
		Result Results_id = service.findResultByRegno(rollno);
		return new ResponseEntity<>(Results_id,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Result> updateResult(@RequestBody ResultRequest rs) {
		Result result =rs.toResult();
		Result updateResult = service.updateResult(result);
		return new ResponseEntity<>(updateResult,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{rollno}")
	public String deleteResult(@PathVariable("rollno") String rollno) {
		service.deleteResults(rollno);
		return "Result removed!! "+rollno;
	}
}
