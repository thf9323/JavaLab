<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<%
String driverClass = "com.mysql.jdbc.Driver";
Class.forName(driverClass);

//3.Connection Object
Connection conn = null;

String url = "jdbc:mysql://localhost:3306/exam1";
String id = "root";
String pw = "0000";

conn = DriverManager.getConnection(url, id, pw);

//4.Statement Object
PreparedStatement pstmt = null;
%>