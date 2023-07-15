/**
 * 
 */
package com.pro.utility;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author AR
 *
 */
public class DbConnection {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/jdbccrud?autoReconnect=true&useSSL=false";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;
	}
}