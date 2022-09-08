package com.prodapt.project.service;

import java.util.List;

import com.prodapt.project.bean.Actech_login;
import com.prodapt.project.repositiory.Actech_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Actech_Service {
	@Autowired
	private Actech_Repository repository;
	public Actech_login saveActech_login(Actech_login actech) {
		return repository.save(actech);
	}
	public List<Actech_login> saveActech_logins(List<Actech_login> actechs){
		return repository.saveAll(actechs);
	}
	public List<Actech_login> getActech_logins(){
		return repository.findAll();
	}
	public String deleteActech_logins(String name) {
		repository.deleteById(name);
		return "Student removed!! "+name;
	}
	public Actech_login updateActech_login(Actech_login actech) {
		Actech_login exisitingStudent1 = repository.findByName(actech.getName());
		exisitingStudent1.setUsername(actech.getUsername());
		exisitingStudent1.setPassword(actech.getPassword());
		exisitingStudent1.setDob(actech.getDob());
		exisitingStudent1.setGender(actech.getGender());
		exisitingStudent1.setDepartment(actech.getDepartment());
		exisitingStudent1.setEmail(actech.getEmail());
		exisitingStudent1.setPhonenumber(actech.getPhonenumber());
		return repository.save(exisitingStudent1);
	}
}
