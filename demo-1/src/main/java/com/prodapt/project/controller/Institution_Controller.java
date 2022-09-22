package com.prodapt.project.controller;

import java.util.List;

import com.prodapt.project.bean.Institution;
import com.prodapt.project.service.Institution_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/institution")
public class Institution_Controller {
	@Autowired
	private Institution_Service service;
	@PostMapping("/add")
	public ResponseEntity<Institution> addInstitution(@RequestBody Institution Institution) {
		Institution newInstitution = service.addInstitution(Institution);
		return new ResponseEntity<>(newInstitution,HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Institution>> findAllInstitutions() {
		List<Institution> Institutions = service.findAllInstitutions();
		return new ResponseEntity<>(Institutions,HttpStatus.OK);
	}
	@GetMapping("/find/{college}")
	public ResponseEntity<Institution> getEmployeeByCollege(@PathVariable("college") String college) {
		Institution Institutions_id = service.findInstitutionByCollege(college);
		return new ResponseEntity<>(Institutions_id,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Institution> updateInstitution(@RequestBody Institution Institution) {
		Institution updateInstitution = service.updateInstitution(Institution);
		return new ResponseEntity<>(updateInstitution,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{college}")
	public String deleteInstitution(@PathVariable("college") String college) {
		service.deleteInstitutions(college);
		return "Institution removed!! "+college;
	}
}
