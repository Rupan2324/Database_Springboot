package com.prodapt.project.controller;

import java.util.List;

import com.prodapt.project.bean.Mit_login;
import com.prodapt.project.service.Mit_Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mit_Controller {
	@Autowired
	private Mit_Service m_service;
	@PostMapping("/addmit")
	public Mit_login addMit(@RequestBody Mit_login mit) {
		return m_service.saveMit(mit);
	}
	@PostMapping("/addmits")
	public List<Mit_login> addmits(@RequestBody List<Mit_login> mits){
	    return m_service.saveMits(mits);
	}
	@GetMapping("/mits")
	public List<Mit_login> findAllMits(){
	    return m_service.getMits();
	}
	@PutMapping("/updateMit")
	public Mit_login updateMit(@RequestBody Mit_login mit) {
	    return m_service.updateMit(mit);
	}
}
