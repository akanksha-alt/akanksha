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
import com.proj.model.RequestDetails;


@WebServlet("/OwnerViewRequestServlet")
public class OwnerViewRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public OwnerViewRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session=request.getSession(false);
		OwnerDetaills owner = (OwnerDetaills)session.getAttribute("ownerinfo");

		String Ownermail = owner.getOwnermail();
		System.out.println(Ownermail);
		DBLogic dbobj = new DBLogic();
        List<RequestDetails> userlist = 
        		       dbobj.ownersearchrequest(Ownermail);
		
		if(userlist.size()>0)
		{
			System.out.println("USER PRESENT "+userlist.size());
			
			request.setAttribute("rlist", userlist);
			
			RequestDispatcher rd = 
				request.getRequestDispatcher("OwnerViewRequest.jsp");
			rd.forward(request, response);
		}
		else
		{
			System.out.println("NO RECORD FOUND");
			request.setAttribute("errormsg", "NO RECORD FOUND");
			RequestDispatcher rd = 
				request.getRequestDispatcher("OwnerLogged.jsp");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
