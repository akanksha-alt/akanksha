<%@page import="com.proj.model.PropertyDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <% List<PropertyDetails> proplist = (List<PropertyDetails>)request.getAttribute("ulist");
   %>
   
   <div align="center">
       <h2> PROPERTY DETAILS </h2>
       <table border="1">
           <tr>
              <th>OWNER ID</th>
              <th>PROPERTY ID</th>
              <th>TYPE</th>
              <th>ADDRESS</th>
              <th>LOCATION</th>
              <th>RENT PER MONTH</th>
              <th>NO OF ROOMS</th>
              <th>STATUS</th>
            </tr>
            
            <%
               for(PropertyDetails pobj : proplist)
               {
            %>	   
                  <tr>
                     <td><%=pobj.getOwnerId() %></td>
                     <td><%=pobj.getPropid() %></td>
                     <td><%=pobj.getProptype() %></td>
                     <td><%=pobj.getPropadd() %></td>
                     <td><%=pobj.getProploc() %></td>
                     <td><%=pobj.getProprent() %></td>
                    <td><%=pobj.getProproom()%></td>
                      <td><%=pobj.getPropstatus()%></td>
                    </tr>
             <%   
               }
            %>
         </table>
     </div>

</body>
</html>