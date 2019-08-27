package com.proj.model;

import java.io.Serializable;

public class OwnerDetaills implements Serializable   
{
	private String Ownermail;
	private String Ownername;
	private String Ownerpass;
	private String Ownerno;
	private String Owneradd;
	private String Ownergender;
	
	public OwnerDetaills() 
	{
		super();
	}
	public String getOwnermail()
	{
		return Ownermail;
	}
	public void setOwnermail(String Ownermail)
	{
		this.Ownermail=Ownermail;
	}
	
	public String getOwnername()
	{
		return Ownername;
	}
	public void setOwnername(String Ownername)
	{
		this.Ownername = Ownername;
	}
	
	public String getOwnerpass()
	{
		return Ownerpass;
	}
	public void setOwnerpass(String Ownerpass)
	{
		this.Ownerpass = Ownerpass;
	}
	
	public String getOwnerno()
	{
		return Ownerno;
	}
	public void setOwnerno(String Ownerno)
	{
		this.Ownerno = Ownerno;
	}
	
	public String getOwneradd()
	{
		return Owneradd;
	}
	public void setOwneradd(String Owneradd)
	{
		this.Owneradd = Owneradd;
	}
	
	public String getOwnergender()
	{
		return Ownergender;
	}
	public void setOwnergender(String Ownergender)
	{
		this.Ownergender = Ownergender;
	}
}
