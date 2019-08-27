<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: darkgrey;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password],input[type=email],input[type=number] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus,input[type=email]:focus ,input[type=number]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
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

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<hr size="5" color="skyblue">
 <div align="center">
		<h1>Client Registration Form</h1>
		<form method="get" action="Clientregisterservlet">
		<div class="container">
		<table>
			<tr>
				<td>Enter ID: </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="email" name="clientid"></td>
			</tr>
			<tr>
				<td>Enter Name: </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="text" name="clientname"></td>
			</tr>
			<tr>
				<td>Enter Password: </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="password" name="clientpassword"></td>
			</tr>
			<tr>
				<td>Mobile Number: </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="number" name="clientmobile"></td>
			</tr>
			<tr>
               <td>Gender:</td>
               <td>&nbsp;&nbsp;&nbsp;</td>
               <td>
                   <input type="radio" name="clientgender" value="Male"> Male
                   <input type="radio" name="clientgender" value="Female">Female
               </td>
           </tr>
			<tr>
				<td>Enter Address: </td>
				<td>&nbsp;&nbsp;&nbsp;</td>
				<td><input type="text" name="clientaddress"></td>
			</tr>
			<hr> <tr>
   <td> <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p></td>
			</tr>
			 <tr>
               <td></td>
               <td></td>
               <td>  <button type="submit" class="registerbtn">Register</button> </td>
               <td></td> 
           </tr>
			
				
			<tr>
                 <div class="signin">
 <td>  Already have an account? <a href="#">Sign in</a></td>
  </div>
    </tr>  
			
		</table>
		</div>
		</form>
	</div>
</body>
</html>