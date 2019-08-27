package com.proj.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/UpdateRequestServlet")
public class UpdateRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestid = request.getParameter("requestid");
		String propid = request.getParameter("propid");
		
		com.proj.dao.DBLogic dbobj = new com.proj.dao.DBLogic();
        boolean b = dbobj.updaterequest(requestid);
        boolean c=dbobj.updateprop(propid);
		String msg ;
		if(b)
		{
			msg = " Request Updated";
		}
		else
		{
			msg = " Not Updated";
		}
		request.setAttribute("msgkey", msg);
		
		javax.servlet.RequestDispatcher rd = 
			request.getRequestDispatcher("UpdateRequest.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
