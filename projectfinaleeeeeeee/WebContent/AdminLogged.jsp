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
input[type=submit] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<hr size="5" color="skyblue">
<div align="center">
<h1>WELCOME ADMIN</h1>
<br/>
<br/>
<br/>
<br/>
<form action="RequestDisplay" method="get">

<input type="submit" value="VIEW REQUESTS">
</form>
<br/>
<br/>
<br/>
<br/>
 <form action="deleteservlet1" method="get">
          <input type="submit" value="VIEW ALL PROPERTY">
     </form>
     
     <br/>
     <br/>
     
      <div style="color: red;font-weight: bold;">
       <% //SCRIPLET TAG
         if(request.getAttribute("errormsg") != null)
    	      out.print(request.getAttribute("errormsg"));
       %>

     </div>
     <button onclick="location.href='AdminLogin.jsp';" id="btn-group" class="float-left submit-button"><h2>LOGOUT</h2></button>
  </div>
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