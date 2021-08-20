package com.byyname;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee 
{
	private int eid;
	private String ename;
	
	@Autowired
	private Department edept;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Department getEdept() {
		return edept;
	}
	public void setEdept(Department edept) {
		this.edept = edept;
	}
	

}
