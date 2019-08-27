package com.proj.model;

import java.io.Serializable;

public class Admindetails implements Serializable
{
	private String adminid;
	private String password;
	public Admindetails() {
		super();
	}
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
