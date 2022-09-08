package com.prodapt.project.service;

import java.util.List;

import com.prodapt.project.bean.Actech_login;
import com.prodapt.project.bean.Ceg_login;
import com.prodapt.project.repositiory.Ceg_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ceg_Service {
	@Autowired
	private Ceg_Repository repository;
	public Ceg_login saveCeg(Ceg_login ceg) {
		return repository.save(ceg);
	}
	public List<Ceg_login> saveCegs(List<Ceg_login> cegs){
		return repository.saveAll(cegs);
	}
	public List<Ceg_login> getCegs(){
		return repository.findAll();
	}
	public String deleteCegs(String name) {
		repository.deleteById(name);
		return "Student removed!! "+name;
	}
	public Ceg_login updateCeg(Ceg_login ceg) {
		Ceg_login exisitingStudent1 = repository.findByName(ceg.getName());
		exisitingStudent1.setUsername(ceg.getUsername());
		exisitingStudent1.setPassword(ceg.getPassword());
		exisitingStudent1.setDob(ceg.getDob());
		exisitingStudent1.setGender(ceg.getGender());
		exisitingStudent1.setDepartment(ceg.getDepartment());
		exisitingStudent1.setEmail(ceg.getEmail());
		exisitingStudent1.setPhonenumber(ceg.getPhonenumber());
		return repository.save(exisitingStudent1);
	}
}
