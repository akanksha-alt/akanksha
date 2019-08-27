package com.proj.model;

import java.io.Serializable;

public class PropertyDetails implements Serializable
{
	private String OwnerId;
	private String propid;
	private String proptype;
	private String propadd;
	private String proploc;
	private String proprent;
	private String proproom;
	private String propstatus;
	public PropertyDetails() {
		super();
	}
	public String getOwnerId() {
		return OwnerId;
	}
	public void setOwnerId(String ownerId) {
		OwnerId = ownerId;
	}
	public String getPropid() {
		return propid;
	}
	public void setPropid(String propid) {
		this.propid = propid;
	}
	public String getProptype() {
		return proptype;
	}
	public void setProptype(String proptype) {
		this.proptype = proptype;
	}
	public String getProploc() {
		return proploc;
	}
	public void setProploc(String proploc) {
		this.proploc = proploc;
	}
	public String getProprent() {
		return proprent;
	}
	public void setProprent(String proprent) {
		this.proprent = proprent;
	}
	public String getProproom() {
		return proproom;
	}
	public void setProproom(String proproom) {
		this.proproom = proproom;
	}
	public String getPropstatus() {
		return propstatus;
	}
	public void setPropstatus(String propstatus) {
		this.propstatus = propstatus;
	}
	public String getPropadd() {
		return propadd;
	}
	public void setPropadd(String propadd) {
		this.propadd = propadd;
	}
	
}
