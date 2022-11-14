package just;

import java.io.IOException;


import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ServletClass")
public class ServletClass implements Servlet {

	ServletConfig config;

	public void inIt(ServletConfig config) {
		this.config = config;
	}

	public void service(ServletRequest request, ServletResponse response) throws IOException {



		Date d = new Date();
		PrintWriter pw = response.getWriter();
		pw.println(d);

	}

	public void destroy() {

	}

	public ServletConfig getServletConfig() {
		return config;

	}

	public String getServletInfo() {
		return null;

	}

	public void init(ServletConfig arg0) throws ServletException {

	}

}
