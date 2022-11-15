package sampleHarvester;

import java.sql.*;
import java.sql.DriverManager;

public class main {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt= null;
		
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to the database");
			conn = DriverManager
			.getConnection("jdbc:mysql://18.195.57.65:3306/BulgarianRegistry","tempLbUser","tempUser@Lb_Sampl3");
			System.out.println("You are now connected to the database");
			
			System.out.println("Inserting data or records into the table called Client");
			stmt = conn.createStatement();
			
			String sql="INSERT INTO Client " +
					"VALUES (1023458907 sea, Apple ,1,10)";
			stmt.executeUpdate(sql);			
			sql = "INSERT INTO Client " +
					"VALUES (103456987 tek, GARMIN,2,20)";
			stmt.executeUpdate(sql);
			

			 sql="INSERT INTO Registered_Office " +
					"VALUES (1023458907 sea, 10 ,England,One Apple Park Way,95014,00 800 4414 5417,00 800 4414 5417)";
			stmt.executeUpdate(sql);			
			sql = "INSERT INTO Registered_Officet " +
					"VALUES (103456987 tek, Germany,2,Mohrenstrasse 37 , 10117 ,  (49 30) 30 18 58 00 ,  (49 30) 30 18 58 00 )";
			stmt.executeUpdate(sql);
			
			 sql="INSERT INTO Representative_Reg " +
					"VALUES (1,1023458907 sea, Apple California )";
			stmt.executeUpdate(sql);			
			sql = "INSERT INTO Client " +
					"VALUES (2,103456987 tek, Garmin Germany)";
			stmt.executeUpdate(sql);
			
			System.out.println("Insert records into the table, Please Verify...");
			
		}catch(SQLException se) {
			se.printStackTrace();			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)
					conn.close();
			}catch(SQLException se) {
				
			}
			try {
				if(conn!=null)
					conn.close();
			}catch(SQLException se) {
				se.print.StackTrace();
			}
		}
		
		
	}

}
