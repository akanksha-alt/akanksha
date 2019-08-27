package com.proj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.DBLogic;
import com.proj.model.ClientDetails;




@WebServlet("/Clientregisterservlet")
public class Clientregisterservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Clientregisterservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//CREATE OBJECT OF MODEL CLASS
		ClientDetails clientobj = new ClientDetails();
		//RECEIVE VALUE FORM CLIENT & STORE IT WITHIN THE OBJECT 
		clientobj.setclientname(request.getParameter("clientname"));
		clientobj.setclientid(request.getParameter("clientid"));
		clientobj.setclientmobile(request.getParameter("clientmobile"));
		clientobj.setclientpassword(request.getParameter("clientpassword"));
		clientobj.setclientaddress(request.getParameter("clientaddress"));
		clientobj.setclientgender(request.getParameter("clientgender"));
		
		
		DBLogic dbobj = new DBLogic();
		boolean b = dbobj.addClientRecord(clientobj);
		
		if(b)
		{
			System.out.println("RECORD INSERTED");
			 RequestDispatcher rd = 
						request.getRequestDispatcher("Clientlogin.jsp");
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
