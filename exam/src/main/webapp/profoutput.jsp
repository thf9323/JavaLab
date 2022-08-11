<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
    <%@ include file = "dbinclude.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<%
	String sql = "SELECT * FROM prof";
	pstmt = conn.prepareStatement(sql);
	
	ResultSet rset = null;
	rset = pstmt.executeQuery();
%>
<div class="container">
<div class="alert alert-primary" role="alert" >
 prof
</div>
</div>
<div class="container">

<table class="table table-hover">
  <thead>
    <tr class="alert alert-dark" role="alert">
      <th scope="col">#</th>
      <th scope="col">학번</th>
      <th scope="col">이름</th>
      <th scope="col">학년</th>
      <th scope="col">전공</th>
    </tr>
  </thead>
  <tbody>
  
<%
	int i=1;
	while (rset.next())
	{
		String hakbun = rset.getString("pno");
		String name = rset.getString("pname");
		String year = rset.getString("year");
		String dept = rset.getString("dept");
		
%>
    <tr class= "alert alert-warning" role="alert" >
      <th scope="row"  ><%=i %></th>
      <td class="table-secondary"><%=hakbun %></td>
      <td class="table-primary"><%=name %></td>
      <td class="table-danger"><%=year %></td>
      <td class="table-info"><%=dept %></td>
    </tr>
<% 
i++;
	}
%>  
  
  </tbody>
</table>		
		
</div>		
		
<%
rset.close();
pstmt.close();
conn.close();
%>





<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>