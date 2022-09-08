package com.prodapt.project.repositiory;

import com.prodapt.project.bean.Mit_login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Mit_Repository extends JpaRepository<Mit_login,Integer>{
	Mit_login findByUsername(String username);
}