package com.prodapt.project.service;

import java.util.List;

import com.prodapt.project.bean.Institution;
import com.prodapt.project.bean.Result;
import com.prodapt.project.exception.UserNotFoundException;
import com.prodapt.project.repositiory.Institution_Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Institution_Service {
	@Autowired
	private Institution_Repository repository;
	public Institution addInstitution(Institution institution) {
		return repository.save(institution);
	}
	public List<Institution> addInstitutions(List<Institution> institutions){
		return repository.saveAll(institutions);
	}
	public List<Institution> findAllInstitutions(){
		return repository.findAll();
	}
	public String deleteInstitutions(String college) {
		repository.deleteInstitutionByCollege(college);
		return "Institution removed!! "+college;
	}
	public Institution findInstitutionByCollege(String college) {
		return repository.findInstitutionByCollege(college)
				.orElseThrow(()->new UserNotFoundException("Institution by college "+college+" was not found"));
	}
	public Institution updateInstitution(Institution institution) {
		Institution exisitingInstitution = repository.findByCollege(institution.getCollege());
		exisitingInstitution.setIcode(institution.getIcode());
		return repository.save(exisitingInstitution);
	}
}
