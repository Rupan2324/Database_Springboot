package com.prodapt.project.controller;

import java.util.List;

import com.prodapt.project.bean.Kiot_login;
import com.prodapt.project.service.Kiot_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Kiot_Controller {
	@Autowired
	private Kiot_Service k_service;
	@PostMapping("/addkiot")
	public Kiot_login addKiot(@RequestBody Kiot_login kiot) {
		return k_service.saveKiot(kiot);
	}
	@PostMapping("/addkiots")
	public List<Kiot_login> addKiots(@RequestBody List<Kiot_login> kiots){
	    return k_service.saveKiots(kiots);
	}
	@GetMapping("/kiots")
	public List<Kiot_login> findAllKiots(){
	    return k_service.getKiots();
	}
	@PutMapping("/updateKiot")
	public Kiot_login updateKiot(@RequestBody Kiot_login kiot) {
	    return k_service.updateKiot(kiot);
	}
}
