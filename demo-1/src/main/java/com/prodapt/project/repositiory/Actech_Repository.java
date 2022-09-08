package com.prodapt.project.repositiory;

import com.prodapt.project.bean.Actech_login;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Actech_Repository extends JpaRepository<Actech_login,String>{
	Actech_login findByName(String name);
}