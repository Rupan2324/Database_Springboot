package com.prodapt.project.repositiory;

import com.prodapt.project.bean.Admin_login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Admin_Repository  extends JpaRepository<Admin_login,String>{
	Admin_login findByUsername(String username);
}