<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}
.imgcontainer {
  text-align: center;
  margin: 30px 0 20px 0;
}

img.avatar {
  width: 20%;
  border-radius: 60%;
}
.container {
  padding: 16px;
}
button {
  background-color: dodgerblue;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}
 input[type=password] ,input[type=email] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: lightgrey;
}
 input[type=password]:focus, input[type=email]:focus {
  background-color: skyblue;
  outline: none;
}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<hr size="5" color="skyblue">
<div align="center">
     <h1> LOGIN PAGE</h1>
     
     <div style="color: red;font-weight: bold;">
       <% //SCRIPLET TAG
         if(request.getAttribute("errormsg") != null)
    	      out.print(request.getAttribute("errormsg"));
       %>
     </div>
     
     
     <form action="AdminLoginServlet" method="get">
     <div class="imgcontainer">
    <img src="image/login1.png" alt="Avatar" class="avatar">
  </div>
  <div class="container">
        <table>
           <tr>
             <td>Admin ID</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="email" name="adminid"></td>
           </tr>
           
           <tr>
               <td>PASSWORD</td>
               <td>&nbsp;&nbsp;&nbsp;</td>
               <td><input type="password" name="password"></td>
           </tr>
           
           <tr>
               <td></td>
               <td> <button type="submit">LOGIN</button>  </td>
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