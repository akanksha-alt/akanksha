<%@page import="com.proj.model.PropertyDetails"%>
<%@page import="com.proj.model.OwnerDetaills"%>
<%@page import="java.util.List"%>
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
text-transform: uppercase;}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<hr size="5" color="skyblue">
<div align="center">
<h1>welcome</h1>

<%! OwnerDetaills Ownobj;  %>

<%
	Ownobj = (OwnerDetaills)session.getAttribute("ownerinfo");

	%>
<h1><%=Ownobj.getOwnername() %></h1>
 <% List<PropertyDetails> proplist = (List<PropertyDetails>)request.getAttribute("ulist");
   %>
    <br/>
	<br/>
	<br/>
	<br/>
	<br/>
 
   <table>
 <tr>
 <td><button onclick="location.href='AddProperty.jsp';" id="btn-group" class="button"><h2>Add New Property</h2></button></td>
 
 <td><button onclick="location.href='OwnerViewPropServlet';" id="btn-group" class="button"><h2>View my property</h2></button></td>

<td><button onclick="location.href='OwnerViewRequestServlet';" id="btn-group" class="button"><h2>View REQUESTS</h2></button></td>
 </tr>
 <td></td>
 
 </table>
  <br/>
	<br/>
	<br/>
	<br/>
	<br/>
   <button onclick="location.href='OwnerLogin.jsp';" id="btn-group" class="button"><h2>LOGOUT</h2></button>
  </div>
  </br>
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
 	<hr size="5" color="skyblue">
 <jsp:include page="Footer.html"></jsp:include>
</body>
</html>