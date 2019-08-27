package com.proj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.DBLogic;
import com.proj.model.RequestDetails;


@WebServlet("/Requestsubmitservlet")
public class Requestsubmitservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Requestsubmitservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDetails requestobj = new RequestDetails();
		
		//RECEIVE VALUE FORM CLIENT & STORE IT WITHIN THE OBJECT 
		requestobj.setrequestid(request.getParameter("requestid"));
		requestobj.setownerid(request.getParameter("ownerid"));
		requestobj.setpropertyid(request.getParameter("propertyid"));
		requestobj.setclientid(request.getParameter("clientid"));
		requestobj.setdate(request.getParameter("date"));
		requestobj.settime(request.getParameter("time"));
		requestobj.setcomment(request.getParameter("comment"));
		requestobj.setstatus(request.getParameter("status"));
		
		
		DBLogic dbobj = new DBLogic();
		boolean b = dbobj.addRequest(requestobj);
		
		if(b)
		{
			System.out.println("RECORD INSERTED");
			RequestDispatcher rd = 
					request.getRequestDispatcher("Clientwelcome.jsp");
				rd.forward(request, response);
		}
		else
		{
			System.out.println("RECORD NOT INSERTED");
		}
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
