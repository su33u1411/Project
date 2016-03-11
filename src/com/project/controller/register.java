package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dao.Query;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

        PrintWriter out=response.getWriter();
        try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
       String a=request.getParameter("F_name");
       String b=request.getParameter("L_name");
       String c=request.getParameter("Address");
       String d=request.getParameter("City");
       String e=request.getParameter("State");
       String f=request.getParameter("Phone");
       String g= request.getParameter("Email");
       String h=request.getParameter("U_ID");
       String i=request.getParameter("Pass");
        
        Query setReg=new Query();
		try {
			boolean z = setReg.setregister(a,b,c,d,e,f,g,h,i);
			if(z==true)
		    {
				out.println("Succecfully Recorded");
		    }
		    else
		    {
		       out.println("Error Has Occured");
		       out.println("Please Try Again Later");				    

		    }
		} 
		catch (SQLException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		out.close();	    
	}

}
