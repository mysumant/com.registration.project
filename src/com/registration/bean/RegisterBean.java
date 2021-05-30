
package com.registration.bean;

@SuppressWarnings("unused")
public class RegisterBean 
{
	private String t_id;
	private String fullName;
	private String email;
	private String contact;
	
	
	
	 public void setT_ID(String t_id)
	    {
	    	this.t_id = t_id;
	    }
	    public String getT_ID()
	    {
	    	return t_id;
	    }
	    
    
    public void setFullName(String fullName)
    {
    	this.fullName = fullName;
    }
    public String getFullName()
    {
    	return fullName;
    }
    
    
    public void setEmail(String email)
    {
    	this.email = email;
    }
    public String getEmail()
    {
    	return email;
    }
    
    
    public void setContact(String contact)
    {
    	this.contact = contact;
    }
    public String getContact()
    {
    	return contact;
    }
    
   
}
