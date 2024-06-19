package soccer.client;

import java.sql.*;
import soccer.config.DatabaseConnection;

public class NavTrial {

	public static void main(String[] args) {
		try (Connection connection = DatabaseConnection.getInstance().getConnection();
				Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt.executeQuery("select * from  League")){
			
			if ( rs.first() ) {
				System.out.println("First Row : " + rs.getInt("LeagueID"));
			}
			
			if ( rs.last()) {
				System.out.println("last Row : " + rs.getInt("LeagueID"));
			}
			
//			rs.previous() ; rs.next() ; rs.absolute(2)
			if(rs.previous())
					{		
				System.out.println(rs.getInt("LeagueId"));
					}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
