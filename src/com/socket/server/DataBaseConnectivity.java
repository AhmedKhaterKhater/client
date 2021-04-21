package com.socket.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DataBaseConnectivity {
	
	
	 private static String driver="com.mysql.jdbc.driver";
	 private static String url="jdbc:mysql://localhost:3360:/chat";
	 private static String username="root";
	 private static String password="root";
	 private static  Connection conn;
	 private static void connecttion() throws SQLException{
	    
	    
	           try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        conn=DriverManager.getConnection(url, username, password);
	    
	 }
	  public static Connection getConnection() {
	        if (conn== null) {
	            try {
					connecttion();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        return conn;
	    }

}
