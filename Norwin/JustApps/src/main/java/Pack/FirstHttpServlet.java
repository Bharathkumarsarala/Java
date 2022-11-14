package Pack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		int firstnum = Integer.parseInt(request.getParameter("fNo"));
		int secondnum = Integer.parseInt(request.getParameter("secNo"));

		int sum = firstnum + secondnum;

		PrintWriter out = response.getWriter();
		out.print("sum of given input:" + sum);
	}
}