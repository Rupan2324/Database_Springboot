package com.prodapt.project.repositiory;

import java.util.Optional;

import javax.transaction.Transactional;

import com.prodapt.project.bean.Student_login;

import org.springframework.data.jpa.repository.JpaRepository;


public interface Student_Repository extends JpaRepository<Student_login,String>{
	Student_login findByRegno(String regno);
	Optional<Student_login> findStudentByRegno(String regno);
	@Transactional
	void deleteByRegno(String regno);
	Student_login findByRegnoAndPassword(String regno, String password);
}