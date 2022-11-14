package Pack;

import java.io.IOException;
import java.rmi.AccessException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;
		
		//Cookie cookie=new Cookie("k",k+" ");
		//res.sendRedirect(cookie);
		
		
		//HttpSession session = req.getSession();
		//session.setAttribute("K",k);
		
		 res.sendRedirect("Sq");
		//res.sendRedirect("Sq?k=" + k);

		// req.setAttribute("k",k);

		// RequestDispatcher rd = req.getRequestDispatcher("Sq");
		// rd.forward(req, res);

	}

}
