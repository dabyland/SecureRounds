import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnect {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		Connection conn = DriverManager.getConnection
            ("jdbc:sqlserver://localhost:1433;databaseName=SecureRounds;user=sa;password=admin;database=SecureRounds");
		System.out.println("Connection Successful");
		Statement sta = conn.createStatement();
	}
}
