package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpFilter;

import com.training.web.model.User;
import com.training.web.service.LoginService;
import com.training.web.service.LoginServiceImpl;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/welcomeServlet")
public class LoginFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public LoginFilter() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    /**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("uname");
		String password1 = request.getParameter("pwd");
	
		LoginService service = new LoginServiceImpl();
	       
		if(userName.equals("") || password1.equals("")) {
			out.print("<h2>**Please enter username and password**</h2> <br>");
			
			//RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			RequestDispatcher rd = request.getRequestDispatcher("new.jsp");
			rd.include(request, response);
				
		}
		
		else if(service.isValidUser(userName, password1)) {
			
//			Cookie cookie1 = new Cookie("username", userName);
//			Cookie cookie2 = new Cookie("password", password1);
//			
//			response.addCookie(cookie1);
//			response.addCookie(cookie2);
			
			List<User> userList = service.getUsers();
			request.setAttribute("user1", userName);
			request.setAttribute("pwd", password1);
			request.setAttribute("userList", userList);
			chain.doFilter(request, response);

		}
		
		
		else {
//			out.print("<h2>** Incorrect Login Credentials **</h2> ");
			
			//RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
	
	}


	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	

}
