package com.proj.model;

public class RequestDetails {
	private String requestid;
	private String ownerid;
	private String propertyid;
	private String clientid;
	private String date;
	private String time;
	private String comment;
	private String status;
	
	public RequestDetails() {
		super();
	}

	public String getrequestid() {
		return requestid;
	}

	public void setrequestid(String requestid) {
		this.requestid = requestid;
	}
	public String getownerid() {
		return ownerid;
	}

	public void setownerid(String ownerid) {
		this.ownerid = ownerid;
	}

	public String getpropertyid() {
		return propertyid;
	}

	public void setpropertyid(String propertyid) {
		this.propertyid = propertyid;
	}

	public String getclientid() {
		return clientid;
	}

	public void setclientid(String clientid) {
		this.clientid = clientid;
	}

	public String getdate() {
		return date;
	}

	public void setdate(String date) {
		this.date = date;
	}

	public String gettime() {
		return time;
	}

	public void settime(String time) {
		this.time = time;
	}
	
	public String getcomment() {
		return comment;
	}

	public void setcomment(String comment) {
		this.comment = comment;
	}
	
	public String getstatus() {
		return status;
	}

	public void setstatus(String status) {
		this.status = status;
	}

}
