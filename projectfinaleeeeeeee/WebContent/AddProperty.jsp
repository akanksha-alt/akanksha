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
input[type=text], input[type=number],input[type=email] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=number]:focus,input[type=email]:focus {
  background-color: #ddd;
  outline: none;
}
.registerbtn {
  background-color: skyblue;
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
   String pid = "P"+x;

%>

<%
   OwnerDetaills ownerobj =(OwnerDetaills)session.getAttribute("ownerinfo");

%>
 <div align="center">
     <h1>PROPERTY DETAILS</h1>
     <form action="Propertyadd" method="get">
      <div class="container">
        <table>
        	 <tr>
             <td>EMAIL</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="email" name="OwnerId" value="<%=ownerobj.getOwnermail()%>" readonly="readonly"></td>
           </tr>
           <tr>
             <td>Property id</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="text" name="propid" value="<%=pid%>" readonly="readonly"></td>
           </tr>
           <tr>
             <td>Property type</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="text" name="proptype"></td>
           </tr>
            <tr>
             <td>ADDRESS</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="text" name="propadd"></td>
           </tr>
            <tr>
             <td>LOCATION</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="text" name="proploc"></td>
           </tr>
            <tr>
             <td>RENT PER MONTH</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="number" name="proprent"></td>
           </tr>
            <tr>
             <td>NO OF ROOMS</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="text" name="proproom"></td>
           </tr>
            <tr>
             <td></td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="hidden" name="propstatus" value="unbooked"></td>
           </tr>
             <tr>
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