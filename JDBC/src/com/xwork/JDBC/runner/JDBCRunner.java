package com.xwork.JDBC.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCRunner {

	public static void main(String[] args) {
		
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String userName="root";
		String password="Xworkzodc@123";
		
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(url, userName, password);
			if(connection != null) {
				System.out.println("Sucessfully Connected to JDBC");
			}else {
				System.out.println("Not Connected to JDBC");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

