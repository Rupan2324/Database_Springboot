package com.prodapt.project.controller;

import java.util.List;

import com.prodapt.project.bean.Admin_login;
import com.prodapt.project.service.Admin_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin_Controller {
	@Autowired
	private Admin_Service service;
	@PostMapping("/addadmin")
	public Admin_login addAdmin(@RequestBody Admin_login admin) {
		return service.saveAdmin(admin);
	}
	@PostMapping("/addadmins")
	public List<Admin_login> addAdmins(@RequestBody List<Admin_login> admins){
	    return service.saveAdmins(admins);
	}
	@GetMapping("/admins")
	public List<Admin_login> findAllAdmins(){
	    return service.getAdmins();
	}
	@PutMapping("/updateAdmin")
	public Admin_login updateAdmin(@RequestBody Admin_login admin) {
	    return service.updateAdmin(admin);
	}
}