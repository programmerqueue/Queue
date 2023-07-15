package com.aijaz.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCCONnection {

	private static final String U_Name = "root";
	private static final String PWD = "3287";
	private static final String URL = "JDBC:Mysql://localhost:3306/dbtest";

	public static Connection myConnection() {
		Connection con = null;
		try {
//			loading Driver
			Class.forName("com.mysql.jdbc.Driver");
//			Creating connection
			System.out.println("connection below");
			con = DriverManager.getConnection(URL, U_Name, PWD);
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
