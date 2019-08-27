package com.proj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.DBLogic;
import com.proj.model.PropertyDetails;



@WebServlet("/Propertyadd")
public class Propertyadd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Propertyadd() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PropertyDetails propobj = new PropertyDetails();
		//RECEIVE VALUE FORM Owner & STORE IT WITHIN THE OBJECT 
		propobj.setOwnerId(request.getParameter("OwnerId"));
		propobj.setPropid(request.getParameter("propid"));
		propobj.setProptype(request.getParameter("proptype"));
		propobj.setPropadd(request.getParameter("propadd"));
		propobj.setProploc(request.getParameter("proploc"));
		propobj.setProprent(request.getParameter("proprent"));
		propobj.setProproom(request.getParameter("proproom"));
		propobj.setPropstatus(request.getParameter("propstatus"));
		DBLogic dbobj = new DBLogic();
		boolean b = dbobj.addRecord(propobj);
		
		if(b)
		{
			System.out.println("RECORD INSERTED");
			RequestDispatcher rd = 
					request.getRequestDispatcher("OwnerLogged.jsp");
				rd.forward(request, response);

			}		
		else
		{
			System.out.println("RECORD NOT INSERTED");
		}
		

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
