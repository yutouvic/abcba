package com.cw.abcba.myp.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DB {
	
	private static final String name = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/test";
	private static final String user = "root";
	private static final String password = "chenwei";
	
	private Connection conn = null;
	
	public Statement sm = null;
	
	public DB(String sql){
		try {
			Class.forName(name);
			conn = DriverManager.getConnection(url, user, password);
			sm = conn.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
