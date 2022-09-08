package com.prodapt.project.controller;

import java.util.List;

import com.prodapt.project.bean.Institution;
import com.prodapt.project.service.Institution_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Institution_Controller {
	@Autowired
	private Institution_Service i_service;
	@PostMapping("/addinstitution")
	public Institution addInstitution(@RequestBody Institution institution) {
		return i_service.saveInstitution(institution);
	}
	@PostMapping("/addinstitutions")
	public List<Institution> addInstitutions(@RequestBody List<Institution> institutions){
	    return i_service.saveInstitutions(institutions);
	}
	@GetMapping("/institutions")
	public List<Institution> findAllInstitutions(){
	    return i_service.getInstitutions();
	}
	@PutMapping("/updateInstitution")
	public Institution updateInstitution(@RequestBody Institution institution) {
	    return i_service.updateInstitution(institution);
	}
}
