package Pack;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/FirstGenericServlet")
public class FirstGenericServlet extends GenericServlet {
	
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		int firstnum=Integer.parseInt(request.getParameter("fNo"));
		int secondnum=Integer.parseInt(request.getParameter("secNo"));
		
		int sum=firstnum+secondnum;
		
		PrintWriter out=response.getWriter();
		out.print("sum of given input:"+sum);
		
	}

}
