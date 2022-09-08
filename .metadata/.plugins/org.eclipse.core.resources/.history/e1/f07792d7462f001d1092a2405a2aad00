package com.prodapt.project.service;

import java.util.List;

import com.prodapt.project.bean.ssn_login;
import com.prodapt.project.repositiory.ssn_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ssn_Service {
	@Autowired
	private ssn_Repository repository;
	public ssn_login savessn(ssn_login ssn) {
		return repository.save(ssn);
	}
	public List<ssn_login> savessns(List<ssn_login> ssns){
		return repository.saveAll(ssns);
	}
	public List<ssn_login> getssns(){
		return repository.findAll();
	}
	public String deletessns(int s_username) {
		repository.deleteById(s_username);
		return "Student removed!! "+s_username;
	}
	public ssn_login updatessn(ssn_login ssn) {
		ssn_login exisitingStudent = repository.findByUsername(ssn.getUsername());
		exisitingStudent.setPassword(ssn.getPassword());
		exisitingStudent.setRole(ssn.getRole());
		return repository.save(exisitingStudent);
	}
}
