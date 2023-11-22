package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {
	
	public void createDatabase() {
	
	//driver load
	
			// connect establish
			
			try {
				String url = "jdbc:mysql://localhost:3306/";
				String userName = "root";
				String password = "Shubham?2001";
				
				Connection conn = DriverManager.getConnection(url, userName, password);
				
				Statement stm = conn.createStatement();
				
				String query = "Create database db";
				
				stm.execute(query);
				
				System.out.println("Database created successfully");
				
				conn.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
			//statement create
			//execute query
			// close connection
		}

	public void createTable() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/db";
			String userName = "root";
			String password = "Shubham?2001";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			Statement stm = conn.createStatement();
			
			String query = "Create table student(RollNo int primary key, name varchar(50), email varchar(100))";
			
			stm.execute(query);
			
			System.out.println("table created successfully");
			
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void createData() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/db";
			String userName = "root";
			String password = "Shubham?2001";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			Statement stm = conn.createStatement();
			
			String query = "insert into student(RollNo, name, email) values(2,'Rahul','shubhamdhatwalia3@gmail.com')";
			
			stm.executeUpdate(query);
			
			System.out.println("data inserted successfully");
			
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void readData() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/db";
			String userName = "root";
			String password = "Shubham?2001";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			Statement stm = conn.createStatement();
			
			String query = "select*from student";
			
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				System.out.println("RollNO "+ rs.getInt(1));
				System.out.println("name "+ rs.getString(2));
				System.out.println("email "+ rs.getString(3));
			}
			
			System.out.println("read successfully");
			
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void updateData() {
		
		try {
			String url = "jdbc:mysql://localhost:3306/db";
			String userName = "root";
			String password = "Shubham?2001";
			
			Connection conn = DriverManager.getConnection(url, userName, password);
			
			Statement stm = conn.createStatement();
			
			String query = "update student set email = 'Rahul@gmail.com' where RollNO = 2";
			
			stm.execute(query);
			
			System.out.println("updated successfully");
			
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
