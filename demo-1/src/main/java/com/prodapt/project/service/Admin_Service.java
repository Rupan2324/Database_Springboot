package com.prodapt.project.service;

import java.util.List;

import com.prodapt.project.bean.Admin_login;
import com.prodapt.project.bean.Student_login;
import com.prodapt.project.exception.UserNotFoundException;
import com.prodapt.project.repositiory.Admin_Repository;
import com.prodapt.project.request.AdminRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Admin_Service {
	@Autowired
	private Admin_Repository repository;
	public Admin_login addAdmin(Admin_login admin) {
		return repository.save(admin);
	}
	public List<Admin_login> findAllAdmin(){
		return repository.findAll();
	}
	public void deleteAdmin(String username) {
		repository.deleteAdminByUsername(username);
	}
	public Admin_login findAdminByUsername(String username) {
		return repository.findAdminByUsername(username)
				.orElseThrow(()->new UserNotFoundException("admin by username "+username+" was not found"));
	}
	public Admin_login updateAdmin(AdminRequest a) throws Exception {
		Admin_login exisitingAdmin = repository.findByUsername(a.getUsername());
	
		exisitingAdmin.setPassword(a.getPassword());
	
		return repository.save(exisitingAdmin);
	}
	  public Admin_login findByUsernameAndPassword(String username,String password) {
	        return repository.findByUsernameAndPassword(username,password);
	        
	    }

}
