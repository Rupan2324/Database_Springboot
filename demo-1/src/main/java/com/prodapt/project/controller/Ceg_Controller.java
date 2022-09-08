package com.prodapt.project.controller;

import java.util.List;

import com.prodapt.project.bean.Ceg_login;
import com.prodapt.project.service.Ceg_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ceg_Controller {
	@Autowired
	private Ceg_Service c_service;
	@PostMapping("/addceg")
	public Ceg_login addCeg(@RequestBody Ceg_login ceg) {
		return c_service.saveCeg(ceg);
	}
	@PostMapping("/addcegs")
	public List<Ceg_login> addCegs(@RequestBody List<Ceg_login> cegs){
	    return c_service.saveCegs(cegs);
	}
	@GetMapping("/cegs")
	public List<Ceg_login> findAllCegs(){
	    return c_service.getCegs();
	}
	@PutMapping("/updateCeg")
	public Ceg_login updateCeg(@RequestBody Ceg_login ceg) {
	    return c_service.updateCeg(ceg);
	}
}
