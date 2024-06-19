package soccer.client;

import java.sql.*;
//import 

import soccer.config.DatabaseConnection;

public class StatementExample {
	

		public static void main(String[] args) {
			try (Connection connection = DatabaseConnection.getInstance().getConnection();
					Statement statement = connection.createStatement()){
				
				
				String selectSQL = "select * From League WHERE TeamID = 6";
				ResultSet rs = statement.executeQuery(selectSQL);
				
				while ( rs.next() ) {
					System.out.println("Team ID : " + rs.getInt("TeamID") + ",Points: "+rs.getInt("Points"));
				}
			
				
			}catch(SQLException e) {
				e.printStackTrace();
			}

		}

	}
