
//import java.sql.*;
//import java.util.*;
//
//
//public class DBConnect {
//    private Connection connection;
//    private Statement stat;
//    
//    public DBConnect() { }
//    
//    public void connectToDB() throws Exception {
//        try{
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
//            String con = "jdbc:sqlserver://localhost:1433;SecureRounds=database;user=sa;password=admin;";
//            connection = DriverManager.getConnection(con);
//            
//            
//            System.out.println("Connected to database successfully.");
//            
//        } catch (Exception e){ 
//            System.out.println("Cannot find class to connect to server.");
//        }
//    }    
//}

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect {
    
//    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
//		Connection conn = DriverManager.getConnection
//            ("jdbc:sqlserver://localhost:1433;databaseName=SecureRounds;user=sa;password=admin;database=SecureRounds");
//		System.out.println("Connection Successful");
//		Statement sta = conn.createStatement();
//	}
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
            Connection conn = DriverManager.getConnection
              ("jdbc:sqlserver://localhost:1433;databaseName=SecureRounds;user=sa;password=admin;database=SecureRounds");
            System.out.println("Connection Successful");
                return conn;
                
    }
}

