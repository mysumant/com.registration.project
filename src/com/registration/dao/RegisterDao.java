package com.registration.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.registration.bean.RegisterBean;
import com.registration.dbcon.DBConnection;


public class RegisterDao 
{
    public String registerUser(RegisterBean registerBean)
    {
   // 	String t_id = registerBean.getT_ID();
    	String fullName = registerBean.getFullName();
    	String email = registerBean.getEmail();
    	String contact = registerBean.getContact();
    	
    	
    	Connection con = null;
    	PreparedStatement  preparedStatement = null;
   	
    	try
    	{
    		// create sequence t_id start with 1;    <------- sql command to create sequence
    		
    		con = DBConnection.createConnection();
    		
    		String queryUSERTB = "insert into USERTBT(t_id,fullName,email,contact) values(t_id.nextval,?,?,?)";
    		
    		preparedStatement = con.prepareStatement(queryUSERTB);
  //  		preparedStatement.setString(1, t_id);
    		preparedStatement.setString(1, fullName);
    		preparedStatement.setString(2, email);
    		preparedStatement.setString(3, contact);    		
    		   		
    		 		
    		int i = preparedStatement.executeUpdate();
    		
    		if(i!=0)
    		{
    			return "SUCCESSR";
    		}
    		
        }
    	catch (SQLException e) 
    	{
		    e.printStackTrace();	
		}
    	return "Opps";
    }
}
