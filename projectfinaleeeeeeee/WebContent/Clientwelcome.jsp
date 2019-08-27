<%@page import="com.proj.model.ClientDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="HeaderStyle.css">
<link rel="stylesheet" type="text/css" href="ButtonStyle.css">
<title>Insert title here</title>
<style>
h1{
text-transform: uppercase;
}
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<%! ClientDetails clientobj;  %>

<%
	clientobj = (ClientDetails)session.getAttribute("clientinfo");

	%>
	<div a align="center">
	<h1>WELCOME </h1>
	<br/>
	<br/>
	<h1><%=clientobj.getclientname() %></h1>
     
     <br/>
     <br/>
     
      <div style="color: red;font-weight: bold;">
       <% //SCRIPLET TAG
         if(request.getAttribute("errormsg") != null)
    	      out.print(request.getAttribute("errormsg"));
       %>
     </div>
	<button onclick="location.href='Searchbylocation.jsp';" id="btn-group" class="float-left submit-button"><h2>SEARCH BY LOCATION</h2></button>
	<button onclick="location.href='ClientViewRequestServlet';" id="btn-group" class="button"><h2>View My Request</h2></button>
	<button onclick="location.href='Clientlogin.jsp';" id="btn-group" class="float-left submit-button"><h2>LOGOUT</h2></button>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	</div>
	<hr size="5" color="skyblue">
 <jsp:include page="Footer.html"></jsp:include>
	
</body>
</html>