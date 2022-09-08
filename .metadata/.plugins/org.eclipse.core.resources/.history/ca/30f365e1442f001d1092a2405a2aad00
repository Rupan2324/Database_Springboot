package com.prodapt.project.service;

import java.util.List;

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
	public String deleteCegs(int c_username) {
		repository.deleteById(c_username);
		return "Student removed!! "+c_username;
	}
	public Ceg_login updateCeg(Ceg_login ceg) {
		Ceg_login exisitingStudent = repository.findByUsername(ceg.getUsername());
		exisitingStudent.setPassword(ceg.getPassword());
		exisitingStudent.setRole(ceg.getRole());
		return repository.save(exisitingStudent);
	}
}
