package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
	private final static String URL = "jdbc:mysql://localhost:3306/Exam";
	private final static String USER = "root";
	private final static String PASS = "dat66060nuce";
	private Connection myConnect;

	//Connect to Database 
	public Connection getConnection() throws SQLException{
		if(myConnect == null || myConnect.isClosed()){
			myConnect = DriverManager.getConnection(URL, USER, PASS);
		}
		return myConnect;
	}
	
	//Disconnect to Database
	public void disconnect() throws SQLException {
		if (myConnect != null || !myConnect.isClosed()) {
			myConnect.close();
		}
	}
	
}
