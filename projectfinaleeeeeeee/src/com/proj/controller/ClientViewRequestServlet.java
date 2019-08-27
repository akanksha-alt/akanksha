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
import com.proj.model.ClientDetails;
import com.proj.model.OwnerDetaills;
import com.proj.model.PropertyDetails;
import com.proj.model.RequestDetails;


@WebServlet("/ClientViewRequestServlet")
public class ClientViewRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ClientViewRequestServlet() {
        super();
        // TODO Auto-generated constructor stub
        
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 HttpSession session=request.getSession(false);
		  			
		 ClientDetails owner = (ClientDetails)session.getAttribute("clientinfo");
		 System.out.println(owner.getclientid());
					String Clientmail = owner.getclientid();
					System.out.println(Clientmail);
					DBLogic dbobj = new DBLogic();
			        List<RequestDetails> userlist = 
			        		       dbobj.searchreq(Clientmail);
					
					if(userlist.size()>0)
					{
						System.out.println("USER PRESENT "+userlist.size());
						
						request.setAttribute("ulist", userlist);
						
						RequestDispatcher rd = 
							request.getRequestDispatcher("clientrequestview.jsp");
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
