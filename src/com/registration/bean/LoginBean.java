package com.registration.bean;

public class LoginBean 
{
	private String userName;
	private String password;
	private String u_id;
		
	public void setU_ID(String u_id)
    {
    	this.u_id = u_id;
    }
    public String getU_ID()
    {
    	return u_id;
    }
    
	public void setUserName(String userName)
    {
    	this.userName = userName;
    }
    public String getUserName()
    {
    	return userName;
    }
    
    public void setPassword(String password)
    {
    	this.password = password;
    }
    public String getPassword()
    {
    	return password;
    }
}
