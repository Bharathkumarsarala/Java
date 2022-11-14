package Pack;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/FirstServlet")
public class FirstServletClass implements Servlet {

	ServletConfig config;

	public void inIt(ServletConfig config) {
		this.config = config;
	}

	public void service(ServletRequest request, ServletResponse response) throws IOException {
		
		String firstname=request.getParameter("name");
		String lastname=request.getParameter("surname");
		
		//int firstname=Integer.parseInt(request.getParameter("name"));
		//int firstname=Integer.parseInt(request.getParameter("surname"));
		
		//Date d=new Date();
		//PrintWriter pw=response.getWriter();
		//pw.println(d);
		
		PrintWriter pw = response.getWriter();
		pw.println("JustApp Servlet......");
		pw.print(firstname+" "+lastname);
	}

	public void destroy() {

	}
	
	public ServletConfig getServletConfig() {
		return config;

	}

	public String getServletInfo() {
		return null;

	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {

	}

}
