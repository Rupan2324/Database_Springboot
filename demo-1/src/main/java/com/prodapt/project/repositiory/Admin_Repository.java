package com.prodapt.project.repositiory;

import java.util.Optional;

import javax.transaction.Transactional;

import com.prodapt.project.bean.Admin_login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Admin_Repository  extends JpaRepository<Admin_login,String>{
	Admin_login findByUsername(String username);
@Transactional
	void deleteAdminByUsername(String username);

	Optional<Admin_login> findAdminByUsername(String username);
	Admin_login findByUsernameAndPassword(String username, String password);

}