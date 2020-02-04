package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userLogin")
public class UserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		boolean flag=true;
		String username1 = request.getParameter("user1");
		String password1 = request.getParameter("pass1");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String jdbcURL = "jdbc:mysql://localhost:3306/cts";
			String user = "root";
			String pass = "admin";
			Connection conn = DriverManager.getConnection(jdbcURL, user, pass);
			Statement statement = conn.createStatement();
		String query = "select username,password from examples";
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()) {
			
				String username=result.getString(1);
				String password= result.getString(2);
				
				if (username1.equals(username)&&password1.equals(password)) {
				flag=true;
			} else {
				flag=false;
			}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(flag)
		{
			RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
			rd.forward(request, response);
		}
		else
		{
			out.println("Credentials were not matched");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.forward(request, response);
		}
	}

}
