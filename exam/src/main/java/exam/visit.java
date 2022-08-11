package exam;
import java.sql.*;
public class visit {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		String driverClass = "com.mysql.jdbc.Driver";
		
		Class.forName(driverClass);
		
		Connection conn = null;
		
		String url = "jdbc:mysql://localhost:3306/visit";
		String id = "root";
		String pw = "0000";
		
		
		conn = DriverManager.getConnection(url, id,pw);
		
			return conn;
		}
	}

