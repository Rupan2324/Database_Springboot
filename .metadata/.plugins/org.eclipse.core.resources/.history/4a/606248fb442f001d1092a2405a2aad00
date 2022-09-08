package com.prodapt.project.service;

import java.util.List;

import com.prodapt.project.bean.Kiot_login;
import com.prodapt.project.repositiory.Kiot_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Kiot_Service {
	@Autowired
	private Kiot_Repository repository;
	public Kiot_login saveKiot(Kiot_login kiot) {
		return repository.save(kiot);
	}
	public List<Kiot_login> saveKiots(List<Kiot_login> kiots){
		return repository.saveAll(kiots);
	}
	public List<Kiot_login> getKiots(){
		return repository.findAll();
	}
	public String deleteKiots(int k_username) {
		repository.deleteById(k_username);
		return "Student removed!! "+k_username;
	}
	public Kiot_login updateKiot(Kiot_login kiot) {
		Kiot_login exisitingStudent = repository.findByUsername(kiot.getUsername());
		exisitingStudent.setPassword(kiot.getPassword());
		exisitingStudent.setRole(kiot.getRole());
		return repository.save(exisitingStudent);
	}
}
