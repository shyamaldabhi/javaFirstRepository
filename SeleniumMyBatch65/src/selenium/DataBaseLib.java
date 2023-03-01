package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseLib {

	public static void main(String[] args) {
		String myServer = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
		String myUrl= "jdbc:sqlserver://localhost:1433";
		Connection con;  //establish connection 
		Statement stmt;
		try {
			con = DriverManager.getConnection(myUrl,"sa","khkhk");
			stmt = con.createStatement();// create the statemnt and return it
			String insertQuery = "";
			stmt.executeQuery("");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
