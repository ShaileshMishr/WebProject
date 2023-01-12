package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

import com.training.web.model.Regis;
import com.training.web.model.User;
import com.training.web.service.LoginService;
import com.training.web.service.LoginServiceImpl;

/**
 * Servlet Filter implementation class LoginFilter1
 */
@WebFilter("/welcomeServlet1")
public class LoginFilter1 extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public LoginFilter1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String MobileNo = request.getParameter("mno");
		
	
		LoginService service = new LoginServiceImpl();
	       
		if(MobileNo.equals("")) {
			//out.print("<h2>**Please enter username and password**</h2> <br>");
			
			RequestDispatcher rd = request.getRequestDispatcher("new.jsp");
			rd.include(request, response);
				
		}
		
		else if(service.isValidRegis(MobileNo)) {
			List<Regis> regisList = service.getRegis();
			request.setAttribute("mobile", MobileNo);
			request.setAttribute("regisList", regisList);
			chain.doFilter(request, response);
			
			}
		
		
		else {
		
			RequestDispatcher rd = request.getRequestDispatcher("new1.jsp");
			rd.include(request, response);
		}
		}
	
	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
