package com.prodapt.project.repositiory;

import java.util.Optional;

import javax.transaction.Transactional;

import com.prodapt.project.bean.Institution;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Institution_Repository extends JpaRepository<Institution,String>{
	Institution findByCollege(String College);
@Transactional
	void deleteInstitutionByCollege(String college);

	Optional<Institution> findInstitutionByCollege(String college);
}
