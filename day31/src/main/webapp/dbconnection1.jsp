<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>








<%
// JSP로 DB 연결 방법 1/4

// 1.sql package import
// 2.jdbc driver loading(위치:: src/main/webapp/WEB-INF/lib)에 mysql-connector-java-8.0.26.jar 넣기

	String driverClass = "com.mysql.jdbc.Driver";
	Class.forName(driverClass);//드라이버 읽어오기

// 3.Connection Object
	Connection conn = null;
	
	String url = "jdbc:mysql://localhost:3306/";
	String id = "root";
	String pw = "0000";
	
	conn = DriverManager.getConnection(url, id, pw);

// 4. Statement Object
	PreparedStatement pstmt = null;

	String sql = "CREATE DATABASE exam1";
	pstmt = conn.prepareStatement(sql);
	
// 5. SQL Execute
	pstmt.executeUpdate();

// 6. ResultSet Object
	//미 실시 (SQL 실행 결과 수신)
	
// 7. Connection Close (9버전 이상 생략 가능하지만 넣어주라)
	pstmt.close();
	conn.close();
%>
