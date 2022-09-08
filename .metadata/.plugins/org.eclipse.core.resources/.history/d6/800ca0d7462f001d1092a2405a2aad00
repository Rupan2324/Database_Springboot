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
	public String deleteActech_logins(int username) {
		repository.deleteById(username);
		return "Student removed!! "+username;
	}
	public Actech_login updateActech_login(Actech_login actech) {
		Actech_login exisitingStudent1 = repository.findByUsername(actech.getUsername());
		exisitingStudent1.setPassword(actech.getPassword());
		exisitingStudent1.setRole(actech.getRole());
		return repository.save(exisitingStudent1);
	}
}
