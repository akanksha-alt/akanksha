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
input[type=text] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus {
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
  width: 50%;
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
<div align="center">
     <form action="Searchlocservlet" method="get">
      <div class="container">
     <table>
     <tr>
     <td>ENTER LOCATION </td>
    <td> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
     <td> <input type="text" name="proploc" required></td>
     </table>
          
          <br/>
          <br/>
         <button type="submit" class="registerbtn">SEARCH</button>
         </div>
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