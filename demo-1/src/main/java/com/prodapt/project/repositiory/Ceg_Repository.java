package com.prodapt.project.repositiory;

import com.prodapt.project.bean.Ceg_login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Ceg_Repository extends JpaRepository<Ceg_login,Integer>{
	Ceg_login findByUsername(String username);
}