package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
//import java.lang.ProcessBuilder.Redirect;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dao.Query;


/**
 * Servlet implementation class welcome
 */
@WebServlet("/welcome")
public class welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 boolean z;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
	        Query a=new Query();
			try {
				z = a.getAuthentication(request.getParameter("username"),request.getParameter("psword"));
				if(z==true)
			    {
					RequestDispatcher requestDispatcher = request
		                    .getRequestDispatcher("/welcome.jsp");
		            requestDispatcher.forward(request, response);
			    }
			    else
			    {
			    	RequestDispatcher requestDispatcher = request
		                    .getRequestDispatcher("/error.jsp");
		            requestDispatcher.forward(request, response);			    }
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			out.close();	    
}
}