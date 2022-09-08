package com.prodapt.project.repositiory;

import com.prodapt.project.bean.Kiot_login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Kiot_Repository extends JpaRepository<Kiot_login,Integer>{
	Kiot_login findByUsername(String username);
}