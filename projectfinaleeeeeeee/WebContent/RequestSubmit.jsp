<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="com.proj.model.ClientDetails"%>
<%@page import="com.proj.model.PropertyDetails"%>
<%@page import="com.proj.model.OwnerDetaills"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.container {
 padding: 16px;
 background-color: white;
}
input[type=text], input[type=date],input[type=time] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=date]:focus,input[type=time]:focus {
  background-color: #ddd;
  outline: none;
}
.registerbtn {
  background-color: darkgrey;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}
.registerbtn:hover {
  opacity: 1;
}


</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<hr size="5" color="skyblue">
<%
   Random r = new Random();
   int x = r.nextInt(90000);
   String rid = "R"+x;

   String oid=request.getParameter("oid");
   String pid=request.getParameter("pid");
   
   ClientDetails clientobj =(ClientDetails)session.getAttribute("clientinfo");
		   
%>

<div align="center">
		<h1>Enroll Your Request</h1>
		<form method="get" action="Requestsubmitservlet">
		 <div class="container">
		<table>
			<tr>
				<td>Request ID: </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="text" name="requestid" value="<%=rid%>" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Owner ID: </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="text" name="ownerid" value="<%=oid%>"></td>
			</tr>
			<tr>
				<td>Property ID: </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="text" name="propertyid" value="<%=pid%>"></td>
			</tr>
			<tr>
				<td>Client ID: </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="text" name="clientid"  value="<%=clientobj.getclientid()%>" readonly="readonly"></td>
			</tr>
			<tr>
               <td>Date:</td>
               <td>&nbsp;&nbsp;&nbsp;</td>
               <td>
                   <input type="date" name="date">
               </td>
           </tr>
			<tr>
				<td>Time: </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="time" name="time"></td>
			</tr>
			<tr>
				<td>Comment: </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="text" name="comment"></td>
			</tr>
			<tr>
				<td> </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="hidden" name="status" value="unbooked"></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr>
               <td></td>
               <td></td>
               <td>  <button type="submit" class="registerbtn">Register</button> </td>
               <td></td> 
           </tr>
						
		</table>
		</div>
		</form>
		</div>
	 <hr size="5" color="skyblue">
 <jsp:include page="Footer.html"></jsp:include>
</body>
</html>