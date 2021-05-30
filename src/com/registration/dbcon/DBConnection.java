package com.registration.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
   public static Connection createConnection()
   {
	   Connection con=null;  
	    
       try
       {  
       	Class.forName("oracle.jdbc.driver.OracleDriver");  
        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","admin");
        System.out.println("Connection Object con = "+con);
       }
       catch(Exception e)
       {
       	System.out.println(e);
       }
	   
	   return con;
   }
}
