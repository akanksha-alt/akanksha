package com.proj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.DBLogic;


@WebServlet("/Deleteservlet2")
public class Deleteservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Deleteservlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Propertyid = request.getParameter("Propertyid");
		DBLogic dbobj = new DBLogic();
        boolean b = dbobj.deleteUser(Propertyid);
		
		if(b)
		{
		    RequestDispatcher rd = 
				request.getRequestDispatcher("deleteservlet1");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
