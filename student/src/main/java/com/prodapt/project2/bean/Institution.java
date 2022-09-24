package com.prodapt.project2.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="institution")
public class Institution {
	@Id
	private String college;
	@Column(nullable = false)
	private int icode;
	@Override
	public String toString() {
		return "Institution [college=" + college + ", icode=" + icode + "]";
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getIcode() {
		return icode;
	}
	public void setIcode(int icode) {
		this.icode = icode;
	}
	
	
}
