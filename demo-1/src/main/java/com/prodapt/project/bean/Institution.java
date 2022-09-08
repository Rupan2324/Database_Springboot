package com.prodapt.project.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="institution")
public class Institution {
	@Id
	private int icode;
	private String iname;
	@Override
	public String toString() {
		return "Institution [icode=" + icode + ", iname=" + iname + "]";
	}
	
	public int getIcode() {
		return icode;
	}
	public void setIcode(int icode) {
		this.icode = icode;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	
}
