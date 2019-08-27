package com.proj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proj.dao.DBLogic;
import com.proj.model.OwnerDetaills;


@WebServlet("/AddOwnerServlet")
public class AddOwnerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public AddOwnerServlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 OwnerDetaills ownobj = new OwnerDetaills();
		 ownobj.setOwnermail(request.getParameter("ownermail"));
		 ownobj.setOwnername(request.getParameter("ownername"));
		 ownobj.setOwnerpass(request.getParameter("ownerpass"));
		 ownobj.setOwnerno(request.getParameter("ownerno"));
		 ownobj.setOwneradd(request.getParameter("owneradd"));
		 ownobj.setOwnergender(request.getParameter("ownergender"));
		 
		 DBLogic dbobj =new DBLogic();
		 boolean b= dbobj.addOwner(ownobj);
		 if(b)
		 {
			 System.out.println("owner inserted");
			 RequestDispatcher rd = 
						request.getRequestDispatcher("OwnerLogin.jsp");
					rd.forward(request, response);
		 }
		 else 
			 System.out.println("owner not inserted");
		 RequestDispatcher rd = 
					request.getRequestDispatcher("OwnerReg.jsp");
				rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
