package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.web.model.Regis;

/**
 * Servlet implementation class WelcomeServlet1
 */
@WebServlet("/welcomeServlet1")
public class WelcomeServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String regis = (String)request.getAttribute("mobile");
		
		List<Regis> rList = (List<Regis>)request.getAttribute("regisList");
		
		//out.print("<h1>Welcome "+regis+"! You are successfully Login</h1> <br>");
		RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
		rd.include(request, response);
		
		
		out.print("<a href='registration.jsp'><button type=\"button\">Register</button></a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
