package com.registration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.registration.bean.LoginBean;
import com.registration.bean.RegisterBean;
import com.registration.dao.LoginDao;
import com.registration.dao.RegisterDao;


public class RegisterServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public RegisterServlet() 
    {      
    	super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
      //  String uid = request.getParameter("uid");
    	  String fullName = request.getParameter("fullName");
    	  String email = request.getParameter("email");
    	  String contact = request.getParameter("contact");
    	  String userName = request.getParameter("userName");
    	  String password = request.getParameter("password");
    	  
    	  RegisterBean  registerBean = new RegisterBean();
    	 
      //  registerBean.setT_ID(uid);
    	  registerBean.setFullName(fullName);
    	  registerBean.setEmail(email);
    	  registerBean.setContact(contact);
    	  
    	  LoginBean  loginBean = new LoginBean();
     	 
    //	  loginBean.setU_ID(uid);
    	  loginBean.setUserName(userName);
    	  loginBean.setPassword(password);
    	  
    	  
    	  RegisterDao  registerDao = new RegisterDao();
    	  String userRegistered = registerDao.registerUser(registerBean) ;

    	  LoginDao  loginDao = new LoginDao();
    	  String userLogged = loginDao.loginUser(loginBean) ;
    	  
    	  
    	  if(userRegistered.equals("SUCCESSR") && userLogged.equals("SUCCESSL"))
    	  {
    		  request.getRequestDispatcher("/Welcome.jsp").forward(request, response);
    	  }
    	  else if(userRegistered.equals("Opps"))
    	  {
    		  request.setAttribute("errMessage", "Opps!!! Something went wrong ....");
    		  request.getRequestDispatcher("/Register.jsp").forward(request, response);
    	  }
    	  
    	  else
    	  {
    		  request.setAttribute("errMessage", "User Name must be Unique ....");
    		  request.getRequestDispatcher("/Register.jsp").forward(request, response);
    	  }
    	  
    }

}
