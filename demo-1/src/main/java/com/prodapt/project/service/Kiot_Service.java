package com.prodapt.project.service;

import java.util.List;

import com.prodapt.project.bean.Actech_login;
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
	public String deleteKiots(String name) {
		repository.deleteById(name);
		return "Student removed!! "+name;
	}
	public Kiot_login updateKiot(Kiot_login kiot) {
		Kiot_login exisitingStudent1 = repository.findByName(kiot.getName());
		exisitingStudent1.setUsername(kiot.getUsername());
		exisitingStudent1.setPassword(kiot.getPassword());
		exisitingStudent1.setDob(kiot.getDob());
		exisitingStudent1.setGender(kiot.getGender());
		exisitingStudent1.setDepartment(kiot.getDepartment());
		exisitingStudent1.setEmail(kiot.getEmail());
		exisitingStudent1.setPhonenumber(kiot.getPhonenumber());
		return repository.save(exisitingStudent1);
	}
}
