package com.prodapt.project.service;

import java.util.List;

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
	public String deleteMits(int m_username) {
		repository.deleteById(m_username);
		return "Student removed!! "+m_username;
	}
	public Mit_login updateMit(Mit_login mit) {
		Mit_login exisitingStudent = repository.findByUsername(mit.getUsername());
		exisitingStudent.setPassword(mit.getPassword());
		exisitingStudent.setRole(mit.getRole());
		return repository.save(exisitingStudent);
	}
}
