<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<hr size="5" color="skyblue">
<div align="center">
    <button onclick="location.href='AdminLogged.jsp';" id="btn-group" class="button"><h2>RETURN BACK</h2></button></td>
    <br/>
    <br/>
     
      <div style="color: black;font-weight: bold;">
       <% //SCRIPLET TAG
         if(request.getAttribute("msgkey") != null)
    	      out.print(request.getAttribute("msgkey"));
       %>
     </div>
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