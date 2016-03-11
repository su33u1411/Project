/**
 * 
 */
package com.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author subramanyammogili
 *
 */
public class Query {
	

	/**
	 * 
	 */
	public Query() {
		// TODO Auto-generated constructor stub
	}
    public boolean getAuthentication(String u,String p) throws SQLException{
    	String DB_uname = null;
    	String DB_password = null;
    	String F_uname;
    	String F_password;
    	if(u!=null && p!=null)
    	{
    		F_uname=u;
    		F_password=p;
    		try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:8889/test","root@localhost", "");
    	String q = "select * from registration where U_ID='" + F_uname + "'";
    	Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(q);
		 while (rs.next()) 
		 {
             DB_uname = rs.getString("U_ID");
             DB_password = rs.getString("Pass");
         }
		 
		 if(F_uname.equals(DB_uname) && F_password.equals(DB_password))
		 {
			    rs.close();
		        stmt.close();
		        conn.close();
		return true;
    	 }
		 else 
		 {
			 return false;
		 }
		  
		 
    	}
    	
    	else
    	{
    		return false;
    	}
    	
    }
    public boolean setregister(String F_name,String L_name,String Address,String City,String State,String Phone,String Email,String U_ID,String Pass) throws SQLException{
    	
    	if(F_name!=null && L_name!=null && Address!=null && City!=null && State!=null && Phone!=null && Email!=null)
    	{
    		try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:8889/test","root@localhost", "");
    	String i = "INSERT INTO registration (F_name,L_name,Address,City,State,Phone,Email,U_ID,Pass) VALUES ('"+F_name+"','"+L_name+"','"+Address+"','"+City+"','"+State+"','"+Phone+"','"+Email+"','"+U_ID+"','"+Pass+"')";
    	Statement stmt=conn.createStatement();
		boolean rs=stmt.execute(i);
		        stmt.close();
		        conn.close();
		return true;
    	 }
		 else 
		 {
			 return false;
		 }	
    }
}