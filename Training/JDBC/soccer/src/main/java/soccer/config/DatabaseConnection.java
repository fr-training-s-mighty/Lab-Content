package soccer.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static final String URL = "jdbc:mysql://localhost:3306/SoccerLeagueDB";
	private static final String USER = "root";
	private static final String PASSWORD = "Simplilearn";
	private static DatabaseConnection instance;
	private Connection connection;
	
	
	private DatabaseConnection() throws SQLException {
		try {
			this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
		}catch (SQLException e) {
			throw new SQLException("Failed to create the database connection.");
		}
	}
	
	public static DatabaseConnection getInstance() throws SQLException {
		if ( instance  == null ) {
			instance = new DatabaseConnection();
		}else if ( instance.getConnection().isClosed()) {
			instance = new DatabaseConnection();
		}
		return instance;
	}
	
	public Connection getConnection() {
		return connection;
	}

}
