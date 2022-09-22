package com.prodapt.project.request;

import com.prodapt.project.bean.Admin_login;
import com.prodapt.project.password.Test2;

import org.springframework.boot.jackson.JsonComponent;

@JsonComponent
public class AdminRequest {
private String username;
private String password;

private Test2 t;
public AdminRequest() {
	t=new Test2();
}


public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() throws Exception {
	
	return t.methodEncrypt(password, true);
}
public void setPassword(String password) throws Exception {
	password=t.methodEncrypt(password, false);
	this.password = password;
}
    public Admin_login toAdmin()  {
    	Admin_login a=new Admin_login();
    	a.setUsername(username);
    	a.setPassword(password);
		return a;
    }
}
