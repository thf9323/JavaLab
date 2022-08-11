package day31;

import java.sql.*;

public class DbConnClose {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		String driverClass = "com.mysql.jdbc.Driver";
		
		Class.forName(driverClass);//드라이버 읽어오기

	
	// 3.Connection Object
		Connection conn = null;

		String url = "jdbc:mysql://localhost:3306/exam";
		String id = "root";
		String pw = "0000";
		
//		try {
		conn = DriverManager.getConnection(url, id, pw);
		//} catch(SQLException e) {
			//System.out.println("DB Connection Err.");
		//}
		
	// 4.Statement Object
	//	PreparedStatement pstmt = null;
		
		return conn;
	}
}