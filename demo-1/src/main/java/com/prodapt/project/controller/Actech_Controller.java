package com.prodapt.project.controller;

import java.util.List;

import com.prodapt.project.bean.Actech_login;
import com.prodapt.project.service.Actech_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Actech_Controller {
	@Autowired
	private Actech_Service a_service;
	@PostMapping("/addactech")
	public Actech_login addActech(@RequestBody Actech_login actech) {
		return a_service.saveActech_login(actech);
	}
	@PostMapping("/addactechs")
	public List<Actech_login> addActechs(@RequestBody List<Actech_login> actechs){
	    return a_service.saveActech_logins(actechs);
	}
	@GetMapping("/actechs")
	public List<Actech_login> findAllActechs(){
	    return a_service.getActech_logins();
	}
	@PutMapping("/updateActech")
	public Actech_login updateActech(@RequestBody Actech_login actech) {
	    return a_service.updateActech_login(actech);
	}
}
