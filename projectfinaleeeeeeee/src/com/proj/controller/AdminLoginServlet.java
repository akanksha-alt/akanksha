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

import com.proj.model.Admindetails;



@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String useremail = request.getParameter("adminid");
		String userpass = request.getParameter("password");
		
		DBLogic dbobj = new DBLogic();
        List<Admindetails> userlist = 
        		       dbobj.searchLogicRecord(useremail, userpass);
		
		if(userlist.size()>0)
		{
			System.out.println("USER PRESENT "+userlist.size());
			HttpSession session=request.getSession(true);
			session.setAttribute("ownerinfo", userlist);
			response.sendRedirect("AdminLogged.jsp");
		}
		else
		{
			System.out.println("NO RECORD FOUND");
			request.setAttribute("errormsg", "NO RECORD FOUND");
			RequestDispatcher rd = 
				request.getRequestDispatcher("AdminLogin.jsp");
			rd.forward(request, response);
		}
		
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
