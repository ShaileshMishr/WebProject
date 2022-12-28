package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Topicservlet
 */
@WebServlet("/list")
public class Topicservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	String topic;
	
	

	
    public Topicservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
//		topic="Java "
//				+ " sql "
//				+ " Jdbc "
//				+ " html "
//				+ " css "
//				+ " JS "
//				+ " TS "
//				+ " Servlet ";
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//out.println("<h1> "+topic+" </h1>");
		out.println("<h1>Covered Topics</h1> ");
		out.println("<ul> ");
		out.println("<li> "+"Java"+" </li>");
		out.println("<li> "+"SQL"+" </li>");
		out.println("<li> "+"jdbc"+" </li>");
		out.println("<li> "+"html"+" </li>");
		out.println("<li> "+"css"+" </li>");
		out.println("<li> "+"JS"+" </li>");
		out.println("<li> "+"TS"+" </li>");
		out.println(" </ul>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
