package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		boolean flag=true;
		PrintWriter out= response.getWriter();  
		String username=request.getParameter("user");
		String password = request.getParameter("pass");
		String repas=request.getParameter("repass");
		long phone=Long.parseLong(request.getParameter("phone"));
		String mail=request.getParameter("mail");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 String jdbcURL = "jdbc:mysql://localhost:3306/cts";
			    String user = "root";
			    String pass = "admin";
			Connection conn=DriverManager.getConnection(jdbcURL,user,pass);
			String sql = "INSERT INTO examples VALUES (?, ?, ?, ?, ?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, username);
			statement.setString(2,password);
			statement.setString(3, repas);
			statement.setLong(4, phone);
			statement.setString(5, mail);
			
			statement.executeUpdate();
			out.println("Username is "+ username + " \n<br>PassWord is " + password+"\n<br>reEnteredPassword is "+repas+"\n<br>Phone number is\n<br>Mail id is :"+mail);
			
			RequestDispatcher rd= request.getRequestDispatcher("login.html");
			rd.forward(request, response);
			
			statement.cancel();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
