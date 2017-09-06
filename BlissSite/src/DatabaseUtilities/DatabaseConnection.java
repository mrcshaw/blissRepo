package DatabaseUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import AppUtilities.BlissProperties;

public class DatabaseConnection {
	private Connection connection; 
	
	/**
	 * Returns connection to this site's database
	 * @return
	 */
	public Connection getConnection() {
		
		BlissProperties properties = new BlissProperties();
		String hostname = properties.getProperty("database.hostname");
		String username = properties.getProperty("database.username");
		String password = properties.getProperty("database.password");
		String port = properties.getProperty("database.port");
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection connection = DriverManager.getConnection(  
					"jdbc:mysql://localhost:" + port + "/" + hostname + "," + username + "," + password); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return connection;
	}
	
	/**
	 * Closes connection
	 * @param connection connection to be closed
	 */
	public void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
