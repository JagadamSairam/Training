package com.studentdatabase;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDataBase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		int id,age;
		String name,branch;
	
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/cts";
		String username = "root";
		String password ="admin";
		Connection conn = DriverManager.getConnection(url,username,password);
		Statement stmnt=conn.createStatement();
		
		System.out.println("Connection Established");
		String query="insert into Student vlaues(?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(query);
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter student id");
		id=Integer.parseInt(s.nextLine());
		System.out.println("Enter Student name");
		name=s.nextLine();
		System.out.println("Enter Student age");
		age=Integer.parseInt(s.nextLine());
		System.out.println("Enter Student branch");
		branch=s.nextLine();
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setString(4, branch);
		
		
		int result=ps.executeUpdate();
		
		
		if(result>0) {
			System.out.println("Data Inserted Successfully");
//			String query1="select * from Student";
//			ResultSet rs=stmnt.executeQuery(query1);
//			
//			while(rs.next()) {
//				System.out.println(rs.getInt(1)+" : "+ rs.getString(2)+" : "+ rs.getInt(3)+" : "+rs.getString(4));
//			}
		}
		else {
			System.out.println("Try Again");
		}
	

	}

}
