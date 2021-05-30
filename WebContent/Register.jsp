<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>

<style type="text/css">
td{font-size:25px;}
input{font-size:20px;}
button{font-size:20px;}
p{font-size : 35px; color : RED;}
h1{color : GOLDENROD;}
td{	font-size:30px; padding-top: 15px; padding-bottom: 15px; color:KHAKI; }
button{color :WHITE; font-size : 20px; border: none; background-color:DARKCYAN;	padding: 10px 50px;}
.bg-img {
			background-image: url("bbb.jpg");
 		    height: 450px;
            background-position: center;
            background-repeat: no-repeat;
           
        }
</style>
 
</head>
 
<body>
<br><br><br>
<div class="bg-img">

<center><h1>User Registration Form</h1></center>

<form name="formRegister" action="RegisterServlet" method="post">

<table align="center">

   
   	<tr>
	<td>Full Name : </td>
	<td><input type="text" name="fullName" title="String Format Only" required></td>
	</tr>
	
	<tr>
	<td>Email : </td>
	<td><input type="email" name="email"  pattern=".+@gmail.com"  title="@gmail.com  comlulsary"></td>
	</tr>
	
	<tr>
	<td>Contact : </td>
	<td><input type="text" name="contact" pattern="[0-9]{10}" title="10 Digit Compulsary "></td>
	</tr>
	
	<tr>
	<td>User Name : </td>
	<td><input type="text" name="userName" pattern="[A-Za-z]{1,}" title="String Format Only"/></td>
	</tr>
	
	<tr>
	<td>Password : </td>
	<td><input type="password" name="password" /></td>
	</tr>

    <tr>
	<td><button type="submit">Register</button></td><td><button type="reset" />Reset</button></td>
	<td><button onClick="window.location.href='Login.jsp'">Go Login</button></td>
	</tr>

</table>
</form>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>	
<center><p>${errMessage}</p></center>

</div>
</body>
</html>