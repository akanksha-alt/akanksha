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

</style>
</head>
<body>
<jsp:include page="Header2.jsp"></jsp:include>
<hr size="5" color="skyblue">
<% List<RequestDetails> requestlist = (List<RequestDetails>)request.getAttribute("rlist");
   %>
   
   <div align="center">
       <h2> REQUEST DETAILS </h2>
       <table border="1">
           <tr>
              <th>REQUEST ID</th>
              <th>OWNER ID</th>
              <th>TPROPERTY ID</th>
              <th>CLIENT ID</th>
              <th>DATE</th>
              <th>TIME</th>
              <th>COMMENT</th>
              <th>STATUS</th>
            </tr>	
            
            <%
               for(RequestDetails robj : requestlist)
               {
            %>	   
                  <tr>
                     <td><%=robj.getrequestid()%></td>
                     <td><%=robj.getownerid()%></td>
                     <td><%=robj.getpropertyid()%></td>
                     <td><%=robj.getclientid()%></td>
                     <td><%=robj.getdate()%></td>
                     <td><%=robj.gettime()%></td>
                     <td><%=robj.getcomment()%></td>
                     <td><%=robj.getstatus() %></td>
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