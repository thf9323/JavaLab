<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% //SQL 패키지 임포트 %>
<%@ page import="java.sql.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SQL package import</title>
</head>
<body>
<%
    // JDBC 드라이버 로딩
    String driverClass = "com.mysql.jdbc.Driver";

	try {
		Class.forName(driverClass);
		out.print(" JDBC Driver loading 성공!!<br>");
	}catch (ClassNotFoundException e) {
		out.print("JDBC Driver loading 실패!!<br>");
	}

	// MySQL 데이터베이스 서버 연결 설정
	String url = "jdbc:mysql://localhost:3306/";
	String id = "root";
	String pw = "0000";
	
	// connection object 생성
	Connection conn = null;
	
	// connection MySQL 서버연결
	try {
		conn = DriverManager.getConnection(url, id, pw);
		out.print("MySQL 서버 연결 성공!!!<br>");
	} catch (SQLException e) {
		out.print("MySQL 서버 연결 실패!!!<br>");
	}/* finally {
		if (conn != null) {
			try { 
				conn.close();
				out.print("MySQL 서버 연결 종료!!!<br>");
			} catch (Exception e) {
				out.print("MySQL 서버 연결 종료에 문제가 생겼습니다.");
			}
		}
	}*/
	//SQL 구문 작성
	
		String sql = "USE stu";
		
		
		String stu = "CREATE table stuu1(column_name varchar(20), age number(15))";
		String stuu = "INSERT INTO stuu VALUES(12)";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		//SQL 구문 실행
		
		try{
		pstmt. executeUpdate();
		out.print("데이터베이스 생성 성공!!!<br>");
		}catch(SQLException e){
			out.print("데이터베이스 생성 실패!!<br>");
			out.print(e.getMessage() +" <br>");
		}
	
%>
</body>
</html>