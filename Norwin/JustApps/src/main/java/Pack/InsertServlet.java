package Pack;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		int stuno = Integer.parseInt(request.getParameter("sno"));
		String stuname = request.getParameter("sname");
		int stumarks = Integer.parseInt(request.getParameter("smarks"));

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/barath", "root", "@imSBK86");
			Statement stm = con.createStatement();
			String sql = "insert into student values(" + stuno + ",'" + stuname + "'," + stumarks + ")";
			stm.executeUpdate(sql);

			PrintWriter out = response.getWriter();
			out.println("data inserted:");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}