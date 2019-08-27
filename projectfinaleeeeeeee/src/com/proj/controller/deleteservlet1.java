package com.proj.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.DBLogic;
import com.proj.model.PropertyDetails;


@WebServlet("/deleteservlet1")
public class deleteservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deleteservlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DBLogic dbobj = new DBLogic();
		List<PropertyDetails> proplist= dbobj.fetchAllUserRecord();
		
		if(proplist.size()>0)
		{
			System.out.println("Property PRESENT "+proplist.size());
			
			request.setAttribute("ulist", proplist);
			
			RequestDispatcher rd = 
				request.getRequestDispatcher("Delete2.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("NO RECORD FOUND");
			request.setAttribute("errormsg", "NO RECORD FOUND");
			RequestDispatcher rd = 
				request.getRequestDispatcher("Delete1.jsp");
			rd.forward(request, response);
		}
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
