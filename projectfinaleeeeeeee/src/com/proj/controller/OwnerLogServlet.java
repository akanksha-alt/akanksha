package com.proj.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.proj.dao.DBLogic;
import com.proj.model.OwnerDetaills;
import com.proj.model.PropertyDetails;


@WebServlet("/OwnerLogServlet")
public class OwnerLogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public OwnerLogServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String Ownermail = request.getParameter("Ownermail");
		String Ownerpass = request.getParameter("Ownerpass");
		DBLogic dbobj = new DBLogic();
		OwnerDetaills Ownerobj = dbobj.OwnerLogin(Ownermail,Ownerpass);
		
	
	if(Ownerobj!=null )
		{
		
			System.out.println("WELCOME USER");
			HttpSession session=request.getSession(true);
			session.setAttribute("ownerinfo", Ownerobj);
			response.sendRedirect("OwnerLogged.jsp");
		}
		else
		{
			System.out.println("INVALID UID OR PASS");
		
		request.setAttribute("errormsg", "INVALID UID OR PASS");
		
		RequestDispatcher rd = 
			    request.getRequestDispatcher("OwnerLogin.jsp");
		  rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
