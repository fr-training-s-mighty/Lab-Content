package soccer.client;

import java.sql.Connection;
import java.sql.SQLException;

import soccer.config.DatabaseConnection;


public class Program {
	
	public static void main(String[] args) {
		
		try {
			DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
			Connection connection = databaseConnection.getConnection();
			System.out.println("Connected to the db");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}