package com.proj.model;

import java.io.Serializable;

public class ClientDetails implements Serializable{
	private String clientid;
	private String clientname;
	private String clientpassword;
	private String clientmobile;
	private String clientaddress;
	private String clientgender;
	
	public ClientDetails() {
		super();
	}

	public String getclientid() {
		return clientid;
	}

	public void setclientid(String clientid) {
		this.clientid = clientid;
	}
	public String getclientname() {
		return clientname;
	}

	public void setclientname(String clientname) {
		this.clientname = clientname;
	}

	public String getclientpassword() {
		return clientpassword;
	}

	public void setclientpassword(String clientpassword) {
		this.clientpassword = clientpassword;
	}

	public String getclientmobile() {
		return clientmobile;
	}

	public void setclientmobile(String clientmobile) {
		this.clientmobile = clientmobile;
	}

	public String getclientaddress() {
		return clientaddress;
	}

	public void setclientaddress(String clientaddress) {
		this.clientaddress = clientaddress;
	}

	public String getclientgender() {
		return clientgender;
	}

	public void setclientgender(String clientgender) {
		this.clientgender = clientgender;
	}

	
	
}
