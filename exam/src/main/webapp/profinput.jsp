<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ include file = "dbinclude.jsp" %>

<%

	String pno = "010-1234-5678";
	String pname = "ost";
	String year = "4856";
	String dept = "piano";

	String sql = "INSERT INTO prof VALUES(?,?,?,?)";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, pno);
	pstmt.setString(2, pname);
	pstmt.setString(3, year);
	pstmt.setString(4, dept);
	
	pstmt.executeUpdate();

		pstmt.close();
		conn.close();	
%>