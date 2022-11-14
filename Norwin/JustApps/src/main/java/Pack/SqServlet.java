package Pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.AccessException;

import org.apache.tomcat.util.http.parser.Cookie;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int m = (int) req.getAttribute("k");
//		m = m * m;
//		PrintWriter out = res.getWriter();
//		out.print("result is :" + m);
//		System.out.println("sq is called");
		
//		int m = Integer.parseInt(req.getParameter("k"));
//		m = m * m;
//		PrintWriter out = res.getWriter();
//		out.print("result is :" + m);
//		System.out.println("sq is called");
//		
		
		HttpSession session = req.getSession();
		
		int m = (int)session.getAttribute("k");
		m = m * m;
		PrintWriter out = res.getWriter();
		out.print("result is :" + m);
		System.out.println("sq is called");
		
//		int m=0;
//		jakarta.servlet.http.Cookie[] cookies =req.getCookies();
//		
//		for(jakarta.servlet.http.Cookie c:cookies) {
//			if(((jakarta.servlet.http.Cookie) c).getName().equals("k"))
//				m=Integer.parseInt(((jakarta.servlet.http.Cookie) c).getValue());
//		}
//		
//		m=m*m;
//		PrintWriter out = res.getWriter();
//		out.print("result is :" + m);
//		System.out.println("sq is called");
		
	}

}
