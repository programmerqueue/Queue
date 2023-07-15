

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
public class DbConnecton {

	private static final String Driver = "com.mysql.cj.jdbc.Driver";
	private static final String Url = "jdbc:mysql://localhost:3306/abdulrazzaque";
	private static final String Username = "root";
	private static final String Password = "root";

	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName(Driver);
			con = DriverManager.getConnection(Url, Username, Password);
		} catch (Exception e) {

			e.printStackTrace();
		}

		return con;
	}

}
