package com.prodapt.project.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Admin_login {
@Id
private String username;
private String password;
private String college;
@Override
public String toString() {
	return "Admin_login [username=" + username + ", password=" + password + ", college=" + college + "]";
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}

}
