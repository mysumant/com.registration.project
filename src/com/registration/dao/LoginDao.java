package com.registration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import java.sql.SQLException;

import com.registration.bean.LoginBean;
import com.registration.bean.RegisterBean;
import com.registration.dbcon.DBConnection;


public class LoginDao 
{
	 public String loginUser(LoginBean loginBean)
	    {
	//      String u_id = loginBean.getU_ID();
	    	String userName = loginBean.getUserName();
	    	String password = loginBean.getPassword();
	    		    	
	    	
	    	Connection con = null;
	    	PreparedStatement  preparedStatement = null;
	   	
	    	try
	    	{
	    		con = DBConnection.createConnection();
	    		
	    		String queryLOGIN = "insert into LOGINT(u_id,userName,password) values(u_id.nextval,?,?)";
	    		
	    		preparedStatement = con.prepareStatement(queryLOGIN);
	    		
	    	//	preparedStatement.setString(1, u_id);
	    		preparedStatement.setString(1, userName);
	    		preparedStatement.setString(2, password);
	    		   		 		
	    		int i = preparedStatement.executeUpdate();
	    		
	    		if(i!=0)
	    		{
	    			return "SUCCESSL"; 
	    		}
	    		
	        }
	    	catch (SQLException e) 
	    	{
			    e.printStackTrace();	
			}
	    	return "Opps! Somthing went wrong there .....";
	    }
	
	 
	 public String authenticateUser(String userName, String password)
	 {
		 	 
		 Connection con = null;
		 Statement statement = null;
		 ResultSet resultSet = null;
		 
		 String uidDB = null;
	//	 String userNameDB = null;
	//	 String passwordDB = null;
		 
		 try
		 {
			 con = DBConnection.createConnection();
			 statement = con.createStatement();
			 resultSet = statement.executeQuery("select u_id from LOGINT where userName = '"+userName+"' AND password = '"+password+"'");
			 
			 if(resultSet!=null)
			 {
				 while(resultSet.next()) 
				 {
	             
					 uidDB = resultSet.getString("u_id"); 

					 return uidDB; 
	            
				 }
			
			 }
		 }
		 catch (SQLException e) 
		 {
		      e.printStackTrace();	
		 }
		 return "Invadil";
	 }
	
	 
}
