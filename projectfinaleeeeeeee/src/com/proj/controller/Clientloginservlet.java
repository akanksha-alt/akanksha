package com.proj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proj.dao.DBLogic;
import com.proj.model.ClientDetails;




@WebServlet("/Clientloginservlet")
public class Clientloginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Clientloginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clientid = request.getParameter("clientid");
		String clientpassword = request.getParameter("clientpassword");
		
		DBLogic dbobj= new DBLogic();
		ClientDetails clientobj = dbobj.loginCheck(clientid, clientpassword);
		
		if(clientobj!=null)
		{
			System.out.println("WELCOME ADMIN");
			HttpSession session = request.getSession(true);
			session.setAttribute("clientinfo", clientobj);
			//session.setMaxInactiveInterval(1000);    // For automatically logout after a limited time
			response.sendRedirect("Clientwelcome.jsp");
				
		}
		else
		{
			System.out.println("INVALID USER ID OR PASSWORD");
			
			request.setAttribute("errormsg", "INVALID USER ID OR PASSWORD");
			
			RequestDispatcher rd = 
				    request.getRequestDispatcher("ClientLogin.jsp");
			if(rd != null)
			  rd.forward(request, response);
			else
				System.out.println("Wrong File Name");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
