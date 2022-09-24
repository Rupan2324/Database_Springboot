package com.prodapt.project1.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import com.prodapt.project1.bean.Result;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Result_Repository extends JpaRepository<Result,String>{
	Result findByRollno(String rollno);
@Transactional
	void deleteResultByRollno(String rollno);

	Optional<Result> findResultByRollno(String rollno);
}