<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>header</title>
<meta name="viewport" content="width=device-width, initial-scale=1" charset="utf-8">
<link rel="stylesheet" type="text/css" href="HeaderStyle.css">
<link rel="stylesheet" type="text/css" href="ButtonStyle.css">

<style>
* {
  box-sizing: border-box;
}

body {
  margin: 0;
}

/* Style the header */
.header {
  background-color: #f1f1f1;
  padding: 20px;
  text-align: center;
}

/* Style the top navigation bar */
.topnav {
  overflow: hidden;
  background-color: #333;
}

/* Style the topnav links */
.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

/* Change color on hover */
.topnav a:hover {
  background-color: #ddd;
  color: black;
}
</style>
</head>
<body>

<div class="header" align="center">
<table>
<tr><td><img src="image/flh.png"  width="80" height="80" alt="logo"></td></tr>
 <tr><td> <h1>FEEL LIKE HOME</h1></td></tr>
  </table>
</div>

<div class="topnav">
  <a href="home.jsp"><i class="fa fa-fw fa-home"></i>HOME</a>
  <a href="AdminLogin.jsp"><i class="fa fa-fw fa-user"></i>ADMIN</a>
</div>

</body>
</html>