package soccer.client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import soccer.config.DatabaseConnection;

public class BankingSystem {

	private static final boolean True = false;


	public static void add(String name, double balance) {
		
String insertSQL1 = "INSERT INTO customers (name, balance) VALUES (?, ?)";
		
		Connection connection  = null;
		try {
			connection = DatabaseConnection.getInstance().getConnection();
			PreparedStatement pstmt1 = connection.prepareStatement(insertSQL1);					
			pstmt1.setString(1,name);
			pstmt1.setDouble(2, balance); // MatchedPlayed

			pstmt1.executeUpdate();
						
					
			}
			catch(SQLException e) {
				e.printStackTrace();
			}

	}
	
	public static void view(String customerName) {
		String insertSQL1 = "select * From customers WHERE name = ?";
		
		Connection connection  = null;
		try {
			connection = DatabaseConnection.getInstance().getConnection();
			PreparedStatement pstmt1 = connection.prepareStatement(insertSQL1);					
			pstmt1.setString(1,customerName);
			try ( ResultSet rs = pstmt1.executeQuery()){
				while ( rs.next() ) {
					System.out.println("ID : " + rs.getInt("id") + ",Balance: "+rs.getInt("balance"));
				}
			}						
					
			}
			catch(SQLException e) {
				e.printStackTrace();
			}

	}
	
	public static void updateBal(int id,double change) {
		String insertSQL1 = "select * From customers WHERE id = ?";
		double bal=0.0;
		Connection connection  = null;
		try {
			connection = DatabaseConnection.getInstance().getConnection();
			PreparedStatement pstmt1 = connection.prepareStatement(insertSQL1);					
			pstmt1.setInt(1,id);
			try ( ResultSet rs = pstmt1.executeQuery()){
				while ( rs.next() ) {
					bal=rs.getDouble("balance");
				}
			}						
					
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		bal+=change;
		insertSQL1 = "UPDATE customers SET balance =? WHERE id = ?";
		
		 connection  = null;
		try {
			connection = DatabaseConnection.getInstance().getConnection();
			PreparedStatement pstmt1 = connection.prepareStatement(insertSQL1);					
			pstmt1.setDouble(1,bal);
			pstmt1.setInt(2, 6); // MatchedPlayed

			pstmt1.executeUpdate();
						
					
			}
			catch(SQLException e) {
				e.printStackTrace();
			}

	}
	
	
	public static void main(String[] args) {
				
//		add();
//		view();
//		updateBal(6,1000);
		Scanner sc = new Scanner(System.in);
		
		while(true){
            System.out.println("Select an option:");
            System.out.println("1. Add new customers.");
            System.out.println("2. View customer details.");
            System.out.println("3. Process deposits and withdrawals.");
            System.out.println("4. Handle batch updates for transactions.");
            System.out.println("5. Manage transactions with commit and rollback operations.");
            System.out.println("6. Exit.");
			int op = sc.nextInt();
			sc.nextLine();
			switch (op) {
             case 1:
                 System.out.print("Enter customer name: ");
                 String name = sc.nextLine();
                 System.out.print("Enter initial balance: ");
                 double balance = sc.nextDouble();
                 sc.nextLine();
                 add(name, balance);
                 
             case 2:
                 System.out.print("Enter customer ID: ");
                 String customerId = sc.nextLine();
                 view(customerId);
                 
             case 3:
                 System.out.print("Enter customer ID: ");
                 int id = sc.nextInt();
                 System.out.print("Enter amount: ");
                 double amount = sc.nextDouble();
                 System.out.print("Enter 1 for deposit or 2 for withdrawal: ");
                 int type = sc.nextInt();
                 amount = type==1?amount:amount*(-1);
                 updateBal(id, amount);
               
             case 4:
//                 handleBatchUpdates();
            	 	System.out.println("HI");
             case 5:
//                 manageTransactionsWithCommitAndRollback();
            	 System.out.println("HI2");
             case 6:
                 System.out.println("Exiting...");
                 
                 sc.close();
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
			
		}
		
		

		

		
		}
		

		

	}

