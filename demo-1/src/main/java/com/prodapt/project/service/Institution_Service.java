package com.prodapt.project.service;

import java.util.List;

import com.prodapt.project.bean.Institution;
import com.prodapt.project.repositiory.Institution_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Institution_Service {
	@Autowired
	private Institution_Repository repository;
	public Institution saveInstitution(Institution institution) {
		return repository.save(institution);
	}
	public List<Institution> saveInstitutions(List<Institution> institutions){
		return repository.saveAll(institutions);
	}
	public List<Institution> getInstitutions(){
		return repository.findAll();
	}
	public String deleteInstitutions(int i_code) {
		repository.deleteById(i_code);
		return "Student removed!! "+i_code;
	}
	public Institution updateInstitution(Institution institution) {
		Institution exisitingStudent1 = repository.findById(institution.getIcode()).orElse(null);
		exisitingStudent1.setIname(institution.getIname());
		return repository.save(exisitingStudent1);
	}
}
