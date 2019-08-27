<%@page import="com.proj.model.RequestDetails"%>
<%@page import="java.util.List"%>
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
 <% List<RequestDetails> requestlist =
            (List<RequestDetails>)request.getAttribute("ulist");
   %>
   
   <div align="center">
       <h2> REQUEST DETAILS </h2>
       <table border="1">
           <tr>
              <th>ReQUEST ID</th>
              <th>Owner ID</th>
              <th>Property ID</th>
              <th>CLIENT ID</th>
              <th>Status</th>
            </tr>
            
            <%
               for(RequestDetails reqobj : requestlist)
               {
            %>	   
                  <tr>
                     <td><%=reqobj.getrequestid()%></td>
                     <td><%=reqobj.getownerid()%></td>
                     <td><%=reqobj.getpropertyid()%></td>
                     <td><%=reqobj.getclientid()%></td>
                     <td><%=reqobj.getstatus()%></td>
                     <td><a class="link" href="ViewBookedServlet?propid=<%=reqobj.getpropertyid()%>">VIEW</a></td>
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