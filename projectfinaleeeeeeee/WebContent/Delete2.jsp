<%@page import="com.proj.model.PropertyDetails"%>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
tr:hover {background-color:dimgrey;}
table {
  border-collapse: collapse;
  width: 100%;
}

 td {
  padding: 15px;
}
a.link:visited,a.link:link {
  background-color: skyblue;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}


a.link:hover, a.link:active {
  background-color: skyblue;
}

</style>
</head>
<body>
<jsp:include page="Header2.jsp"></jsp:include>
<hr size="5" color="skyblue">
<% List<PropertyDetails> proplist =
            (List<PropertyDetails>)request.getAttribute("ulist");
   %>
   
   <div align="center">
       <h2> Property details </h2>
       <table border="1">
           <tr>
              <th>OWNER ID</th>
              <th>PROPERTY ID</th>
              <th>PROPERTY TYPE</th>
              <th>PROPERTY ADDRESS</th>
              <th>PROPERTY LOCATION</th>
              <th>PROPERTY RENT</th>
              <th>PROPERTY ROOM</th>
              <th>PROPERTY STATUS</th>
            </tr>
            
            <%
               for(PropertyDetails uobj : proplist)
               {
            %>	   
                  <tr>
                     <td><%=uobj.getOwnerId()%></td>
                     <td><%=uobj.getPropid()%></td>
                     <td><%=uobj.getProptype()%></td>
                     <td><%=uobj.getPropadd()%></td>
                     <td><%=uobj.getProploc()%></td>
                     <td><%=uobj.getProprent()%></td>
                     <td><%=uobj.getProproom()%></td>
                     <td><%=uobj.getPropstatus()%></td>
                     <td><a class="link" href="Deleteservlet2?Propertyid=<%=uobj.getPropid()%>">DELETE</a></td>
                    </tr>
             <%   
               }
            %>
         </table>
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
     
	<hr size="5" color="skyblue">
 <jsp:include page="Footer.html"></jsp:include>
     

</body>
</html>