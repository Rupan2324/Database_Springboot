package com.prodapt.project.repositiory;

import com.prodapt.project.bean.ssn_login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ssn_Repository extends JpaRepository<ssn_login,String>{
	ssn_login findByName(String name);
}