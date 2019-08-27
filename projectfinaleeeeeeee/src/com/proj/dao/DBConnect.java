package com.proj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect 
{ 
    public static Connection getMySQLConnection()
	{
		Connection mysqlconnection = null;
		try 
		{
		   Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) 
		   {System.out.println(e.toString());}
		
	    try 
	    {
	     	mysqlconnection = DriverManager.getConnection
	     	("jdbc:mysql://localhost/HouseRent","root","abc123");
		} catch (SQLException e) {System.out.println(e.toString());}
	    
	    return mysqlconnection;
	}
}