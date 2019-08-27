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



@WebServlet("/Searchlocservlet")
public class Searchlocservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Searchlocservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String proploc = request.getParameter("proploc");
		DBLogic dbobj = new DBLogic();
        List<PropertyDetails> userlist = 
        		       dbobj.searchlocation(proploc);
		
		if(userlist.size()>0)
		{
			System.out.println("USER PRESENT "+userlist.size());
			
			request.setAttribute("ulist", userlist);
			
			RequestDispatcher rd = 
				request.getRequestDispatcher("clientlogged.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("NO RECORD FOUND");
			request.setAttribute("errormsg", "NO RECORD FOUND");
			RequestDispatcher rd = 
				request.getRequestDispatcher("Searchbylocation.jsp");
			rd.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
