<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<style type="text/css">
h1{color : GOLDENROD;}
td{	font-size:30px;padding-top: 20px; padding-bottom: 20px; color:BEIGE; }
input{font-size:25px;}
button{color :WHITE; font-size : 20px; border: none; background-color:DARKCYAN;	padding: 10px 50px;}
p{font-size : 35px; color : RED;}

.bg-img {
			background-image: url("contact.jpg");
			height: 500px;
            width: 400;
            background-position: center;
            background-repeat: no-repeat;
            
	    }

</style>

</head>
<body>

<br><br><br><br>

<div class="bg-img">
<center><h1>User Login Module</h1></center>

<form name="formLogin" action="LoginServlet" method="post">

<table align="center">
    <tr></tr><tr></tr><tr></tr><tr></tr>
    
    <tr>
	<td>User Name : </td>
	<td><input type="text" name="userName"></td>
	</tr>
	
	<tr>
	<td>Password : </td>
	<td><input type="password" name="password"></td>
	</tr>

    <tr>
	<td><button type="submit">Login</button></td><td><button type="reset" >Reset</button></td>
	</tr>
		       
</table>
</form>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>	
<center><p>${errMessage}</p></center>
</div>
<center><button  onClick="window.location.href='Register.jsp'"/>Go Registration</button></center>
</body>
</html>