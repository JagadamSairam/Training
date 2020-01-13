//Creating a connection with database and using static queries
//this is only for static queries not for the real time...
//The data was fetched up dynamically from the user and u have connect with database.......


package com.employee.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;  //Statement Interface Used for static queries only
import java.util.Scanner;
public class EmployeeDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		// 1. A Database MySql
		// 2. Database Jar File (JDBC API)
		// 3. Driver class(For the Database)
		// 4. Database URL(Database Address)
		// 5. Load the driver class
		
		
		Class.forName("com.mysql.jdbc.Driver");  //ClassNotFoundException
		
		
		//2. Establish the connection with database
		
		String url="jdbc:mysql://localhost:3306/cts";
		String username="root";
		String password="admin";
			
		Connection conn = DriverManager.getConnection(url,username,password);//SQLException
		
		
		
		//Create Statement
		
		Statement stmnt=conn.createStatement();
		
		
		//System.out.println("Connection is Established");
		
		
		//String query="insert into employee values(41,'Dev',22,875678678,'DotNetFullStack','Banglore',700000);
		
		//String query="update employee set locatio ='pune' where Empid=41";
		
		//String query="delete from employee where Empid = 41";

//		int result = stmnt.executeUpdate(query);
//		if(result>0) {
//			System.out.println("Data Inserted Successfully");
//		}
//		else
//			System.out.println("Try Again");
		
//		String query="select * from employee";
//		
//		ResultSet rs=stmnt.executeQuery(query);
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" : "+ rs.getString(2)+" : "+ rs.getInt(3)+" : "+ rs.getLong(4)+" : "+rs.getString(5)+" : "+ rs.getString(6)+" : "+ rs.getInt(7));
//		}
		
		
		
		/* Dynamically Creating And Executing the Queriea*/
		//...............................................//
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the employee Id");
		int Empid=Integer.parseInt(s.nextLine());
		System.out.println("Enter Employee First Name");
		String firstname=s.nextLine();
		System.out.println("Enter Employee Age");
		int age = Integer.parseInt(s.nextLine());
		System.out.println("Enter Your Phone Number");
		long phone=Long.parseLong(s.nextLine());
		System.out.println("Enter Your Stream");
		String department=s.nextLine();
		System.out.println("Enter Your Location");
		String address=s.nextLine();
		System.out.println("Enter Your Salary");
		int salary=Integer.parseInt(s.nextLine());
		
		String query="insert into employee values(?,?,?,?,?,?,?)";  //How many columns in ur tabvle contains that much of ?you have to gave
		
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, Empid);
		ps.setString(2, firstname);
		ps.setInt(3,age);
		ps.setLong(4, phone);
		ps.setString(5, department);
		ps.setString(6, address);
		ps.setInt(7,salary);
		
		int result=ps.executeUpdate();
		if(result>0) {
			System.out.println("Data Inserted Successfully");
			String query1="select * from employee";
			ResultSet rs=stmnt.executeQuery(query1);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" : "+ rs.getString(2)+" : "+ rs.getInt(3)+" : "+ rs.getLong(4)+" : "+rs.getString(5)+" : "+ rs.getString(6)+" : "+ rs.getInt(7));
			}
		}
		else {
			System.out.println("Try Again");
		}
	
	
	
	}
}