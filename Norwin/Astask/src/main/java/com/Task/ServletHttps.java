package com.Task;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class ServletHttps extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
        String pass = request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/employee";
			String user = "root";
			String password = "@imSBK86";

			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("connection successful");

			PreparedStatement ps=con.prepareStatement("insert into employees values (?,?)");
			ps.setString(1,uname );
			ps.setString(2, pass);
			
			int rs = ps.executeUpdate();
			System.out.println("values inserted");
		
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
