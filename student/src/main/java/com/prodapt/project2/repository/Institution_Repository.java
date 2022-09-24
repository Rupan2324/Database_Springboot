package com.prodapt.project2.repository;

import java.util.Optional;

import javax.transaction.Transactional;

import com.prodapt.project2.bean.Institution;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Institution_Repository extends JpaRepository<Institution,String>{
	Institution findByCollege(String College);
@Transactional
	void deleteInstitutionByCollege(String college);

	Optional<Institution> findInstitutionByCollege(String college);
}
