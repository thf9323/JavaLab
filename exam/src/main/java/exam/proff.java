package exam;
import java.sql.*;
public class proff {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
	
	String driverClass = "com.mysql.jdbc.Driver";
	
	Class.forName(driverClass);
	
	Connection conn = null;
	
	String url = "jdbc:mysql://localhost:3306/prof";
	String id = "root";
	String pw = "0000";
	
	
	conn = DriverManager.getConnection(url, id,pw);
	
		return conn;
	}
}
