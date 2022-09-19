package com.prodapt.project.controller;

import java.util.List;

import com.prodapt.project.bean.Admin_login;
import com.prodapt.project.bean.Student_login;
import com.prodapt.project.service.Admin_Service;

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
@RequestMapping("/admin")
public class Admin_Controller {
	@Autowired
	private Admin_Service service;
	@PostMapping("/add")
	public ResponseEntity<Admin_login> addAdmin(@RequestBody Admin_login Admin) {
		Admin_login newAdmin = service.addAdmin(Admin);
		return new ResponseEntity<>(newAdmin,HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<Admin_login>> findAllAdmins() {
		List<Admin_login> Admins = service.findAllAdmin();
		return new ResponseEntity<>(Admins,HttpStatus.OK);
	}
	@GetMapping("/find/{username}")
	public ResponseEntity<Admin_login> getEmployeeByUsername(@PathVariable("username") String username) {
		Admin_login Admins_id = service.findAdminByUsername(username);
		return new ResponseEntity<>(Admins_id,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Admin_login> updateAdmin(@RequestBody Admin_login Admin) {
		Admin_login updateAdmin = service.updateAdmin(Admin);
		return new ResponseEntity<>(updateAdmin,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{username}")
	public String deleteAdmin(@PathVariable("username") String username) {
		service.deleteAdmin(username);
		return "Admin removed!! "+username;
	}
	@PostMapping("/adminlogin")
	public Admin_login adminlogin(@RequestBody Admin_login admin) throws Exception {
		 String tempusername = admin.getUsername();
         String temppassword = admin.getPassword();
         Admin_login adminObj=null;
         if(tempusername!=null && temppassword!=null)
         {
        	 adminObj=service.findByUsernameAndPassword(tempusername, temppassword);
         }
         if(adminObj == null) {
             throw new Exception("Wrong credentials");
         }
         return adminObj;
     }
	
}
