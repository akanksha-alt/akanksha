<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
     <form action="DisplayAllUserServlet" method="get">
          <input type="submit" value="DISPALY ALL USER">
     </form>
     
     <br/>
     <br/>
     
      <div style="color: red;font-weight: bold;">
       <% //SCRIPLET TAG
         if(request.getAttribute("errormsg") != null)
    	      out.print(request.getAttribute("errormsg"));
       %>
     </div>
     
  </div>

</body>
</html>