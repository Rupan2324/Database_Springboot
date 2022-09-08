package com.prodapt.project.service;

import java.util.List;

import com.prodapt.project.bean.Actech_login;
import com.prodapt.project.bean.Mit_login;
import com.prodapt.project.repositiory.Mit_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mit_Service {
	@Autowired
	private Mit_Repository repository;
	public Mit_login saveMit(Mit_login mit) {
		return repository.save(mit);
	}
	public List<Mit_login> saveMits(List<Mit_login> mits){
		return repository.saveAll(mits);
	}
	public List<Mit_login> getMits(){
		return repository.findAll();
	}
	public String deleteMits(String name) {
		repository.deleteById(name);
		return "Student removed!! "+name;
	}
	public Mit_login updateMit(Mit_login mit) {
		Mit_login exisitingStudent1 = repository.findByName(mit.getName());
		exisitingStudent1.setUsername(mit.getUsername());
		exisitingStudent1.setPassword(mit.getPassword());
		exisitingStudent1.setDob(mit.getDob());
		exisitingStudent1.setGender(mit.getGender());
		exisitingStudent1.setDepartment(mit.getDepartment());
		exisitingStudent1.setEmail(mit.getEmail());
		exisitingStudent1.setPhonenumber(mit.getPhonenumber());
		return repository.save(exisitingStudent1);
	}
}
