package main.java;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	static Connection newConnection =null;
	public static Connection getDBConnection () {
		return newConnection;
		//try (Connection con = DriveManager.getConnection("search-ms:query=dbwork\\dbwork", "root", "1234")) {
		//newConnection = con;
		//}
		//return newConnection;
		//}
		//public static void main (String [] args) throws SQLException {
		//getDBConnection ();
		//Statement st = newConnection.createStatement();
		//st.executeUpdate("INSERT INTO student VALUES (102, `Kelvin')");
	}
}