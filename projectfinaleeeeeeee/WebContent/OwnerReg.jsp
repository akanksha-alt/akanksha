<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Owner Registration</title>
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
	<h1>Owner Register Here</h1>
	<hr>
	<form action="AddOwnerServlet">
	<div class="container">
	<table>
	<tr>
		<td>Email</td>
		<td>&nbsp;&nbsp;&nbsp;</td>
        <td><input type="text" name="ownermail"></td>
    </tr>
    <tr>
             <td>Name</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="text" name="ownername"></td>
    </tr>
     <tr>
             <td>Password</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="password" name="ownerpass"></td>
     </tr>
     <tr>
             <td>MobileNo.</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="number" maxlength="10" name="ownerno"></td>
           </tr>
            <tr>
             <td>Address</td>
             <td>&nbsp;&nbsp;&nbsp;</td>
             <td><input type="text" name="owneradd"></td>
           </tr>
         </table>
<input type="radio" name="ownergender" value="Male"> MALE
<input type="radio" name="ownergender" value="Female">FEMALE
<br>
<br/>
<br/>
  <hr>
    <table>
			    <tr>
   <td> <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p></td>
               <td></td>
               <td>  <button type="submit" class="registerbtn">Register</button> </td>
               <td></td> 
           </tr>
			
			
<tr>
                 <div class="signin">
 <td>  Already have an account? <a href="OwnerLogin.jsp">LOGIN</a></td>
  </div>
    </tr> 
    </table>          
    </div> 
</form>
</div>
<hr size="5" color="skyblue">
 <jsp:include page="Footer.html"></jsp:include>
</body>
</html>