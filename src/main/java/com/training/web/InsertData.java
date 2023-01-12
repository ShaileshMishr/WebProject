package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertData
 */
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 
			 Connection con = DatabaseConnection.initializeDatabase();
	  
	             PreparedStatement st = con
	                   .prepareStatement("insert into login values(?, ?)");
	  
	           
	           
	            st.setString(1, request.getParameter("id"));
	            st.setString(2, request.getParameter("mno"));
	           
	            
	            st.executeUpdate();
	  
	           
	            st.close();
	            con.close();
	            PrintWriter out = response.getWriter();
	            
//out.println("<html><body><b><h1>Successfully Registered</h1>"
	            		
	                       // + "</b></body></html>");
	            RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
	            rd.include(request, response);

out.print("<a href='login1.jsp'><button type=\"button\">Login</button></a>");
	            
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
