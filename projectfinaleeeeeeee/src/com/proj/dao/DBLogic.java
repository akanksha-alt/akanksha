package com.proj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.proj.dao.DBConnect;
import com.proj.model.Admindetails;
import com.proj.model.OwnerDetaills;
import com.proj.model.PropertyDetails;
import com.proj.model.RequestDetails;







public class DBLogic 
{
	public boolean addRecord(PropertyDetails propobj) 
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		boolean f = false;
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	("insert into AddProp values(?,?,?,?,?,?,?,?)");
		     
		   pst.setString(1,propobj.getOwnerId());
	       pst.setString(2,propobj.getPropid());
		   pst.setString(3,propobj.getProptype());
		   pst.setString(4,propobj.getPropadd());
		   pst.setString(5,propobj.getProploc());
		   pst.setString(6,propobj.getProprent());
		   pst.setString(7,propobj.getProproom());
		   pst.setString(8,propobj.getPropstatus());
		   int i = pst.executeUpdate();
		     
		   if(i > 0 )
		   	 f = true;
           
	    }catch(SQLException e){System.out.print(e.toString());}
	    
		return f;
	}
	public boolean addRequest(RequestDetails requestobj) 
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		boolean f = false;
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	("insert into Requestbook values(?,?,?,?,?,?,?,?)");
		     
		   pst.setString(1,requestobj.getrequestid());
		   pst.setString(2,requestobj.getownerid());
		   pst.setString(3,requestobj.getpropertyid());
		   pst.setString(4,requestobj.getclientid());
		   pst.setString(5,requestobj.getdate());
		   pst.setString(6,requestobj.gettime());
		   pst.setString(7,requestobj.getcomment());
		   pst.setString(8,requestobj.getstatus());

		   int i = pst.executeUpdate();
		     
		   if(i > 0 )
		   	 f = true;
           
	    }catch(SQLException e){System.out.print(e.toString());}
	    
		return f;
	}
	/*public List<RequestDetails> costestimation()
	{
		
	}*/
	public List<PropertyDetails> fetchAllUserRecord()
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		List<PropertyDetails> proplist = 
				            new ArrayList<PropertyDetails>();
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	                  ("select * from AddProp");
		   
	       rs = pst.executeQuery();
		   while(rs.next())
		   {
			   PropertyDetails propobj = new PropertyDetails();
			   
			   propobj.setOwnerId(rs.getString(1));
			   propobj.setPropid(rs.getString(2));
			   propobj.setProptype(rs.getString(3));
			   propobj.setPropadd(rs.getString(4));
			   propobj.setProploc(rs.getString(5));
			   propobj.setProprent(rs.getString(6));
			   propobj.setProproom(rs.getString(7));
			   propobj.setPropstatus(rs.getString(8));

			   proplist.add(propobj);//ADD OBJECT TO ARRAYLIST
			}
	    }catch(SQLException e){System.out.print(e.toString());}
	
		System.out.println("No of RECORD "+proplist.size());
		return proplist;
	}
	public List<RequestDetails> ownersearchrequest(String OwnerId)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		//List<PropertyDetails> proplist = 
				           // new ArrayList<PropertyDetails>();
		List<RequestDetails> requestlist = 
	            new ArrayList<RequestDetails>();
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("select * from Requestbook where OwnerId =?");
	       pst.setString(1, OwnerId);
		   
	       rs = pst.executeQuery();
		   while(rs.next())
		   {
			   RequestDetails rqstobj = new RequestDetails();
			   
			   rqstobj.setrequestid(rs.getString(1));
			   rqstobj.setownerid(rs.getString(2));
			   rqstobj.setpropertyid(rs.getString(3));
			   rqstobj.setclientid(rs.getString(4));
			   rqstobj.setdate(rs.getString(5));
			   rqstobj.settime(rs.getString(6));
			   rqstobj.setcomment(rs.getString(7));
			   rqstobj.setstatus(rs.getString(8));
			   requestlist.add(rqstobj);//ADD OBJECT TO ARRAYLIST
			}
	    }catch(SQLException e){System.out.print(e.toString());}
	
		System.out.println("No of RECORD "+requestlist.size());
		return requestlist;
	}
	public boolean deleteUser(String Propertyid)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		boolean f = false;
		
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("delete from AddProp where PropertyId =?");
	       pst.setString(1, Propertyid);
		   
	       int i = pst.executeUpdate();
		   if(i >0)
			   f = true;
		   
		}catch(SQLException e){System.out.print(e.toString());}
			
		return f;
	}
	public boolean updaterequest(String requestid)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		boolean f = false;
		
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("update Requestbook set Status = 'BOOKED'  where RequestId =?");
	       pst.setString(1, requestid);
		   
	       int i = pst.executeUpdate();
		   if(i >0)
			   f = true;
		   
		}catch(SQLException e){System.out.print(e.toString());}
			
		return f;
	}
	
	public boolean updateprop(String propid)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		boolean f = false;
		
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("update AddProp set Status = 'BOOKED'  where PropertyId =?");
	       pst.setString(1, propid);
		   
	       int i = pst.executeUpdate();
		   if(i >0)
			   f = true;
		   
		}catch(SQLException e){System.out.print(e.toString());}
			
		return f;
	}
	public List<com.proj.model.RequestDetails> fetchRequest()
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		List<com.proj.model.RequestDetails> requestlist = 
				            new ArrayList<com.proj.model.RequestDetails>();
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	                  ("select * from Requestbook");
	       
		   
	       rs = pst.executeQuery();
		   while(rs.next())
		   {
			   com.proj.model.RequestDetails requestobj = new com.proj.model.RequestDetails();
			   
			   requestobj.setrequestid(rs.getString(1));
			   requestobj.setownerid(rs.getString(2));
			   requestobj.setpropertyid(rs.getString(3));
			   requestobj.setclientid(rs.getString(4));
			   requestobj.setdate(rs.getString(5));
			   requestobj.settime(rs.getString(6));
			   requestobj.setcomment(rs.getString(7));
			   requestobj.setstatus(rs.getString(8));

			   requestlist.add(requestobj);//ADD OBJECT TO ARRAYLIST
			}
	    }catch(SQLException e){System.out.print(e.toString());}
	
		System.out.println("No of RECORD "+requestlist.size());
		return requestlist;
	}
	
	public boolean addClientRecord(com.proj.model.ClientDetails clientobj) 
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		boolean f = false;
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	("insert into ClientDetails values(?,?,?,?,?,?)");
		     
		   pst.setString(1,clientobj.getclientid());
		   pst.setString(2,clientobj.getclientname());
		   pst.setString(3,clientobj.getclientpassword());
		   pst.setString(4,clientobj.getclientmobile());
		   pst.setString(5,clientobj.getclientaddress());
		   pst.setString(6,clientobj.getclientgender());
		   
		   int i = pst.executeUpdate();
		     
		   if(i > 0 )
		   	 f = true;
           
	    }catch(SQLException e){System.out.print(e.toString());}
	    
		return f;
	}
	public List<Admindetails> searchLogicRecord(String adminid,String password)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		List<Admindetails> userlist = 
				            new ArrayList<Admindetails>();
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("select * from adminlogin where AdminId =? and Password =?");
	       pst.setString(1, adminid);
	       pst.setString(2, password);
	       rs = pst.executeQuery();
		   while(rs.next())
		   {
			   Admindetails userobj = new Admindetails();
			   
			   userobj.setAdminid(rs.getString(1));
			   userobj.setPassword(rs.getString(2));
			   userlist.add(userobj);//ADD OBJECT TO ARRAYLIST
			}
	    }catch(SQLException e){System.out.print(e.toString());}
	
		System.out.println("No of RECORD "+userlist.size());
		return userlist;
	}
	public List<PropertyDetails> searchproperty(String OwnerId)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		List<PropertyDetails> proplist = 
				            new ArrayList<PropertyDetails>();
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("select * from AddProp where OwnerId =?");
	       pst.setString(1, OwnerId);
		   
	       rs = pst.executeQuery();
		   while(rs.next())
		   {
			   PropertyDetails propobj = new PropertyDetails();
			   
			   propobj.setOwnerId(rs.getString(1));
			   propobj.setPropid(rs.getString(2));
			   propobj.setProptype(rs.getString(3));
			   propobj.setPropadd(rs.getString(4));
			   propobj.setProploc(rs.getString(5));
			   propobj.setProprent(rs.getString(6));
			   propobj.setProproom(rs.getString(7));
			   propobj.setPropstatus(rs.getString(8));
			   proplist.add(propobj);//ADD OBJECT TO ARRAYLIST
			}
	    }catch(SQLException e){System.out.print(e.toString());}
	
		System.out.println("No of RECORD "+proplist.size());
		return proplist;
	}
	public List<RequestDetails> searchreq(String ClientId )
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		List<RequestDetails> proplist = 
				            new ArrayList<RequestDetails>();
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("select * from Requestbook where ClientId  =?");
	       pst.setString(1, ClientId );
		   
	       rs = pst.executeQuery();
		   while(rs.next())
		   {
			   RequestDetails propobj = new RequestDetails();
			   
			   propobj.setrequestid(rs.getString(1));
			   propobj.setownerid(rs.getString(2));
			   propobj.setpropertyid(rs.getString(3));
			   propobj.setclientid(rs.getString(4));
			   propobj.setstatus(rs.getString(8));
			   
			   proplist.add(propobj);//ADD OBJECT TO ARRAYLIST
			}
	    }catch(SQLException e){System.out.print(e.toString());}
	
		System.out.println("No of RECORD "+proplist.size());
		return proplist;
	}
	public List<PropertyDetails> searchlocation(String proploc)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		List<PropertyDetails> proplist = 
				            new ArrayList<PropertyDetails>();
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("select * from AddProp where location =?");
	       pst.setString(1, proploc);
		   
	       rs = pst.executeQuery();
		   while(rs.next())
		   {
			   PropertyDetails propobj = new PropertyDetails();
			   
			   propobj.setOwnerId(rs.getString(1));
			   propobj.setPropid(rs.getString(2));
			   propobj.setProptype(rs.getString(3));
			   propobj.setPropadd(rs.getString(4));
			   propobj.setProploc(rs.getString(5));
			   propobj.setProprent(rs.getString(6));
			   propobj.setProproom(rs.getString(7));
			   propobj.setPropstatus(rs.getString(8));
			   if(rs.getString(8).equals("BOOKED"))
			   {}
			   else
			      proplist.add(propobj);//ADD OBJECT TO ARRAYLIST
			}
	    }catch(SQLException e){System.out.print(e.toString());}
	
		System.out.println("No of RECORD "+proplist.size());
		return proplist;
	}
	public List<PropertyDetails> viewbookedprop(String propid)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		List<PropertyDetails> proplist = 
				            new ArrayList<PropertyDetails>();
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("select * from AddProp where PropertyId =?");
	       pst.setString(1, propid);
		   
	       rs = pst.executeQuery();
		   while(rs.next())
		   {
			   PropertyDetails propobj = new PropertyDetails();
			   
			   propobj.setOwnerId(rs.getString(1));
			   propobj.setPropid(rs.getString(2));
			   propobj.setProptype(rs.getString(3));
			   propobj.setPropadd(rs.getString(4));
			   propobj.setProploc(rs.getString(5));
			   propobj.setProprent(rs.getString(6));
			   propobj.setProproom(rs.getString(7));
			   propobj.setPropstatus(rs.getString(8));
			   //if(rs.getString(8).equals("BOOKED"))
			  //{}
			  //else
			      proplist.add(propobj);//ADD OBJECT TO ARRAYLIST
			}
	    }catch(SQLException e){System.out.print(e.toString());}
	
		System.out.println("No of RECORD "+proplist.size());
		return proplist;
	}
	public com.proj.model.ClientDetails loginCheck(String clientid,String chientpassword)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		com.proj.model.ClientDetails clientobj = null;
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("select * from ClientDetails where clientid =? and password =?");
	       pst.setString(1, clientid);
		   pst.setString(2, chientpassword);
	       rs = pst.executeQuery();
		   if(rs.next())
		   {
			   clientobj = new com.proj.model.ClientDetails();
			   
			   clientobj.setclientid(rs.getString(1));
			   clientobj.setclientname(rs.getString(2));
			   //clientobj.setclientpassword(rs.getString(3));
			   clientobj.setclientmobile(rs.getString(4));
			   clientobj.setclientaddress(rs.getString(5));
			   clientobj.setclientgender(rs.getString(6));
			   

			  
			}
	    }catch(SQLException e){System.out.print(e.toString());}
	
		
		return clientobj;
	}
	public boolean addOwner(OwnerDetaills ownobj)
	{
		Connection conobj=null;
		PreparedStatement pst = null;
		boolean f = false;
		try
		{
			conobj = DBConnect.getMySQLConnection();
			pst = conobj.prepareStatement("insert into OwnerDetails values(?,?,?,?,?,?)");
			
			pst.setString(1, ownobj.getOwnermail());
			pst.setString(2, ownobj.getOwnername());
			pst.setString(3, ownobj.getOwnerpass());
			pst.setString(4, ownobj.getOwnerno());
			pst.setString(5, ownobj.getOwneradd());
			pst.setString(6, ownobj.getOwnergender());
			int i = pst.executeUpdate();
			
			if(i>0)
				f=true;
		}
		catch(SQLException e) {System.out.println(e.toString());}
		
		return f;
	}
	public OwnerDetaills OwnerLogin(String Ownermail,String Ownerpass)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		OwnerDetaills Ownerobj = 
				            null;
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("select * from OwnerDetails where OwnerId =? and Password=?");
	       pst.setString(1, Ownermail);
	       pst.setString(2, Ownerpass);
		   
	       rs = pst.executeQuery();
		   while(rs.next())
		   {
			   Ownerobj = new OwnerDetaills();
			   
			   Ownerobj.setOwnermail(rs.getString(1));
			   Ownerobj.setOwnername(rs.getString(2));
			   //Ownerobj.setOwnerpass(rs.getString(3));
			   Ownerobj.setOwnerno(rs.getString(4));
			   Ownerobj.setOwneradd(rs.getString(5));
			   Ownerobj.setOwnergender(rs.getString(6));

			 
			}
	    }catch(SQLException e){System.out.print(e.toString());}
	
		return Ownerobj;

	}
	/*public boolean updaterequest(String requestid)
	{
		Connection conobj = null;
		PreparedStatement pst = null;
		boolean f = false;
		
		try
		{
	       conobj = DBConnect.getMySQLConnection();
		   
	       pst = conobj.prepareStatement
	    	 ("update Request set Status = 'Approve'  where RequestId =?");
	       pst.setString(1, requestid);
		   
	       int i = pst.executeUpdate();
		   if(i >0)
			   f = true;
		   
		}catch(SQLException e){System.out.print(e.toString());}
			
		return f;
	}*/
}
