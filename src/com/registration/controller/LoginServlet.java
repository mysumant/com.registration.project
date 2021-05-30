package com.registration.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registration.bean.LoginBean;
import com.registration.bean.ResultSetBean;
import com.registration.dao.LoginDao;
import com.registration.dbcon.DBConnection;


public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    
    public LoginServlet()
    {
        super();
    } 


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		
		String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        
        LoginDao loginDao = new LoginDao();		
		
		String userValidate = loginDao.authenticateUser(userName,password);
        
		if(!userValidate.equals("Invadil"))
		{
          try
  	        {  
  	            Connection con =  DBConnection.createConnection();
  	            PreparedStatement preparedStament = con.prepareStatement("select userName, fullName, email, contact  from logint, usertbt where u_id ='"+userValidate+"' AND t_id ='"+userValidate+"'");  
  	            ResultSet resultSet = preparedStament.executeQuery(); 
  			                        	
  	           // List<ResultSetBean> list = new ArrayList<ResultSetBean>();
  	            
  	            if(resultSet.next())
  			    {
  	            	ResultSetBean resultSetBean = new ResultSetBean();
  	            				    	    	
  			    	resultSetBean.setUserName(resultSet.getString("userName"));
  			    	resultSetBean.setFullName(resultSet.getString("fullName"));
  			    	resultSetBean.setEmail(resultSet.getString("email"));  
  			    	resultSetBean.setContact(resultSet.getString("contact"));
  			    	
  			    	//list.add(resultSetBean); 
  			    	//System.out.println(list);
  			        //request.setAttribute("list",list);
  			    	
  			    	request.setAttribute("resultSetBean",resultSetBean);
  			    	
  			    }
  			     
  			  
  			  
  	           con.close();
  	        }
  			catch(Exception e)
            {
  				e.printStackTrace();
  			}
             
        	//response.sendRedirect("SuccessLogin.jsp");
        	 request.getRequestDispatcher("/SuccessLogin.jsp").forward(request, response);
      }
	 else
		{
		  request.setAttribute("errMessage", "Invalid Credentials Entered .....");
		  request.getRequestDispatcher("/Login.jsp").forward(request, response);
		}
	}

}



