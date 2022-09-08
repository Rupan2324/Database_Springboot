package com.prodapt.project.repositiory;

import com.prodapt.project.bean.Institution;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Institution_Repository extends JpaRepository<Institution,Integer>{
	Institution findByIname(String iname);
}