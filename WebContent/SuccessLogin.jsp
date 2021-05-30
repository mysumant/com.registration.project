<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SuccessLogin</title>

<style type="text/css">

b{font-size: 25px; color : GREEN;}
input{background-color: ORANGE; font-size : 50px, padding : 30px 60px;}
button{color :WHITE; font-size : 20px; border: none; background-color:DARKORANGE; padding: 10px 50px;}
body { background-color:rgba(50, 50, 50,1.0); } 
h1 { font-size:25px; color:Orange;  }
td {font-size: 20px; color:darkgoldenrod ;}
tr {font-size: 25px;  color:Orange;}
</style>
</head>

<body>
<br><br><br>

  <center><b>Welcome !!! You have successfully logged in .......</b></center>
  <br>
  
  <center>
  <form action="LogoutServlet" method="post">
   
   
   	
    
           	<h1> Details of Logged in Users List </h1>
			<br><br>								
			<table border='1' width='80%'>
			<tr><th>User Name</th><th>Full Name</th><th>Email</th><th>Contact</th></tr>
			
			        	        
		            <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>	
		           
		           
                  
                    <tr>
                 		<td align="center">${resultSetBean.userName }</td>
                		<td align="center">${resultSetBean.fullName }</td>
                		<td align="center">${resultSetBean.email }</td>
                		<td align="center">${resultSetBean.contact }</td>
            		</tr>
       
       				
	    
		
			</table>
			<br><br><br>
			
	<button  type = "submit" >Logout</button>		
   </form>
  </center>  
</body>
</html>