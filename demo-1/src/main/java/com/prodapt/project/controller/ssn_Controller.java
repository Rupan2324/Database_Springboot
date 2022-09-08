package com.prodapt.project.controller;

import java.util.List;

import com.prodapt.project.bean.ssn_login;
import com.prodapt.project.service.ssn_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ssn_Controller {
	@Autowired
	private ssn_Service s_service;
	@PostMapping("/addssn")
	public ssn_login addssn(@RequestBody ssn_login ssn) {
		return s_service.savessn(ssn);
	}
	@PostMapping("/addssns")
	public List<ssn_login> addssns(@RequestBody List<ssn_login> ssns){
	    return s_service.savessns(ssns);
	}
	@GetMapping("/ssns")
	public List<ssn_login> findAllssns(){
	    return s_service.getssns();
	}
	@PutMapping("/updateSsn")
	public ssn_login updatessn(@RequestBody ssn_login ssn) {
	    return s_service.updatessn(ssn);
	}
}
