package com.prodapt.project.service;

import java.util.List;

import com.prodapt.project.bean.Actech_login;
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
	public String deletessns(String name) {
		repository.deleteById(name);
		return "Student removed!! "+name;
	}
	public ssn_login updatessn(ssn_login ssn) {
		ssn_login exisitingStudent1 = repository.findByName(ssn.getName());
		exisitingStudent1.setUsername(ssn.getUsername());
		exisitingStudent1.setPassword(ssn.getPassword());
		exisitingStudent1.setDob(ssn.getDob());
		exisitingStudent1.setGender(ssn.getGender());
		exisitingStudent1.setDepartment(ssn.getDepartment());
		exisitingStudent1.setEmail(ssn.getEmail());
		exisitingStudent1.setPhonenumber(ssn.getPhonenumber());
		return repository.save(exisitingStudent1);
	}
}
