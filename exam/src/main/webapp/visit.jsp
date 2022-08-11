<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ include file="dbinclude.jsp" %>

<%
String sql="CREATE table visit("
		+"memo    	varchar(50))";

pstmt = conn.prepareStatement(sql);

//5.SQL Execute
pstmt.executeUpdate();

//6. ResultSet Object
//미 실시 (sql 실행 결과 수신)

//7. Connection Close
pstmt.close();
conn.close();

%>