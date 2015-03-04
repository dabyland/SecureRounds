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
//            System.out.println("Connected to database successfully.");
//            
//        } catch (Exception e){ 
//            System.out.println("Cannot find class to connect to server.");
//        }
//    }
//}
